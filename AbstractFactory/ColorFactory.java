
public class ColorFactory implements AbstractFactory<Color> { 
	
	

	    @Override
	    public Color create(String animalType) {
	        if ("Red".equalsIgnoreCase(animalType)) {
	            return (Color) new Red();
	        } else if ("Brown".equalsIgnoreCase(animalType)) {
	            return (Color) new Brown();
	        }

	        return null;
	    }

	

}
