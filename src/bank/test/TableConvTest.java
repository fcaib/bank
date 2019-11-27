/**
 * 
 */
package bank.test;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.Test;

import bank.ICheckCompte;
import bank.NumCompte;
import bank.TableConv;



/**
 * @author IB
 *
 */
public class TableConvTest {

	@Test()
	public void testCheckOK() {
		
		String numCpt ="123456789AB";		
		TableConv  t = new TableConv(numCpt);
		BigInteger resultOk = new BigInteger( "12345678912");
		BigInteger result =  t.conv();
		assertEquals(resultOk,result);	
	}

	@Test()
	public void testCheckKO() {
		
		String numCpt ="123456789AB";		
		TableConv  t = new TableConv(numCpt);
		BigInteger resultOk = new BigInteger( "12345678913");
		assertNotEquals(resultOk, t.conv());	
	}
	
}
