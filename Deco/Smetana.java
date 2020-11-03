
public class Smetana extends FillingDecorator {
	
	public Smetana(Pizza somepizza) {
		super(somepizza);

	}

	public String getDescription() {
		return pizza.getDescription() + ", Smetana";
		
	}
	
	public Double getPrice() {
		return pizza.getPrice() + 2.00;
	}
	
}
