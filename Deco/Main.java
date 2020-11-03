
public class Main {

	public static void main(String[] args) {
		Pizza p = new Salami(new Redonion(new Dough()));
		System.out.println("pizza consists of: "+ p.getDescription()  + ". and costs: " + p.getPrice());
		
		Pizza n = new Redonion(new Salami(new Smetana(new Shrimp(new Dough()))));
		System.out.println("pizza consists of: "+ n.getDescription()  + ". and costs: " + n.getPrice());
		
		Pizza z = new Cheese(new Redonion(new Salami(new Dough())));
		System.out.println("pizza consists of: "+ z.getDescription()  + ". and costs: " + z.getPrice());

	}

}
