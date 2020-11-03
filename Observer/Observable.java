import java.util.HashSet;
import java.util.Set;

public abstract class Observable {

	Set<Observer> observers = new HashSet();
	
	public void attach(Observer o) {
		observers.add(o);
	}
	
	public void detach(Observer o){
		observers.remove(o);
	}
	
	protected void notifyy() {
		for(Observer o : observers) {
			o.update(this);
		}
	}

	}
