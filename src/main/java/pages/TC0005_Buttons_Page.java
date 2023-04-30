package pages;

import java.io.IOException;

import org.openqa.selenium.Keys;

import base.BaseClass;


public class TC0005_Buttons_Page extends BaseClass{
	
	
	
	public void button_Click() throws Exception {
		clickJS("buttons_xpath");
	}
	
	public void doubleClick() throws Exception {
		doubleClick("doubleclick_xpath");
		singlegetText("doubleclickText_xpath");
		Thread.sleep(1000);
	}
	
	public void rightClick() throws Exception {
		rightClick("rightclick_xpath");
		singlegetText("rightclickText_xpath");
		Thread.sleep(1000);
	}
	
	public void clickMe() throws Exception {
		clickJS("clickMe_xpath");
		singlegetText("clickMeText_xpath");
		Thread.sleep(1000);
	}

	
		

}
