package prototype;

public class FerrariPrototype extends CarPrototype {

	protected FerrariPrototype(FerrariPrototype ferrariPrototype) {
		this.price = ferrariPrototype.getPrice();
	}
	
	public FerrariPrototype() {
		price = 0.0;
	}
	
	@Override
	public String info() {
		return "Model: Spider\nAutomaker: Ferrari\nValor: " + getPrice();
	}

	@Override
	public CarPrototype clone() {
		return new FerrariPrototype(this);
	}

}
