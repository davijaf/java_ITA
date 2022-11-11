package xb;

public class Principal {

	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.getX());
		b.setX(2);
		System.out.println(b.getX());
		
		b.setX(b.getX( ) + 1);
		System.out.println(b.getX());

	}

}
