import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;


public class BancoDePalavrasLocal implements BancoDePalavras{
   
	
	String stringPalavra = null;
	
	public BancoDePalavrasLocal() throws IOException {
		String [] palavras = new String[35];
		int i = 0;
		
		File file = new File("palavras.txt");
		
		if(file.exists())
		{
			Scanner inputFile = new Scanner(file);
			while (inputFile.hasNext() && i < palavras.length)
			{
				palavras[i] = inputFile.nextLine();
				i++;
			}
			
			inputFile.close();
		}
		Random random = new Random();
        stringPalavra = palavras[random.nextInt(palavras.length)];;
    }
    @Override
    public String getPalavra() {
    	return stringPalavra;
    }
}
