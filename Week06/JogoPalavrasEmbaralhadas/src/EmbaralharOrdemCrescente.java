import java.util.Arrays;

public class EmbaralharOrdemCrescente implements Embaralhador{
	
	@Override
	public String embaralhar(String palavra) {
		
		char[] arrayPalavra = new char[palavra.length()];
		
		for (int i = 0; i < palavra.length(); i++) {
				arrayPalavra[i] = palavra.charAt(i);  
		}
		StringBuilder stringEmbaralhada = new StringBuilder();
		Arrays.sort(arrayPalavra);
		stringEmbaralhada.append(arrayPalavra);
		//System.out.println(stringEmbaralhada.toString());
		return stringEmbaralhada.toString();
	}
}
