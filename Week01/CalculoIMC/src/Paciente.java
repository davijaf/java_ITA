import java.text.DecimalFormat;

public class Paciente {
	
	String nome;
	double peso;
	double altura;
	double imc;
	String resultadoDiagnostico;
	DecimalFormat df = new DecimalFormat("###,##0.00");
	
	// calculo do IMC
	public void calcularIMC(double peso, double altura) {
		imc = peso / (altura * altura);
	}
	
	// realiza diagnostico
	public void diagnostico() {
		if (imc < 16) {resultadoDiagnostico = "Baixo peso muito grave";}
		else if (imc >= 16 && imc < 17){resultadoDiagnostico = "Baixo peso grave";}
		else if (imc >= 17 && imc < 18.5){resultadoDiagnostico = "Baixo peso";}
		else if (imc >= 18.5 && imc < 25){resultadoDiagnostico = "Peso normal";}
		else if (imc >= 25 && imc < 30){resultadoDiagnostico = "Sobrepeso";}
		else if (imc >= 30 && imc < 35){resultadoDiagnostico = "Obesidade grau I";}
		else if (imc >= 35 && imc < 40){resultadoDiagnostico = "Obesidade grau II";}
		else if (imc >= 40){resultadoDiagnostico = "Obesidade grau III (obesidade mórbida)";}	
	}
	
	// retorna IMC
	public double getIMC() {
		return imc;
	}
		
	// retorna diagnostico
	public String getDiagnostico() {
		return resultadoDiagnostico;
	}
	
	public void imprimir() {
		 // imprime Método CalcularIMC
		System.out.println(nome+": IMC igual à "+df.format(getIMC()));
		 // imprime Método Diagnóstico
		System.out.println("Diagnóstico : "+getDiagnostico()+"\n");
		
		
	}

}
