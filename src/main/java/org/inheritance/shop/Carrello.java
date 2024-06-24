package org.inheritance.shop;

import java.util.LinkedList;
import java.util.Scanner;

public class Carrello {
	
	private static Scanner input = null;
	
	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		boolean addStatus = true;

		LinkedList<Prodotto> listaProdotti = new LinkedList<Prodotto>();
				
		String[] tipiDiProdotto = {"SMARTPHONE", "TELEVISORE", "CUFFIE"};
			
		while (addStatus) {		
			productInsert(listaProdotti,tipiDiProdotto);
			addStatus = checkOutChoice();
		}
		checkOut(listaProdotti);
		input.close();
	}
	private static void checkOut(LinkedList<Prodotto> listaProdotti) {
		
		System.out.println("------- Il tuo carrello: -------------");
		for (Prodotto prodotto : listaProdotti) {
			System.out.println("------- Prodotto: "+ (listaProdotti.indexOf(prodotto)+1) +" -------------");
	    	System.out.println(prodotto.toString());
	      }
	}		
	private static boolean checkOutChoice() {
		
		while (true) {
			System.out.println("/----------------------------------------------\\");
			System.out.println("/--------- Vuoi inserire altri prodotti? ------\\");
			System.out.println("/-- (S : continua / N : visualizza carrello) --\\");
			String rispostaUtente = input.nextLine().toUpperCase();
			
			if (rispostaUtente.equals("N")) {
				return false;	
			}
			if (rispostaUtente.equals("S")) {			
				return true;	
			} 
			System.out.println("/-------- (***** Inserisci S / N *****) -------\\");
		}
	}
	private static void productInsert(LinkedList<Prodotto> listaProdotti, String[] tipiDiProdotto) {	
		
		while (true) {
			System.out.println("/---------------------------------------------\\");
			System.out.println("/------- Quale Prodotto Vuoi Inserire? -------\\");
			System.out.println("/------ (Smartphone, Televisore, Cuffie) -----\\");
			String rispostaUtente = input.nextLine().toUpperCase();
			
			if (tipiDiProdotto[0].equals(rispostaUtente)) {
				listaProdotti.add(new Smartphone("Galaxy","Samsung", (short) 256, 22.50)); 
				System.out.println("/--------- Prodotto Smartphone inserito -------\\");
				break;
			
			} else if (tipiDiProdotto[1].equals(rispostaUtente)) {
				listaProdotti.add(new Televisore("Cadzum","LG", 55, false, 22.50)); 
				System.out.println("/--------- Prodotto Televisore inserito -------\\");
				break;
				
			} else if (tipiDiProdotto[2].equals(rispostaUtente)) {
				listaProdotti.add(new Cuffie("MDR","Sony", "Rosso", true, 22.50)); 
				System.out.println("/--------- Prodotto Cuffie inserito -----------\\");
				break; 
				
			} else {
				System.out.println("*** Hai inserito: "+ rispostaUtente +" ***");
				System.out.println("*** Inserisci: Smartphone, Televisore, Cuffie ***");
			}
		}
	}
}