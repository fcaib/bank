package bank;

public class NumGuichet implements ICheckCompte{

	private String numGuichet;
	
	@Override
	public boolean check() {
		
		boolean test=false;

		if (this.numGuichet.matches("^[0-9]{5}$") ) test=true;
		
		return test;
	}

	public NumGuichet(String numGuichet) {
		this.numGuichet = numGuichet;
	}

	public String getNumGuichet() {
		return numGuichet;
	}

	public void setNumGuichet(String numGuichet) {
		this.numGuichet = numGuichet;
	}

	

}
