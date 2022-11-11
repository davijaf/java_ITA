import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestPaciente {

	@Test
	void consultaPaciente1() {
		Paciente p1 = new Paciente();
		p1.calcularIMC(59,2);
		p1.diagnostico();
		assertEquals(14.75,p1.getIMC(),0.2);
		assertEquals("Baixo peso muito grave",p1.getDiagnostico());
	}
	
	@Test
	void consultaPaciente2() {
		Paciente p2 = new Paciente();
		p2.calcularIMC(66,2);
		p2.diagnostico();
		assertEquals(16.50,p2.getIMC(),0.2);
		assertEquals("Baixo peso grave",p2.getDiagnostico());
	}
	
	@Test
	void consultaPaciente3() {
		Paciente p3 = new Paciente();
		p3.calcularIMC(72,2);
		p3.diagnostico();
		assertEquals(18.00,p3.getIMC(),0.2);
		assertEquals("Baixo peso",p3.getDiagnostico());
	}
	
	@Test
	void consultaPaciente4() {
		Paciente p4 = new Paciente();
		p4.calcularIMC(74,2);
		p4.diagnostico();
		assertEquals(18.50,p4.getIMC(),0.2);
		assertEquals("Peso normal",p4.getDiagnostico());
	}

	
	@Test
	void consultaPaciente5() {
		Paciente p5 = new Paciente();
		p5.calcularIMC(101,2);
		p5.diagnostico();
		assertEquals(25.25,p5.getIMC(),0.2);
		assertEquals("Sobrepeso",p5.getDiagnostico());
	}
	
	@Test
	void consultaPaciente6() {
		Paciente p6 = new Paciente();
		p6.calcularIMC(122,2);
		p6.diagnostico();
		assertEquals(30.50,p6.getIMC(),0.2);
		assertEquals("Obesidade grau I",p6.getDiagnostico());
	}
	
	@Test
	void consultaPaciente7() {
		Paciente p7 = new Paciente();
		p7.calcularIMC(142,2);
		p7.diagnostico();
		assertEquals(35.50,p7.getIMC(),0.2);
		assertEquals("Obesidade grau II",p7.getDiagnostico());
	}
	
	@Test
	void consultaPaciente8() {
		Paciente p8 = new Paciente();
		p8.calcularIMC(170,2);
		p8.diagnostico();
		assertEquals(42.50,p8.getIMC(),0.2);
		assertEquals("Obesidade grau III (obesidade mórbida)",p8.getDiagnostico());
	}
	


}
