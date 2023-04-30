package testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.TC0001_TextBox_Page;
import utilities.Utilities;

public class TC0001_TextBox_Test {

	
	@Test(priority = 1,groups = {"smoke","regression"})
	public void textBox_Test_Click() {
		TC0001_TextBox_Page tb = new TC0001_TextBox_Page();
		tb.textBox_Page_Click();
	
	}
	
	@Test(priority = 2,groups = {"smoke","regression"}, dataProviderClass=Utilities.class, dataProvider="demoQAdata")
	public void textBox_Test_EnterForm(Hashtable<String, String> data) throws Exception {
		TC0001_TextBox_Page tb = new TC0001_TextBox_Page();
		tb.textBox_Page_EnterForm(data.get("fname"), data.get("email"),
				data.get("caddress"), data.get("paddress"));
		tb.textBox_Page_getText();
	}
	
	
	@Test(priority = 3,groups = {"smoke","regression"})
	public void teardown() {
		BaseClass.tear();
	}
}
