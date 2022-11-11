
public abstract class CarroDeCorrida {

	protected int velocidade;
	protected int velMaxima;
	protected String nome;

	public CarroDeCorrida(String nome,int velMaxima) {
		this.nome = nome;
		this.velMaxima = velMaxima;
		this.velocidade = 0;
	}
	
	public abstract void acelerar();
	
	public void frear() {
		velocidade = velocidade / 2;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public String getNome() {
		return nome;
	}
	
}
