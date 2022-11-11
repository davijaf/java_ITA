package pacote;

public class Principal {

	public static void main(String[] args) {
		Pilha p1 = new Pilha(10);
		p1.empilhar("Davi");
		p1.empilhar("José");
		p1.empilhar("Araújo");

		System.out.println(p1.topo());
		System.out.println(p1.tamanho());
		
		Object[] arrayElementos = p1.getElementos();
		System.out.println(arrayElementos.length);
		arrayElementos[2] = "OUTRO";

		p1.setTopo(3);
		System.out.println("------------");
		System.out.println(p1.desimpilhar());//.toString().toUpperCase());
		System.out.println(p1.topo());//.toString().toUpperCase());
		System.out.println(p1.tamanho());// tamanho da pilha
		System.out.println(p1.getElementos().length);
	}

}
