import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class TesteCarroMult {
	
	CarroDeCorrida c;
	
	@Before
	public void inicializaCarro() {
		c = new CarroMult("teste",1.1,200);
	}

	@Test
	public void testCarroParado() {
		assertEquals(0,c.getVelocidade());
		
	}
	
	@Test
	public void testAcelerar() {
		c.acelerar();
		assertEquals(11,c.getVelocidade());
	}
	
	@Test
	public void testAcelerar2X() {
		for(int i=0; i<2; ++i)
			c.acelerar();
		assertEquals(12,c.getVelocidade());
	}
	
	@Test
	public void testAcelerarMaxima() {
		for(int i=0; i<37; ++i)
			c.acelerar();
		assertEquals(200,c.getVelocidade());
	}
		
	@Test
	public void testCarroFrear() {
		c.acelerar();
		c.acelerar();
		c.frear();
		assertEquals(6,c.getVelocidade());
	}
	
	@Test
	public void testoFrearAteZero() {
		c.acelerar();
		c.frear();
		c.frear();
		c.frear();
		c.frear();
		assertEquals(0,c.getVelocidade());
	}
}