package factorymethod;

public class Koodaaja extends AterioivaOtus {
	
	public Juoma createJuoma(){
        return new Mountain();
    };

}
