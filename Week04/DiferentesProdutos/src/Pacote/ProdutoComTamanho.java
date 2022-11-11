package Pacote;

public class ProdutoComTamanho extends Produto{
	
	private String tamanho;
	
	public ProdutoComTamanho(String nome, String codigo, double preco, String tamanho) {
		super(nome, codigo, preco);
		this.tamanho = tamanho;
	}

	public String getTamanho() {
		return tamanho;
	}

 // Equals e hashcode()
	@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((tamanho == null) ? 0 : tamanho.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ProdutoComTamanho other = (ProdutoComTamanho) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (tamanho == null) {
            if (other.tamanho != null)
                return false;
        } else if (!tamanho.equals(other.tamanho))
            return false;
        return true;
    }
	
	
	
}
