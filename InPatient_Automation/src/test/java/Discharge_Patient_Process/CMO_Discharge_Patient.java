package Discharge_Patient_Process;

import java.util.Iterator;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CMO_Discharge_Patient {
	public void discharge_patient(WebDriver driver, String Patient_ID) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		try {

			Set<String> windows = driver.getWindowHandles();

			Iterator<String> it = windows.iterator();
			String homePage = it.next();
			String systemEM = it.next();

			driver.switchTo().window(systemEM);

			driver.close();

			driver.switchTo().window(homePage);

			driver.get("http://10.209.1.5:7777/HIS/eCommon/jsp/eHIS.jsp");

			driver.switchTo().frame(1);
			driver.switchTo().frame("menuFr");

			By Discharge_Patient = By.id("sd9");
			driver.findElement(Discharge_Patient).click();

			driver.switchTo().parentFrame();
			driver.switchTo().defaultContent();

			driver.switchTo().frame(2);
			driver.switchTo().frame("f_query_add_mod");

			By Nursing_Unit = By.name("nursing_unit_desc");
			driver.findElement(Nursing_Unit).sendKeys("General Surgery" + Keys.ENTER);

			By Specialty = By.name("specialty_desc");
			driver.findElement(Specialty).sendKeys("GENS" + Keys.ENTER);

			By PatientID_text = By.name("patient_id");
			driver.findElement(PatientID_text).sendKeys(Patient_ID);

			By Admission_Date_From = By.name("from_date");
			driver.findElement(Admission_Date_From).sendKeys("22/12/2020 19:40");

			By Search_Button = By.name("search");
			driver.findElement(Search_Button).click();

			driver.switchTo().defaultContent();

			driver.switchTo().frame(2);
			driver.switchTo().frame("f_query_add_mod1");

			Thread.sleep(1000);

			By Encounter_ID_Heiperlink = By.partialLinkText("100");
			driver.findElement(Encounter_ID_Heiperlink).click();

			Thread.sleep(500);

			String currentWindow1 = driver.getWindowHandle();
			Set<String> windows1 = driver.getWindowHandles();
			for (String window1 : windows1) {
				driver.switchTo().window(window1);
				System.out.println(driver.getTitle());
			}
			if (driver.getTitle().contains("Discharge Patient")) {
//				System.out.println(driver.getCurrentUrl());

				driver.switchTo().defaultContent();
				driver.switchTo().frame("Transfer_frame_buttons");

				Thread.sleep(500);

				By Confirm_Discharge = By.name("confirm");
				driver.findElement(Confirm_Discharge).click();

			}

		} catch (InterruptedException ex) {
			Logger.getLogger(CMO_Discharge_Patient.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}