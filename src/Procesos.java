
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AlexCifuentes
 */
public class Procesos {
        private int proceso;
	private int tiempo;
        //private static ArrayList<Procesos> atenProceso = new ArrayList<>();

    

    Procesos(int Valor, int Tiempo) {
        this.proceso = Valor;
        this.tiempo = Tiempo;
    }

    public int getProceso() {
        return proceso;
    }

    public void setProceso(int proceso) {
        this.proceso = proceso;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    
    @Override
	public String toString() {
		return this.getProceso()+ "  Con prioridad  " + this.getTiempo();
    }
   
    
}
