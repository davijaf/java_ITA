import java.io.FileNotFoundException;

public class Principal {

	public static void main(String[] args) {
		new ProcessadorArquivo();
		System.out.println("Hmap vazio :");
		System.out.println(ProcessadorArquivo.hmap);
		try {
			ProcessadorArquivo.processar("ArquivoCerto.txt");
			System.out.println("Hmap processado :");
			System.out.println(ProcessadorArquivo.hmap);
		}catch (LeituraArquivoException e) {
			String s=e.toString();
			System.out.println("Erros : "+s);
		}catch(FileNotFoundException e) {
				String s=e.toString();
				System.out.println("Erro ao abrir o arquivo : "+s);
				}

}
}
