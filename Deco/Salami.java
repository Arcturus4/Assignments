
public class Salami extends FillingDecorator {

	public Salami(Pizza somepizza) {
		super(somepizza);

	}

	public String getDescription() {
		return pizza.getDescription() + ", Salami";
		
	}
	
	public Double getPrice() {
		return pizza.getPrice() + 1.50;
	}
	
}
