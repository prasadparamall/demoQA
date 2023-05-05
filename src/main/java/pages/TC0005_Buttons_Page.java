package pages;

import java.io.IOException;

import org.openqa.selenium.Keys;

import base.BaseClass;


public class TC0005_Buttons_Page extends BaseClass{
	
	
	
	public void button_Click() throws Exception {
		clickJS("buttons_xpath");
		log.info("click button");
	}
	
	public void doubleClick() throws Exception {
		doubleClick("doubleclick_xpath");
		log.info("click doublieclick");
		singlegetText("doubleclickText_xpath");
		Thread.sleep(1000);
	}
	
	public void rightClick() throws Exception {
		rightClick("rightclick_xpath");
		log.info("click rightclick");
		singlegetText("rightclickText_xpath");
		Thread.sleep(1000);
	}
	
	public void clickMe() throws Exception {
		clickJS("clickMe_xpath");
		log.info("click singleclick");
		singlegetText("clickMeText_xpath");
		Thread.sleep(1000);
	}

	
		

}
