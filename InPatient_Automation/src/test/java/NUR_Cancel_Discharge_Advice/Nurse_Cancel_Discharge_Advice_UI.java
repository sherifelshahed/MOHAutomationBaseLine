package NUR_Cancel_Discharge_Advice;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Nurse_Cancel_Discharge_Advice_UI {

	public void discharge_advice(WebDriver driver, String Patient_ID) {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		try {

			WebElement cancel_discharge_btn = driver.findElement(By.id("sd19"));
			cancel_discharge_btn.click();

			Thread.sleep(500);
			System.out.println("Nurse is Navigated to Cancel Discharge Advice Page Successfully");

			driver.switchTo().defaultContent();
			driver.switchTo().frame(2);
			driver.switchTo().frame("f_query_add_mod");

			System.out.println("We are at 'Cancel Dishcarg Advice' function");

			WebElement NursingUnitTxt = driver.findElement(By.name("nursing_unit_desc"));
			// NursingUnitTxt.sendKeys("General Surgery");
			if (NursingUnitTxt.isEnabled()) {
				System.out.println("Nursing unit text field is existing and Enabled");
			}

			// System.out.println(NursingUnitTxt.getText());
			WebElement SpecialtyTxt = driver.findElement(By.name("specialty_desc"));
			// SpecialtyTxt.sendKeys("GASTROENTEROLOG");
			if (SpecialtyTxt.isEnabled()) {
				System.out.println("Specialty text field is existing and Enabled");
			}
			WebElement EncounterTxt = driver.findElement(By.name("encounter_id"));
			// EncounterTxt.sendKeys("100");
			if (EncounterTxt.isEnabled()) {
				System.out.println("Encounter text field is existing and Enabled");
			}
			WebElement patientIdTxt = driver.findElement(By.name("patient_id"));
			patientIdTxt.sendKeys(Patient_ID);
			if (patientIdTxt.isEnabled()) {
				System.out.println("patient Id text field is existing and Enabled");
			}
			WebElement DateFromTxt = driver.findElement(By.name("from_date"));
			if (DateFromTxt.isEnabled()) {
				System.out.println("Date from text field is existing and Enabled");
			}
			WebElement DateToTxt = driver.findElement(By.name("to_date"));
			if (DateToTxt.isEnabled()) {
				System.out.println("Date To text field is existing and Enabled");
			}
			WebElement PractitionerIDTxt = driver.findElement(By.name("practid_desc"));
			if (PractitionerIDTxt.isEnabled()) {
				System.out.println("Practitioner ID text field is existing and Enabled");
			}
			WebElement ClearBtn = driver.findElement(By.name("clear"));
			if (ClearBtn.isEnabled()) {
				System.out.println("Clear button is exiting and enabled");
			}
			WebElement SearchBtn = driver.findElement(By.name("search"));
			if (SearchBtn.isEnabled()) {
				System.out.println("Search button is exiting and enabled");
			}

		} catch (InterruptedException ex) {
			Logger.getLogger(Nurse_Cancel_Discharge_Advice.class.getName()).log(Level.SEVERE, null, ex);
		}

	}
}
