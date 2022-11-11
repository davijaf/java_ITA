import static org.junit.Assert.*;
//import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import org.junit.After;
import org.junit.Test;

public class testePizzaIngredientes {
	
	@After
	public void afterClass(){
		CarrinhoDeCompras.limpaPizzas();
		Pizza.limpaIngredientes();
	}
	
	@Test
	public void pizza0() {
		Pizza p0 = new Pizza();
		p0.nomePizza = "Pizza Vazia";
		
		ArrayList<String> list1 = p0.getcontabilizaIngrediente();
		ArrayList<String> list2 = new ArrayList<String>();
		assertEquals(list1,list2);
		}

	@Test
	public void pizza1() {
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("Ingrediente01");
		p1.nomePizza = "Pizza 1 ingrediente";
		
		ArrayList<String> list1 = p1.getcontabilizaIngrediente();
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Ingrediente01");
		assertEquals(list1,list2);
		}

	@Test
	public void pizza2() {
		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("Ingrediente01");
		p2.adicionaIngrediente("Ingrediente02");
		p2.nomePizza = "Pizza 2 ingredientes";
		
		ArrayList<String> list1 = p2.getcontabilizaIngrediente();
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Ingrediente01");
		list2.add("Ingrediente02");
		assertEquals(list2,list1);
		}
	
	@Test
	public void pizza3() {
		Pizza p3 = new Pizza();
		p3.adicionaIngrediente("Ingrediente01");
		p3.adicionaIngrediente("Ingrediente02");
		p3.adicionaIngrediente("Ingrediente03");
		p3.nomePizza = "Pizza 3 ingredientes";
		
		ArrayList<String> list1 = p3.getcontabilizaIngrediente();
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Ingrediente01");
		list2.add("Ingrediente02");
		list2.add("Ingrediente03");
		assertEquals(list2,list1);
		}
	
	@Test
	public void pizza4() {
		Pizza p4 = new Pizza();
		p4.adicionaIngrediente("Ingrediente01");
		p4.adicionaIngrediente("Ingrediente02");
		p4.adicionaIngrediente("Ingrediente03");
		p4.adicionaIngrediente("Ingrediente04");
		p4.nomePizza = "Pizza 4 ingredientes";
		
		ArrayList<String> list1 = p4.getcontabilizaIngrediente();
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Ingrediente01");
		list2.add("Ingrediente02");
		list2.add("Ingrediente03");
		list2.add("Ingrediente04");
		assertEquals(list2,list1);
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
		
		ArrayList<String> list1 = p5.getcontabilizaIngrediente();
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Ingrediente01");
		list2.add("Ingrediente02");
		list2.add("Ingrediente03");
		list2.add("Ingrediente04");
		list2.add("Ingrediente05");
		assertEquals(list2,list1);
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

		ArrayList<String> list1 = p6.getcontabilizaIngrediente();
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Ingrediente01");
		list2.add("Ingrediente02");
		list2.add("Ingrediente03");
		list2.add("Ingrediente04");
		list2.add("Ingrediente05");
		list2.add("Ingrediente06");
		assertEquals(list2,list1);
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
		
		ArrayList<String> list1 = p7.getcontabilizaIngrediente();
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Ingrediente01");
		list2.add("Ingrediente02");
		list2.add("Ingrediente03");
		list2.add("Ingrediente04");
		list2.add("Ingrediente05");
		list2.add("Ingrediente06");
		list2.add("Ingrediente07");
		assertEquals(list2,list1);
		}
	
	@Test
	public void pizzas() {
		
		Pizza p0 = new Pizza();
		p0.nomePizza = "Pizza Vazia";
		
		Pizza p1 = new Pizza();
		p1.nomePizza = "Pizza de Calabreza";
		p1.adicionaIngrediente("Calabresa");
		p1.adicionaIngrediente("Mussarela");
				
		Pizza p2 = new Pizza();
		p2.nomePizza = "Pizza da Casa";
		p2.adicionaIngrediente("Frango");
		p2.adicionaIngrediente("Mussarela");
		p2.adicionaIngrediente("Bacon");
		p2.adicionaIngrediente("Calabresa");
		
		Pizza p3 = new Pizza();
		p3.nomePizza = "Pizza 4 Queijos";
		p3.adicionaIngrediente("Mussarela");
		p3.adicionaIngrediente("Bacon");
		p3.adicionaIngrediente("Parmesão");
		p3.adicionaIngrediente("Gorgonzola");
		p3.adicionaIngrediente("Provolone");
		p3.adicionaIngrediente("Queijo Prato");
		
		ArrayList<String> list1 = p3.getcontabilizaIngrediente();
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Calabresa");
		list2.add("Mussarela");
		list2.add("Frango");
		list2.add("Mussarela");
		list2.add("Bacon");
		list2.add("Calabresa");
		list2.add("Mussarela");
		list2.add("Bacon");
		list2.add("Parmesão");
		list2.add("Gorgonzola");
		list2.add("Provolone");
		list2.add("Queijo Prato");
		assertEquals(list2,list1);

		}

}
