package progra2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.Queue;
import progra2.ventana;

/*******************************************************************************
 * Esta clase realiza las operaciones para la memoria virtual
 * 1. Realiza la lectura al archivo proceso.
 * 2. Realiza los cambios dependiendo de la unidad que tengan los procesos.
 * 3. Ingresa los datos a las colas de FIFO y de prioridad
 * 4. Verifica si existe espacio suficiente para que el proceso entre a memoria.
 * 5. Ingresa los procesos a memoria, ya en forma de paginas.
 *******************************************************************************/


//Clase memoria virtual
public class memoriaVirtual {

    //Variables que se solicitan a usuario
    int ProcesosEjecutar = 4; //Se toma de interfaz
    
    
    //Variables memoria virtual
    int tamanoMemoriaVirtual;//= 1000; //Variable del tamaño (se toma de interfaz)
    int paginas;//=50; //Tamano de las paginas
    int paginasMemoria;//=tamanoMemoriaVirtual/paginas; //Cantidad de paginas para la memoria virtual
    String[] memoriaVirtual;//=new String[paginasMemoria]; //Tabla de la memoria virtual
    public static ArrayList<proceso> listaProcesos = new ArrayList<proceso>();//Lista de los procesos de memoria virtual
    int contador=0;
    int paginasMemoriaVirtual;// = paginasMemoria;
    
//    //Variables memoria fisica
//    public static int tamanoMemoriaFisica = 500; // Tamano de la memoria fisica
//    int paginasMemoriaFisica = tamanoMemoriaFisica/paginas;
//    int[] memoriaFisica = new int[paginasMemoriaFisica]; //Tabla de la memoria fisica
//    int marcos=2; //Numero de marcos solicitados

    public memoriaVirtual(int memoria, int paginas1){
        this.tamanoMemoriaVirtual = memoria;
        this.paginas=paginas1;
        paginasMemoria=tamanoMemoriaVirtual/paginas;
        paginasMemoriaVirtual=paginasMemoria;
        memoriaVirtual = new String[paginasMemoria]; //Tabla de la memoria virtual

    }
    
    
//    String tipocola = "FIFO";
//    proceso[] fifof=new proceso[1000];
//    LinkedList<proceso> fifo2 = new LinkedList<proceso>();
//    ArrayList<proceso> fifoQueue = new ArrayList<proceso>();//ArrayList donde se guardan los procesos
//    
//
//    //Colas requeridas para guardar los procesos
//    PriorityQueue<proceso> priorityQueue = new PriorityQueue<>(10, idComparator); //Cola Prioridad
//    LinkedList<proceso> fifo = new LinkedList<proceso>();

    //Variables del proceso
    public static String id;
    public static String nombre;
    public static String memoria;
    public static String unidad;
    public static String prioridad;
    public static int memoriaInt; //Variable de tipo int de la memoria
    public static int prioridadInt;

        //Funcion del comparador para la cola de Prioridad
        public static Comparator<proceso> idComparator = new Comparator<proceso>(){

            @Override
            public int compare(proceso c1, proceso c2) {
//                System.out.println("c1: "+c1.getDatos());
//                System.out.println("c2: "+c2.getDatos());
                return (int) (c1.getPrio()- c2.getPrio());
            }
        };

        //Funcion para obtener los datos de archivo .txt
        public void leerArchivo() throws FileNotFoundException, IOException{
            //LinkedList<proceso> f = new LinkedList<proceso>();
            //Verifica si el archivo existe
            if (! (new File("Procesos.txt")).exists() )
            {
                System.out.println("No he encontrado fichero .txt");
                return;
            }
            else{
//                System.out.println("El archivo si existe");
            }

            try
            {
                BufferedReader br = new BufferedReader(new FileReader("Procesos.txt"));
                String proces = null;

                //Verificar si existen datos en el archivo
//                proces = br.readLine();
                int pos=0;
                while((proces = br.readLine()) != null){

                    //Como el delimitador es una coma, se indica
                    StringTokenizer token = new StringTokenizer(proces, ",");
                    //Recuperacion de datos
                    id = token.nextToken().trim(); //Id del proceso
                    nombre = token.nextToken().trim(); //Nombre del proceso
                    memoria = token.nextToken().trim(); //Memoria requerida
                    unidad = token.nextToken().trim(); //Unidad de medida
                    prioridad = token.nextToken().trim(); //Prioridad del proceso


                    //Cambia el parametro memoria y sPrioridd a int
                    memoriaInt = Integer.parseInt(memoria);
                    prioridadInt = Integer.parseInt(prioridad);

                    //Verifica la unidad del proceso
                    if(unidad.equals("k")){
                        //no se realiza ningun cambio
                    }
                    else{
                        if(unidad.equals("MB")){
                            memoriaInt = memoriaInt*1024;
                        }
                        else{
                            if(unidad.equals("GB")){
                                memoriaInt = memoriaInt*(1024*1024);
                            }
                        }
                    }   

                    //Ingresa los datos a la cola FIFO
                    proceso proc=new proceso(id, nombre, memoriaInt, unidad, prioridadInt);
//                    System.out.println(proc.getDatos());
                    ingresoProcesos(proc);
                    
                    
//                    proces = br.readLine();
                }//Fin del while
//                System.out.println("carga completa");
                br.close();
            }
            catch (IOException errorDeFichero)
            {
                System.out.println("Ha habido problemas: " + errorDeFichero.getMessage() );
            }
        }

        /*
        Funcion que imprime la tabla de memoria Virtual
        */
        public void imprimeTablaVirtual(){
            System.out.println("Memoria Virtual");
            System.out.println("---------------------------------");
                for(int i=0; i<paginasMemoriaVirtual; i++){
                    System.out.print(memoriaVirtual[i] + "\t");

                System.out.println(" ");
                    if(i%4==0 && i!=0){
                        System.out.println(" ");
                    }
            }
            System.out.println();
            System.out.println();
        }


        public void ingresoProcesos(proceso proceso){
            if(ProcesosEjecutar>0){
            //Ingresa los procesos a memoria virtual
                if (paginasMemoria>0){
                    int paginasProceso = memoriaInt/paginas;             
//                    System.out.println("paginasProceso del proceso: "+ proceso.getName()+ " ->"+ paginasProceso);
                    if(paginasProceso<= paginasMemoria){
                    //Inicia el ingreso a la tabla
                    for(int i=0; i<paginasProceso;i++){
                          memoriaVirtual[contador] = proceso.getName();
//                        System.out.println(memoriaVirtual[contador]);
//                        System.out.println(proceso.getName()+ " pagina " + contador);
//                        imprimeTabla();
                        contador++;
//                        System.out.println("contador: "+ contador);
                    }                   
                    //Fin del ingreso a la tabla
//                        listaProcesos.add(new proceso(id,nombre,memoriaInt,unidad,prioridadInt));
                        listaProcesos.add(proceso);
                        
                        paginasMemoria=paginasMemoria-paginasProceso;
//                        System.out.println(listaProcesos.get(i).getName());
//                        System.out.println("El proceso "+ id+ " fue asignado con exito");
                        ProcesosEjecutar--;
                    
                    }else{
//                        ProcesosEjecutar++;
//                        System.out.println("El proceso "+ id + " solicita mas de lo disponible en memoria");
//                        System.out.println("El disponible es: "+ paginasMemoria + " el proceso solicita: "+ paginasProceso);
                    }
                }else{
                    System.out.println("Memoria llena");
                }
//                System.out.println("----------------------------------------------------------------------------------------");
            }
//            ProcesosEjecutar--;
            

        }


        //Main de clase memoria
	public static void main(String[] args) throws IOException{

            memoriaVirtual pruebaMemoria =  new memoriaVirtual(1000,50);
            pruebaMemoria.leerArchivo();
            pruebaMemoria.imprimeTablaVirtual();



        }

}
