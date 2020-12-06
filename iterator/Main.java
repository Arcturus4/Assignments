import java.util.*;

class ThreadDemo extends Thread {
	   private Thread t;
	   private String threadName;
	   List<Integer> e;
	   
	   
	   
	   ThreadDemo( String name, List<Integer> e) {
		   this.e = e;
	      threadName = name;
	      System.out.println("Creating " +  threadName );
	   }
	   
	   public void run() {
	      System.out.println("Running " +  threadName );
	      Iterator<Integer> r = e.iterator();
	      while (r.hasNext()) {
	    	    int next = (int) r.next();
	    	   
	    	    System.out.println("Thread: " + threadName + ", " + next);
	    	    
	    	    //test2
	    	    Random rn = new Random();
	    	    int rand = rn.nextInt(8) + 1;
	    	    //System.out.println("Thread: " + threadName + "removing: " + rand);
	    	    // kaataa sovelluksen
	    	    //e.remove(rand);
	    	    System.out.println("Thread: " + threadName + "adding: " + rand);
	    	    e.add(rand);
	    	    
	           
	      }
	      
	   }
	   
	   public void start (List<Integer> e) {
	      System.out.println("Starting " +  threadName );
	      if (t == null) {
	         t = new Thread (this, threadName);
	         t.start ();
	      }
	   }
	}


public class Main extends ThreadDemo{

	Main(String name, List<Integer> e) {
		super(name, e);
		// TODO Auto-generated constructor stub
	}
	
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> items = new ArrayList<Integer>() {{
			add(1);
	        add(2);
	        add(3);
	        add(4);
	        add(5);
	        add(6);
	        add(7);
	        add(8);
	        add(9);
		}};
		
		Iterator<Integer> iter1 = items.iterator();
		   Iterator<Integer> iter2 = items.iterator();
		 
		 ThreadDemo t1 = new ThreadDemo("t1", items);
		 ThreadDemo t2 = new ThreadDemo("t2", items);
		 
		 t1.start();
		 try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 t2.start();
}
	/*@Override
    public void run() {
        
    }*/
}


		
