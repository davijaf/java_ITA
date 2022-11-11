
public class ContaCorrente {
	
	protected int saldo;
	
	public int  sacar(int valor) {
		if(saldo>=valor) {saldo -= valor; return valor;}
		else return 0;
	}
	
	public void depositar(int valor) {
		saldo =+ valor;
	}
}
