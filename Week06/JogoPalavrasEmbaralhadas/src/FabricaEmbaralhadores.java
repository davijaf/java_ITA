import java.util.Random;

public class FabricaEmbaralhadores {
	
	private Embaralhador[] e = new Embaralhador[3];
	private Random gerador = new Random();
	private int seleciona = gerador.nextInt(3);
	
	protected String embaralhar(String palavra) throws Exception {
		e[0] = new EmbalhararReverso();
		e[1] = new EmbaralharOrdemCrescente();
		e[2] = new EmbaralharParImpar();
		return e[seleciona].embaralhar(palavra);
	}
}
