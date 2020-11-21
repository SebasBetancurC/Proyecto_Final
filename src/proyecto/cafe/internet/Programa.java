package proyecto.cafe.internet;

public class Programa {

	public static void main(String[] args) {
		
		Cafe cafe = new Cafe();
		
		Celular cel1 = new Celular();
		
		cel1.marca = "Samsung";
		cel1.numero = "3116326896";
		cel1.minuto = 40;
		cel1.prioridadCarga = 10; //5% de carga
		cel1.listPlanMinutos.add("500");
		cafe.addCelular(cel1);
		
        Celular cel2 = new Celular();
		
		cel2.marca = "Nokia";
		cel2.numero = "3117501599";
		cel2.minuto = 10; 
		cel1.prioridadCarga = 1; //80% de carga
		cel2.listPlanMinutos.add("100");
		cafe.addCelular(cel2);
		
        Celular cel3 = new Celular();
		
		cel3.marca = "Huawei";
		cel3.numero = "3116860590";
		cel3.minuto = 57;
		cel3.prioridadCarga = 5; //20% de carga
		cel3.listPlanMinutos.add("500");
		cafe.addCelular(cel3);
		
		Celular cel4 = new Celular();
			
	    cel4.marca = "Motorola";
		cel4.numero = "3124865594";
		cel4.minuto = 25;
		cel4.prioridadCarga = 8; //9% de carga
		cel4.listPlanMinutos.add("100");
		cafe.addCelular(cel4);
		
		Celular cel5 = new Celular();
		
	    cel5.marca = "Lumix";
		cel5.numero = "3146530099";
		cel5.minuto = 45;
		cel5.prioridadCarga = 7; //10% de carga
		cel5.listPlanMinutos.add("500");
		cafe.addCelular(cel5);
		
		Computador pc1 = new Computador();
		
		pc1.marca = "Lenovo";
		pc1.id = "123";
		pc1.listTipoPC.add("Portatil");
		cafe.addComputador(pc1);
		
        Computador pc2 = new Computador();
		
		pc2.marca = "HP";
		pc2.id = "456";
		pc2.listTipoPC.add("Todo en uno");
		cafe.addComputador(pc2);
		
        Computador pc3 = new Computador();
		
		pc3.marca = "Asus";
		pc3.id = "789";
		pc3.listTipoPC.add("Portatil");
		cafe.addComputador(pc3);
		
        Computador pc4 = new Computador();
		
		pc4.marca = "Mesa";
		pc4.id = "12345";
		pc4.listTipoPC.add("Mesa");
		cafe.addComputador(pc4);
			
			
			
			
			
		
		int totalMinutosConsumidos = cafe.calcularConsumoMinutosCelular();
		
		System.out.println("");
		System.out.println("El total de minutos consumidos es de: " +totalMinutosConsumidos+ " minutos");
		System.out.println(" ");
		
		cafe.calcularPlanes();
		
		String tipoPCMasComun = cafe.calcularPCMasComun();
		System.out.println("");
		System.out.println("El tipo de computador más común en el café internet es " +tipoPCMasComun);
		
		

	}

}
