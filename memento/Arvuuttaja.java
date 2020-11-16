import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Arvuuttaja {
	
	List<Object> clients = new ArrayList<Object>();
	
	public Boolean lp(Object client) {
		int randomNum = ThreadLocalRandom.current().nextInt(1, 30 + 1);
		int num = randomNum;
		Memento memento = new Memento(num);
		if(client == memento) {
			System.out.println("oikein");
			return true;
		}else
			System.out.println("v‰‰rin");
			return false;
	}

	
	public void liityPeliin(Object cl) {
		clients.add(cl);
		for(Object c : clients) {
			lp(c);
		}
	}
	

}

