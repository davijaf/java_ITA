package Pacote;

public class SubClasse2 extends Referencia {
	Referencia r = new Referencia();
	public void testeAcesso() {
		r.modificadorDefault = 0;
		r.modificadorPublico = 0;
		r.modificadorProtegido = 0;
		//r.modificadorPrivado = 0;
	}
}
