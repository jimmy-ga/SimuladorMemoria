//package progra2;

import java.util.Random;
import java.util.ArrayList;

public class proceso
{
	//Clase proceso. Atributos id, nombre, memoria (requerida).
	//Funciones: constructor, set de cada atributo y get de cada atributo.

	public static String id;
	public static String nombre;
	public static int memoria;
        public static String unidad;
        public static int prioridad;

	public proceso()
	{
		this.id=null;
		this.nombre=null;
		this.memoria=0;
		this.unidad=null;
		this.prioridad=0;
	}
	public proceso(String i,String n,int m, String u, int p)//Constructor con parametros de entrada id,nombre,memoria requerida
	{
		this.id=i;
		this.nombre=n;
		this.memoria=m;
		this.unidad=u;
		this.prioridad=p;

	}

	public String getId()//Obtiene el id del proceso
	{
		return this.id;
	}

	public String getName()//Obtiene el nombre del proceso
	{
		return this.nombre;
	}

	public int getMem()//Obtiene la memoria requerida del proceso
	{
		return this.memoria;
	}

        public int getPrio()//Obtiene la prioridad  del proceso
	{
		return this.prioridad;
	}

	public void setId(String i)//Cambia o establece el id del proceso
	{
		this.id=i;
	}

	public void setName(String n)//Cambia o establece el nombre del proceso
	{
		this.nombre=n;
	}

	public void setMem(int m)//Cambia o establece la memoria requerida del proceso
	{
		this.memoria=m;
	}

        public void setPrio(int p)//Cambia o establece la prioridad requerida del proceso
	{
		this.prioridad=p;
	}
	public String getDatos()//Devuelve un string con todos los atributos del proceso
	{
		return "Id proceso: "+String.valueOf(this.id)+" Nombre: "+this.nombre+" Memoria requerida: "+String.valueOf(this.memoria) + " Prioridad: "+String.valueOf(this.prioridad);
	}

	/*public static void main(String[] args)//Main temporal para probar las funciones de creacion y obtencion de procesos
	{
		//Random  rnd = new Random();//Para crear numeros aleatorios para simular solicitud de memoria
		ArrayList<proceso> lista = new ArrayList<proceso>();//ArrayList donde se guardan los procesos
//		//***Importante*** se puede utilizar este mismo procedimiento para crear la lista de procesos
//
//		for(int i=0;i<10;i++)//Crear 10 procesos random con nombres "proceso+numeroEntero"
//		{
//			//lista.add(new proceso(i,"proceso"+String.valueOf(i),rnd.nextInt(1024)+1));
//                        lista.add(new proceso(id,nombre,memoria));
//		}
//		for(int i=0;i<10;i++)//Recorre la lista de procesos e imprime sus atributos con la funcion getDatos()
//		{
//			System.out.println(lista.get(i).getDatos());
//		}
	}*/
}