package testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.TC0009_DynamicProperties_Page;


public class TC0009_dynamicProperties_Test {
	
	@Test(priority = 1,groups = {"smoke","regression"})
	public void dynamicProperties_Click() throws Exception {
		TC0009_DynamicProperties_Page dy = new TC0009_DynamicProperties_Page();
		dy.dynamicProperties_Click();
		dy.visibleText();
	}
	
	@Test(priority = 2,groups = {"smoke","regression"})
	public void tear() {
		BaseClass.tear();
	}

}
