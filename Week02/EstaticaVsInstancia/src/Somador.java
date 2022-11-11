
public class Somador {
	String nome;
	int valorInstancia = 0;
	static int valorEstatica = 0;
	
	void somar() {
		valorInstancia += 1;
		valorEstatica += 1;
	}
	
	void imprimir() {
		System.out.println("O somador "+nome+": instancia = "+valorInstancia+" e estatica = "+valorEstatica);
	}
	
}
