import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class testeCarrinhoImpedeVazia {
	
	@After
	public void afterClass(){
		CarrinhoDeCompras.limpaPizzas();
		Pizza.limpaIngredientes();
	}
		
	@Test
	public void carrinho0() {
		CarrinhoDeCompras c0 = new CarrinhoDeCompras();
		Pizza p0 = new Pizza();
		p0.nomePizza = "Pizza Vazia";
		c0.calculaValor(p0);

		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("Ingrediente01");
		p1.nomePizza = "Pizza 1 ingrediente";
		c0.calculaValor(p1);

		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("Ingrediente01");
		p2.adicionaIngrediente("Ingrediente02");
		p2.nomePizza = "Pizza 2 ingredientes";
		c0.calculaValor(p2);

		Pizza p3 = new Pizza();
		p3.adicionaIngrediente("Ingrediente01");
		p3.adicionaIngrediente("Ingrediente02");
		p3.adicionaIngrediente("Ingrediente03");
		p3.nomePizza = "Pizza 3 ingredientes";
		c0.calculaValor(p3);
		
		assertEquals(3,CarrinhoDeCompras.pizzas.size()); //Verificar se impede a adição de uma pizza sem ingredientes.
		}
	
	@Test
	public void carrinho1() {
		CarrinhoDeCompras c1 = new CarrinhoDeCompras();
		Pizza p4 = new Pizza();
		p4.adicionaIngrediente("Ingrediente01");
		p4.adicionaIngrediente("Ingrediente02");
		p4.adicionaIngrediente("Ingrediente03");
		p4.adicionaIngrediente("Ingrediente04");
		p4.nomePizza = "Pizza 4 ingredientes";
		c1.calculaValor(p4);

		Pizza p5 = new Pizza();
		p5.adicionaIngrediente("Ingrediente01");
		p5.adicionaIngrediente("Ingrediente02");
		p5.adicionaIngrediente("Ingrediente03");
		p5.adicionaIngrediente("Ingrediente04");
		p5.adicionaIngrediente("Ingrediente05");
		p5.nomePizza = "Pizza 5 ingredientes";
		c1.calculaValor(p5);

		Pizza p6 = new Pizza();
		p6.adicionaIngrediente("Ingrediente01");
		p6.adicionaIngrediente("Ingrediente02");
		p6.adicionaIngrediente("Ingrediente03");
		p6.adicionaIngrediente("Ingrediente04");
		p6.adicionaIngrediente("Ingrediente05");
		p6.adicionaIngrediente("Ingrediente06");
		p6.nomePizza = "Pizza 6 ingredientes";
		c1.calculaValor(p6);

		Pizza p7 = new Pizza();
		p7.adicionaIngrediente("Ingrediente01");
		p7.adicionaIngrediente("Ingrediente02");
		p7.adicionaIngrediente("Ingrediente03");
		p7.adicionaIngrediente("Ingrediente04");
		p7.adicionaIngrediente("Ingrediente05");
		p7.adicionaIngrediente("Ingrediente06");
		p7.adicionaIngrediente("Ingrediente07");
		p7.nomePizza = "Pizza 7 ingredientes";
		c1.calculaValor(p7);
		
		assertEquals(4,CarrinhoDeCompras.pizzas.size()); //Verificar se impede a adição de uma pizza sem ingredientes.
		}
	
	@Test
	public void carrinho2() {
		CarrinhoDeCompras c2 = new CarrinhoDeCompras();
		
		Pizza p0 = new Pizza();
		p0.nomePizza = "Pizza Vazia";
		c2.calculaValor(p0);
		
		Pizza p1 = new Pizza();
		p1.nomePizza = "Pizza de Calabreza";
		p1.adicionaIngrediente("Calabresa");
		p1.adicionaIngrediente("Mussarela");
		c2.calculaValor(p1);
				
		Pizza p2 = new Pizza();
		p2.nomePizza = "Pizza da Casa";
		p2.adicionaIngrediente("Frango");
		p2.adicionaIngrediente("Mussarela");
		p2.adicionaIngrediente("Bacon");
		p2.adicionaIngrediente("Calabresa");
		c2.calculaValor(p2);
		
		Pizza p3 = new Pizza();
		p3.nomePizza = "Pizza 4 Queijos";
		p3.adicionaIngrediente("Mussarela");
		p3.adicionaIngrediente("Bacon");
		p3.adicionaIngrediente("Parmesão");
		p3.adicionaIngrediente("Gorgonzola");
		p3.adicionaIngrediente("Provolone");
		p3.adicionaIngrediente("Queijo Prato");
		c2.calculaValor(p3);
		
		assertEquals(3,CarrinhoDeCompras.pizzas.size()); // Verificar se impede a adição de uma pizza sem ingredientes.
		}

}
