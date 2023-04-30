package testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.TC0002_CheckBox_Page;
import pages.TC0001_TextBox_Page;
import utilities.Utilities;

public class TC0002_CheckBox_Test {

	
	@Test(priority = 1,groups = {"smoke"})
	public void checkBox_Test_Click() throws Exception {
		TC0002_CheckBox_Page cb = new TC0002_CheckBox_Page();
		cb.checkBox_Page_Click();
	}
	
	@Test(priority = 2,groups = {"smoke"}, dataProviderClass=Utilities.class, dataProvider="demoQAdata")
	public void checkBox_Test_EnterForm(Hashtable<String, String> data) throws Exception {
		TC0002_CheckBox_Page cb = new TC0002_CheckBox_Page();
		cb.checkBox_Page_SelectItems(data.get("desktop"), data.get("docu"), 
				data.get("down"), data.get("worksp"), data.get("office"), 
				data.get("notes"),
				data.get("commands"), data.get("react"), data.get("angular"),
				data.get("veu"),data.get("publi"), data.get("privat"), 
				data.get("classified"), data.get("general"),
				data.get("wordfile"), data.get("excelfile"));
		
		cb.textBox_Page_getText();
		
	}
	
	
	
	
	@Test(priority = 3,groups = {"smoke","regression"})
	public void teardown() {
		BaseClass.tear();
	}

	
	
	
	
	
}
