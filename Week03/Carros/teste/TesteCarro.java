import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TesteCarro {

	@Test
	public void testAcelerar() {
		Carro c = new Carro();
		c.potencia = 10;
		c.acelerar();
		assertEquals(10,c.getVelocidade());
	}
	
	@Test
	public void testCarroParado() {
		Carro c = new Carro();
		assertEquals(0,c.getVelocidade());
		
	}
	
	@Test
	public void testCarroFrear() {
		Carro c = new Carro();
		c.potencia = 10;
		c.acelerar();
		c.frear();
		assertEquals(5,c.getVelocidade());
	}
	
	@Test
	public void testoFrearAteZero() {
		Carro c = new Carro();
		c.potencia = 10;
		c.acelerar();
		c.frear();
		c.frear();
		c.frear();
		c.frear();
		assertEquals(0,c.getVelocidade());
	}
}
