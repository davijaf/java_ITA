package Pacote;

public class Principal {

	public static void main(String[] args) {
		
		CompraParcelada c1 = new CompraParcelada(1000, 0, 0.01);
		System.out.println(c1.total());	
		
		CompraParcelada c2 = new CompraParcelada(1000, 1, 0.01);
		System.out.println(c2.total());	
		
		CompraParcelada c3 = new CompraParcelada(1000, 2, 0.01);
		System.out.println(c3.total());	
		
		CompraParcelada c4 = new CompraParcelada(1000, 5, 0.01);
		System.out.println(c4.total());	
		
		CompraParcelada c5 = new CompraParcelada(1000, 10, 0.01);
		System.out.println(c5.total());	

	}

}
