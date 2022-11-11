import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestPaciente {

	@Test
	void consultaPaciente1() {
		Paciente p1 = new Paciente();
		p1.calcularIMC(60,2);
		p1.diagnostico();
		assertEquals(15,p1.getIMC());
		assertEquals("Baixo peso muito grave",p1.getDiagnostico());
	}
	
	@Test
	void consultaPaciente2() {
		Paciente p2 = new Paciente();
		p2.calcularIMC(65,2);
		p2.diagnostico();
		assertEquals(16.25,p2.getIMC());
		assertEquals("Baixo peso grave",p2.getDiagnostico());
	}
	
	@Test
	void consultaPaciente3() {
		Paciente p3 = new Paciente();
		p3.calcularIMC(70,2);
		p3.diagnostico();
		assertEquals(17.50,p3.getIMC());
		assertEquals("Baixo peso",p3.getDiagnostico());
	}
	
	@Test
	void consultaPaciente4() {
		Paciente p4 = new Paciente();
		p4.calcularIMC(75,2);
		p4.diagnostico();
		assertEquals(18.75,p4.getIMC());
		assertEquals("Peso normal",p4.getDiagnostico());
	}

	
	@Test
	void consultaPaciente5() {
		Paciente p5 = new Paciente();
		p5.calcularIMC(100,2);
		p5.diagnostico();
		assertEquals(25.00,p5.getIMC());
		assertEquals("Sobrepeso",p5.getDiagnostico());
	}
	
	@Test
	void consultaPaciente6() {
		Paciente p6 = new Paciente();
		p6.calcularIMC(120,2);
		p6.diagnostico();
		assertEquals(30.00,p6.getIMC());
		assertEquals("Obesidade grau I",p6.getDiagnostico());
	}
	
	@Test
	void consultaPaciente7() {
		Paciente p7 = new Paciente();
		p7.calcularIMC(140,2);
		p7.diagnostico();
		assertEquals(35.00,p7.getIMC());
		assertEquals("Obesidade grau II",p7.getDiagnostico());
	}
	
	@Test
	void consultaPaciente8() {
		Paciente p8 = new Paciente();
		p8.calcularIMC(160,2);
		p8.diagnostico();
		assertEquals(40.00,p8.getIMC());
		assertEquals("Obesidade grau III (obesidade mórbida)",p8.getDiagnostico());
	}
	


}
