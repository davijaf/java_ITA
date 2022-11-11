
public class Principal {

	public static void main(String[] args) {
		Paciente p1 = new Paciente();
		p1.peso = 21.6;
		p1.altura = 1.2;
		p1.nome = "Paciente p1";
		
		Paciente p2 = new Paciente();
		p2.peso = 41.63;
		p2.altura = 1.5;
		p2.nome = "Paciente p2";
		
		Paciente p3 = new Paciente();
		p3.peso = 144.40;
		p3.altura = 1.9;
		p3.nome = "Paciente p3";
		
		p1.calcularIMC(p1.peso, p1.altura);
		p1.diagnostico();
		p1.imprimir();
		
		p2.calcularIMC(p2.peso, p2.altura);
		p2.diagnostico();
		p2.imprimir();
						
		p3.calcularIMC(p3.peso, p3.altura);
		p3.diagnostico();
		p3.imprimir();

	}

}
