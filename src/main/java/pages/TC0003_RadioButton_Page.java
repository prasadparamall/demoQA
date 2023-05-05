package pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseClass;

public class TC0003_RadioButton_Page extends BaseClass {

	public void radioButton() throws Exception {
		clickJS("radio_button_xpath");
		log.info("click radiobutton");
		Thread.sleep(1000);
	}

	public void selectOptions(String yes, String impre, String no) throws Exception {


		switch (yes) {
		case "true":

			if (!(getElement("yes_xpath").isSelected())) {

				clickJS("yes_xpath");
				log.info("click yes radio button");
				Thread.sleep(1000);
				WebElement tx = getElement("gettext2_xpath");
				System.out.println(tx.getText());
				break;

			} else {
				System.out.println("It is Selected");
			}

		case "false":
			System.out.println("");
			break;
		default:
			break;
		}

		switch (impre) {
		case "true":

			if (!(getElement("impr_xpath").isSelected())) {

				clickJS("impr_xpath");
				log.info("click impre radio button");
				Thread.sleep(1000);
				WebElement tx = getElement("gettext2_xpath");
				System.out.println(tx.getText());
				break;

			} else {
				System.out.println("It is Selected");
			}

		case "false":
			System.out.println("");
			break;
		default:
			break;
		}

		switch (no) {
		case "true":

			if (!(getElement("no_xpath").isEnabled())) {
				System.out.println("It is not Enabled");
			} else {
				
				clickJS("no_xpath");
				log.info("click no radio button");
				Thread.sleep(1000);
				WebElement tx = getElement("gettext2_xpath");
				System.out.println(tx.getText());
				break;

			}

		case "false":
			System.out.println("");
			break;
		default:
			break;
		}

	}

}
