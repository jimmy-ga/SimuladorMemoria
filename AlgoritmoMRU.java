/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2;

import java.util.ArrayList;

/*
 * Metodo que realiza el reemplazo de paginas con LRU
 */
public class AlgoritmoMRU {
    long pageFaults; //Numero de fallos de pagina
    int x=3; // numero de marcos que necesitaremos (se agarra de interfaz grafica)
    int[] tabla = new int[x]; //Tabla que contiene los marcos
    int temp = 0; //Tempoal de la variable 'x'
    int numeroReemplazo=0; //Contador que tiene los numeros que ya han sido reemplazados
    
    /*
     * Método que verifica sin un dato pertenece al conjunto
     */
    public boolean pertenece(int dato){
        for(int i=0; i<x; i++){
            if(tabla[i]==dato){
                return true;/*Si el dato está retornamos true y salimos del ciclo*/
            }
        }
        return false;/*El dato no fue hallado*/
    }


    /*
     * Método que imprime la tabla por pantalla
     */
    public void imprimeTabla(){
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        for(int i=0; i<x; i++){
            System.out.print(tabla[i] + "\t");
        }
        System.out.print("Page Faults: " + pageFaults);
        System.out.println();
        System.out.println();
    }
    

    /*
     * Método que simula el algorimo de reemplazo de páginas FIFO 
     */
    
    public void reemplazarPagina(String linea){
        for(int i=0; i<linea.split(",").length;i++){ //Verifica que i sea menor o igual al largo de la lista
            if(pertenece(Integer.parseInt(linea.split(",")[i]))){
                imprimeTabla(); /*Vemos el estado de la tabla*/
            }else{           
                if (temp <x){ //ingresa los primeros datos hasta que se llene el numero maximo de marcos
                    if(!pertenece(Integer.parseInt(linea.split(",")[i]))){ //tomar el primer elemento de la lista y verifica si existe
                        tabla[temp] = Integer.parseInt(linea.split(",")[i]);
                        imprimeTabla(); /*Vemos el estado de la tabla*/
                        temp++;
                    }
                }else{
                    int numeroReemplazar = Integer.parseInt(linea.split(",")[i]); //Numero que reemplazara
                    int numeroAnterior = Integer.parseInt(linea.split(",")[i-1]); //Numero anterior al que reemplazara
                    if(numeroReemplazar != numeroAnterior){
                        int var=0;
                        while(var<x){
                            if(tabla[var] == numeroAnterior){
                                tabla[var] = numeroReemplazar;
                                pageFaults++;
                                imprimeTabla();
                            }else{
                                var++;
                            }
                        }                        
                    }
                }
            }
        }
    }
     public static void main(String[] args) {
        
        /***********Algoritmo de FIFO***********/
        System.out.println("ALGORITMO DE REEMPLAZO: FIRST IN FIRST OUT");
        System.out.println("******************************************");
        AlgoritmoMRU m = new AlgoritmoMRU(); /*Llamamos a la clase FIFO*/
        m.reemplazarPagina("2,3,2,1,5,2,4,5,3,2,5,2");
//        /************Fin de FIFO***************/
     }
    
}