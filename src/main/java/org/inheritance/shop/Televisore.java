package org.inheritance.shop;

 class Televisore extends Prodotto{

	private double inch;
	private boolean isSmart;
	
	public Televisore () {
	}
	public Televisore (String nome) {
		super (nome);
	}
	public Televisore (String nome, String marca) {
		super (nome, marca);
	}
	public Televisore (String nome, String marca,  double inch) {
		super (nome, marca);
		this.inch = inch;
	}
	public Televisore (String nome, String marca,  double inch, boolean isSmart) {
		super (nome, marca);
		this.inch = inch;
		this.isSmart = isSmart;
	}
	public Televisore (String nome, String marca,  double inch, boolean isSmart, double prezzo) {
		super (nome, marca, prezzo);
		this.inch = inch;
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
	
    @Override
	public void printMe() {
		super.printMe();
		System.out.println(this.toString());

	}
	@Override
	public String toString() {
		return  super.toString() + 
				"\n Pollici : " + this.inch +
				"\n Smart : " + this.isSmart +
				"\n --------------- /Dettagli Prodotto -------------";
	}
}
