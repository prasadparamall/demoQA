package pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.BaseClass;


public class TC0007_BrokenLinks_Page extends BaseClass{
	
	
	
	public void brokenlinksButton_Click() throws Exception {
		clickJS("brokenlinks_xpath");
		Thread.sleep(1000);
	}
	
	public void brokenlinksAll() {
		  //Storing the links in a list and traversing through the links
       // List<WebElement> links = getElements("tagname_name");
        List<WebElement> links = driver.findElements(By.tagName("a"));

        // This line will print the number of links and the count of links.
        System.out.println("No of links are "+ links.size() +"\n");  
      
        //checking the links fetched.
        for(int i=0;i<links.size();i++)
        {
            WebElement E1= links.get(i);
            String url= E1.getAttribute("href");
            verifyLinks(url);
        }
        
       // driver.quit();
    }

	public void brokenimages() {
		 // Storing all elements with img tag in a list of WebElements
       // List<WebElement> images = getElements("tagnameimage_name");
		List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println("Total number of Images on the Page are " + images.size() +"\n");
        
        
        //checking the links fetched.
        for(int index=0;index<images.size();index++)
        {
            WebElement image= images.get(index);
            String imageURL= image.getAttribute("src");
            System.out.println("URL of Image " + (index+1) + " is: " + imageURL);
            verifyLinks(imageURL);
          
            //Validate image display using JavaScript executor
            try {
                boolean imageDisplayed = (Boolean) ((JavascriptExecutor) driver).executeScript("return (typeof arguments[0].naturalWidth !=\"undefined\" && arguments[0].naturalWidth > 0);", image);
                if (imageDisplayed) {
                    System.out.println("DISPLAY - OK" +"\n");
                }else {
                     System.out.println("DISPLAY - BROKEN" +"\n");
                }
            } 
            catch (Exception e) {
            	System.out.println("Error Occured");
            }
        }

	}
	
	public void getText_Links() {
		iteratorgetText("getTextxomm_xpath");
		
	}
	
	public void click_Links(String link11, String link22) throws Exception {
		
		List<WebElement> links = getElements("getTextxomm_xpath");
		
		switch(link11){
		case "true":
			
			clickJS("f_xpath");
			
			break;
		case "false":
			System.out.println("");
			break;
			default:
			break;
		}
		
		Thread.sleep(2000);
		String actu = "https://demoqa.com/1";
		softassert.assertEquals(actu, driver.getCurrentUrl(), " fffffffff");
		driver.navigate().to("https://demoqa.com/broken");
		Thread.sleep(3000);
		
		switch(link22){
		case "true":
     		
			clickJS("s_xpath");
					
			break;
		case "false":
			System.out.println("");
			break;
			default:
				
				break;
		}
		
		Thread.sleep(2000);
		String actu1 = "http://the-internet.herokuapp.com/status_codes/5001";
		softassert.assertEquals(actu1, driver.getCurrentUrl() ,"seeeeeeee");
		driver.navigate().to("https://demoqa.com/broken");
		Thread.sleep(1000);

		softassert.assertAll();
	}

	
}
