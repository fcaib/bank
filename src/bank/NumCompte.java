package bank;

import java.math.BigInteger;

public class NumCompte implements  ICheckCompte {

	
	public NumCompte(String numCptInput) {		
		this.numCptInput = numCptInput;
		this.tableConv = new TableConv(this.numCptInput);
		this.numCpt = this.tableConv.conv();
	}


	public String getNumCptInput() {
		return numCptInput;
	}



	public void setNumCptInput(String numCptInput) {
		this.numCptInput = numCptInput;
	}



	public BigInteger getNumCpt() {
		return numCpt;
	}



	public void setNumCpt(BigInteger numCpt) {
		this.numCpt = numCpt;
	}

	

	private String numCptInput;
	
	private BigInteger numCpt;
	
	
	private TableConv tableConv;
		
	
	/*
	 * Vérification
	 * 
	 */
	public boolean check()
	{
		Boolean resultOk = false;
		
		resultOk =  this.numCptInput.length() == 11;		
		
		return resultOk;
	}
}
