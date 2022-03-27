package CMO_Cancel_Admission;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cancel_Admission {
	public void cancel(WebDriver driver, String Patient_ID) {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		try {

			WebElement Cancel_Admission = driver.findElement(By.id("sd3"));
			Cancel_Admission.click();

			driver.switchTo().defaultContent();
			driver.switchTo().frame(2);
			driver.switchTo().frame("f_query_add_mod");

			WebElement PatientIDTxt = driver.findElement(By.name("patient_id"));
			PatientIDTxt.sendKeys(Patient_ID);

			WebElement search_btn = driver.findElement(By.name("search"));
			search_btn.click();

			if (search_btn.isEnabled()) {
				System.out.println("search button is exiting and enabled");
			}
			driver.switchTo().defaultContent();
			driver.switchTo().frame("content");
			driver.switchTo().frame(2);

			WebElement Encounter_ID_hyperlink = driver.findElement(By.partialLinkText("100"));
			Encounter_ID_hyperlink.click();

			String currentWindow = driver.getWindowHandle();
			Set<String> windows1 = driver.getWindowHandles();
			for (String window1 : windows1) {
				driver.switchTo().window(window1);

				if (driver.getTitle().contains("Cancel Admission")) {

					System.out.println(driver.getCurrentUrl());
					driver.switchTo().frame("f_query_add_mod");
					Thread.sleep(1000);

					WebElement Cancel_addmission_btn = driver.findElement(By.name("cancel_admission"));
					Cancel_addmission_btn.click();

					Thread.sleep(500);

					WebElement reason_DDL = driver.findElement(By.name("reason_for_cancellation"));
					reason_DDL.click();
					reason_DDL.sendKeys(Keys.ARROW_DOWN);
					reason_DDL.sendKeys(Keys.TAB);

					Thread.sleep(800);

					Cancel_addmission_btn.click();

					if (Cancel_addmission_btn.isEnabled()) {
						System.out.println("confirm Cancelation button is enabled and functional");

						Thread.sleep(1000);

						org.openqa.selenium.Alert alert = driver.switchTo().alert();
						String alertMessage = driver.switchTo().alert().getText();
						System.out.println(alertMessage);
						Thread.sleep(1000);
						alert.accept();

						Thread.sleep(500);

						System.out.println("Operation Completed Successfully");
					}
				}
			}

		} catch (

		InterruptedException ex) {
			Logger.getLogger(Cancel_Admission.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}