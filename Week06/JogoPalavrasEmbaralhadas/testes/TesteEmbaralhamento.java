import static org.junit.Assert.*;

import org.junit.Test;

public class TesteEmbaralhamento {
	
	@Test
	public void testEmbaralharParImpar1() {
		EmbaralharParImpar e = new EmbaralharParImpar();
		String palavraEmbaralhada = e.embaralhar("casa");
		assertEquals("acas",palavraEmbaralhada);
	}
	
	@Test
	public void testEmbaralharParImpar2() {
		EmbaralharParImpar e = new EmbaralharParImpar();
		String palavraEmbaralhada = e.embaralhar("paralelepipedo");
		assertEquals("aparelelipepod",palavraEmbaralhada);
	}
	
	@Test
	public void testEmbaralharOrdemCrescente1() {
		EmbaralharOrdemCrescente e = new EmbaralharOrdemCrescente();
		String palavraEmbaralhada = e.embaralhar("casa");
		assertEquals("aacs",palavraEmbaralhada);
	}
	
	@Test
	public void testEmbaralharOrdemCrescente2() {
		EmbaralharOrdemCrescente e = new EmbaralharOrdemCrescente();
		String palavraEmbaralhada = e.embaralhar("paralelepipedo");
		assertEquals("aadeeeillopppr",palavraEmbaralhada);
	}
	
	@Test
	public void testEmbalhararReverso1() {
		EmbalhararReverso e = new EmbalhararReverso();
		String palavraEmbaralhada = e.embaralhar("casa");
		assertEquals("asac",palavraEmbaralhada);
	}
	
	@Test
	public void testEmbalhararReverso2() {
		EmbalhararReverso e = new EmbalhararReverso();
		String palavraEmbaralhada = e.embaralhar("paralelepipedo");
		assertEquals("odepipelelarap",palavraEmbaralhada);
	}

}
