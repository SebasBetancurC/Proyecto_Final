package proyecto.cafe.internet;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.PriorityQueue;
import java.util.Queue;



public class Cafe {

	Queue<Celular> colaCelulares = new PriorityQueue<>();

	public void addCelular(Celular celular) {
		colaCelulares.add(celular);
	}

	public int calcularConsumoMinutosCelular() {
		int totalMinutosConsumidos = 0;

		System.out.println("Poner a cargar celulares con este orden de prioridad ");
		System.out.println(" ");

		for (Celular celular : colaCelulares) {

			System.out.println("Celular : " + celular.marca);
			totalMinutosConsumidos = totalMinutosConsumidos + celular.minuto;

		}
		return totalMinutosConsumidos;
	}

	public String calcularPlanes() {
		Hashtable<String, Integer> hashPlanes = new Hashtable<String, Integer>();

		for (Celular celular : colaCelulares) {
			for (String plan : celular.listPlanMinutos) {
				int cant = 1;
				if (hashPlanes.containsKey(plan)) {
					cant = hashPlanes.get(plan);
					cant++;
				}
				hashPlanes.put(plan, cant);
			}
		}

		hashPlanes.forEach((key, value) -> {
			System.out.println("Hay " + value + " celulares con plan de " + key + " minutos ");

		});

		return " ";
	}

	
	
	Queue<Computador> colaComputadores = new PriorityQueue<>();

	public void addComputador(Computador computador) {
		colaComputadores.add(computador);
	}

	public String calcularPCMasComun() {
		Hashtable<String, Integer> hashTipos = new Hashtable<String, Integer>();

		for (Computador computador : colaComputadores) {
			for (String tipo : computador.listTipoPC) {
				int cant = 1;
				if (hashTipos.containsKey(tipo)) {
					cant = hashTipos.get(tipo);
					cant++;
				}
				hashTipos.put(tipo, cant);
			}
		}
		
		
		
		
		int mayor = 0;
		String tipoQueMasSeRepite = "";
		
		Enumeration<String> enumeration = hashTipos.keys();
		while(enumeration.hasMoreElements()) {
			String key = enumeration.nextElement();
			if(hashTipos.get(key)>mayor) {
				tipoQueMasSeRepite = key;
			}
		}
		
		
			
		
		return tipoQueMasSeRepite;
	}

}
