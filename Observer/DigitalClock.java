
public class DigitalClock implements Observer {
	
	private ClockTimer timer;
	
	public DigitalClock(ClockTimer ct) {
		timer = ct;
		timer.attach(this);
		
	}

	@Override
	public void update(Observable theChangedSubject) {
		if (theChangedSubject == timer) {
			draw();
			
		}
	}

	private void draw() {
		int hour = timer.getHour();
		int sec = timer.getSecond();
		int min = timer.getMinute();
		System.out.println(hour+ " " + min + " " + sec);
		
	}
}
