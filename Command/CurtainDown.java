
public class CurtainDown implements Command{
	
	
		private Curtain c;
		
		public CurtainDown(Curtain cu) {
		this.c = cu;
		}

		@Override // Command
		public void execute() {
		c.lowerDown();
		}
		

}
