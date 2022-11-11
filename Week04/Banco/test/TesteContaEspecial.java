import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class TesteContaEspecial {
		
	@Test
	void testDepositar0() {
		ContaEspecial c1 = new ContaEspecial(100);
		c1.depositar(100);
		assertEquals(100,c1.saldo);
	}
	
	@Test
	void testSacar0() {
		ContaEspecial c1 = new ContaEspecial(100);
		c1.depositar(100);
		assertEquals(100,c1.saldo);
		assertEquals(100,c1.sacar(100));
		assertEquals(0,c1.saldo);
	}
	
	@Test
	void testSacar1() {
		ContaEspecial c1 = new ContaEspecial(100);
		c1.depositar(99);
		assertEquals(99,c1.saldo);
		assertEquals(100,c1.sacar(100));
		assertEquals(-1,c1.saldo);
	}
	
	@Test
	void testSacarLimite() {
		ContaEspecial c1 = new ContaEspecial(100);
		c1.depositar(100);
		assertEquals(100,c1.saldo);
		assertEquals(0,c1.sacar(201));
		assertEquals(100,c1.saldo);
	}


}
