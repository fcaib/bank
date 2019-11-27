package bank;


public class NumEtablissement implements ICheckCompte {

	private String numEtab;
	
	@Override
	public boolean check() {
		
		boolean test=true;
		int i=0;
		// Test caractères ne sont que des chiffres
		while ( (i<this.numEtab.length() ) && (test==true) )
		{
			if (this.numEtab.substring(i).matches("[0-9]"))	{test=false;}
			i++;
		}
		// Test longueur 5
		if (this.numEtab.length() != 5 ) { test = false;}
		
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
