package testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.TC0007_BrokenLinks_Page;
import utilities.Utilities;


public class TC0007_Broken_Links_Images_Test {
	
	@Test(priority = 1,groups = {"smoke","regression"})
	public void brokenLinks_Click() throws Exception {
		TC0007_BrokenLinks_Page bn = new TC0007_BrokenLinks_Page();
		bn.brokenlinksButton_Click();
		
	}
	
	@Test(priority = 2,groups = {"smoke","regression"})
	public void getBrokenLinks_images_Details() {
		TC0007_BrokenLinks_Page bn = new TC0007_BrokenLinks_Page();
		bn.brokenlinksAll();
		bn.brokenimages();
		bn.getText_Links();
	}
	
	@Test(priority = 3,groups = {"smoke","regression"}, dataProviderClass=Utilities.class, dataProvider="demoQAdata")
	public void brokenlinks_click_Links(Hashtable<String, String> data) throws Exception {
		TC0007_BrokenLinks_Page bn = new TC0007_BrokenLinks_Page();
		bn.click_Links(data.get("link1"), data.get("link2"));
	}
	
	@Test(priority = 4,groups = {"smoke","regression"})
	public void tear() {
		BaseClass.tear();
	}
	
}
