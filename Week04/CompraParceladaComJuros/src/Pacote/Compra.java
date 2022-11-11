package Pacote;

public class Compra {
	
	protected double total;

	// Construtor
	public Compra(double total) {
		this.total = total;
	}
	

	 // Getters and setters
	public double total() {
		return total;
	}

	public void setValorDaCompra(double total) {
		this.total = total;
	}

}
