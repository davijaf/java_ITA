
public class EmbalhararReverso implements Embaralhador{
	
	@Override
	public String embaralhar(String palavra) {
	char[] arrayPalavra = new char[palavra.length()];
	
	for (int i = 0; i < palavra.length(); i++) {
			arrayPalavra[palavra.length()-1-i] = palavra.charAt(i);
	}
	StringBuilder stringEmbaralhada = new StringBuilder();
	stringEmbaralhada.append(arrayPalavra);
	//System.out.println(stringEmbaralhada.toString());
	return stringEmbaralhada.toString();
	}
}
