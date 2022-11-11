package Testes;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import Pacote.Compra;
import Pacote.CompraParcelada;

public class TesteCompra {

	@Test
	public void testCompraVista() {
		Compra c1 = new Compra(1000);
		assertEquals(1000.00,c1.total(),0.01);
	}
	
	@Test
	public void testCompra00Parcela() {
		CompraParcelada c1 = new CompraParcelada(1000,0,0.01);
		assertEquals(1000.00,c1.total(),0.01);
	}
	
	@Test
	public void testCompra01Parcela() {
		CompraParcelada c1 = new CompraParcelada(1000,1,0.01);
		assertEquals(1010.00,c1.total(),0.01);
	}
	
	@Test
	public void testCompra02Parcela() {
		CompraParcelada c1 = new CompraParcelada(1000,2,0.01);
		assertEquals(1020.1,c1.total(),0.1);
	}
	
	@Test
	public void testCompra05Parcela() {
		CompraParcelada c1 = new CompraParcelada(1000,5,0.01);
		assertEquals(1051.01,c1.total(),0.01);
	}
	
	@Test
	public void testCompra10Parcela() {
		CompraParcelada c1 = new CompraParcelada(1000,10,0.01);
		assertEquals(1104.62,c1.total(),0.01);
	}

}
