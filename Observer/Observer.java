import java.util.*;
public interface Observer {
	
	public abstract void update(
			Observable theChangedSubject);

}
