import static org.junit.Assert.*;
import org.junit.Test;

public class TestAutenticador {

	@Test
	public void loginComSucesso() throws LoginException {
		Autenticador a = new Autenticador();
		Usuario u = a.logar("davijose", "araujo");
		assertEquals("davijose",u.getLogin());
	}
	
	@Test(expected= LoginException.class)
	public void loginFalho() throws LoginException {
		Autenticador a = new Autenticador();
		Usuario u = a.logar("usuarioerrado", "araujo");
		assertEquals("davijose",u.getLogin());
	}
	
	@Test(expected= LoginException.class)
	public void senhaFalha() throws LoginException {
		Autenticador a = new Autenticador();
		Usuario u = a.logar("davijose", "senhaerrada");
		assertEquals("davijose",u.getLogin());
	}
	
	@Test
	public void informacaoDoErro(){
		Autenticador a = new Autenticador();
		try {
			Usuario u = a.logar("davijose", "senhaerrada");
			System.out.println(u.getLogin());
			fail();
		}
		catch (LoginException e) {
			System.out.println(e.getLogin());
			assertEquals("davijose",e.getLogin());
		}
	}

}
