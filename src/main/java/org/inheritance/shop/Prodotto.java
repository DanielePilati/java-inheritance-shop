package org.inheritance.shop;
import org.inheritance.shop.utilities.*;

 class Prodotto {

	private String codice;
	private String nome;
	private String marca;
	private double prezzo;
	private double iva = 1.22;
	
	public Prodotto() {
		this.codice = UtilsGenerator.generateRandomCode();
	}
	
	public Prodotto(String nome) {
		this.codice = UtilsGenerator.generateRandomCode();
		this.nome = nome;
	}
	
	public Prodotto(String nome, String marca) {
		this.codice = UtilsGenerator.generateRandomCode();
		this.nome = nome;
		this.marca = marca;
	}
	
	public Prodotto(String nome, String marca, double prezzo) {
		this.codice = UtilsGenerator.generateRandomCode();
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
	}
	
	public Prodotto(String nome, String marca, double prezzo, double iva) {
		this.codice = UtilsGenerator.generateRandomCode();
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
		this.iva = iva;
	}
	
	public String getCodice() {
		return codice;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public double getIva() {
		return (this.prezzo*this.iva)-this.prezzo;
	}
	public void setIva(double iva) {
		this.iva = iva;
	}
	
	public void dettagliProdotto() {
		System.out.println("--------------- Dettagli Prodotto --------------");
		System.out.println("Codice : " + this.codice);
		System.out.println("Nome : " + this.nome);
		System.out.println("Marca : " + this.marca);
		System.out.println("Prezzo : " + UtilsGenerator.toDecimalFormat(this.prezzo));
		System.out.println("iva : " + UtilsGenerator.toDecimalFormat(getIva()));
		System.out.println("Prezzo ivato : " + UtilsGenerator.toDecimalFormat(getPrezzoIvato()));
	}
	public double getPrezzoIvato() {
		return this.prezzo * this.iva;
	}
}
