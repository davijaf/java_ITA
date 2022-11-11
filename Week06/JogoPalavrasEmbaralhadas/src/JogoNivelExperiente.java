
public class JogoNivelExperiente implements MecanicaDoJogo{
	int jogadasPermitidas = 20; 
	int limiteAcertos = 14;
	int limiteErros = 6; 
	@Override
	public int[] jogar(Boolean gamerPontua,Integer pontosDoGamer, Integer jogadasDoGamer, Integer fimDoJogo, Integer resultadoJogo) {
		int[] resultado = {0, 0, 0, 0}; // {Integer pontosDoGamer, Integer errosDoGamer, Integer jogadasDoGamer}
		resultado[1] = jogadasDoGamer + 1;
		if (gamerPontua) {
			resultado[0] = pontosDoGamer + 1;
			} 
		else {
			resultado[0] = pontosDoGamer;
			}
		if (resultado[1] < jogadasPermitidas && resultado[0] < limiteAcertos && (resultado[1]-resultado[0])<limiteErros){
			resultado[2] = 0;
			return resultado;
		} else {
			if ((resultado[1]-resultado[0])<limiteErros) {resultado[3] = 1;}
			resultado[2] = 1;
			return resultado;
		}
	}
}
