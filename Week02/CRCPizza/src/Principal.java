
public class Principal {

	public static void main(String[] args) {
		
		CarrinhoDeCompras c1 = new CarrinhoDeCompras();
		
		Pizza p0 = new Pizza();
		p0.nomePizza = "Pizza Vazia";
		c1.calculaValor(p0);
		
		Pizza p1 = new Pizza();
		p1.nomePizza = "Pizza de Calabreza";
		p1.adicionaIngrediente("Calabresa");
		p1.adicionaIngrediente("Mussarela");
		c1.calculaValor(p1);
				
		Pizza p2 = new Pizza();
		p2.nomePizza = "Pizza da Casa";
		p2.adicionaIngrediente("Frango");
		p2.adicionaIngrediente("Mussarela");
		p2.adicionaIngrediente("Bacon");
		p2.adicionaIngrediente("Calabresa");
		c1.calculaValor(p2);
		
		Pizza p3 = new Pizza();
		p3.nomePizza = "Pizza 4 Queijos";
		p3.adicionaIngrediente("Mussarela");
		p3.adicionaIngrediente("Bacon");
		p3.adicionaIngrediente("Parmesão");
		p3.adicionaIngrediente("Gorgonzola");
		p3.adicionaIngrediente("Provolone");
		p3.adicionaIngrediente("Queijo Prato");
		c1.calculaValor(p3);
		
		c1.imprimirTotal();
		
		c1.imprimirIngredientes();
		
	}

}
