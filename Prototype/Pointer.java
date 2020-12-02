
public class Pointer implements Prototype {
	
	String type = "";
	int value;
	Pointer osoitin = new Pointer("sec", 0);
	
	public Pointer(String type, int value ) {
		this.value = value;
		this.type = type;
	}
	
	
	@Override
	public Pointer clone() {
		// syväkopio
		Pointer s = null;
		try {
		s = (Pointer)super.clone();
		//s.type = (String)type.clone();
		//s.value = value.clone();
		} catch (CloneNotSupportedException e) {}
		return s;
		}


	@Override
	public Object makeCopy() {
		// TODO Auto-generated method stub
		return null;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}

}
