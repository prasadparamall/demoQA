package testcases;



import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;



public class OpenBrowser {
	
	@Test(groups = {"smoke","regression","sanity","functional"})
	public void openBrowserAndURL() throws Exception {
		BaseClass.setUp();
		
	}

}
