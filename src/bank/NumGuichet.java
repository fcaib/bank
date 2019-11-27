package bank;

public class NumGuichet implements ICheckCompte{

	private String numGuichet;
	
	@Override
	public boolean check() {
		
		boolean test=true;
		int i=0;
		// Test caractères ne sont que des chiffres
		while ( (i<this.numGuichet.length() ) && (test==true) )
		{
			if (this.numGuichet.substring(i).matches("[0-9]"))	{test=false;}
			i++;
		}
		// Test longueur 5
		if (this.numGuichet.length() != 5 ) { test = false;}
		
		return test;
	}

	

}
