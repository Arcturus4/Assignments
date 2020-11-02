import java.util.ArrayList;

public class PSU implements Component {

	
	int price = 60;
	

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
