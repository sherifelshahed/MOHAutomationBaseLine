package CMO_Cancel_Discharge;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CMO_Cancel_Discharge {
	public void cancel_discharge(WebDriver driver, String Patient_ID) {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		try {

			By Cancel_Discharge = By.id("sd10");
			driver.findElement(Cancel_Discharge).click();

			driver.switchTo().defaultContent();
			driver.switchTo().frame(2);
			driver.switchTo().frame("f_query_add_mod");

			WebElement Patient_IDText = driver.findElement(By.name("patient_id"));
			Patient_IDText.sendKeys(Patient_ID);

			WebElement search_btn = driver.findElement(By.name("search"));
			search_btn.click();
			Thread.sleep(500);
			search_btn.click();

			driver.switchTo().parentFrame();
			driver.switchTo().defaultContent();

			driver.switchTo().frame("content");
			driver.switchTo().frame("f_query_add_mod1");

			WebElement Encounter_ID_hyperlink = driver.findElement(By.partialLinkText("1000"));
			Encounter_ID_hyperlink.click();

			String currentWindow = driver.getWindowHandle();
			Set<String> windows1 = driver.getWindowHandles();
			for (String window1 : windows1) {
				driver.switchTo().window(window1);
				if (driver.getTitle().contains("Cancel Discharge Patient")) {

					driver.switchTo().parentFrame();
					driver.switchTo().defaultContent();
					driver.switchTo().frame("Transfer_frame");

					WebElement reason_for_Cancelation = driver
							.findElement(By.xpath("//table/tbody/tr[16]/td[2]/select"));
					reason_for_Cancelation.sendKeys(Keys.ARROW_DOWN);

					driver.switchTo().parentFrame();
					driver.switchTo().defaultContent();
					driver.switchTo().frame("Transfer_frame_buttons");

					WebElement Confirm_Cancelation = driver.findElement(By.name("confirm"));
					Confirm_Cancelation.click();

					org.openqa.selenium.Alert alert = driver.switchTo().alert();
					String alertMessage = driver.switchTo().alert().getText();
					System.out.println(alertMessage);

					alert.accept();
				}
			}
		} catch (InterruptedException ex) {
			Logger.getLogger(CMO_Cancel_Discharge.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}