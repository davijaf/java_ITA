
public class Carro {
	int potencia;
	int velocidade;
	String nome;
	
	void acelerar() {
		velocidade += potencia;
	}
	
	void frear() {
		velocidade = velocidade / 2;
	}
	
	public int getVelocidade() {
		return velocidade;
	}
	void imprimir() {
		System.out.println("O carro "+nome+" está a velocidade de "+getVelocidade()+" Km/h");
	}
	
	/* Construtores da Classe
	 Carro(int potencia) {
		this.potencia = potencia;
		velocidade = 0;
	}*/
}
