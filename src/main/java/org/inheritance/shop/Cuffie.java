package org.inheritance.shop;

public class Cuffie extends Prodotto{

	private String colore;
	private boolean isWireless;
	
	public Cuffie () {
	}
	public Cuffie (String nome) {
		super(nome);
	}
	public Cuffie (String nome, String marca) {
		super(nome, marca);
	}
	public Cuffie (String nome, String marca, String colore) {
		super(nome, marca);
		this.colore = colore;
	}
	public Cuffie (String nome, String marca, String colore, boolean isWireless) {
		super(nome, marca);
		this.colore = colore;
		this.isWireless = isWireless;
	}
	public Cuffie (String nome, String marca, String colore, boolean isWireless, double prezzo) {
		super(nome, marca, prezzo);
		this.colore = colore;
		this.isWireless = isWireless;
	}
	
	
	public String getColore() {
		return colore;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
	public boolean isWireless() {
		return isWireless;
	}
	public void setWireless(boolean isWireless) {
		this.isWireless = isWireless;
	}
}
