package org.inheritance.shop;
import org.inheritance.shop.serio.utilities.*;

public class Prodotto {

	protected String codice;
	protected String nome;
	protected String marca;
	protected double prezzo;
	protected double iva;
	
	
	public Prodotto() {
		this.codice = SerioUtil.format05Left(SerioUtil.getRandomShort());
	}
	
	public Prodotto(String nome) {
		this.codice = SerioUtil.format05Left(SerioUtil.getRandomShort());
		this.nome = nome;
	}
	
	public Prodotto(String nome, String marca) {
		this.codice = SerioUtil.format05Left(SerioUtil.getRandomShort());
		this.nome = nome;
		this.marca = marca;
	}
	
	public Prodotto(String nome, String marca, double prezzo) {
		this.codice = SerioUtil.format05Left(SerioUtil.getRandomShort());
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
	}
	
	public Prodotto(String nome, String marca, double prezzo, double iva) {
		this.codice = SerioUtil.format05Left(SerioUtil.getRandomShort());
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
	
}