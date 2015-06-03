/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2;

import java.util.Scanner;

/**
 *
 * Clase que realiza el menu inicial
 */
public class Menu {
    static Scanner scanner = new Scanner(System.in); //Sirve para recoger texto por consola
	static int select = -1; //opción elegida del usuario
	static int num1 = 0, num2 = 0; //Variables
        static int memoriaVirtual;
        static int memoriaFisica;
        static int tamanoPagina;        
        static int fetch;
        static int placement;
        static int replacementPolicy;
        static int residentSet;
        static int replacementScope;
        static int cleaning;
	static int grado;
        static int cola;
        
	public static void main(String[] args) {
		
		//Mientras la opción elegida sea 0, preguntamos al usuario
		while(select != 0){
			//Try catch para evitar que el programa termine si hay un error
			try{
				System.out.println("Elige opción:\n1. Ingresar los datos " + "\n0. Salir");
				//Recoger una variable por consola
				select = Integer.parseInt(scanner.nextLine()); 
                                System.out.println(" ");
	
				//Ejemplo de switch case en Java
				switch(select){
				case 1: 
					pideNumeros();
                                        memoriaVirtual memVirtual = new memoriaVirtual(memoriaVirtual, tamanoPagina);
                                        memVirtual.leerArchivo();
                                        memVirtual.imprimeTablaVirtual();
					break;
				case 0: 
					System.out.println("Saliendo del programa");
					break;
				default:
					System.out.println("Número no reconocido");break;
				}
				
				System.out.println("\n"); //Mostrar un salto de línea en Java
				
			}catch(Exception e){
				System.out.println("Error: Sólo se pueden ingresar números.\n");
			}
		}

	}
	
        //Metodo para recoger las variables
        public static void variablesConsola(){
            
        }
        
        
	//Método para recoger variables por consola
	public static void pideNumeros(){
            
                System.out.println("Cantidad de memoria virtual: \nEscribase en terminos de 'k'.  ");
		memoriaVirtual = Integer.parseInt(scanner.nextLine());

                System.out.println("Cantidad de memoria fisica: \nEscribase en terminos de 'k'.  ");
		memoriaFisica = Integer.parseInt(scanner.nextLine());
            
                System.out.println("Tamaño de las paginas: \nEscribase en terminos de 'k'.  ");
		tamanoPagina = Integer.parseInt(scanner.nextLine());
                
		System.out.println("Fetch Policy: \n1. Demanda  \n2. Prepaginacion  ");
		fetch = Integer.parseInt(scanner.nextLine());
                //Validacion del fetch
                if(fetch != 1 && fetch!=2){
                    System.out.println("Solo puede ingresar 1 o 2.\n Por favor vuelva a elegir el numero de sy eleccion.");
                    fetch = Integer.parseInt(scanner.nextLine());
                }
		
		System.out.println("Placement Policy: \n1. First available  \n2. Next available  ");
		placement = Integer.parseInt(scanner.nextLine());
                //Validacion de placement
                if(placement!= 1 && placement!=2){
                    System.out.println("Solo puede ingresar 1 o 2.\n Por favor vuelva a elegir el numero de su eleccion.");
                    placement = Integer.parseInt(scanner.nextLine());
                }
                
                System.out.println("Replacement Policy: \n1. LRU  \n2. FIFO \n3. MRU  ");
		replacementPolicy = Integer.parseInt(scanner.nextLine());
                //Validacion de replacement
                if(replacementPolicy != 1 && replacementPolicy!=2 && replacementPolicy!=3){
                    System.out.println("Solo puede ingresar 1, 2 o 3.\n Por favor vuelva a elegir el numero de su eleccion.");
                    fetch = Integer.parseInt(scanner.nextLine());
                }                
 
                System.out.println("Resident Set Management: \nSize:  \n   1. Fijo \n   2. Variable  ");
		residentSet = Integer.parseInt(scanner.nextLine());
                //Validacion de resident set
                if(residentSet!= 1 && residentSet!=2){
                    System.out.println("Solo puede ingresar 1 o 2.\n Por favor vuelva a elegir el numero de su eleccion.");
                    residentSet  = Integer.parseInt(scanner.nextLine());
                }                

                System.out.println("Replacement Scope: \n1. Global  \n2. Local ");
		replacementScope = Integer.parseInt(scanner.nextLine());
                //Validacion de replacement scope
                if(replacementScope!= 1 && replacementScope!=2){
                    System.out.println("Solo puede ingresar 1 o 2.\n Por favor vuelva a elegir el numero de su eleccion.");
                    replacementScope = Integer.parseInt(scanner.nextLine());
                }
                
                System.out.println("Cleaning policy: \n1. Demanda  \n2. Pre-cleaning ");
		cleaning = Integer.parseInt(scanner.nextLine());
                //Validacion del cleaning
                if(cleaning!= 1 && cleaning!=2){
                    System.out.println("Solo puede ingresar 1 o 2.\n Por favor vuelva a elegir el numero de su eleccion.");
                    cleaning = Integer.parseInt(scanner.nextLine());
                }                
 
                System.out.println("Load Control: \n1. Grado de multiprogramacion ");
		grado = Integer.parseInt(scanner.nextLine());
                System.out.println("Elija el tipo de cola a utilizar: \n1. FIFO \n2.Prioridad  ");
                cola = Integer.parseInt(scanner.nextLine());
                //Validacion de la cola
                if(cola!= 1 && cola!=2){
                    System.out.println("Solo puede ingresar 1 o 2.\n Por favor vuelva a elegir el numero de su eleccion.");
                    cola = Integer.parseInt(scanner.nextLine());
                }                
		//Mostrar un salto de línea en Java
		System.out.println("\n"); 
	}


}
