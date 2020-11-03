import java.sql.Time;
import java.util.*;
import java.time.*;
public class ClockTimer extends Observable implements Runnable {
	LocalTime lc = LocalTime.now();
	
	
	public int getHour() {
		int hour = lc.getHour();
		return hour;
	}
	
public int getMinute() {
		int minute = lc.getMinute();
		return minute;
	}

public int getSecond() {
	int second = lc.getSecond();
	return second;
	
}

void tick() {
	
	
	int h = getHour();
	int sec = getSecond();
	int min = getMinute();
	int[] clock = {h, min, sec};
	
	for(int c:clock) {
		notifyy();
		try {
			Thread.sleep(1000);
			clock[0] = getHour();
			clock[1] = getMinute();
			clock[2] = getSecond();
		}
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
			
		}
	}
}

@Override
public void run() {
	while(true) {
		tick();
	}
}

}
