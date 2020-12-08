
public class ControlButton {

	/** Invoker */
	
	Command cmd;
	public ControlButton(Command cmd){
	this.cmd = cmd;
	}


	public void push() {
	cmd.execute();
	}
	
	
}
