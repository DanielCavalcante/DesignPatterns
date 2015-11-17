package prototype;

public class App {
	
	public static void main(String[] args) {
		FerrariPrototype ferrariPrototype = new FerrariPrototype();
		
		CarPrototype newFerrari = ferrariPrototype.clone();
		newFerrari.setPrice(30.000);
		
		CarPrototype usedFerrari = ferrariPrototype.clone();
		usedFerrari.setPrice(20.000);
		
		System.out.println(newFerrari.info());
		System.out.println(usedFerrari.info());
	}

}
