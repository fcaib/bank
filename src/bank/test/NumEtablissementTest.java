package bank.test;

import static org.junit.Assert.*;

import org.junit.Test;

import bank.NumEtablissement;

public class NumEtablissementTest {
	
	@Test
	public void test() {
		
		
		NumEtablissement etab = new NumEtablissement("12345");
		assertTrue(etab.check());
		
		etab = new NumEtablissement("123456");
		assertFalse(etab.check());
		
		etab = new NumEtablissement("A2345");
		assertFalse(etab.check());
		
		etab = new NumEtablissement("");
		assertFalse(etab.check());
	}

}
