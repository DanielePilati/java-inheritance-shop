package org.inheritance.shop;

public class Cuffie extends Prodotto{

	private String colore;
	private boolean isWireless;
	
	public Cuffie () {
	}
	public Cuffie (String colore, boolean isWireless) {
		this.colore = colore;
		this.isWireless = isWireless;
	}
	public Cuffie (String colore) {
		this.colore = colore;
	}
	public Cuffie (boolean isWireless) {
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
