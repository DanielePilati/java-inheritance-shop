package org.inheritance.shop;

public class Main {

	public static void main(String[] args) {
		
	
		Cuffie cuffie = new Cuffie("MDR","Sony", "Rosso", true, 22.50);
		cuffie.dettagliProdotto();
		Smartphone smartphone = new Smartphone("Galaxy","Samsung", (short) 256, 22.50);
		smartphone.dettagliProdotto();
		Televisore televisore = new Televisore("Cadzum","Neso", 55, false, 22.50);
		televisore.dettagliProdotto();
		
		
	}

}
