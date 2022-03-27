package CMO_OPD_Create_consultation_visit;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Create_consultation_visit {
	public void select_form(WebDriver driver) {

		try {

			Thread.sleep(4000);
			// ٍsearch for patient
			By search_Text = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-identify-patient/div/div[2]/div/input");
			driver.findElement(search_Text).sendKeys("A200000468" + Keys.ENTER);

			Thread.sleep(2000);

			// Select patient
			By Select_patient = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-identify-patient/div[2]/app-find-patient-detail/div/div/app-flash-card/div/div/div[1]/div/div/div[2]/div[2]/div[2]/div/div/div[1]");
			driver.findElement(Select_patient).click();

			Thread.sleep(2000);

			// Choose a lost
			By Choose_a_lost = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-identify-patient/div/div[2]/div[2]/div/div[2]/div");
			driver.findElement(Choose_a_lost).click();

			Thread.sleep(2000);

			// ٍChoose Clinic
			By search_Text_Clinic = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[2]/div[2]/div[2]/div/app-clinic/div/div[2]/div/input");
			driver.findElement(search_Text_Clinic).sendKeys("General Surgery");

			// Select Clinic
			By Select_Clinic = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[2]/div[2]/div[2]/div/app-clinic/div/div[3]/div/div/p");
			driver.findElement(Select_Clinic).click();

			Thread.sleep(2000);

			// ٍChoose practitioner
			By search_Text_practitioner = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-choose-practitioner/div/div[2]/div/input");
			driver.findElement(search_Text_practitioner).sendKeys("Doctor El Zohour Inpatient 01");

			Thread.sleep(2000);

			// Select practitioner
			By Select_practitioner = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[2]/div[2]/div[2]/div/app-ex-choose-practitioner/div/div[3]/div/div/div/div[1]");
			driver.findElement(Select_practitioner).click();

			Thread.sleep(2000);

			// Select a slot time
			By Select_time = By.xpath("//*[@id=\"slotcontainer\"]/div/div/div[1]");
			driver.findElement(Select_time).click();

			Thread.sleep(2000);

			By click_Continue = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[3]/div[2]/button");
			driver.findElement(click_Continue).click();

			By click_Bill_Only = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[3]/div[2]/button[1]");
			driver.findElement(click_Bill_Only).click();

			By click_Done = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-ex-create-visit/div/div[2]/div/div[3]/div[2]/button[2]");
			driver.findElement(click_Done).click();

		} catch (InterruptedException ex) {
			Logger.getLogger(Create_consultation_visit.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
