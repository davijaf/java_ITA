
public class Principal {

	public static void main(String[] args) {
		
		Informal i = new Informal();
		System.out.println(i.formatarNome("Davi", "Araújo"));
		
		Respeitoso r = new Respeitoso(false);
		System.out.println(r.formatarNome("Davi", "Araújo"));
		
		ComTitulo t = new ComTitulo("Exmo.");
		System.out.println(t.formatarNome("Davi", "Araújo"));
	}

}
