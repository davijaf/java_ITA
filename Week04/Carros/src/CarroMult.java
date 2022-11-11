
public class CarroMult extends CarroDeCorrida{
	
	private double potencia;
	
	public CarroMult(String nome, double potencia,int velMaxima) {
		super(nome,velMaxima);
		if(potencia > 1 && potencia < 2) {
			this.potencia = potencia;
		}else {
			this.potencia = 1.5;
		}
	}
	
	@Override
	public void acelerar() {
		if(velocidade == 0) {
			velocidade = 10;
		}
		velocidade *= potencia;
		if(velocidade > velMaxima)
			velocidade = velMaxima;
	}
}
