import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Case ware = new Case();
		ArrayList<Component> clist = (ArrayList<Component>) ware.cList;
		GPU RTX4000 = new GPU();
		CPU slake7700k = new CPU();
		Motherboard RE270 = new Motherboard();
		PSU Enermax = new PSU();
		RAM HyperX = new RAM();
		SSD QVOSSD = new SSD();
		ware.AddComponent(QVOSSD); ware.AddComponent(HyperX); ware.AddComponent(Enermax);ware.AddComponent(RE270);ware.AddComponent(slake7700k);ware.AddComponent(RTX4000);
		 int setupcost = ware.getPrice(clist);
		 System.out.println("Rig costs: " + setupcost);
		
		
		

	}

}
