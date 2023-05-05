package testcases;

import java.lang.reflect.Method;
import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.TC0010_PractiesForm_Page;
import utilities.Utilities;





public class TC0010_PractiesForm_Test extends BaseClass{
	
	@Test(priority = 1,groups = {"smoke","regression"})
	public void dynamicProperties_Click() throws Exception {
		TC0010_PractiesForm_Page pr = new TC0010_PractiesForm_Page();
		pr.dynamicProperties_Click();
	
	}
	
//	@Test(priority = 2,groups = {"smoke","regression"})
//	public void demo() {
//		TC0010_PractiesForm_Page pr = new TC0010_PractiesForm_Page();
//		pr.testdemo();
//	}
	
	@Test(priority = 2,groups = {"smoke","regression"}, dataProviderClass=Utilities.class, dataProvider="demoQAdata")
	public void enterFormDetails(Hashtable<String, String> data) throws Exception {
		TC0010_PractiesForm_Page pr = new TC0010_PractiesForm_Page();
		pr.enterFormDetails(data.get("fname"), data.get("lname"), data.get("email")
				, data.get("male"), data.get("female"), data.get("other")
				
				, data.get("mnumber"), data.get("date"), data.get("month")
				, data.get("year"), data.get("sub"), data.get("sports"), data.get("reading")
				, data.get("music"), data.get("caddress"), data.get("state"), data.get("city"),
				data.get("path"));
	
	
	}
	
	@Test(priority = 3,groups = {"smoke","regression"})
	public void teardown() {
		BaseClass.tear();
	}
	
	
	
	


		
		
		
	

}
