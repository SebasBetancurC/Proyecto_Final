package proyecto.cafe.internet;

import java.util.ArrayList;

public class Computador implements Comparable<Computador> {
	
	public String marca;
	public String id;
	ArrayList<String> listTipoPC = new ArrayList<String>();
	
public int prioridad;
	
	
	@Override
	public int compareTo(Computador otroComputador) {
		return otroComputador.prioridad - this.prioridad;
		
		
	}
	


}
