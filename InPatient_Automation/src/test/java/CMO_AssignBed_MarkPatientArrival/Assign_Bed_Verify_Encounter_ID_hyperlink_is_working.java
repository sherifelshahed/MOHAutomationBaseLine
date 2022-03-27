package CMO_AssignBed_MarkPatientArrival;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Assign_Bed_Verify_Encounter_ID_hyperlink_is_working {
	public void assign_bed(WebDriver driver, String Patient_ID) {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		try {

			WebElement Assign_Bed_btn = driver.findElement(By.id("sd2"));
			Assign_Bed_btn.click();

			driver.switchTo().defaultContent();
			driver.switchTo().frame(2);
			driver.switchTo().frame("commontoolbarFrame");

			WebElement page_title = driver.findElement(By.id("cmnToolBarFuncName"));
			if (page_title.isDisplayed()) {

				System.out.println("we are at ' Assign Bed / Mark Patient Arrival ' function");
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
			// store assign bed main function link in "currentWindow"
			Encounter_ID_hyperlink.click();

			Thread.sleep(500);

			System.out.println(
					" Encounter ID hyperlink is working  and user is directed to Assign Bed/Mark Patient Arrival page ");

			String currentWindow = driver.getWindowHandle();
			for (String WindowID : driver.getWindowHandles()) {
				String Title = driver.switchTo().window(WindowID).getTitle();
				if (Title.equals("Assign Bed / Mark Patient Arrival")) {

					Thread.sleep(500);

					driver.close();
				}
			}

		} catch (InterruptedException ex) {
			Logger.getLogger(Assign_Bed_Verify_Encounter_ID_hyperlink_is_working.class.getName()).log(Level.SEVERE,
					null, ex);
		}
	}
}