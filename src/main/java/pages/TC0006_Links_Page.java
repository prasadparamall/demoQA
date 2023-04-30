package pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import base.BaseClass;


public class TC0006_Links_Page extends BaseClass{
	
	
	
	public void linksButton_Click() throws Exception {
		clickJS("links_xpath");
	}

	public void getTextAll_Links() throws Exception {
		
		iteratorgetText("alllinks_xpath");
	}
	
	public void Click_Home_Links(String home,  String home2) throws Exception {
		
		List<WebElement> dd2 = getElements("alllinks_xpath");

		switch (home) {
		case "true":
			for (int j = 0; j <= dd2.size(); j++) {
				dd2.get(0).click();
				break;
			}
			Thread.sleep(1000);
			
			String main = driver.getWindowHandle();
			Set<String> dd = driver.getWindowHandles();
			
			Iterator<String> kk = dd.iterator();
			while(kk.hasNext()) {
				String child = kk.next();
				
				if(! main.equalsIgnoreCase(child)) {
					driver.switchTo().window(child);
					String ex = "DEMOQA";
					Assert.assertEquals(ex, driver.getTitle());
					System.out.println(driver.getTitle());
					
					Thread.sleep(1000);
					driver.close();
				}
				driver.switchTo().window(main);
			}
			

			break;
		case "false":
			System.out.println("");
			break;
		default:
			break;
		}
		
		switch (home2) {
		case "true":
			for (int k = 0; k <= dd2.size(); k++) {
				dd2.get(1).click();
				break;
			}
			
			Thread.sleep(1000);
			String main = driver.getWindowHandle();
			Set<String> dd = driver.getWindowHandles();
			
			Iterator<String> kk = dd.iterator();
			while(kk.hasNext()) {
				String child = kk.next();
				
				if(! main.equalsIgnoreCase(child)) {
					driver.switchTo().window(child);
					String ex = "DEMOQA";
					Assert.assertEquals(ex, driver.getTitle());
					System.out.println(driver.getTitle());
					
					Thread.sleep(1000);
					driver.close();
				}
				driver.switchTo().window(main);
			}


			break;
		case "false":
			System.out.println("");
			break;
		default:
			break;
		}

	}
		
        public void Click_HomeSWXEC_Links(String created,String nocontent, String moved, String badrequest,
        		String unautorized, String forbidden, String notfound) throws Exception {
		
		List<WebElement> dd3 = getElements("alllinks_xpath");

		switch (created) {
		case "true":
			for (int i = 0; i <= dd3.size(); i++) {
				WebElement aa = dd3.get(2);
				clickJSValue(aa);
				break;
			}
			Thread.sleep(1000);
			singlegetText("getstatus_xpath");

			break;
		case "false":
			System.out.println("");
			break;
		default:
			break;
		}
		Thread.sleep(1000);
		
		switch (nocontent) {
		case "true":
			for (int j = 0; j <= dd3.size(); j++) {
				WebElement bb = dd3.get(3);
				clickJSValue(bb);
				break;
			}
			Thread.sleep(1000);
			singlegetText("getstatus_xpath");

			break;
		case "false":
			System.out.println("");
			break;
		default:
			break;
		}
		Thread.sleep(1000);
		switch (moved) {
		case "true":
			for (int k = 0; k <= dd3.size(); k++) {
				WebElement cc = dd3.get(4);
				clickJSValue(cc);
				break;
			}
			Thread.sleep(1000);
			singlegetText("getstatus_xpath");

			break;
		case "false":
			System.out.println("");
			break;
		default:
			break;
		}
		Thread.sleep(1000);
		
		switch (badrequest) {
		case "true":
			for (int l = 0; l <= dd3.size(); l++) {
				WebElement dd = dd3.get(5);
				clickJSValue(dd);
				break;
			}
			Thread.sleep(1000);
			singlegetText("getstatus_xpath");

			break;
		case "false":
			System.out.println("");
			break;
		default:
			break;
		}
		Thread.sleep(1000);
		
		switch (unautorized) {
		case "true":
			for (int m = 0; m <= dd3.size(); m++) {
				WebElement ee = dd3.get(6);
				clickJSValue(ee);
				break;
			}
			Thread.sleep(1000);
			singlegetText("getstatus_xpath");

			break;
		case "false":
			System.out.println("");
			break;
		default:
			break;
		}

		Thread.sleep(1000);
		switch (forbidden) {
		case "true":
			for (int n = 0; n <= dd3.size(); n++) {
				WebElement ff = dd3.get(7);
				clickJSValue(ff);
				break;
			}
			Thread.sleep(1000);
			singlegetText("getstatus_xpath");

			break;
		case "false":
			System.out.println("");
			break;
		default:
			break;
		}
		Thread.sleep(1000);
		
		switch (notfound) {
		case "true":
			for (int o = 0; o <= dd3.size(); o++) {
				WebElement gg = dd3.get(8);
				clickJSValue(gg);
				break;
			}
			Thread.sleep(1000);
			singlegetText("getstatus_xpath");

			break;
		case "false":
			System.out.println("");
			break;
		default:
			break;
		}

		Thread.sleep(1000);

	}
	
        
      
}
