package org.inheritance.shop;

import java.util.LinkedList;
import java.util.Scanner;

public class Carrello {
	
	
	private static void checkOut(LinkedList<Prodotto> listaProdotti) {
		System.out.println("------- Il tuo carrello: -------------");
		for (Prodotto prodotto : listaProdotti) {
			System.out.println("------- Prodotto: "+ (listaProdotti.indexOf(prodotto)+1) +" -------------");
	    	System.out.println(prodotto.toString());
	      }
	}
		
	private static void checkOutChoice(boolean addStatus, Scanner input) {
		
		while (addStatus) {
			System.out.println("/----------------------------------------------\\");
			System.out.println("/--------- Vuoi inserire altri prodotti? ------\\");
			System.out.println("/-- (S : continua / N : visualizza carrello) --\\");
			String rispostaUtente = input.nextLine().toUpperCase();
			
			if (rispostaUtente.equals("N")) {
				addStatus=false;
				break;
				
			} else if (!rispostaUtente.equals("S")) {	
				System.out.println("/-------- (***** Inserisci S / N *****) -------\\");
				
			} else {
				addStatus = true;
				break;
			}
		}
	}
	
	private static void productInsert(boolean addStatus, Scanner input, LinkedList<Prodotto> listaProdotti, String[] tipiDiProdotto) {	
	
		while (addStatus) {
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
		input.close();
	}
	
	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		
		boolean addStatus = true;

		LinkedList<Prodotto> listaProdotti = new LinkedList<Prodotto>();
				
		String[] tipiDiProdotto = {"SMARTPHONE", "TELEVISORE", "CUFFIE"};
			
		while (addStatus) {		
			Carrello.productInsert(addStatus,input,listaProdotti,tipiDiProdotto);
			checkOutChoice(addStatus, input);
		}
		checkOut(listaProdotti);
	}
}