package testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.TC0004_WebTable_Page;
import utilities.Utilities;


public class TC0004_WebTable_Test {
	
	@Test(priority = 1,groups = {"smoke","regression"})
	public void webtable_Click() throws Exception {
		TC0004_WebTable_Page wb = new TC0004_WebTable_Page();
		wb.webtableButton_Click();
	}
	
	@Test(priority = 2,groups = {"smoke","regression"}, dataProviderClass = Utilities.class, dataProvider="demoQAdata")
	public void webtable_enter_Values(Hashtable<String, String> data) throws Exception {
		TC0004_WebTable_Page wb = new TC0004_WebTable_Page();
		wb.enterValues(data.get("fname"), data.get("lname"), data.get("email"), data.get("age"), data.get("salary"), data.get("depertment"));
	}
	
	@Test(priority = 3,groups = {"smoke","regression"})
	public void print_After_Table() throws Exception {
		TC0004_WebTable_Page wb = new TC0004_WebTable_Page();
		wb.print_After_Adding_Values();
	}


	@Test(priority = 4,groups = {"smoke","regression"}, dataProviderClass = Utilities.class, dataProvider="demoQAdata")
	public void webtable_serching_(Hashtable<String, String> data) throws Exception {
		TC0004_WebTable_Page wb = new TC0004_WebTable_Page();
		wb.Serching(data.get("fname"), data.get("mfname"), data.get("mlname"), data.get("memail"), data.get("smfname"));
	}
	
	@Test(priority = 5,groups = {"smoke","regression"})
	public void print_After_Deleted_Table() throws Exception {
		TC0004_WebTable_Page wb = new TC0004_WebTable_Page();
		wb.print_Table();
	}
	
	
	@Test(priority = 6,groups = {"smoke","regression"})
	public void teardown() {
		BaseClass.tear();
	}


}