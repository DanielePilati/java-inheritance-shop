package org.inheritance.shop;
import java.text.DecimalFormat;

import org.inheritance.shop.utilities.*;

 class Prodotto {

	private String codice;
	private String nome;
	private String marca;
	private double prezzo;
	private double iva = 1.22;
	
	public Prodotto() {
		this.codice = generateRandomCode();
	}
	
	public Prodotto(String nome) {
		this.codice = generateRandomCode();
		this.nome = nome;
	}
	
	public Prodotto(String nome, String marca) {
		this.codice = generateRandomCode();
		this.nome = nome;
		this.marca = marca;
	}
	
	public Prodotto(String nome, String marca, double prezzo) {
		this.codice = generateRandomCode();
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
	}
	
	public Prodotto(String nome, String marca, double prezzo, double iva) {
		this.codice = generateRandomCode();
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
		this.iva = iva;
	}
	
	public String getCodice() {
		return this.codice;
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return this.marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPrezzo() {
		return this.prezzo;
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
	public double getPrezzoIvato() {
		return this.prezzo * this.iva;
	}
	
	public void dettagliProdotto() {
		System.out.println(this.toString());

	}
	
	@Override
	public String toString() {
		return "--------------- Dettagli Prodotto --------------" +
				"\n Codice : " + this.codice +
				"\n Nome : " + this.nome +
				"\n Marca : " + this.marca +
				"\n Prezzo : " + toDecimalFormat(this.prezzo) +
				"\n iva : " + toDecimalFormat(getIva()) +
				"\n Prezzo ivato : " + toDecimalFormat(getPrezzoIvato());
	}
	
	public static String generateRandomCode () {
		return format05Left(UtilsGenerator.generateRandomShort());
	}
	
	public static String format05Left(short code) {
		return String.format("%05d",code);
	}
	
	public static String toDecimalFormat(double number) {
		final DecimalFormat decfor = new DecimalFormat("0.00");  
		return decfor.format(number);
	}

}
