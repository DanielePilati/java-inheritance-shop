package org.inheritance.shop;

import org.inheritance.shop.utilities.UtilsGenerator;

class Smartphone extends Prodotto {
	
	private String imeiCode;
	private short memory;
	
	public Smartphone () {
		this.imeiCode = UtilsGenerator.generateIMEICode();
	}
	public Smartphone (String nome) {
		super(nome);
	}
	public Smartphone (Short memory) {
		this.imeiCode =  UtilsGenerator.generateIMEICode();
		this.memory = memory;
	}
	public Smartphone (String nome, Short memory) {
		super(nome);
		this.imeiCode =  UtilsGenerator.generateIMEICode();
		this.memory = memory;
	}
	public Smartphone (String nome, String marca,Short memory) {
		super(nome, marca);
		this.imeiCode =  UtilsGenerator.generateIMEICode();
		this.memory = memory;
	}
	public Smartphone (String nome, String marca,Short memory, double prezzo) {
		super(nome, marca, prezzo);
		this.imeiCode =  UtilsGenerator.generateIMEICode();
		this.memory = memory;
	}

		
	public String getImeiCode() {
		return imeiCode;
	}
	public void setImeiCode(String imeiCode) {
		this.imeiCode = imeiCode;
	}
	public short getMemory() {
		return memory;
	}
	public void setMemory(short memory) {
		this.memory = memory;
	}
	
	public void dettagliProdotto() {
		super.dettagliProdotto();
		System.out.println("Memoria : " + this.memory);
		System.out.println("Codice IMEI : " + this.imeiCode);
		System.out.println("--------------- /Dettagli Prodotto -------------");
	}
}
