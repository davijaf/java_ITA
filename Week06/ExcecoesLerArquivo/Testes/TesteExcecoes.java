
import static org.junit.Assert.assertEquals;
import java.io.FileNotFoundException;
import org.junit.Test;

public class TesteExcecoes {

	@Test
	public void testabrirArquivo() {
		new ProcessadorArquivo();
		try {
			ProcessadorArquivo.processar("ArquivoNaoExistente.txt");
			if(ProcessadorArquivo.b=="1"); 	
		}catch (LeituraArquivoException e) {
			String s=e.toString();
			System.out.println("Erros : "+s);
		}catch(FileNotFoundException e) {
			String s=e.toString();
			System.out.println("Erro ao abrir o arquivo : "+s);
			}
		}
	
	@Test
	public void testArquivoCerto() throws LeituraArquivoException,FileNotFoundException,ArrayIndexOutOfBoundsException {
		new ProcessadorArquivo();
		try {
			ProcessadorArquivo.processar("ArquivoCerto.txt");
			if(ProcessadorArquivo.b=="0"); 
				
		}catch (LeituraArquivoException e) {
			String s=e.toString();
			System.out.println("Erros : "+s);
		}catch(FileNotFoundException e) {
				String s=e.toString();
				System.out.println("Erro ao abrir o arquivo : "+s);
				}
		System.out.println(ProcessadorArquivo.hmap);
		assertEquals(ProcessadorArquivo.hmap.containsKey("nome"),true);
		}
	
	@Test
	public void testArquivoVazio() throws LeituraArquivoException,FileNotFoundException,ArrayIndexOutOfBoundsException {
		new ProcessadorArquivo();
		try {
			ProcessadorArquivo.processar("ArquivoVazio.txt");
			if(ProcessadorArquivo.b=="0"); 
		}catch (LeituraArquivoException e) {
			String s=e.toString();
			System.out.println("Erros : "+s);
		}catch (ArrayIndexOutOfBoundsException e) {
			String s=e.toString();
			System.out.println(new LeituraArquivoException("","Arquivo vazio  ").toString()+ "  "+s);}
		System.out.println(ProcessadorArquivo.hmap);
		assertEquals(ProcessadorArquivo.hmap.containsKey("nome"),false);
		}
	
	@Test
	public void testArquivoFormato() throws LeituraArquivoException,FileNotFoundException,ArrayIndexOutOfBoundsException {
		
		new ProcessadorArquivo();
		try {
			ProcessadorArquivo.processar("ArquivoErrado.txt");
			if(ProcessadorArquivo.b=="2"); 
		}catch (LeituraArquivoException e) {
			String s=e.toString();
			System.out.println("Erros : "+s);
		}catch (ArrayIndexOutOfBoundsException e) {
			String s=e.toString();
			System.out.println(new LeituraArquivoException("","Formato de arquivo invalido  ").toString()+ "  "+s);}
			assertEquals(ProcessadorArquivo.b,"2");
		}
}	