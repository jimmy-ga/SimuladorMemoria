import java.util.Random;
import java.util.ArrayList;

public class proceso
{
	//Clase proceso. Atributos id, nombre, memoria (requerida).
	//Funciones: constructor, set de cada atributo y get de cada atributo.

	private int id;
	private String nombre;
	private int memoria;

	public proceso(int i,String n,int m)//Constructor con parametros de entrada id,nombre,memoria requerida
	{
		this.id=i;
		this.nombre=n;
		this.memoria=m;
	}

	public int getId()//Obtiene el id del proceso
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

	public void setId(int i)//Cambia o establece el id del proceso
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

	public String getDatos()//Devuelve un string con todos los atributos del proceso
	{
		return "Id proceso: "+String.valueOf(this.id)+" Nombre: "+this.nombre+" Memoria requerida: "+String.valueOf(this.memoria);
	}

	public static void main(String[] args)//Main temporal para probar las funciones de creacion y obtencion de procesos
	{
		Random  rnd = new Random();//Para crear numeros aleatorios para simular solicitud de memoria
		ArrayList<proceso> lista = new ArrayList<proceso>();//ArrayList donde se guardan los procesos
		//***Importante*** se puede utilizar este mismo procedimiento para crear la lista de procesos

		for(int i=0;i<10;i++)//Crear 10 procesos random con nombres "proceso+numeroEntero"
		{
			lista.add(new proceso(i,"proceso"+String.valueOf(i),rnd.nextInt(1024)+1));
		}
		for(int i=0;i<10;i++)//Recorre la lista de procesos e imprime sus atributos con la funcion getDatos()
		{
			System.out.println(lista.get(i).getDatos());
		}
	}
}