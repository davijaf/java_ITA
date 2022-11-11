package pacote;

import java.util.Arrays;

public class Pilha {
	
	private Object[] elementos;
	private int topo = 0;
	
	public Pilha(int maximo) {
		elementos = new Object[maximo];
	}
	public void empilhar(Object elemento) {
		elementos[topo] = elemento;
		topo++;
	}
	
	public Object desimpilhar() {
		topo--;
		return elementos[topo];
	}
	
	// Getters and Setters
	public Object topo() {
		return elementos[topo-1];
	}
	public Object[] getElementos() {
		Object[] paraRetornar = Arrays.copyOf(elementos, tamanho());
		return paraRetornar;
	}
	/*public void setElementos(Object[] elementos) {
		this.elementos = elementos;
	}*/
	public int tamanho() {
		return topo;
	}
	public void setTopo(int topo) {
		this.topo = topo;
	}
	
	
}
	
	
