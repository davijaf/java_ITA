import java.util.Scanner;

public class Principal {
	
	private static Boolean gamerPontua;
	private static Integer nivelJogo = 0;
	private static Integer fonteDePalavras = 0;
	private static int[] resultados= {0,0,0,0};
	
	private static FabricaEmbaralhadores fEmbaralhadores = new FabricaEmbaralhadores();
	private static FabricaMecanicaDoJogo fMecanica = new FabricaMecanicaDoJogo();
	private static FabricaBancoDePalavras fBanco = new FabricaBancoDePalavras();
	
	
	public static void main(String[] args) throws Exception {
		aberturaDoJogo();
		System.out.println("*********************************************************");
		chamaBancoDePalavras();
		System.out.println("*********************************************************");
		regrasDoJogo();
		System.out.println("*********************************************************");
		jogada();		
		resultadoDoJogo();
		System.out.println("*********************************************************");
	} 
	
	
	private static void aberturaDoJogo() {
		System.out.println("Bem Vindo ao Jogo das Palavras Embaralhadas!");
		System.out.println("Escolha o nível de dificuldade do jogo:");
		System.out.println("Digite 0 para nível iniciante");
		System.out.println("Digite 1 para nível intermediário");
		System.out.println("Digite 2 para nível experiente");
		System.out.print("Digite o nível: ");
		@SuppressWarnings("resource")
		Scanner entradaJogo= new Scanner(System.in);
		String strEntradaJogo= entradaJogo.nextLine();
		System.out.println("Você Digitou: "+strEntradaJogo); 
		nivelJogo =  Integer.parseInt(strEntradaJogo);
	}
	
	private static void chamaBancoDePalavras() {
		System.out.println("Defina a fonte de origem das palavras!");
		System.out.println("Digite 0 para lista de palavras de Tecnologia em português");
		System.out.println("Digite 1 para API randômica de palavras em inglês");
		System.out.println("Digite 2 para API randômica de palavras em português");
		System.out.print("Digite o número para fonte selecionada: ");
		@SuppressWarnings("resource")
		Scanner entradaFonteDePalavras= new Scanner(System.in);
		String strFonteDePalavras= entradaFonteDePalavras.nextLine();
		System.out.println("Você Digitou: "+strFonteDePalavras); 
		fonteDePalavras =  Integer.parseInt(strFonteDePalavras);
	}
	
	
	private static void regrasDoJogo() {
		System.out.println("REGRAS:");
		if (nivelJogo==0){
			System.out.println("Você possui 6 tentativas");
			System.out.println("Deve acertar no mínimo 3");
			System.out.println("Deve errar menos de 3");
		}
		if (nivelJogo==1){
			System.out.println("Você possui 10 tentativas");
			System.out.println("Deve acertar no mínimo 6");
			System.out.println("Deve errar menos de 4");
		}
		if (nivelJogo==2){
			System.out.println("Você possui 20 tentativas");
			System.out.println("Deve acertar no mínimo 14");
			System.out.println("Deve errar menos de 6");
		}
	}
	
	private static void jogada() throws Exception {
		while (resultados[2] == 0) {
			
			System.out.println("Digite a palavra correta abaixo:");
			
			String palavra = fBanco.getPalavra(fonteDePalavras);
			String strTeste= fEmbaralhadores.embaralhar(palavra);
			System.out.println(strTeste);
			
			@SuppressWarnings("resource")
			Scanner entradaUsuario= new Scanner(System.in);
			System.out.print("Digite a palavra: ");  
			String strEntrada= entradaUsuario.nextLine();
			System.out.println("Você Digitou: "+strEntrada); 
			
			if (palavra.equals(strEntrada)) {
				gamerPontua = true;
				System.out.println("Parabéns! A palavra correta é "+palavra);
			}
			else {
				gamerPontua = false;
				System.out.println("Você errou! A palavra correta é "+palavra);
			}
			System.out.println("*********************************************************");
			resultados = (int[]) fMecanica.jogar(gamerPontua,resultados[0],resultados[1],resultados[2], nivelJogo, resultados[3]);
		}	
	}
	
	private static void resultadoDoJogo() {
		if (resultados[3]==1) {
			System.out.println("PARABÉNS, você venceu!");
		} else {
			System.out.println("Desculpe, você NÃO atingiu a pontuação necessária!");
		}
		int erros = resultados[1]-resultados[0];
		System.out.println("Acertos : "+resultados[0]); 
		System.out.println("Erros : "+erros);
		System.out.println("Total de palavras : "+resultados[1]);
	}

}