package proyecto.cafe.internet;

import java.util.ArrayList;

public class Celular implements Comparable<Celular>{
	
	public String marca;
	public String numero;
	public int carga;
	public int minuto;
	ArrayList<String> listPlanMinutos = new ArrayList<String>();
	
	
	public int prioridadCarga;
	
	
	@Override
	public int compareTo(Celular otroCelular) {
		return otroCelular.prioridadCarga - this.prioridadCarga;
		
		
	}
	
	

}
