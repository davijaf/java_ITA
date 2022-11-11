
public class CarroSoma extends CarroDeCorrida{
	private int potencia;
	
	public CarroSoma(String nome, int potencia,int velMaxima) {
		super(nome,velMaxima);
		this.potencia = potencia;
	}
	
	@Override
	public void acelerar() {
		velocidade += potencia;
		if(velocidade > velMaxima)
			velocidade = velMaxima;
	}
}
