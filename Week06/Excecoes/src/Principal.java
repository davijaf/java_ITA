
public class Principal {

	public static void main(String[] args) throws Exception {
		a(-100);
		System.out.println("Finalizando execução de Main");
		
	}
	
	public static void a(int i)  {
		System.out.println("executando a() com "+i);
		try {
			b(i);
		} catch (Exception e) {
			System.out.println("tratando a exceção "+e.getMessage());
		}
		System.out.println("Finalizando execução de a");
		
	}
	
	public static void b(int i) throws Exception {
		System.out.println("executando b() com "+i);
		if(i > 0)
			throw new Exception("mensagem");
		System.out.println("Finalizando execução de b");
		
	}
}
