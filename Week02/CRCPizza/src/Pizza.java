import java.util.ArrayList;

public class Pizza {

	public static ArrayList<String> ingredientes = new ArrayList<String>();
	public int totalIngredientes;
	public String nomePizza;
	
	public static void contabilizaIngrediente(String ingrediente) {
		ingredientes.add(ingrediente);
	}
	
	public void adicionaIngrediente(String ingrediente) {
		totalIngredientes += 1;
		contabilizaIngrediente(ingrediente);
	}
	
	public int getPreco() {
		if(totalIngredientes > 0 && totalIngredientes <= 2) {return 15;}
		if(totalIngredientes > 2 && totalIngredientes <= 5) {return 20;}
		if(totalIngredientes > 5) {return 23;}
		else return 0;
	}
	

}
