package NUR_Intra_Ward_Patient_Transfer;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Nurse_Check_Intra_Ward_Patient_Transfer_UI {
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

			// Text fields

			WebElement Nursing_UnitTXT = driver.findElement(By.name("nursing_unit_desc"));
			if (Nursing_UnitTXT.isEnabled()) {
				Nursing_UnitTXT.sendKeys("Chemotherapy unit");

				WebElement NursingUnit_search_btn = driver.findElement(By.name("nursing_unit_lookup"));
				NursingUnit_search_btn.click();
				System.out.println("Nuring Unit text field is Visible and with a type:" + Nursing_UnitTXT.getTagName());
			}

			WebElement patientId = driver.findElement(By.name("patient_id"));
			patientId.sendKeys(Patient_ID);

			if (patientId.isEnabled()) {
				System.out.println("Patient ID text field is Visible and with a type:" + patientId.getTagName());
			}

			WebElement EncounterId = driver.findElement(By.name("encounter_id"));
			if (EncounterId.isEnabled()) {
				EncounterId.sendKeys("1000342");
				System.out.println("Encounter ID field is Visible and with a type:" + EncounterId.getTagName());
			}

			WebElement Admission_date_from_txt = driver.findElement(By.name("from_date"));
			if (Admission_date_from_txt.isEnabled()) {
				Admission_date_from_txt.sendKeys("18/01/2021");
				System.out.println("Admission Date From Text field is Visible and with a type:"
						+ Admission_date_from_txt.getTagName());
			}

			WebElement Admission_date_to_txt = driver.findElement(By.name("to_date"));
			if (Admission_date_to_txt.isEnabled()) {
				Admission_date_to_txt.sendKeys("18/01/2022");
				System.out.println("Admission Date to field Text is Visible and with a type:"
						+ Admission_date_to_txt.getTagName());

			}

			WebElement practitioner_txt = driver.findElement(By.name("practid_desc"));
			if (practitioner_txt.isEnabled()) {
				practitioner_txt.sendKeys("Doctor El Zohour Inpatient 01");
				WebElement practitioner_search_btn = driver.findElement(By.name("pract_id_search"));
				practitioner_search_btn.click();
				System.out
						.println("Practitioner Text field is Visible and with a type:" + practitioner_txt.getTagName());
			}

			// Buttons
			WebElement SearchBtn = driver.findElement(By.name("search"));
			if (SearchBtn.isEnabled()) {
				System.out.println("Search Button is Visible and with a type:" + SearchBtn.getTagName());
			}
			WebElement ClearBtn = driver.findElement(By.name("clear"));
			if (ClearBtn.isEnabled()) {
				System.out.println("Reset Button is Visible and with a type:" + ClearBtn.getTagName());
			}

			Thread.sleep(5000);
//			driver.close();

		} catch (

		InterruptedException ex) {
			Logger.getLogger(Nurse_Check_Intra_Ward_Patient_Transfer_UI.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}