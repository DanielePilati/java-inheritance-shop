package org.inheritance.shop;

import org.inheritance.shop.serio.utilities.SerioUtil;

public class Smartphone extends Prodotto {
	
	private String imeiCode;
	private short memory;
	
	public Smartphone () {
		this.imeiCode = SerioUtil.format09Left(SerioUtil.getRandomLong())+SerioUtil.format05Left(SerioUtil.getRandomShort());
	}
	public Smartphone (Short memory) {
		this.imeiCode = SerioUtil.format09Left(SerioUtil.getRandomLong())+SerioUtil.format05Left(SerioUtil.getRandomShort());
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
