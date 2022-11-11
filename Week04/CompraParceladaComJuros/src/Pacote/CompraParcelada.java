package Pacote;

import java.lang.Math;

public class CompraParcelada extends Compra{

	private int parcelas;
	private double taxaDeJuros;
	
	// Construtor
	public CompraParcelada(double total, int parcelas, double taxaDeJuros) {
		super(total);
		this.parcelas = parcelas;
		this.taxaDeJuros = taxaDeJuros;
	}
	
	@Override
	public double total() {
		//Montante (M)-Capital (C)-Taxa (i)-Período de tempo (t)
		//M = C * (1 + i) elevado a t
		total = total * Math.pow(1 + this.taxaDeJuros, this.parcelas); 
		return total;
	}	
	
	 // Getters and setters

	public int getParcelas() {
		return parcelas;
	}

	public void setParcelas(int parcelas) {
		this.parcelas = parcelas;
	}

	public double getTaxaDeJuros() {
		return taxaDeJuros;
	}

	public void setTaxaDeJuros(double taxaDeJuros) {
		this.taxaDeJuros = taxaDeJuros;
	}

}
