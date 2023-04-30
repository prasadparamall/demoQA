package testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.TC0005_Buttons_Page;


public class TC0005_Buttons_Test {
	
	@Test(priority = 1,groups = {"smoke","regression"})
	public void buttons_Click() throws Exception {
		TC0005_Buttons_Page bt = new TC0005_Buttons_Page();
		bt.button_Click();
	}
	
	@Test(priority = 2,groups = {"smoke","regression"})
	public void double_right_Click() throws Exception {
		TC0005_Buttons_Page bt = new TC0005_Buttons_Page();
		bt.doubleClick();
		bt.rightClick();
		bt.clickMe();
	}
	
	@Test(priority = 3,groups = {"smoke","regression"})
	public void tear() {
		BaseClass.tear();
	}
	
}
