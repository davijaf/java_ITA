import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TesteTratamentos {
	
	@Test
	public void testInformal() {
		FormatadorNome informal = new Informal();
		Autoridade aut = new Autoridade("Davi", "José", informal);
		assertEquals("Davi", aut.getTratamento());
	}
	
	@Test
	public void testRespeitosoMasculino() {
		FormatadorNome masc = new Respeitoso(false);
		Autoridade aut = new Autoridade("Davi", "José", masc);
		assertEquals("Sr. José", aut.getTratamento());
	}
	
	@Test
	public void testRespeitosoFeminino() {
		FormatadorNome fem = new Respeitoso(true);
		Autoridade aut = new Autoridade("Maria", "Cristina", fem);
		assertEquals("Sra. Cristina", aut.getTratamento());
	}
	
	@Test
	public void testComTitulo() {
		FormatadorNome t = new ComTitulo("Exmo.");
		Autoridade aut = new Autoridade("Davi", "José", t);
		assertEquals("Exmo. Davi José", aut.getTratamento());
	}

}
