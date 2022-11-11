public class Respeitoso implements FormatadorNome {

	
	private boolean genero;


	public Respeitoso(boolean genero) {

		this.genero = genero; 
		// if true is feminino 
		// if false is masculino
	}

	public String formatarNome(String nome, String sobrenome) {

		if (genero) {
			return "Sra. " + sobrenome;
		}
		if (!genero) {
			return "Sr. " + sobrenome;
		}
		return "ALERTA: Gênero indefinido!";
	}
	
}
