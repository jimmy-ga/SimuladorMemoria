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
public class Memorias {
    ArrayList<String> tablaPaginas=new ArrayList<String>();
    ArrayList<String> referencias = new ArrayList<String>();
    int valorReferencia;

    //Variables que se solicitan a usuario
    int ProcesosEjecutar;//= 4; //Se toma de interfaz
    
    
    //Variables memoria virtual
    int tamanoMemoriaVirtual;//= 1000; //Variable del tamaño (se toma de interfaz)
    int paginas;//=50; //Tamano de las paginas
    int paginasMemoria;//=tamanoMemoriaVirtual/paginas; //Cantidad de paginas para la memoria virtual
    public static String[] memoriaVirtual;//=new String[paginasMemoria]; //Tabla de la memoria virtual
    public static ArrayList<proceso> listaProcesos = new ArrayList<proceso>();//Lista de los procesos de memoria virtual
    int contador=0;
    int paginasMemoriaVirtual;// = paginasMemoria;
    
//    //Variables memoria fisica
//    int paginasFisica=50;
    public static int tamanoMemoriaFisica = 1000; // Tamano de la memoria fisica
    int paginasMemoriaFisica;// = tamanoMemoriaFisica/paginasFisica;
    public static String[] memoriaFisica;//= new String[paginasMemoriaFisica]; //Tabla de la memoria fisica
    int marcos=2; //Numero de marcos solicitados
    int contadorFisica=0;

    //Tabla de paginas
    public static ArrayList<String> tablaProcesos = new ArrayList<String>();
    
    public void tomarInterfaz(ArrayList lista){
        
    }
    
    public Memorias(int virtual, int pagina, int grado, int fisica, int marco){
        this.tamanoMemoriaVirtual = virtual;
        this.paginas=pagina;
        this.ProcesosEjecutar=grado;
        this.tamanoMemoriaFisica=fisica;
        this.marcos=marco;
        //paginas
        paginasMemoria=tamanoMemoriaVirtual/paginas;
        paginasMemoriaVirtual=paginasMemoria;
        paginasMemoriaFisica=tamanoMemoriaFisica/pagina;
        
        memoriaVirtual = new String[paginasMemoria]; //Tabla de la memoria virtual
        memoriaFisica = new String [paginasMemoriaFisica];
        valorReferencia= 1024*pagina;

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
    public static String naa;


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
            int a=0;
                for(int i=0; i<paginasMemoriaVirtual; i++){
                    System.out.print(memoriaVirtual[i] + "\t");
                    a++;
                    if(a==4){
                        System.out.println(" ");
                        a=0;
                    }
            }
            System.out.println();
            System.out.println();
        }
        
        public void imprimeTablaFisica(){
            System.out.println("Memoria Fisica");
            System.out.println("---------------------------------");
            int a=0;
                for(int i=0; i<paginasMemoriaFisica; i++){
                    System.out.print(memoriaFisica[i] + "\t");
                    a++;
                    if(a==4){
                        System.out.println(" ");
                        a=0;
                    }
            }
            System.out.println();
            System.out.println();
        }


        public void ingresoProcesos(proceso proceso){
            String prueba="";
            if(ProcesosEjecutar>0){
                //Ingresa los procesos a memoria virtual
                if (paginasMemoria>0){
                    int paginasProceso = memoriaInt/paginas;      //Cantidad de paginas del proceso       
                    int peso= proceso.getMem()*1024;
                    if(paginasProceso<= paginasMemoria){
                    //Inicia el ingreso a la tabla virtual
                    for(int i=0; i<paginasProceso;i++){
                        memoriaVirtual[contador] = proceso.getName();
                        contador++;
                    }
                    //Ingreso de los procesos a tabla fisica
                    if(contadorFisica<paginasMemoriaFisica){
                        int disponible = paginasMemoriaFisica-contadorFisica;
                        if(marcos<= disponible){
                            for(int a=0; a<marcos; a++){
                                 
                                if(a>=paginasProceso){
                                    memoriaFisica[contadorFisica]="null";
                                }
                                else{
                                    prueba+=a+1+",";
                                    memoriaFisica[contadorFisica]=proceso.getName();
                                }
                                contadorFisica++;
                            }                 
                        }
                    }
                        //System.out.println(prueba);
                        tablaPaginas.add(proceso.getName()+";"+peso+";"+prueba);
                    
                    //Fin del ingreso a la tabla
//                        listaProcesos.add(new proceso(id,nombre,memoriaInt,unidad,prioridadInt));
                        listaProcesos.add(proceso);
                        
                        paginasMemoria=paginasMemoria-paginasProceso;
//                        System.out.println(listaProcesos.get(i).getName());
//                        System.out.println("El proceso "+ id+ " fue asignado con exito");
                        ProcesosEjecutar--;
                    
                    }
                                        
                }else{
                    System.out.println("Memoria llena");
                }
//                System.out.println("----------------------------------------------------------------------------------------");
            }
//            ProcesosEjecutar--;
            

        }



        
        public void referencias(){
            if (! (new File("Referencias.txt")).exists() )
            {
                System.out.println("No he encontrado fichero .txt");
                return;
            }
            
            try
            {
                BufferedReader br = new BufferedReader(new FileReader("Referencias.txt"));
                String proces = null;

                //Verificar si existen datos en el archivo
//                proces = br.readLine();
                while((proces = br.readLine()) != null){

                    //Como el delimitador es una coma, se indica
                    StringTokenizer token = new StringTokenizer(proces, ",");
                    //Recuperacion de datos
                    nombre = token.nextToken().trim(); //Nombre del proceso
                    memoria = token.nextToken().trim(); //Memoria requerida
                    naa = token.nextToken().trim(); //lectura y escritura

                    referencias.add(nombre.toString()+";"+memoria.toString());
                    

                }
            }
            catch (IOException errorDeFichero)
            {
                System.out.println("Ha habido problemas: " + errorDeFichero.getMessage() );
            }
        }
        
        public void tablaProcesos(){
            //System.out.println(tablaPaginas.size());
            System.out.println("Tabla de paginas");
            System.out.println("--------------------------------------");
            for(int x=0;x<tablaPaginas.size();x++)
            {
                System.out.println(tablaPaginas.get(x));
            }            
            System.out.println("referencias"+ referencias.size());
            for(int x=0;x<referencias.size();x++)
            {
                System.out.println(referencias.get(x));
            }
        }
        
        //validacion de referencias
        public void validacion(){
//            System.out.println("tabla paginas: \n "+ tablaPaginas.get(0));
//            System.out.println(referencias.get(0));
            

//            System.out.println(variable[0]);
            
            for(int i=0; i<referencias.size(); i++){
                //
                String[] variable2 = referencias.get(i).split(";");
                String nombre=variable2[0];
                String tamano=variable2[1];
                
                for (int x=0;x<tablaPaginas.size();x++)
                {
                    String[] variable = tablaPaginas.get(x).split(";");
                    if(variable[0].equals(nombre)){
                        if(Integer.parseInt(variable[1])<=Integer.parseInt(tamano)){
                            System.out.println("Invalido: "+variable[1]+" "+tamano);
                            break;
                        }
                        else
                        {
                            //System.out.println(tamano +" "+ valorReferencia);
                            //int paginaRef = valorReferencia/Integer.parseInt(tamano);
                            //System.out.println(paginaRef);
                        }
                    }
                }
                //System.out.println(variable2[1]);
                
            }
        }
        
        
        //Main de clase memoria
	public static void main(String[] args) throws IOException{

            Memorias pruebaMemoria =  new Memorias(1000,50,4, 1500, 3);
            pruebaMemoria.leerArchivo();
            pruebaMemoria.imprimeTablaVirtual();
            pruebaMemoria.imprimeTablaFisica();
            pruebaMemoria.referencias();
//            pruebaMemoria.tablaProcesos();
            pruebaMemoria.validacion();
            



        }

}
