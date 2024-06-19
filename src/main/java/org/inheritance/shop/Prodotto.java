package org.inheritance.shop;
import org.inheritance.shop.serio.utilities.*;

public class Prodotto {

	protected String codice;
	protected String nome;
	protected String marca;
	protected double prezzo;
	protected double iva;
	
	public Prodotto() {
		this.codice = SerioUtil.getRandomCode();;
	}
	
	public Prodotto(String nome) {
		this.codice = SerioUtil.getRandomCode();;
		this.nome = nome;
	}
	
	public Prodotto(String nome, String marca) {
		this.codice = SerioUtil.getRandomCode();;
		this.nome = nome;
		this.marca = marca;
	}
	
	public Prodotto(String nome, String marca, double prezzo) {
		this.codice = SerioUtil.getRandomCode();
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
	}
	
	public Prodotto(String nome, String marca, double prezzo, double iva) {
		this.codice = SerioUtil.getRandomCode();;
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
		return iva;
	}
	public void setIva(double iva) {
		this.iva = iva;
	}
	
	public void dettagliProdotto() {
		System.out.println("--------------- Dettagli Prodotto --------------");
		System.out.println("Codice : " + this.codice);
		System.out.println("Nome : " + this.nome);
		System.out.println("Marca : " + this.marca);
		System.out.println("Prezzo : " + this.marca);
		System.out.println("iva : " + this.marca);
		System.out.println("--------------- /Dettagli Prodotto -------------");
	}
}
