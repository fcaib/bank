package bank;

public class CleRib implements  ICheckCompte  {

	private String numCle;
	
	
	
	public CleRib(String numCle) {
		this.numCle = numCle;
	}



	public boolean check() {
		
		boolean test=false;
		
		if (this.numCle.matches("^[0-9]{2}$") && this.numCle!="98" && this.numCle!="99") test=true;		
		
		return test;
	}
	
	
}
