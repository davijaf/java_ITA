
public class FabricaMecanicaDoJogo {
	
	private MecanicaDoJogo[] e = new MecanicaDoJogo[3];
	
	protected int[] jogar(Boolean gamerPontua, Integer pontosDoGamer, Integer jogadasDoGamer, Integer fimDoJogo, Integer nivelJogo, Integer resultadoJogo) {
		e[0] = new JogoNivelIniciante();
		e[1] = new JogoNivelIntermediario();
		e[2] = new JogoNivelExperiente();
		return e[nivelJogo].jogar(gamerPontua,pontosDoGamer,jogadasDoGamer,fimDoJogo,resultadoJogo);
	}
}
