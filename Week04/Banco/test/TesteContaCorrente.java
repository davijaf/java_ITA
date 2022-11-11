import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteContaCorrente {

	
	@Test
	void testDepositar0() {
		ContaCorrente c1 = new ContaCorrente();
		c1.depositar(100);
		assertEquals(100,c1.saldo);
	}
	
	@Test
	void testSacar0() {
		ContaCorrente c1 = new ContaCorrente();
		c1.depositar(100);
		assertEquals(100,c1.saldo);
		assertEquals(100,c1.sacar(100));
		assertEquals(0,c1.saldo);
	}
	
	@Test
	void testSacar1() {
		ContaCorrente c1 = new ContaCorrente();
		c1.depositar(99);
		assertEquals(99,c1.saldo);
		assertEquals(0,c1.sacar(100));
		assertEquals(99,c1.saldo);
	}

}
