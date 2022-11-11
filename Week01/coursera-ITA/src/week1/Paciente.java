package week1;

public class Paciente {

	
	public double altura;
	public double peso;
	public double imc;
	
	//Construtor 
	public Paciente(double altura, double peso) {
		this.altura = altura;
		this.peso = peso;
	}
	
	public double calcularIMC() {
		return imc = this.peso/(this.altura*this.altura);
	}
	
	public String diagnostico() {
		
		if(imc < 16.0) {
			return "Baixo peso muito grave";
		}
		
		else if (imc >= 16.0 && imc < 17.0) {
			return "Baixo peso grave";
		}
		
		
		else if(imc >= 17.0 && imc < 18.5) {
			return "Baixo peso";
		}
		
		else if(imc >= 18.5 && imc < 25.0) {
			return "Peso normal";
		}
		
		else if(imc >= 25.0 && imc < 30.0) {
			return "Sobrepeso";
		}
		
		else if(imc >= 30.0 && imc < 35.0) {
			return "Obesidade grau I";
		}
		
		else if(imc >= 35.0 && imc < 40.0) {
			return "Obesidade grau II";
		}
				
		else {
			return "Obesidade grau III";
		}
	}

	//para customizar a impressão dos objetos da classe Paciente.
	@Override
	public String toString() {
		return String.format("Altura = %.2f | Peso = %.2f | IMC = %.1f | Diagnóstico = %s",altura, peso, calcularIMC(), diagnostico());
				
	}
	
	
}
