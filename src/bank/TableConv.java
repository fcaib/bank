package bank;

import java.math.BigInteger;
import java.util.Hashtable;


public class TableConv {

	private String numCptInput;
	Hashtable<String, String> t;	
	

	public TableConv(String numCptInput) {

		this.numCptInput = numCptInput;
		this.initTable();
		
		
	}

	private static boolean isInterger(String number)
	{
		try {
			Integer.parseInt(number);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
		
	}
	
	public BigInteger  conv()
	{
		char[] s = this.numCptInput.toCharArray();
		
		String result ="" ;
		
		
		for (int i =0; i<=  this.numCptInput.length() ; i++ ) {
		/*
			String v =  
			//if( ) 
				result += this.t.get(s[i]);
			else
				result +=s[i];
				*/ 
		}
		
		return new BigInteger(result);
	}
	
	private void initTable()
	{
		
		t =new Hashtable<String, String>();
		t.put("A", "1");
		t.put("J", "1");
		
		t.put("B", "2");
		t.put("K", "2");
		t.put("S", "2");
		
		t.put("C", "3");
		t.put("L", "3");
		t.put("T", "3");
		
		t.put("D", "4");
		t.put("M", "4");
		t.put("U", "4");
		
		t.put("E", "5");
		t.put("N", "5");
		t.put("V", "5");
		
		t.put("F", "6");
		t.put("O", "6");
		t.put("W", "6");
		
		
		t.put("G", "7");
		t.put("P", "7");
		t.put("W", "7");

		t.put("H", "8");
		t.put("Q", "8");
		t.put("Y", "8");
		
		
		t.put("I", "9");
		t.put("R", "9");
		t.put("Z", "9");
		
		
	}
}
