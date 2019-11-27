package bank.test;

import static org.junit.Assert.*;

import org.junit.Test;

import bank.CleRib;

public class CleRibTest {

	@Test
	public void test() {
		
		CleRib cleRib = new CleRib("12");
		assertTrue(cleRib.check());
		
		cleRib = new CleRib("123");
		assertFalse(cleRib.check());

		cleRib = new CleRib("");
		assertFalse(cleRib.check());
		
		cleRib = new CleRib("98");
		assertFalse(cleRib.check());
		
		cleRib = new CleRib("99");
		assertFalse(cleRib.check());
	}

}
