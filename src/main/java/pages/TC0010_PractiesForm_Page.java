package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.BaseClass;
import utilities.Paths;

public class TC0010_PractiesForm_Page extends BaseClass {

	public void dynamicProperties_Click() throws Exception {
		clickJS("clickForms_xpath");
		clickJS("clickpractiesForm_xpath");
	}

	public void enterFormDetails(String fname, String lname, String email, String male, String female, String others,
			String mnumber, String date, String month, String year, String sub, String sports, String reading,
			String music, String caddress, String state1, String city, String path) throws Exception {

		getElement("fname_xpath").sendKeys(fname);
		getElement("lname_xpath").sendKeys(lname);
		getElement("email_xpath").sendKeys(email);

		List<WebElement> dd2 = getElements("gender_comm2_xpath");
		switch (male) {
		case "true":
			for (int j = 0; j <= dd2.size(); j++) {
				dd2.get(0).click();
				break;
			}
			break;
		case "false":
			System.out.println("");
			break;
		default:
			break;
		}

		switch (female) {
		case "true":
			for (int k = 0; k <= dd2.size(); k++) {
				dd2.get(1).click();
				break;
			}

			break;
		case "false":
			System.out.println("");
			break;
		default:
			break;
		}

		switch (others) {
		case "true":
			for (int l = 0; l <= dd2.size(); l++) {
				dd2.get(2).click();
				break;
			}

			break;
		case "false":
			System.out.println("");
			break;
		default:
			break;
		}

		getElement("mobileno_xpath").sendKeys(mnumber);

		clickJS("dateofbirthClick_xpath");

		Thread.sleep(1000);
		waitVisibility("calender_xpath");
		selectDate(date, month, year);

		Thread.sleep(2000);

		getElement("sub_xpath").sendKeys(sub);
		getElement("sub_xpath").sendKeys(Keys.ENTER);

		List<WebElement> dd3 = getElements("hobbiescomm_xpath");
		switch (sports) {
		case "true":
			for (int j = 0; j <= dd3.size(); j++) {
				WebElement ss = dd3.get(0);
				clickJSValue(ss);
				break;
			}
			break;
		case "false":
			System.out.println("");
			break;
		default:
			break;
		}

		switch (reading) {
		case "true":
			for (int j = 0; j <= dd3.size(); j++) {
				WebElement ss = dd3.get(1);
				clickJSValue(ss);
				break;
			}

			break;
		case "false":
			System.out.println("");
			break;
		default:
			break;
		}

		switch (music) {
		case "true":
			for (int j = 0; j <= dd3.size(); j++) {
				WebElement ss = dd3.get(2);
				clickJSValue(ss);
				break;
			}

			break;
		case "false":
			System.out.println("");
			break;
		default:
			break;
		}

		Thread.sleep(1000);
		clickJS("chosefile_xpath");
		Thread.sleep(4000);
		StringSelection ss = new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		robot().keyPress(KeyEvent.VK_CONTROL);
		robot().keyPress(KeyEvent.VK_V);

		robot().keyRelease(KeyEvent.VK_CONTROL);
		robot().keyRelease(KeyEvent.VK_V);

		robot().keyPress(KeyEvent.VK_ENTER);
		robot().keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);

		getElement("currentadd_xpath").sendKeys(caddress);
		Thread.sleep(1000);

		getElement("selectstate_xpath").sendKeys(state1);
		Thread.sleep(1000);
		robot().keyPress(KeyEvent.VK_ENTER);
		robot().keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

		getElement("selectcity_xpath").sendKeys(city);
		Thread.sleep(1000);
		robot().keyPress(KeyEvent.VK_ENTER);
		robot().keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		clickJS("subm_xpath");
		Thread.sleep(2000);
		
		iteratorgetText("fprinttabledetails_xpath");
		Thread.sleep(1000);
		printTable("tableprint_xpath",Paths.table3 ,Paths.table4 );
		Thread.sleep(2000);
		
		//getElement("//button[@id='closeLargeModal']").click();
		
		clickJS("close_xpath");
		Thread.sleep(1000);
	}

	public void selectDate(String day, String month, String year) throws Exception {

		// String s=Integer.toString(day);

//		 String s="200";  
//		//Converting String into int using Integer.parseInt()  
//		int i=Integer.parseInt(s);  
//		
//		int i=200;  
//		String s=Integer.toString(i);

		if (month.equals("February") && Integer.parseInt(day) > 29) {
			System.out.println("wrong date: " + month + " : " + (day));
			return;
		}

		if (Integer.parseInt(day) > 31) {
			System.out.println("wrong date: " + month + " : " + day);
			return;
		}

		String monthYearVal = getElement("getTitleText_xpath").getText(); // title
		System.out.println(monthYearVal);

		while (!(getMonthYear(monthYearVal)[0].equals(month) && getMonthYear(monthYearVal)[1].equals(year))) {
			clickJS("nextmonthbutton_xpath"); // next click path
			monthYearVal = getElement("getTitleText_xpath").getText();
		}
		try {

			driver.findElement(By.xpath("//div[text()='" + day + "']")).click();
		} catch (Exception e) {
			System.out.println("wrong date: " + month + " : " + day);
		}
		// locator(Config.practiesform("")).click(); //date
	}

	public void testdemo() {

		driver.findElement(By.xpath("//div[@id='subjectsContainer']/div/div/div/div/input")).sendKeys("c");

	}

}
