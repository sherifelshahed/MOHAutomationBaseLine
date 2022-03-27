package NUR_Cancel_Discharge_Advice;

import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Nurse_Cancel_Discharge_Advice {

	public void discharge_advice(WebDriver driver, String Patient_ID) {

		try {

			WebElement cancel_discharge_btn = driver.findElement(By.id("sd19"));
			cancel_discharge_btn.click();

			Thread.sleep(500);
			System.out.println("Nurse is Navigated to Cancel Discharge Advice Page Successfully");

			driver.switchTo().defaultContent();
			driver.switchTo().frame(2);
			driver.switchTo().frame("f_query_add_mod");

			WebElement patientId = driver.findElement(By.name("patient_id"));
			patientId.sendKeys(Patient_ID);

			WebElement SearchBtn = driver.findElement(By.name("search"));
			SearchBtn.click();

			driver.switchTo().defaultContent();
			driver.switchTo().frame(2);
			driver.switchTo().frame("f_query_add_mod1");

			WebElement Encounter_ID_Heiperlink = driver.findElement(By.partialLinkText("1000"));
			Encounter_ID_Heiperlink.click();

			String currentWindow = driver.getWindowHandle();
			Set<String> windows1 = driver.getWindowHandles();
			for (String window1 : windows1) {
				driver.switchTo().window(window1);
				System.out.println(driver.getTitle());
			}
			if (driver.getTitle().contains("Cancel Discharge Advice")) {
				System.out.println(driver.getCurrentUrl());
				driver.switchTo().defaultContent();
				driver.switchTo().frame("f_query_add_mod");
				WebElement cancel_discharge_adviceBtn = driver.findElement(By.name("cancel_discharge"));
				cancel_discharge_adviceBtn.click();
				WebElement CancelReasons = driver.findElement(By.name("cancel_remarks"));
				CancelReasons.click();
				CancelReasons.sendKeys(Keys.ARROW_DOWN);
				CancelReasons.sendKeys(Keys.TAB);
				WebElement confirm_cancel_dischargeBtn = driver.findElement(By.name("cancel_discharge"));
				confirm_cancel_dischargeBtn.click();

				driver.switchTo().alert();
				if (driver.switchTo().alert().getText().contains("Operation Completed Successfully ....")) {
					System.out.println("the Discharge Advice is Cancelled Successfully");
					driver.switchTo().alert().dismiss();
				}

			}

		} catch (InterruptedException ex) {
			Logger.getLogger(Nurse_Cancel_Discharge_Advice.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
