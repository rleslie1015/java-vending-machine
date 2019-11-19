package test.vend;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;


public class MachineTest
{

	@Before
	public void setUp() throws Exception
	{
		//create a vending machine
		Machine SodaMachine = new Machine("Pepsi");
		SodaMachine.getProducts().add(new Product(1, "Test Pepsi", 45));
		SodaMachine.getProducts().add(new Product(2, "Test Big Red", 45));
		SodaMachine.getProducts().add(new Product(3, "Test Mountain Dew", 45));
		SodaMachine.getProducts().add(new Product(4, "Test Mug Root Beer", 45));

		SodaMachine.addProductToMachine(5, "Test Water", 75);
	}

	@After
	public void tearDown() throws Exception
	{
	}

	@org.junit.Test
	public void buttonPress()
	{
		Machine SodaMachine = new Machine("Pepsi");
		assertEquals(System.out.println("**Test Pepsi 45 cents**"), SodaMachine.buttonPress(1));
	}
}