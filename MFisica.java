package infra2;
import java.util.ArrayList;

public class MFisica {
    ArrayList Tamaño_Memoria;
    int Tmem;

    public MFisica(ArrayList Tamaño_Memoria, int Tmem) {
        this.Tamaño_Memoria = Tamaño_Memoria;
        this.Tmem = Tmem;
        
    }

    public int getTmem() {
        return Tmem;
    }

    public void setTmem(int Tmem) {
        this.Tmem = Tmem;
    }

    public ArrayList getTamaño_Memoria() {
        return Tamaño_Memoria;
    }

    public void setTamaño_Memoria(ArrayList Tamaño_Memoria) {
        this.Tamaño_Memoria = Tamaño_Memoria;
    }
    
    public void CargarProceso(proceso p){
        if(p.getMem()<= Tmem){
            Tamaño_Memoria.add(p);
        }
	Tmem = Tmem - p.getMem();
		
    }
}