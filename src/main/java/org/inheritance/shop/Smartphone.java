package org.inheritance.shop;

import org.inheritance.shop.serio.utilities.SerioUtil;

public class Smartphone extends Prodotto {
	
	private String imeiCode;
	private short memory;
	
	public Smartphone () {
		this.imeiCode = SerioUtil.getIMEICode();
	}
	public Smartphone (Short memory) {
		this.imeiCode =  SerioUtil.getIMEICode();
		this.memory = memory;
	}
	public Smartphone (String nome, Short memory) {
		super(nome);
		this.imeiCode =  SerioUtil.getIMEICode();
		this.memory = memory;
	}
	public Smartphone (String nome, String marca,Short memory) {
		super(nome, marca);
		this.imeiCode =  SerioUtil.getIMEICode();
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
	
	
}