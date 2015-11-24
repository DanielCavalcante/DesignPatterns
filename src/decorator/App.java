package decorator;

public class App {
	
	
	public static void main(String[] args) {

		Coquetel myCoquetel = new Cachaca();
		System.out.println(myCoquetel.getNome() + " = R$ " + myCoquetel.getPreco() + "\n");
		
		myCoquetel = new Refrigerante(myCoquetel);
		System.out.println(myCoquetel.getNome() + " = R$ " + myCoquetel.getPreco() + "\n");
		
		System.out.println(myCoquetel instanceof Refrigerante);
		
	}

}
