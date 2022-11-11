
public class ContaEspecial extends ContaCorrente {
	
	int limite;
	
	
	ContaEspecial(int limite){
		this.limite = limite;
	}
	
	public int sacar(int valor) {
		if((saldo+limite)>=valor) {saldo -= valor; return valor;}
		else return 0;
	}
}
