
public class FabricaBancoDePalavras {
	private BancoDePalavras[] e = new BancoDePalavras[3];
	protected String getPalavra(Integer fonteDePalavras) throws Exception {
		e[0] = new BancoDePalavrasLocal();
		e[1] = new BancoDePalavrasWebENG();
		e[2] = new BancoDePalavrasWebPT();
		return e[fonteDePalavras].getPalavra();
	}
}
