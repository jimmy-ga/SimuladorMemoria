import java.io.*;
import java.util.*;
//import java.util.Arrays;

public class virtual
{
	LinkedList<String> lista=new LinkedList<String>();
	int cantProcesos=4;
	String tipocola="FIFO";

	public void cargamemoria()
	{
		String archivo="Procesos.txt";
		try
		{
			String linea="";
			FileReader fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);
			proceso ptemp=new proceso();
			if (tipocola.equals("FIFO")){
				while((linea=br.readLine())!=null)
				{
					String temporal[] = linea.split(",");
					String x=(temporal[0].trim()+","+temporal[1].trim()+","+temporal[2].trim()+","+temporal[3].trim()+","+temporal[4].trim());
					lista.addLast(x);
					//lista[i]=x;i++;
				}
			}
			else
			{
				while((linea=br.readLine())!=null)
				{
					String temporal[] = linea.split(",");
					String x=(temporal[0].trim()+","+temporal[1].trim()+","+temporal[2].trim()+","+temporal[3].trim()+","+temporal[4].trim());
					lista.addLast(x);
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public void ingresoProcesos()
	{
		for (int i=0;i<cantProcesos;i++)
		{
			String temp=lista.remove(0);
			String temporal[]=temp.split(",");
			proceso pr=new proceso(temporal[0].trim(),temporal[1].trim(),Integer.parseInt(temporal[2].trim()),temporal[3].trim(),Integer.parseInt(temporal[4].trim()));
			System.out.println(pr.getDatos());
		}
	}


	public static void main(String args[])
	{
		virtual v=new virtual();
		v.cargamemoria();
		v.ingresoProcesos();
	}
}