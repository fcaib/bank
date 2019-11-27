package bank.test;

import static org.junit.Assert.*;


import org.junit.Test;

import bank.ICheckCompte;
import bank.NumCompte;

public class NumCompteTest {

	@Test()
	public void testCheckOK() {
		
		String numCpt ="123456789AB";
		
		ICheckCompte  numCompte = new NumCompte(numCpt);
		assertTrue(numCompte.check());
	}

	@Test()
	public void testCheckLgToLong() {
		
		String numCpt ="123456789ABCD";
		
		ICheckCompte  numCompte = new NumCompte(numCpt);
		assertFalse(numCompte.check());
	}
	
	@Test()
	public void testCheckLgToMin() {
		
		String numCpt ="12345678";
		
		ICheckCompte  numCompte = new NumCompte(numCpt);
		assertFalse(numCompte.check());
	}
	
	
	
}
