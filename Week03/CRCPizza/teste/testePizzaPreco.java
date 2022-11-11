import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Test;

public class testePizzaPreco {
	
	@After
	public void afterClass(){
		CarrinhoDeCompras.limpaPizzas();
		Pizza.limpaIngredientes();
	}
	
	@Test
	public void pizza0() {
		Pizza p0 = new Pizza();
		p0.nomePizza = "Pizza Vazia";
		int preco = p0.getPreco();

		assertEquals(0,preco);
		}

	@Test
	public void pizza1() {
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("Ingrediente01");
		p1.nomePizza = "Pizza 1 ingrediente";
		int preco = p1.getPreco();

		assertEquals(15,preco);
		}

	@Test
	public void pizza2() {
		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("Ingrediente01");
		p2.adicionaIngrediente("Ingrediente02");
		p2.nomePizza = "Pizza 2 ingredientes";
		int preco = p2.getPreco();

		assertEquals(15,preco);
		}
	
	@Test
	public void pizza3() {
		Pizza p3 = new Pizza();
		p3.adicionaIngrediente("Ingrediente01");
		p3.adicionaIngrediente("Ingrediente02");
		p3.adicionaIngrediente("Ingrediente03");
		p3.nomePizza = "Pizza 3 ingredientes";
		int preco = p3.getPreco();

		assertEquals(20,preco);
		}
	
	@Test
	public void pizza4() {
		Pizza p4 = new Pizza();
		p4.adicionaIngrediente("Ingrediente01");
		p4.adicionaIngrediente("Ingrediente02");
		p4.adicionaIngrediente("Ingrediente03");
		p4.adicionaIngrediente("Ingrediente04");
		p4.nomePizza = "Pizza 4 ingredientes";
		int preco = p4.getPreco();

		assertEquals(20,preco);
		}
	
	@Test
	public void pizza5() {
		Pizza p5 = new Pizza();
		p5.adicionaIngrediente("Ingrediente01");
		p5.adicionaIngrediente("Ingrediente02");
		p5.adicionaIngrediente("Ingrediente03");
		p5.adicionaIngrediente("Ingrediente04");
		p5.adicionaIngrediente("Ingrediente05");
		p5.nomePizza = "Pizza 5 ingredientes";
		int preco = p5.getPreco();

		assertEquals(20,preco);
		}
	
	@Test
	public void pizza6() {
		Pizza p6 = new Pizza();
		p6.adicionaIngrediente("Ingrediente01");
		p6.adicionaIngrediente("Ingrediente02");
		p6.adicionaIngrediente("Ingrediente03");
		p6.adicionaIngrediente("Ingrediente04");
		p6.adicionaIngrediente("Ingrediente05");
		p6.adicionaIngrediente("Ingrediente06");
		p6.nomePizza = "Pizza 6 ingredientes";
		int preco = p6.getPreco();

		assertEquals(23,preco);
		}
	
	@Test
	public void pizza7() {
		Pizza p7 = new Pizza();
		p7.adicionaIngrediente("Ingrediente01");
		p7.adicionaIngrediente("Ingrediente02");
		p7.adicionaIngrediente("Ingrediente03");
		p7.adicionaIngrediente("Ingrediente04");
		p7.adicionaIngrediente("Ingrediente05");
		p7.adicionaIngrediente("Ingrediente06");
		p7.adicionaIngrediente("Ingrediente07");
		p7.nomePizza = "Pizza 7 ingredientes";
		int preco = p7.getPreco();

		assertEquals(23,preco);
		}
	
	@Test
	public void pizzas() {
		
		Pizza p0 = new Pizza();
		p0.nomePizza = "Pizza Vazia";
		int preco0 = p0.getPreco();

		assertEquals(0,preco0);
		
		Pizza p1 = new Pizza();
		p1.nomePizza = "Pizza de Calabreza";
		p1.adicionaIngrediente("Calabresa");
		p1.adicionaIngrediente("Mussarela");
		int preco1 = p1.getPreco();

		assertEquals(15,preco1);
				
		Pizza p2 = new Pizza();
		p2.nomePizza = "Pizza da Casa";
		p2.adicionaIngrediente("Frango");
		p2.adicionaIngrediente("Mussarela");
		p2.adicionaIngrediente("Bacon");
		p2.adicionaIngrediente("Calabresa");
		int preco2 = p2.getPreco();

		assertEquals(20,preco2);
		
		Pizza p3 = new Pizza();
		p3.nomePizza = "Pizza 4 Queijos";
		p3.adicionaIngrediente("Mussarela");
		p3.adicionaIngrediente("Bacon");
		p3.adicionaIngrediente("Parmesão");
		p3.adicionaIngrediente("Gorgonzola");
		p3.adicionaIngrediente("Provolone");
		p3.adicionaIngrediente("Queijo Prato");
		int preco3 = p3.getPreco();

		assertEquals(23,preco3);
		
		}

}
