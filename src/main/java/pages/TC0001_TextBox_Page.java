package pages;

import org.testng.Assert;

import base.BaseClass;

public class TC0001_TextBox_Page extends BaseClass {

	public void textBox_Page_Click() {
		clickJS("textboxbtn_xpath");
		log.info("Click TextBox Button");

	}

	public void textBox_Page_EnterForm(String fname, String email, String cadd, String padd) throws Exception {

		clear("fullname_xpath");
		getElement("fullname_xpath").sendKeys(fname);
		log.info("enter firstname");
		
		clear("email_xpath");
		getElement("email_xpath").sendKeys(email);
		log.info("enter email");
		
		clear("caddress_xpath");
		getElement("caddress_xpath").sendKeys(cadd);
		log.info("enter Current Address");
		
		clear("paddress_xpath");
		getElement("paddress_xpath").sendKeys(padd);
		log.info("enter Permanent Address");
		
		Thread.sleep(1000);

		clickJS("submit_xpath");
		log.info("click submit button");
		Thread.sleep(1000);
	}

	public void textBox_Page_getText() {
		String text = getElement("printoutput_xpath").getText();
		System.out.println(text);
		log.info("print textbox details");
		Assert.assertTrue(false);
	}

}
