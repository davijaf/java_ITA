import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;

public class teste {

	
	@Before
	public void before(){
		System.out.println("@Before");
	}
	
	@After
	public void after(){
		System.out.println("@After");
	}
	
	@Test
	public void test() {
		System.out.println("Not yet implemented");
	}

}
