package org.inheritance.shop;

import java.util.LinkedList;
import java.util.Scanner;

public class Carrello {

	public static void main(String[] args) {
		
		LinkedList<Prodotto> listaProdotti = new LinkedList<Prodotto>();
		String[] tipiDiProdotto = {"SMARTPHONE", "TELEVISORE", "CUFFIE"};
		
		listaProdotti = productInsert(tipiDiProdotto);
		
		
	private static void visualizzaCarrello() {
			
		Scanner input = new Scanner(System.in);
		
		boolean addStatus = true;
		
		String rispostaUtente;
		
		while (addStatus) {
		
			System.out.println("/----------------------------------------------\\");		
			System.out.println("/--------- Vuoi inserire altri prodotti? ------\\");	
			System.out.println("/-- (S : continua / N : visualizza carrello) --\\");
			
			rispostaUtente = input.nextLine().toUpperCase();
			
			if (rispostaUtente.equals("N")) {
			
				addStatus=false;	
				break;	
				
			} else if (!rispostaUtente.equals("S")) {	
			
				addStatus = true;
				System.out.println("/-------- (***** Inserisci S / N *****) -------\\");
				
			} else {
				
				addStatus = false;	
				break;
			}
			
			input.close();	
		}
				
	}

	
	
	private static Prodotto productInsert(String[]...tipiDiProdotto) {
		
		Scanner input = new Scanner(System.in);
		boolean addStatus = true;
		String rispostaUtente;
		
		while (addStatus) {
			System.out.println("/---------------------------------------------\\");
			System.out.println("/------- Quale Prodotto Vuoi Inserire? -------\\");
			System.out.println("/------ (Smartphone, Televisore, Cuffie) -----\\");
			rispostaUtente = input.nextLine().toUpperCase();
			
			if (tipiDiProdotto[0].equals(rispostaUtente)) {
				
				listaProdotti.add(new Smartphone("Galaxy","Samsung", (short) 256, 22.50)); 
				System.out.println("/--------- Prodotto Smartphone inserito -------\\");
				addStatus = false;
				break;
				
			} else if (tipiDiProdotto[1].equals(rispostaUtente)) {
				
				listaProdotti.add(new Televisore("Cadzum","LG", 55, false, 22.50)); 
				System.out.println("/--------- Prodotto Televisore inserito -------\\");
				addStatus = false;
				break;
				
			} else if (tipiDiProdotto[2].equals(rispostaUtente)) {
				
				listaProdotti.add(new Cuffie("MDR","Sony", "Rosso", true, 22.50)); 
				System.out.println("/--------- Prodotto Cuffie inserito -----------\\");
				addStatus = false;
				break; 
				
			} else {
				System.out.println("*** Hai inserito: "+ rispostaUtente +" ***");
				System.out.println("*** Inserisci: Smartphone, Televisore, Cuffie ***");
			}
		}
		input.close();
		return listaProdotti;
	}
}
