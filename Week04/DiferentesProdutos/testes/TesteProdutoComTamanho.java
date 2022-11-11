import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import Pacote.ProdutoComTamanho;

public class TesteProdutoComTamanho {
	
	ProdutoComTamanho p1, p2, p3;
	
	@Before
	public void inicializaProduto() {
		p1 = new ProdutoComTamanho("Camisa 1","0001",10.00,"P");
		p2 = new ProdutoComTamanho("Camisa 1","0001",10.00,"P");
		p3 = new ProdutoComTamanho("Camisa 1","0001",10.00,"M");
	}
	
	@Test
	public void testNome() {
		assertEquals("Camisa 1",p1.getNome());
	}
	
	@Test
	public void testCodigo() {
		assertEquals("0001",p1.getCodigo());
	}
	
	@Test
	public void testPreco() {
		assertEquals(10.00,p1.getPreco(),0.01);
	}
	
	@Test
	public void testTamanho() {
		assertEquals("P",p1.getTamanho());
		assertEquals("P",p2.getTamanho());
		assertEquals("M",p3.getTamanho());
	}
	
	@Test
	public void testHashCodeIdenticos() {
		assertEquals(p2.hashCode(),p1.hashCode());
		assertEquals(true,p2.hashCode()==p1.hashCode());
	}
	
	@Test
	public void testEqualsIdenticos() {
		assertEquals(p2.equals(p1),p1.equals(p2));
		assertEquals(true,p1.equals(p2));
	}
	
	@Test
	public void testHashCodeDiferentes() {
		assertEquals(1777355448,p1.hashCode());
		assertEquals(1777355448,p2.hashCode());
		assertEquals(1777355445,p3.hashCode());
		assertEquals(p3.hashCode()!=p1.hashCode(),p3.hashCode()!=p2.hashCode());
		assertEquals(true,p3.hashCode()!=p1.hashCode());
	}
	
	@Test
	public void testEqualsDiferentes() {
		assertEquals(false,p1.equals(p3));
		assertEquals(false,p3.equals(p1));
	}


}
