package org.inheritance.shop;

import java.util.LinkedList;
import java.util.Scanner;

public class Carrello {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String rispostaUtente;
		
		boolean addStatus = true;
		
		String[] tipiDiProdotto = {"SMARTPHONE", "TELEVISORE", "CUFFIE"};
		
		LinkedList<Prodotto> listaProdotti = new LinkedList<Prodotto>();
		
		
		while (addStatus) {
			
			while (addStatus) {
				
				System.out.println("/---------------------------------------------\\");
				System.out.println("/------- Quale Prodotto Vuoi Inserire? -------\\");
				System.out.println("/------ (Smartphone, Televisore, Cuffie) -----\\");
				rispostaUtente = input.nextLine().toUpperCase();
				
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
			
			while (addStatus) {
				
				System.out.println("/----------------------------------------------\\");
				System.out.println("/--------- Vuoi inserire altri prodotti? ------\\");
				System.out.println("/-- (S : continua / N : visualizza carrello) --\\");
				rispostaUtente = input.nextLine().toUpperCase();
				
				if (rispostaUtente.equals("N")) {
					addStatus=false;
					break;
				} else if (!rispostaUtente.equals("S")) {
					System.out.println("/-------- (***** Inserisci S / N *****) -------\\");
				} else {
					break;
				}
			}
		}
		input.close();
		System.out.println("------- Il tuo carrello: -------------");
		for (Prodotto prodotto : listaProdotti) {
			System.out.println("------- Prodotto: "+ (listaProdotti.indexOf(prodotto)+1)+" -------------");
	    	System.out.println(prodotto.toString());
	      }
	}
}
