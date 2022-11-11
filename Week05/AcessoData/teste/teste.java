import static org.junit.Assert.*;
import java.text.ParseException;
import org.junit.Test;

public class teste {

	@Test
	public void idade1() throws ParseException {
		Pessoa p1 = new Pessoa("Danilo", "12/12/1989");
		String nome = p1.getNome();
		String signo = p1.getSigno();
		int idade = (int) p1.getIdade(null);
		assertEquals(32, idade);
		System.out.println(nome+" é de "+signo+" e tem "+idade+" anos.");		
	}
	
	@Test
	public void idade2() throws ParseException {
		Pessoa p2 = new Pessoa("Patrícia","27/09/1985");
		String nome = p2.getNome();
		String signo = p2.getSigno();
		int idade = (int) p2.getIdade(null);
		assertEquals(37, idade);
		System.out.println(nome+" é de "+signo+" e tem "+idade+" anos.");		
	}
	
	@Test
	public void idade3() throws ParseException {
		Pessoa p3 = new Pessoa("Adriana","31/10/1966");
		String nome = p3.getNome();
		String signo = p3.getSigno();
		int idade = (int) p3.getIdade(null);
		assertEquals(56, idade);
		System.out.println(nome+" é de "+signo+" e tem "+idade+" anos.");		
	}
	
	@Test
	public void signo1() throws ParseException {
		Pessoa p1 = new Pessoa("Danilo", "12/12/1989");
		String signo = p1.getSigno();
		assertEquals("Sagitário", signo);
	}
	
	@Test
	public void signo2() throws ParseException {
		Pessoa p2 = new Pessoa("Patrícia","27/09/1985");
		String signo = p2.getSigno();
		assertEquals("Libra", signo);
	}
	
	@Test
	public void signo3() throws ParseException {
		Pessoa p3 = new Pessoa("Adriana","31/10/1966");
		String signo = p3.getSigno();
		assertEquals("Escorpião", signo);

	}
	

}