package Pacote;

public class Produto {
	protected String nome;
	protected String codigo;
	protected double preco;
	
	// Construtor
	public Produto(String nome,String codigo, double preco) {
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
	}
	
	 // Getters and setters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
    
    public String getCodigo() {
        return codigo;
    }
    
	public String getTamanho() {
		return "Único";
	}
    
    // Equals e hashcode()
    
	@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
        Produto other = (Produto) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        return true;
    }
}
