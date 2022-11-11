import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProcessadorArquivo {
	static String b;
	String s;
	static String arquivo;
	static Map <String,String> hmap;{
	hmap= new HashMap<String,String>();
	}
	
	
		static Map<String,String> processar(String arquivo) throws LeituraArquivoException ,FileNotFoundException,ArrayIndexOutOfBoundsException { 
		
		File file = new File(arquivo);
		if(!file.canRead()) {
			b="1";
		}
		Scanner sc = new Scanner(file);
		while (sc.hasNextLine()){
			  String s = sc.nextLine();
			  if(s.isEmpty()) {
				 System.out.println(s);
				 b="0";} 
			 if (s.contains("->->" )| !s.contains("->")){
				b="2";
				 
			  }
			  String[] partes=s.split("->");
			  String parte1=partes[0];
			  String parte2=partes[1];
		  	  hmap.put(parte1, parte2);
		}
		sc.close();
		return hmap;}
		
}
		
		
		
	


		
		
		
	

