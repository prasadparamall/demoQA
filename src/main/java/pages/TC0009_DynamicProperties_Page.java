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
import org.testng.Assert;

import base.BaseClass;


public class TC0009_DynamicProperties_Page extends BaseClass{
	
	
	
	public void dynamicProperties_Click() throws Exception {
		clickJS("dynamicproperties_xpath");
	}
	
	public void visibleText() throws Exception {
		waitVisibility("visible_xpath");
		singlegetText("visible_xpath");
	}
	
	

	
}
