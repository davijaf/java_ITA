
public class Principal {

	public static void main(String[] args) {
		// instancia
		Aluno guerra = new Aluno();
		guerra.bim1 = 70;
		guerra.bim2 = 60;
		guerra.bim3 = 80;
		guerra.bim4 = 70;
		
		// OOB
		System.out.println(guerra.media());
		System.out.println(guerra.passouDeAno());
		
		// Prog. Estruturada
		System.out.println(VerificadoraNotas.mediaAluno(guerra));
		System.out.println(VerificadoraNotas.passouDeAno(guerra));
	}

}
