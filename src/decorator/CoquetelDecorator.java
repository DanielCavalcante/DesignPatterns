package decorator;

public abstract class CoquetelDecorator extends Coquetel {
	
	Coquetel coquetel;
	
	public CoquetelDecorator(Coquetel myCoquetel) {
		coquetel = myCoquetel;
	}

	@Override
	public String getNome() {
		return coquetel.getNome() + " + " + nome;
	}
	
	public double getPreco() {
		return coquetel.getPreco() + preco;
	}
	
}
