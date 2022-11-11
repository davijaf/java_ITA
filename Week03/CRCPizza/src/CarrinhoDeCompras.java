import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CarrinhoDeCompras {

	public int valorTotal;
	public static ArrayList<String> pizzas = new ArrayList<String>();

	public void calculaValor(Pizza p) {
		int preco = p.getPreco();
		if(preco <= 0) {
			System.out.println("ALERTA: "+p.nomePizza+" sem ingredientes, favor adicione-os!"+"\n");
		}
		else
			pizzas.add(p.nomePizza);
			valorTotal += preco;
	}
	
	public void imprimirTotal() {
		System.out.println("**** Carrinho de Compras ****");
		System.out.println("Quantidade de pizza(s) : "+pizzas.size());
		System.out.println("Valor total : "+valorTotal+" R$.");
//		System.out.println("Pizzas : "+pizzas);
		System.out.println("*****************************"+"\n");
	}
	
	public void imprimirIngredientes() {
		Map<String,Integer> map = new HashMap<String,Integer>();
		for(String str:Pizza.ingredientes) {
			Integer count = map.get(str);
			if(count==null) {
				map.put(str, 1);
			} else {
				map.put(str, ++count);
			}
		}
		final Set<String> keySet = map.keySet();
			System.out.println("*** Lista de Ingredientes ***");
		for(String str:keySet) {
			System.out.println(str+" : "+map.get(str));
		}
		System.out.println("*****************************");
	}
	
	public int getcalculaValor() {
		return valorTotal;
	}
	
	public static void limpaPizzas() {
		pizzas.clear();
	}
}
