package pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import base.BaseClass;


public class TC0004_WebTable_Page extends BaseClass{
	
	
	
	public void webtableButton_Click() throws Exception {
		clickJS("webtable_xpath");
		Thread.sleep(1000);
		
	}

	
	public void enterValues(String fname, String lastname, String email, String age, String sal, String dep) throws Exception {
		
		clickJS("add_Button_xpath");
		Thread.sleep(1000);
		clear("first_name_xpath");
		getElement("first_name_xpath").sendKeys(fname);
		clear("last_name_xpath");
		getElement("last_name_xpath").sendKeys(lastname);
		clear("useremail_xpath");
		getElement("useremail_xpath").sendKeys(email);
		clear("age_xpath");
		getElement("age_xpath").sendKeys(age);
		clear("salary_xpath");
		getElement("salary_xpath").sendKeys(sal);
		
		clear("depertment_xpath");
		getElement("depertment_xpath").sendKeys(dep);
		
		Thread.sleep(1000);
		clickJS("submit_xpath");
		Thread.sleep(1000);
	}
	
	public void Serching(String name, String fname, String lastname, String email, String smfname) throws Exception {
		
		iteratorgetText("gettestfirst_xpath");
		Thread.sleep(1000);
		iteratorgetText("demo2_xpath");
		Thread.sleep(1000);
		
		System.out.println("....Before Enter values..." + "\n");
		
		
		if(name.contains("abc")) {
			
			clear("serch_xpath");
			getElement("serch_xpath").sendKeys(name);
			Thread.sleep(1000);
			iteratorgetText("gettestfirst_xpath");
			Thread.sleep(1000);
			iteratorgetText("demo2_xpath");
			Thread.sleep(1000);
			
			clickJS("edit_xpath");
			Thread.sleep(1000);
			clear("first_name_xpath");
			getElement("first_name_xpath").sendKeys(fname);
			clear("last_name_xpath");
			getElement("last_name_xpath").sendKeys(lastname);
			clear("useremail_xpath");
			getElement("useremail_xpath").sendKeys(email);
			
			Thread.sleep(1000);
			clickJS("submit_xpath");
			Thread.sleep(1000);
			
			clear("serch_xpath");
			getElement("serch_xpath").sendKeys(smfname);
			iteratorgetText("gettestfirst_xpath");
			Thread.sleep(1000);
			iteratorgetText("demo2_xpath");
			Thread.sleep(1000);
			
		    clickJS("delete_xpath");
		    Thread.sleep(1000);
		    getElement("serch_xpath").sendKeys(Keys.CONTROL, "a", Keys.BACK_SPACE);
			
			
		} else if(name.contains("xyz")) {
			
			clear("serch_xpath");
			getElement("serch_xpath").sendKeys(name);
			iteratorgetText("gettestfirst_xpath");
			Thread.sleep(1000);
			iteratorgetText("demo2_xpath");
			Thread.sleep(1000);
			
			clickJS("edit_xpath");
			Thread.sleep(1000);
			clear("first_name_xpath");
			getElement("first_name_xpath").sendKeys(fname);
			clear("last_name_xpath");
			getElement("last_name_xpath").sendKeys(lastname);
			clear("useremail_xpath");
			getElement("useremail_xpath").sendKeys(email);
			
			Thread.sleep(1000);
			clickJS("submit_xpath");
			Thread.sleep(1000);
			
			clear("serch_xpath");
			getElement("serch_xpath").sendKeys(smfname);
			iteratorgetText("gettestfirst_xpath");
			Thread.sleep(1000);
			Thread.sleep(1000);
			iteratorgetText("demo2_xpath");
			Thread.sleep(1000);
			
		    clickJS("delete_xpath");
		    Thread.sleep(1000);
		    getElement("serch_xpath").sendKeys(Keys.CONTROL, "a", Keys.BACK_SPACE);
			
			
		}
		System.out.println("....After Enter values..." + "\n");
	}
	
	public void print_Table() throws Exception {
		iteratorgetText("table_firstrow_xpath");
		Thread.sleep(1000);
		iteratorgetText("table_secondrow_xpath");
	}
	

}
