
public class CurtainUp implements Command {
	
	private Curtain c;
	
	
	public CurtainUp(Curtain cu) {
	this.c = cu;
	}
	@Override // Command
	public void execute() {
	c.raiseUp();
	}

}
