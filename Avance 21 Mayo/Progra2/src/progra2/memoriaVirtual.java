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
    proceso[] procs=new proceso[1000];
    String tipocola="FIFO";
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

			void cargamemoria()
			{
				String archivo="Procesos.txt";
				try
				{
					String linea="";
					FileReader fr = new FileReader(archivo);
					BufferedReader br = new BufferedReader(fr);
					int i=0;
					while((linea=br.readLine())!=null)
					{
						String temporal[] = linea.split(",");
						proceso ptemp=new proceso(temporal[0].trim(),temporal[1].trim(),Integer.parseInt(temporal[2].trim()),temporal[3].trim(),Integer.parseInt(temporal[4].trim()));
						procs[i]=ptemp;
						//System.out.println(ptemp.getDatos());
						i++;
					}
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}

        //Funcion para agregar los procesos a memoria virtual
        public void ingresoProcesos(){
            //System.out.println(FIFOQueue.extraer().getDatos());
            for (int i=0;i<ProcesosEjecutar;i++){
            //Verificacion de la cola que desea utilizar
                if (tipocola.equals("FIFO")){
	                    System.out.println(procs[i].getDatos());
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
            pruebaMemoria.cargamemoria();
            pruebaMemoria.ingresoProcesos();
            //pruebaMemoria.imprimir();



        }

}
