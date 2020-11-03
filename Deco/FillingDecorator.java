
public abstract class FillingDecorator implements Pizza{
	
	protected Pizza pizza;
	
	public FillingDecorator(Pizza somepizza) {
		this.pizza = somepizza;
	}
	
	public String getDescription() {
		return pizza.getDescription();
		
	}
	
	public Double getPrice() {
		return pizza.getPrice();
	}
	
	

}
