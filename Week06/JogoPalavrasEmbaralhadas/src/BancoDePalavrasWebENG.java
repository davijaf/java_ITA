import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.*;


public class BancoDePalavrasWebENG implements BancoDePalavras{
    static String webService2 = "https://api.api-ninjas.com/v1/randomword";
    static int codigoSucesso = 200;
    String stringPalavra = null;
    public BancoDePalavrasWebENG() throws Exception {
    	try {
            URL url = new URL(webService2);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
            
                        
            if (conexao.getResponseCode() != codigoSucesso)
                throw new RuntimeException("HTTP error code : " + conexao.getResponseCode());

            BufferedReader resposta = new BufferedReader(new InputStreamReader((conexao.getInputStream())));
            
            
            JsonParser gsonparser = new JsonParser();
            JsonElement stringJson = gsonparser.parse(resposta);
            Gson gson = new Gson();
            Palavra palavra = gson.fromJson(stringJson, Palavra.class);
            stringPalavra = palavra.toString();
            
            
        } catch (Exception e) {
            throw new Exception("ERRO: " + e);
        }	
    }
    @Override
    public String getPalavra() {
    	return stringPalavra;
    }
}
