package org.inheritance.shop;

public class Televisore extends Prodotto{

	private double inch;
	private boolean isSmart;
	
	public Televisore () {
		
	}
	public Televisore (String nome, double inch, boolean isSmart) {
		super(nome);
		this.inch = inch;
		this.isSmart = isSmart;
	}
	public Televisore (String nome, String marca,  double inch, boolean isSmart) {
		super(nome, marca);
		this.inch = inch;
		this.isSmart = isSmart;
	}
	public Televisore (double inch, boolean isSmart) {
		this.inch = inch;
		this.isSmart = isSmart;
	}
	public Televisore (double inch) {
		this.inch = inch;
	}
	public Televisore (boolean isSmart) {
		this.isSmart = isSmart;
	}
	
	public double getInch() {
		return inch;
	}
	public void setInch(double inch) {
		this.inch = inch;
	}
	public boolean isSmart() {
		return isSmart;
	}
	public void setSmart(boolean isSmart) {
		this.isSmart = isSmart;
	}
	
	
}