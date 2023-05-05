package pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import base.BaseClass;
import utilities.Paths;


public class TC0004_WebTable_Page extends BaseClass{
	
	
	
	public void webtableButton_Click() throws Exception {
		clickJS("webtable_xpath");
		log.info("click webtable button");
		Thread.sleep(1000);
		System.out.println("---------Before Adding Values ----------"+ "\n");
		printTable("mtable_xpath", Paths.table5, Paths.table6);
		Thread.sleep(1000);
	}

	
	public void enterValues(String fname, String lastname, String email, String age, String sal, String dep) throws Exception {
		
		clickJS("add_Button_xpath");
		log.info("click Add button");
		Thread.sleep(1000);
		
		clear("first_name_xpath");
		getElement("first_name_xpath").sendKeys(fname);
		log.info("enter first name");
		
		clear("last_name_xpath");
		getElement("last_name_xpath").sendKeys(lastname);
		log.info("enter last name");
		
		clear("useremail_xpath");
		getElement("useremail_xpath").sendKeys(email);
		log.info("enter email");
		
		clear("age_xpath");
		getElement("age_xpath").sendKeys(age);
		log.info("enter age");
		
		clear("salary_xpath");
		getElement("salary_xpath").sendKeys(sal);
		log.info("enter salary");
		
		clear("depertment_xpath");
		getElement("depertment_xpath").sendKeys(dep);
		log.info("enter department");
		
		Thread.sleep(1000);
		clickJS("submit_xpath");
		log.info("click submit button");
		Thread.sleep(1000);
	}
	
	public void print_After_Adding_Values() throws Exception {
		Thread.sleep(1000);
		System.out.println("---------After Adding Values ----------"+ "\n");
		printTable("mtable_xpath", Paths.table5, Paths.table6);
		Thread.sleep(1000);
	}
	
	public void Serching(String name, String fname, String lastname, String email, String smfname) throws Exception {
		
			clear("serch_xpath");
			getElement("serch_xpath").sendKeys(name);
			log.info("enter name");
			Thread.sleep(1000);
	
			clickJS("edit_xpath");
			log.info("click edit button");
			Thread.sleep(1000);
			
			clear("first_name_xpath");
			getElement("first_name_xpath").sendKeys(fname);
			log.info("enter first name");
			Thread.sleep(1000);
			
			clear("last_name_xpath");
			getElement("last_name_xpath").sendKeys(lastname);
			log.info("enter last name");
			Thread.sleep(1000);
			
			clear("useremail_xpath");
			getElement("useremail_xpath").sendKeys(email);
			log.info("enter email");
			Thread.sleep(1000);
			
			clickJS("submit_xpath");
			log.info("click submit button");
			Thread.sleep(1000);
			
			clear("serch_xpath");
			getElement("serch_xpath").sendKeys(smfname);
			log.info("enter modified name");
			Thread.sleep(1000);
				
		    clickJS("delete_xpath");
		    log.info("click delect button");
		    Thread.sleep(1000);
		    
		    getElement("serch_xpath").sendKeys(Keys.CONTROL, "a", Keys.BACK_SPACE);
		    Thread.sleep(1000);
		
	}
	
	public void print_Table() throws Exception {
		
		System.out.println("---------After deleted Values ----------"+ "\n");
		printTable("mtable_xpath", Paths.table5, Paths.table6);
		Thread.sleep(1000);
	}
	

}
