package stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	@Before
	public void initial()
	{
		//Do all stuff before hook is invoked
		System.out.print("Before hook is invoked");
	}
	
	@After
	public void Refresh()
	{
		//Do all stuff after hook is invoked
		System.out.print("After hook is invoked");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
