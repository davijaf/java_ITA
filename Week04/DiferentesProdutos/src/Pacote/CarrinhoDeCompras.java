package Pacote;
import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {
	
	private Map<Produto, Integer> produtos = new HashMap<>();
	
	public boolean produtoSimilar(Produto produto) {
		for(Produto produto2 : produtos.keySet()) {
	        if(produto.equals(produto2) && produto.hashCode() == produto2.hashCode()) {
	        	return true;
	        };
		}
		return false;
	}
	
	
	public void adicionaProduto(Produto produto, int quantidadeProdutos) {
		if(produtoSimilar(produto)){
			int quantidade = produtos.get(produto);
			quantidade += quantidadeProdutos;
			produtos.put(produto, quantidade);
			}
		else
			produtos.put(produto, quantidadeProdutos);
	}
	
	public void removeProduto(Produto produto, int quantidadeProdutos) {
		if(produtoSimilar(produto)){
			int quantidade = produtos.get(produto);
			quantidade -= quantidadeProdutos;
			if(quantidade<=0) {
				produtos.remove(produto);
				}
			else 
				produtos.put(produto, quantidade);
			}
		else{
			System.out.println("ATENÇÃO - Produto "+produto.nome+", tamanho "+produto.getTamanho()+" , não consta no carrinho de compras!");
			produtos.remove(produto);
		}
	}
	
	public void imprimirCarrinho() {
		String format = "%-10s %-10s %-10s %-10s%n";
		System.out.println("************************************************");
		System.out.format(format, "Nome","Quantidade","Tamanho","Preço Unit.(R$)");
		System.out.println("************************************************");
		for(Produto produto : produtos.keySet()) {
			System.out.format(format,produto.getNome(),produtos.get(produto),produto.getTamanho(),produto.preco);
		}
		System.out.println("************************************************");
		System.out.println("O valor total do carrinho é de : "+valorTotal()+" R$");
	}
	
	public double valorTotal() {
		double total = 0;
		for(Produto produto : produtos.keySet()) {
			total += produtos.get(produto)* produto.preco;
		}
		return total;
	}
	
    public int getQuantidadeProdutos() {
    	int quantidadeProdutos = 0;
		for(Produto produto : produtos.keySet()) {
			quantidadeProdutos += produtos.get(produto);
		}
		return quantidadeProdutos;
    }
    
    public Map<Produto, Integer> getProdutos() {
        return produtos;
    }
}
