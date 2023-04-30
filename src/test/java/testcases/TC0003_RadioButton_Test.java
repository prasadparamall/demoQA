package testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.TC0003_RadioButton_Page;
import utilities.Utilities;



public class TC0003_RadioButton_Test {
	
	@Test(priority = 1,groups = {"smoke","regression"})
	public void radio_ButtonClick() throws Exception {
		
		TC0003_RadioButton_Page rb= new TC0003_RadioButton_Page();
		rb.radioButton();
	}
	
	@Test(priority = 2,groups = {"smoke","regression"}, dataProviderClass=Utilities.class, dataProvider="demoQAdata")
	public void radiobuttondata(Hashtable<String, String> data) throws Exception {
		
		TC0003_RadioButton_Page rb= new TC0003_RadioButton_Page();
		rb.selectOptions(data.get("yes"), data.get("impressive"), data.get("no"));
	}
	

	
	@Test(priority = 3,groups = {"smoke","regression"})
	public void tear() {
		BaseClass.tear();
	}

}
