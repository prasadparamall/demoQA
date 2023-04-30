package testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.TC0006_Links_Page;
import utilities.Utilities;


public class TC0006_Links_Test {
	
	@Test(priority = 1,groups = {"smoke","regression"})
	public void links_Click() throws Exception {
		TC0006_Links_Page ln = new TC0006_Links_Page();
		ln.linksButton_Click();
	}
	
	@Test(priority = 2,groups = {"smoke","regression"})
	public void getLinksText() throws Exception {
		TC0006_Links_Page ln = new TC0006_Links_Page();
		ln.getTextAll_Links();
	}
	
	@Test(priority = 3,groups = {"smoke","regression"}, dataProviderClass= Utilities.class, dataProvider="demoQAdata")
	public void links_test(Hashtable<String, String> data) throws Exception {
		TC0006_Links_Page ln = new TC0006_Links_Page();
		ln.Click_Home_Links(data.get("home"),data.get("home2"));
		ln.Click_HomeSWXEC_Links(data.get("created"), data.get("nocontent"), 
				data.get("moved"),
				data.get("badrequest"), data.get("unautorized"), 
				data.get("forbidden"), data.get("not_found"));
	}
	
	@Test(priority = 4,groups = {"smoke","regression"})
	public void tear() {
		BaseClass.tear();
	}


}
