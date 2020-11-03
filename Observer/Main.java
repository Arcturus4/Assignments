
public class Main {

	public static void main(String[] args) {
	
		Observable ct = new ClockTimer();
		System.out.println("I");
		DigitalClock dc = new DigitalClock((ClockTimer)ct);
		System.out.println("am");
		new Thread((Runnable)ct).start();
		System.out.println("here");

	}

}
