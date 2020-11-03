
public class Shrimp extends FillingDecorator {
	
	public Shrimp(Pizza somepizza) {
		super(somepizza);

	}

	public String getDescription() {
		return pizza.getDescription() + ", Shrimp";
		
	}
	
	public Double getPrice() {
		return pizza.getPrice() + 2.55;
	}

}
