
/*public class CPU {
	
	
	 public void Freeze() {
		 
	 }
	  public void Jump(long position) {
		  
	  }
	   public void Execute() {
		   
	   }
	};

	class HardDrive {
	  public char Read(long lba, int size) {
		  //dostuff
		  char ch = 'a'; 
		  return ch;
	};

	class Memory {
	  void Load(long position, char data) {
		  
	  }
	};

	class ComputerFacade {
	 
	private CPU cpu_;
    private Memory memory_;
    private HardDrive hard_drive_;
		
     ComputerFacade(CPU cpu, Memory memory, HardDrive hardrive) {
    	 this.cpu_ = cpu;
    	 this.hard_drive_ = hardrive;
    	 this.memory_ = memory;
     }
     
	 public void Start() {
	    cpu_.Freeze();
	    memory_.Load(kBootAddress, hard_drive_.Read(kBootSector, kSectorSize));
	    cpu_.Jump(kBootAddress);
	    cpu_.Execute();
	  }
	};

	public static void main(String[] args) {
		HardDrive name = new HardDrive();
		ComputerFacade computer = new ComputerFacade();

	}

}*/
class CPU {
    public void freeze() { 
    	
    	
    	
    }
    public void jump(long position) {  }
    public void execute() { }
}

class Memory {
    public void load(long position, byte[] data) { 
 }
}

class HardDrive {
    public byte[] read(long lba, int size) { 

    	byte[] b = {1,2,3,4,5};
    	return b;
    }
}

/* Facade */

class ComputerFacade {
    private CPU processor;
    private Memory ram;
    private HardDrive hd;

    public ComputerFacade() {
        this.processor = new CPU();
        this.ram = new Memory();
        this.hd = new HardDrive();
    }

    public void start() {
    	final long BOOT_ADDRESS = 23513;
    	final long BOOT_SECTOR = 443;
    	final int SECTOR_SIZE = 4096;
    	
        processor.freeze();
        ram.load(BOOT_ADDRESS, hd.read(BOOT_SECTOR, SECTOR_SIZE));
        processor.jump(BOOT_ADDRESS);
        processor.execute();
    }
}

/* Client */

class Main {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.start();
    }
}
