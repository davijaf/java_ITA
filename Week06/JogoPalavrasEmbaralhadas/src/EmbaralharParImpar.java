
public class EmbaralharParImpar implements Embaralhador{
	
	@Override
	public String embaralhar(String palavra) {
		char[] arrayPalavra = new char[palavra.length()];
		
		for (int i = 0; i < palavra.length(); i++) {
			if(i%2==0 && i!=palavra.length()-1){	
				arrayPalavra[i+1] = palavra.charAt(i);
			}
			if(i%2==1 && i!=palavra.length()-1){	
				arrayPalavra[i-1] = palavra.charAt(i);
			}
			else if (i==palavra.length()-1 && palavra.length()%2==0){
				arrayPalavra[i-1] = palavra.charAt(i);
			}
			else if (i==palavra.length()-1 && palavra.length()%2==1){
				arrayPalavra[i] = palavra.charAt(i);
			}
		}
		StringBuilder stringEmbaralhada = new StringBuilder();
		stringEmbaralhada.append(arrayPalavra);
		//System.out.println(stringEmbaralhada.toString());
		return stringEmbaralhada.toString();
	}
}