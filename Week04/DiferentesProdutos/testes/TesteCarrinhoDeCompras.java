import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Pacote.CarrinhoDeCompras;
import Pacote.Produto;
import Pacote.ProdutoComTamanho;

public class TesteCarrinhoDeCompras {

	Produto p1, p2, p3;
	ProdutoComTamanho p4, p5, p6;
	CarrinhoDeCompras c1;
	
	@Before
	public void inicializaProduto() {
		p1 = new Produto("Camisa 1","0001",10.00);
		p2 = new Produto("Camisa 1","0001",10.00);
		p3 = new Produto("Camisa 2","0002",30.00);
		p4 = new ProdutoComTamanho("Camisa 3","0003",20.00,"P");
		p5 = new ProdutoComTamanho("Camisa 3","0003",20.00,"P");
		p6 = new ProdutoComTamanho("Camisa 3","0003",20.00,"M");
		c1 = new CarrinhoDeCompras();
	}
	
	@Test
	public void testProdutoNaoSimilar() {
		c1.adicionaProduto(new Produto("Camisa 4","0004",10.00),1);
		assertEquals(false,c1.produtoSimilar(p1));
	}
	
	@Test
	public void testProdutoSimilar() {
		c1.adicionaProduto(new Produto("Camisa 1","0001",10.00),1);
		assertEquals(true,c1.produtoSimilar(p1));
	}

	@Test
	public void testNenhumProduto() {
		assertEquals(0,c1.getQuantidadeProdutos());
	}
	
	@Test
	public void testAdiciona2Produtos() {
		c1.adicionaProduto(p1,3);
		c1.adicionaProduto(p3,5);
		assertEquals(8,c1.getQuantidadeProdutos());
	}
	
	@Test
	public void testRemove1Produto() {
		c1.adicionaProduto(p1,1);
		c1.removeProduto(p1,1);
		assertEquals(0,c1.getQuantidadeProdutos());
	}
	
	@Test
	public void testRemoveVariosProdutos() {
		c1.adicionaProduto(p1,3);
		c1.removeProduto(p1,1);
		c1.adicionaProduto(p2,2);
		c1.removeProduto(p2,1);
		c1.adicionaProduto(p3,1);
		c1.removeProduto(p3,1);
		c1.adicionaProduto(p4,1);
		c1.removeProduto(p4,1);
		c1.adicionaProduto(p5,1);
		assertEquals(4,c1.getQuantidadeProdutos());
	}
	
	@Test
	public void testRemoveProdutoInexisteCarrinho() {
		c1.removeProduto(p6,1);
		assertEquals(0,c1.getQuantidadeProdutos());
	}
	
	@Test
	public void testValorTotalSemProduto() {
		assertEquals(0,c1.valorTotal(),0.01);
	}
	
	@Test
	public void testValorTotalComProduto() {
		c1.adicionaProduto(p1,1);
		c1.adicionaProduto(p2,1);
		c1.adicionaProduto(p3,1);
		c1.adicionaProduto(p4,1);
		c1.adicionaProduto(p5,1);
		c1.adicionaProduto(p6,1);
		assertEquals(110,c1.valorTotal(),0.01);
	}
	
	@Test
	public void testValorTotalComProdutoRemovido() {
		c1.adicionaProduto(p1,1);
		c1.adicionaProduto(p2,1);
		c1.adicionaProduto(p3,1);
		c1.adicionaProduto(p4,1);
		c1.adicionaProduto(p5,1);
		c1.adicionaProduto(p6,1);
		c1.removeProduto(p1,1);
		assertEquals(100,c1.valorTotal(),0.01);
	}
	
	@Test
	public void testValorTotalComTodosProdutosRemovidos() {
		c1.adicionaProduto(p1,1);
		c1.adicionaProduto(p2,1);
		c1.adicionaProduto(p3,1);
		c1.adicionaProduto(p4,1);
		c1.adicionaProduto(p5,1);
		c1.adicionaProduto(p6,1);
		c1.removeProduto(p1,1);
		c1.removeProduto(p2,1);
		c1.removeProduto(p3,1);
		c1.removeProduto(p4,1);
		c1.removeProduto(p5,1);
		c1.removeProduto(p6,1);
		assertEquals(0,c1.valorTotal(),0.01);
	}
}
