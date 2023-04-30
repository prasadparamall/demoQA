package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import base.BaseClass;


public class TC0008_UploadAndDownload_Page extends BaseClass{
	
	
	
	public void uploadAndDownloadButton_Click() throws Exception {
		clickJS("uploadAndDownload_xpath");
	}
	
	public void uploadFile() throws Exception {
		
		//clickJS(Config.uploadAndDownload("choosefile_XPATH"));
		WebElement up= getElement("choosefile_xpath");
		
		Actions act = new Actions(driver);
		act.moveToElement(up).click().perform();

		Robot rb= new Robot();
		rb.delay(2000);

		StringSelection ss = new StringSelection("C:\\Users\\Kanna\\Downloads\\abc.jfif");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

	}
	
	public void download_File() {
		clickJS("down_xpath");
	}
	
	
	
}
