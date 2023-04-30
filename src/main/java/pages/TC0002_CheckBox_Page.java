package pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import base.BaseClass;

public class TC0002_CheckBox_Page extends BaseClass {
	
	public void checkBox_Page_Click() throws Exception {
		clickJS("checkboxbtn_xpath");
		Thread.sleep(1000);
		clickJS("clickhomedropdown_xpath");
		Thread.sleep(1000);
	}
	
	
	public void checkBox_Page_SelectItems(String desktop, String documents,String downloads,
			String workspace, String office, String notes, String commands,
			String react, String angular, String veu , String Private,
			String Public, String Classified, String General,
			String Word_File_doc, String Excel_File_doc) throws Exception {

		Thread.sleep(1000);

		List<WebElement> dd2 = getElements("clickddddropdownCommon_xpath");

		switch (desktop) {
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

		switch (documents) {
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

		switch (downloads) {
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

		Thread.sleep(1000);

		List<WebElement> dd4 = getElements("docudatacomcli_xpath");

		switch (workspace) {
		case "true":
			for (int m = 0; m <= dd4.size(); m++) {
				dd4.get(0).click();
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

		switch (office) {
		case "true":
			for (int n = 0; n <= dd4.size(); n++) {
				WebElement gg = dd4.get(1);
				clickJSValue(gg);
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

		List<WebElement> dd5 = getElements("allsubdatacomm_xpath");

		switch (notes) {
		case "true":
			for (int n = 0; n <= dd5.size(); n++) {
				WebElement gg = dd5.get(0);
				clickJSValue(gg);
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

		switch (commands) {
		case "true":
			for (int n = 0; n <= dd5.size(); n++) {
				WebElement gg = dd5.get(1);
				clickJSValue(gg);
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

		switch (react) {
		case "true":
			for (int n = 0; n <= dd5.size(); n++) {
				WebElement gg = dd5.get(2);
				clickJSValue(gg);
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

		switch (angular) {
		case "true":
			for (int n = 0; n <= dd5.size(); n++) {
				WebElement gg = dd5.get(3);
				clickJSValue(gg);
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

		switch (veu) {
		case "true":
			for (int n = 0; n <= dd5.size(); n++) {
				WebElement gg = dd5.get(4);
				clickJSValue(gg);
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

		switch (Public) {
		case "true":
			for (int n = 0; n <= dd5.size(); n++) {
				WebElement gg = dd5.get(5);
				clickJSValue(gg);
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

		switch (Private) {
		case "true":
			for (int n = 0; n <= dd5.size(); n++) {
				WebElement gg = dd5.get(6);
				clickJSValue(gg);
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

		switch (Classified) {
		case "true":
			for (int n = 0; n <= dd5.size(); n++) {
				WebElement gg = dd5.get(7);
				clickJSValue(gg);
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

		switch (General) {
		case "true":
			for (int n = 0; n <= dd5.size(); n++) {
				WebElement gg = dd5.get(8);
				clickJSValue(gg);
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

		switch (Word_File_doc) {
		case "true":
			for (int n = 0; n <= dd5.size(); n++) {
				WebElement gg = dd5.get(9);
				clickJSValue(gg);
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

		switch (Excel_File_doc) {
		case "true":
			for (int n = 0; n <= dd5.size(); n++) {
				WebElement gg = dd5.get(10);
				clickJSValue(gg);
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

	}

	
	
	public void textBox_Page_getText() {
		List<WebElement> gette = getElements("comm_gettext_xpath");
		Iterator<WebElement> dd = gette.iterator();
		
		while(dd.hasNext()) {
			String cc = dd.next().getText();
			System.out.println(cc);
		}
	
		Assert.assertTrue(false);
	}

}
