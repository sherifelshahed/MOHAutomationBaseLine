package DOC_Operation_Note;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.logging.Level;
import java.util.logging.Logger;

public class operation_note {

	public void Physicians_operation_note_Edge(WebDriver driver) {

		try {

			// Fill in the form

			By click_Surgical_Information = By
					.xpath("//*[@id=\"OPNOTE#0#SURGINFO\"]/div/div/app-directive-linked/div/div[2]/input");
			driver.findElement(click_Surgical_Information).click();

			// Search for Surgical Information
			By search_Surgical_Information_Text = By.xpath("//*[@id=\"asdfasdf\"]");
			driver.findElement(search_Surgical_Information_Text).sendKeys("Gastrointestinal system");

			Thread.sleep(4000);

			By select_Surgical_Information = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[1]/div[2]/div[2]/div/div");
			driver.findElement(select_Surgical_Information).click();

			By select_Diagnosis_section = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[1]/div[2]/div/span[2]");
			driver.findElement(select_Diagnosis_section).click();

			// Fill in Diagnosis

			By click_ICD11_Diagnosis = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[1]/div[2]/div/span[2]");
			driver.findElement(click_ICD11_Diagnosis).click();

			By search_ICD11_Diagnosis = By.xpath("//*[@id=\"asdfasdf\"]");
			driver.findElement(search_ICD11_Diagnosis).sendKeys("1A31 Giardiasis");

			Thread.sleep(3000);

			By select_Diagnosis = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[1]/div[2]/div[2]/div[1]/div");
			driver.findElement(select_Diagnosis).click();

			Thread.sleep(3000);

			By select_Diagnosis_Classification = By
					.xpath("//*[@id=\"1A31#0#SYSDIAGCAT\"]/div/div/app-segment/div/div/div[2]/div[1]/div/input");
			driver.findElement(select_Diagnosis_Classification).click();

			By select_Nature = By
					.xpath("//*[@id=\"1A31#0#DI00001\"]/div/div/app-segment/div/div/div[2]/div[1]/div/input");
			driver.findElement(select_Nature).click();

			By select_Accuracy = By
					.xpath("//*[@id=\"1A31#0#DIAGACCU\"]/div/div/app-segment/div/div/div[2]/div[1]/div/input");
			driver.findElement(select_Accuracy).click();

			Select Onset_Since_dropdown = new Select(
					driver.findElement(By.xpath("//*[@id=\"1A31#0#DIAGONSET\"]/div/div/app-timeperiod/div/select")));
			Onset_Since_dropdown.selectByVisibleText("Days");

			By enter_Onset_Since = By.xpath("//*[@id=\"1A31#0#DIAGONSET\"]/div/div/app-timeperiod/div/input");
			driver.findElement(enter_Onset_Since).sendKeys("6");

			By select_Patient_Profile_section = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[1]/div[3]/div/span[2]");
			driver.findElement(select_Patient_Profile_section).click();

			// Search for Patient Profile
			By search_Patient_Profile_Text = By.xpath("//*[@id=\"asdfasdf\"]");
			driver.findElement(search_Patient_Profile_Text).sendKeys("Test Form child");

			Thread.sleep(3000);

			By select_Patient_Profile = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[1]/div[2]/div[2]/div/div");
			driver.findElement(select_Patient_Profile).click();

			// Fill in Patient Profile Form

			Thread.sleep(3000);

			By click_doctor_recommendations_text = By
					.xpath("//*[@id=\"TESTFORMCHI#0#TAWSYAT\"]/div/div/app-longtext/div/div[2]/textarea");
			driver.findElement(click_doctor_recommendations_text).sendKeys("The patient is in good condition");

			By select_Abdominal = By
					.xpath("//*[@id=\"TESTFORMCHI#0#ABDOMINAL\"]/div/div/app-check/div/div/div[2]/div[1]/div/input");
			driver.findElement(select_Abdominal).click();

			// Place Rad_Order
			By Rad_order = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[1]/div[7]/div/span[2]");
			driver.findElement(Rad_order).click();

			By Select_Rad_order = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[1]/div[2]/div[3]/div[1]/div");
			driver.findElement(Select_Rad_order).click();

			Thread.sleep(2000);

			By Close_Button = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[2]/button[3]");
			driver.findElement(Close_Button).click();

			Thread.sleep(1000);

			By Submit_Button = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[2]/div[2]/button[4]");
			driver.findElement(Submit_Button).click();

			JavascriptExecutor java = (JavascriptExecutor) driver;
			java.executeScript("scroll(0,250)");
		} catch (InterruptedException ex) {
			Logger.getLogger(operation_note.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}