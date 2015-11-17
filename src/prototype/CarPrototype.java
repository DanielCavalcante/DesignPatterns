package prototype;

public abstract class CarPrototype {
	
	protected double price;
	
	public abstract String info();
	
	public abstract CarPrototype clone();

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
