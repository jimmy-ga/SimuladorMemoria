//package progra2;

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
//import proceso;


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

    //Variables
    public static int tamanoMemoria = 1000; //Variable del tamaño
    int paginas=50; //Variable de tamano de paginas, se toma desde interfaz
    int paginasMemoria = tamanoMemoria/paginas; //Cantidad de paginas para la memoria
    ArrayList<proceso> listaProcesos = new ArrayList<proceso>();//ArrayList donde se guardan los procesos
    int ProcesosEjecutar = 4;
    String tipocola = "FIFO";
	//proceso[] fifof=new proceso[1000];

    //Colas requeridas para guardar los procesos
    PriorityQueue<proceso> priorityQueue = new PriorityQueue<>(10, idComparator); //Cola Prioridad
    LinkedList<proceso> fifo = new LinkedList<proceso>();

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
                System.out.println("No he encontrado fichero.txt");
                return;
            }
            else{
                System.out.println("El archivo si existe");
            }

            try
            {
                BufferedReader br = new BufferedReader(new FileReader("Procesos.txt"));
                String proces = null;

                //Verificar si existen datos en el archivo
                proces = br.readLine();
                int pos=0;
                while(proces!= null){
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

                    //Ingresa los datos a la cola FIFO
                  proceso proc=new proceso(id, nombre, memoriaInt, unidad, prioridadInt);
                  //ingresoProcesos(proceso);
                  addprocs(proc);
                  //fifof[pos]=proc;
                  //if (pos>=1)
                  //System.out.println(fifof[pos].getDatos());
                  //pos++;
					proces = br.readLine();
                }//Fin del while
                System.out.println("carga compleat");
                br.close();
            }
            catch (IOException errorDeFichero)
            {
                System.out.println("Ha habido problemas: " + errorDeFichero.getMessage() );
            }
        }

        //Funcion para agregar los procesos a memoria virtual
        LinkedList<proceso> fifo2 = new LinkedList<proceso>();
        public void addprocs(proceso p)
        {
			fifo2.addFirst(p);
		}

        public void ingresoProcesos(){
            //System.out.println(FIFOQueue.extraer().getDatos());
            for (int i=0;i<ProcesosEjecutar;i++){
            //Verificacion de la cola que desea utilizar
                if (tipocola.equals("FIFO")){
                    //while (FIFOQueue.size()>0){
                    //proceso procesoMemoria = FIFOQueue.extraer();
                    System.out.println(fifo2.getLast().getDatos());
                    }
                }

            //Ingresa los procesos a memoria virtual
                if (paginasMemoria>0){
                    int paginasProceso = memoriaInt/paginas;
                    if(paginasProceso<= tamanoMemoria){
                        listaProcesos.add(new proceso(id,nombre,memoriaInt,unidad,prioridadInt));
                        //System.out.println(listaProcesos.get(i).getDatos());
                        //i++;
                        tamanoMemoria=tamanoMemoria-memoriaInt;
                        //System.out.println("Cantidad de memoria disponible: "+ tamaño);
                        System.out.println("El proceso "+ id+ " fue asignado con exito");
                    }else{
                        System.out.println("El proceso "+ id + " solicita mas de lo disponible en memoria");
                        System.out.println("El disponible es: "+ tamanoMemoria + " el proceso solicita: "+ memoriaInt);
                    }
                }else{
                    System.out.println("Memoria llena");
                }
                System.out.println("----------------------------------------------------------------------------------------");
                ProcesosEjecutar--;


        }



        //Main de clase memoria
	public static void main(String[] args) throws IOException{

            memoriaVirtual pruebaMemoria =  new memoriaVirtual();
            pruebaMemoria.leerArchivo();
            pruebaMemoria.ingresoProcesos();
            //pruebaMemoria.imprimir();



        }

}
