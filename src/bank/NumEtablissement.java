package bank;


public class NumEtablissement implements ICheckCompte {

	private String numEtab;
	
	@Override
	public boolean check() {
		
		boolean test=false;

		// Test caractères ne sont que des chiffres
		if (this.numEtab.matches("^[0-9]{5}$") ) test=true;
		
		// Test longueur 5
		//if (this.numEtab.length() != 5 ) test = false;
		
		return test;
	}

	public NumEtablissement(String numEtab) {
		this.numEtab = numEtab;
	}

	public String getNumEtab() {
		return numEtab;
	}

	public void setNumEtab(String numEtab) {
		this.numEtab = numEtab;
	}
	
	

}
