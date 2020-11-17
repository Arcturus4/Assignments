import java.util.ArrayList;
import java.util.*;

interface Image {
    public void displayImage();
    public void showData();
}

// On System A
class RealImage implements Image {
    private final String filename;
    private String imagename;

    /**
     * Constructor
     * @param filename
     */
    public RealImage(String filename, String imagename) {
        this.filename = filename;
        this.imagename = imagename;
        loadImageFromDisk();
    }

    /**
     * Loads the image from the disk
     */
    private void loadImageFromDisk() {
        System.out.println("Loading   " + filename);
    }

    /**
     * Displays the image
     */
    public void displayImage() {
        System.out.println("Displaying " + filename);
    }

	@Override
	public void showData() {
		System.out.println("Displaying " + imagename);
		
	}
}

// On System B
class ProxyImage implements Image {
    private final String filename;
    private RealImage image;
    private String imagename;
    
    /**
     * Constructor
     * @param filename
     */
    public ProxyImage(String filename, String imagename) {
    	this.imagename = imagename;
        this.filename = filename;
    }

    /**
     * Displays the image
     */
    public void displayImage() {
        if (image == null) {
           image = new RealImage(filename, filename);
        }
        image.displayImage();
    }

	@Override
	public void showData() {
		System.out.println("Displaying " + imagename);
		
	}
}

class ProxyExample {
   /**
    * Test method
 * @param Object 
    */
   public static void main(final String[] arguments, int Object) {
	   
	   List<Image> imgList = new ArrayList();
	   Scanner sc = new Scanner(System.in);
	   
        Image image1 = new ProxyImage("HiRes_10MB_Photo1", "img1");
        Image image2 = new ProxyImage("HiRes_10MB_Photo2", "img2");
        Image image3 = new ProxyImage("HiRes_10MB_Photo1", "img3");
        Image image4 = new ProxyImage("HiRes_10MB_Photo2", "img4");
        
        imgList.add(image1);
        imgList.add(image2);
        imgList.add(image3);
        imgList.add(image4);
        
        for(Image e : imgList) {
        	e.showData();
        }
       
        while(true) {
        	System.out.println("Mitä kuvaa tarkastellaan? anna nimi; ");
            String name = sc.nextLine();
            
            for(Image e : imgList) {
            	
            	if(true) {
            	//lataa kuvan nimen perusteella jos olemassa?
            	}
            }
            
            
            
            
        }
        
        
        
        
        
        //image1.displayImage(); // loading necessary
       // image1.displayImage(); // loading unnecessary
       // image2.displayImage(); // loading necessary
       // image2.displayImage(); // loading unnecessary
       // image1.displayImage(); // loading unnecessary
    }
}