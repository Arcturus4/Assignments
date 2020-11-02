import java.util.ArrayList;

public class Motherboard implements Component {
	
	int price = 300;

	@Override
	public void setPrice(int price) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public int getPrice(ArrayList<Component> c) {
		// TODO Auto-generated method stub
		return 0;
	}

}
