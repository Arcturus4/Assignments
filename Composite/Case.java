import java.util.ArrayList;
import java.util.List;

public class Case implements Component {
	
	int price = 100;
	
	int salePrice = 0;
	
	List<Component> cList = new ArrayList<Component>();
	
	public void AddComponent(Component c) {
		cList.add(c);
	}
	
	@Override
	public int getPrice(ArrayList<Component> c) {
		for(Component e : c) {
			int b = ((Component) e).getPrice();
			System.out.println(e.getClass().toString()+" price is: " + b);
			salePrice += b;
			
		}
		return salePrice + price;
	}
	
	@Override
	public void setPrice(int p) {
		price = p;
		
	}

	@Override
	public int getPrice() {
		return this.price;
	}
	
	
	
	
	
}
