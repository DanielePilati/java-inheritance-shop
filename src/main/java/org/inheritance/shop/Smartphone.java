package org.inheritance.shop;

import org.inheritance.shop.utilities.UtilsGenerator;

class Smartphone extends Prodotto {
	
	private String imeiCode;
	private short memory;
	
	public Smartphone () {
		this.imeiCode = generateIMEICode();
	}
	public Smartphone (String nome) {
		super (nome);
	}
	public Smartphone (Short memory) {
		this.imeiCode =  generateIMEICode();
		this.memory = memory;
	}
	public Smartphone (String nome, Short memory) {
		super (nome);
		this.imeiCode =  generateIMEICode();
		this.memory = memory;
	}
	public Smartphone (String nome, String marca,Short memory) {
		super (nome, marca);
		this.imeiCode =  generateIMEICode();
		this.memory = memory;
	}
	public Smartphone (String nome, String marca,Short memory, double prezzo) {
		super(nome, marca, prezzo);
		this.imeiCode =  generateIMEICode();
		this.memory = memory;
	}

		
	public String getImeiCode() {
		return this.imeiCode;
	}
	public void setImeiCode(String imeiCode) {
		this.imeiCode = imeiCode;
	}
	public short getMemory() {
		return this.memory;
	}
	public void setMemory(short memory) {
		this.memory = memory;
	}
	
    @Override
	public void dettagliProdotto() {
		super.dettagliProdotto();
		System.out.println("Memoria : " + this.memory);
		System.out.println("Codice IMEI : " + this.imeiCode);
		System.out.println("--------------- /Dettagli Prodotto -------------");
	}
	@Override
	public String toString() {
		return  super.toString() +
				"\n Memoria : " + this.memory +
				"\n Codice IMEI : " + this.imeiCode +
				"\n --------------- /Dettagli Prodotto -------------";
	}
	
	public static String generateIMEICode() {
		return format09Left(UtilsGenerator.generateRandomLong()) + format05Left(UtilsGenerator.generateRandomShort());
	}
	
	public static String format09Left(long code) {
		return String.format("%09d",code);
	}
}
