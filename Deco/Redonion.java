
public class Redonion extends FillingDecorator {

	public Redonion(Pizza somepizza) {
		super(somepizza);

	}

	public String getDescription() {
		return pizza.getDescription() + ", redOnion";
		
	}
	
	public Double getPrice() {
		return pizza.getPrice() + 0.50;
	}
	
}
