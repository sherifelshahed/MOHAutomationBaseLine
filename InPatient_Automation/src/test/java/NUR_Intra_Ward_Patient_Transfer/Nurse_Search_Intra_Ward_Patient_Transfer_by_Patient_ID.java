package NUR_Intra_Ward_Patient_Transfer;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Nurse_Search_Intra_Ward_Patient_Transfer_by_Patient_ID {
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
			if (Encounter_ID_hyperlink.isDisplayed()) {
				System.out.println(
						"the search result is Displayed the Encounter id is :" + Encounter_ID_hyperlink.getText());
				System.out.println("Nurse can search in 'Intra Ward Patient Transfer' by the Patient ID Successfully ");
			}
			Thread.sleep(3000);

		} catch (

		InterruptedException ex) {
			Logger.getLogger(Nurse_Search_Intra_Ward_Patient_Transfer_by_Patient_ID.class.getName()).log(Level.SEVERE,
					null, ex);
		}
	}
}