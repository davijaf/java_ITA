
public class Relogio {
	long tempoTeste = 1666467530707L; // equivalente à 22/10/2022
	public long agora() {
		long i = tempoTeste -  System.currentTimeMillis();
		if (i == 0) {
			return  System.currentTimeMillis();
		}
		else
			return tempoTeste;
	}

}
