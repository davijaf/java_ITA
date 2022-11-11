
public class LeituraArquivoException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mensagem;

	public LeituraArquivoException(String mensagem,String message) {
		super(message);
		this.mensagem = mensagem;
	}
	
	

	public String getMensagem() {
		return mensagem;
	}


}
