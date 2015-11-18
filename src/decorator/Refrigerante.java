package decorator;

public class Refrigerante extends CoquetelDecorator {

	public Refrigerante(Coquetel myCoquetel) {
		super(myCoquetel);
		nome = "Refrigerante";
		preco = 1.0;
	}

}
