import java.util.Scanner;

public class Client implements Runnable{
	
	int clientnum;
	Scanner sc = new Scanner(System.in);
	
	public Memento ask(int cn) {
		cn = clientnum;
		Memento memento = new Memento(clientnum);
		return memento;
	}
	
	
	
	public void run() {
		
	}

	public static void main(String[] args) {
		
		Client c1 = new Client();
		Client c2 = new Client();
		Client c3= new Client();
		
		Arvuuttaja a = new Arvuuttaja();
		
		a.liityPeliin(c1.ask(2));
		a.liityPeliin(c2.ask(24));
		a.liityPeliin(c3.ask(14));
		
		System.out.println("got here");
	
	}


	public int getClientnum() {
		return clientnum;
	}


	public void setClientnum(int clientnum) {
		this.clientnum = clientnum;
	}

}
