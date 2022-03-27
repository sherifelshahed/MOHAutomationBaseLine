package NUR_Intra_Ward_Patient_Transfer;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Nurse_Transfer_patients_within_the_same_nursing_unit {
	public void transfer(WebDriver driver, String Patient_ID) {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		try {
			WebElement Transfer_Patient_Intra_btn = driver.findElement(By.id("sd2"));
			Transfer_Patient_Intra_btn.click();

			driver.switchTo().defaultContent();
			driver.switchTo().frame(2);
			driver.switchTo().frame("commontoolbarFrame");

			WebElement page_title = driver.findElement(By.id("cmnToolBarFuncName"));
			if (page_title.isDisplayed()) {
				System.out.println("we are at 'Intra-Ward Patient Transfer' function");
			}

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

			WebElement Encounter_ID_hyperlink = driver.findElement(By.partialLinkText("1000"));
			Encounter_ID_hyperlink.click();

			Thread.sleep(2000);

			// String currentWindow = driver.getWindowHandle();
			Set<String> windows1 = driver.getWindowHandles();
			for (String window1 : windows1) {
				driver.switchTo().window(window1);
				// System.out.println(driver.getTitle());
			}
			if (driver.getTitle().contains("Intra ward Patient Transfer")) {

				System.out.println(driver.getCurrentUrl());

				Thread.sleep(1000);

				driver.switchTo().defaultContent();
				driver.switchTo().frame("Transfer_frame");

				WebElement ReasonForTransfer = driver.findElement(By.name("transfer_type"));
				ReasonForTransfer.click();
				ReasonForTransfer.sendKeys(Keys.ARROW_DOWN);
				ReasonForTransfer.sendKeys(Keys.TAB);

				WebElement Service_ddl = driver.findElement(By.name("service"));
				Service_ddl.click();
				Service_ddl.sendKeys(Keys.ARROW_DOWN);
				Service_ddl.sendKeys(Keys.TAB);

				WebElement bedLookup = driver.findElement(By.id("bedlookkup"));
				bedLookup.click();
			}

			String currentWindow1 = driver.getWindowHandle();
			Set<String> windows11 = driver.getWindowHandles();
			for (String window1 : windows11) {
				driver.switchTo().window(window1);
				System.out.println(driver.getTitle());

				if (driver.getTitle().contains("Bed Availability Chart")) {
					System.out.println(driver.getCurrentUrl());
					driver.switchTo().parentFrame();
					driver.switchTo().defaultContent();
					driver.switchTo().frame("result");

					WebElement BedNo = driver.findElement(By.xpath("//input[@class = 'IP_GreenButton'][1]"));
					BedNo.click();
					System.out.println(BedNo.getText());
					BedNo.click();
					Thread.sleep(3000);
				}
			}
			Thread.sleep(2000);
			driver.switchTo().window(currentWindow1);
			driver.switchTo().defaultContent();
			driver.switchTo().frame("Transfer_frame");
			WebElement transfer_btn = driver.findElement(By.name("transfer"));
			transfer_btn.click();
			Thread.sleep(4000);

			driver.switchTo().alert();
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().dismiss();

			Thread.sleep(6000);
		} catch (

		InterruptedException ex) {
			Logger.getLogger(Nurse_Transfer_patients_within_the_same_nursing_unit.class.getName()).log(Level.SEVERE,
					null, ex);
		}
	}
}