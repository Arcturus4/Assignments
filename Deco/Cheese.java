
public class Cheese extends FillingDecorator {

	public Cheese(Pizza somepizza) {
		super(somepizza);

	}

	public String getDescription() {
		return pizza.getDescription() + ", Cheese";
		
	}
	
	public Double getPrice() {
		return pizza.getPrice() + 1.50;
	}
	
}
