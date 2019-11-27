package bank.test;

import static org.junit.Assert.*;

import org.junit.Test;

import bank.NumGuichet;

public class NumGuichetTest {

	@Test
	public void test() {
		
		NumGuichet etab = new NumGuichet("12345");
		assertTrue(etab.check());
		
		etab = new NumGuichet("123456");
		assertFalse(etab.check());
		
		etab = new NumGuichet("A2345");
		assertFalse(etab.check());
		
		etab = new NumGuichet("");
		assertFalse(etab.check());
	}

}
