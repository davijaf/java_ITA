package Pacote;

public class Principal {

	public static void main(String[] args) {
		CarrinhoDeCompras c1 = new CarrinhoDeCompras();
		
		c1.adicionaProduto(new Produto("Camisa 1","0001",10.00),3);
		c1.adicionaProduto(new Produto("Camisa 2","0002",15.00),2);
		
		c1.removeProduto(new Produto("Camisa 2","0002",15.00),1);
		c1.removeProduto(new Produto("Camisa 1","0001",10.00),1);
		c1.removeProduto(new Produto("Camisa 4","0004",10.00),1);
		 
		c1.adicionaProduto(new ProdutoComTamanho("Camisa 3","0003",30.00,"P"),3);
		c1.adicionaProduto(new ProdutoComTamanho("Camisa 3","0003",30.00,"M"),1);
		c1.adicionaProduto(new ProdutoComTamanho("Camisa 3","0003",30.00,"G"),1);
		
		c1.adicionaProduto(new ProdutoComTamanho("Camisa 3","0003",30.00,"GG"),1);
		
		c1.removeProduto(new ProdutoComTamanho("Camisa 3","0003",30.00,"P"),2);
		c1.removeProduto(new ProdutoComTamanho("Camisa 3","0003",30.00,"XG"),1);
		
		c1.imprimirCarrinho();
	}

}