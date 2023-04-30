package pages;

import org.testng.Assert;

import base.BaseClass;

public class TC0001_TextBox_Page extends BaseClass {
	
	public void textBox_Page_Click() {
		clickJS("textboxbtn_xpath");
	}
	
	public void textBox_Page_EnterForm(String fname, String email, String cadd, String padd) throws Exception {
		clear("fullname_xpath");
		getElement("fullname_xpath").sendKeys(fname);
		clear("email_xpath");
		getElement("email_xpath").sendKeys(email);
		clear("caddress_xpath");
		getElement("caddress_xpath").sendKeys(cadd);
		clear("paddress_xpath");
		getElement("paddress_xpath").sendKeys(padd);
		Thread.sleep(1000);
		
		clickJS("submit_xpath");
		Thread.sleep(1000);
	}
	
	public void textBox_Page_getText() {
		String text = getElement("printoutput_xpath").getText();
		System.out.println(text);
		Assert.assertTrue(false);
	}

}
