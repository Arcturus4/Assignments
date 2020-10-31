package factorymethod;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        AterioivaOtus oppilas = new Oppilas();
        AterioivaOtus koodaaja = new Koodaaja();
        
        koodaaja.aterioi();
        opettaja.aterioi();
        oppilas.aterioi();
        
        
    }
}