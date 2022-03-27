package DOC_Discharge_Summary;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Discharge_Summary {

	public void Physicians_Discharge_Summary_Edge(WebDriver driver) {

		try {

			// Fill in Discharge Summary

			Thread.sleep(2000);

			// Admission Date

			By click_Admission_Date = By
					.xpath("//*[@id=\"DISCHSUMAIN#0#DATOFADMS3399\"]/div/div/app-directive-linked/div/div[2]/input");
			driver.findElement(click_Admission_Date).click();

			By search_Admission_Date_Text = By.xpath("//*[@id=\"asdfasdf\"]");
			driver.findElement(search_Admission_Date_Text).sendKeys("anesthesia record child 1");

			Thread.sleep(3000);

			By select_Admission_Date = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[1]/div[2]/div[2]/div");
			driver.findElement(select_Admission_Date).click();

			Thread.sleep(3000);

			By enter_Date_Time = By.xpath("//*[@id=\"ANSTHRECH1#0#D11\"]/div/div/app-dateandtime/input");
			driver.findElement(enter_Date_Time).click();

			Thread.sleep(2000);

			By select_update = By.xpath("//*[@id=\"owl-dt-picker-0\"]/div[2]/div/button[2]/span");
			driver.findElement(select_update).click();

			By enter_operating_room = By.xpath("//*[@id=\"ANSTHRECH1#0#ORNUM31\"]/div/div/app-text/div/div[2]/input");
			driver.findElement(enter_operating_room).sendKeys("IP_Room1");

			// Provisional diagnosis

			By click_Provisional_diagnosis = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[1]/div[2]/div/span[2]");
			driver.findElement(click_Provisional_diagnosis).click();

			By select_Provisional_diagnosis = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[1]/div[2]/div[2]/div");
			driver.findElement(select_Provisional_diagnosis).click();

			By select_Diagnosis_Classification = By
					.xpath("//*[@id=\"6E20.0#0#SYSDIAGCAT\"]/div/div/app-segment/div/div/div[2]/div[1]/div/input");
			driver.findElement(select_Diagnosis_Classification).click();

			By select_Nature = By
					.xpath("//*[@id=\"6E20.0#0#DI00001\"]/div/div/app-segment/div/div/div[2]/div[1]/div/input");
			driver.findElement(select_Nature).click();

			By select_Accuracy = By
					.xpath("//*[@id=\"6E20.0#0#DIAGACCU\"]/div/div/app-segment/div/div/div[2]/div[1]/div/input");
			driver.findElement(select_Accuracy).click();

			Select Onset_Since_dropdown = new Select(
					driver.findElement(By.xpath("//*[@id=\"6E20.0#0#DIAGONSET\"]/div/div/app-timeperiod/div/select")));
			Onset_Since_dropdown.selectByVisibleText("Days");

			By enter_Onset_Since = By.xpath("//*[@id=\"6E20.0#0#DIAGONSET\"]/div/div/app-timeperiod/div/input");
			driver.findElement(enter_Onset_Since).sendKeys("6");

			// Significant Clinical Findings and Results

			By click_Significant_Clinical = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[1]/div[4]/div/span[2]");
			driver.findElement(click_Significant_Clinical).click();

			By search_for_Results = By.xpath("//*[@id=\"asdfasdf\"]");
			driver.findElement(search_for_Results).sendKeys("ER Room Physician Notes1");

			Thread.sleep(2000);

			By select_Significant_Clinical = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[1]/div[2]/div[2]/div[1]/div");
			driver.findElement(select_Significant_Clinical).click();

			Thread.sleep(2000);

			By select_Onset = By.xpath("//*[@id=\"ERRPH#0#ONSET\"]/div/div/app-check/div/div/div[2]/div[2]/div/input");
			driver.findElement(select_Onset).click();

			By enter_Course = By.xpath("//*[@id=\"ERRPH#0#\"]/div/div/app-text/div/div[2]/input");
			driver.findElement(enter_Course).sendKeys("Discharge Summary");

			By select_Aggravating_factors = By
					.xpath("//*[@id=\"ERRPH#0#AGGF\"]/div/div/app-radio/div/div/div[2]/div[2]/div/input");
			driver.findElement(select_Aggravating_factors).click();

			By select_Relieving_factors = By
					.xpath("//*[@id=\"ERRPH#0#REFAC\"]/div/div/app-radio/div/div/div[2]/div[2]/div/input");
			driver.findElement(select_Relieving_factors).click();

			// patient_medication

			By click_patient_medication = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[1]/div[7]/div/span[2]");
			driver.findElement(click_patient_medication).click();

			driver.findElement(search_Admission_Date_Text).sendKeys("anesthesia record child 1");

			Thread.sleep(2000);

			driver.findElement(select_Admission_Date).click();

			driver.findElement(enter_Date_Time).click();

			Thread.sleep(2000);

			By select_Update = By.xpath("//*[@id=\"owl-dt-picker-1\"]/div[2]/div/button[2]/span");
			driver.findElement(select_Update).click();

			driver.findElement(enter_operating_room).sendKeys("IP_Room1");
//
//			// Discharge_Medication
//
//			By click_Discharge_Medication = By.xpath(
//					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[1]/div[8]/div/span[2]");
//			driver.findElement(click_Discharge_Medication).click();
//
//			By search_Prescription_Order = By.xpath("//*[@id=\"cns-pres-search\"]");
//			driver.findElement(search_Prescription_Order).sendKeys("Paracetamol");
//
//			Thread.sleep(2000);
//
//			By Select_Prescription_order = By.xpath(
//					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/app-consultation-note-prescription/div/div/div[1]/div[2]/div[3]/div[1]");
//			driver.findElement(Select_Prescription_order).click();
//
//			Thread.sleep(5000);
//
//			By select_Route = By
//					.xpath("//*[@id=\"200-00337#0#PRESROUTE\"]/div/div/app-segment/div/div/div[2]/div[1]/div/input");
//			driver.findElement(select_Route).click();
//
//			By select_Frequency = By
//					.xpath("//*[@id=\"200-00337#0#PRESFRQ\"]/div/div/app-segment/div/div/div[2]/div[3]/div/input");
//			driver.findElement(select_Frequency).click();
//
//			By select_Duration = By
//					.xpath("//*[@id=\"200-00337#0#\"]/div/div/app-composite-field/div/div[2]/span[4]/input");
//			driver.findElement(select_Duration).click();

			By Close_Button = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[2]/button[3]");
			driver.findElement(Close_Button).click();

			Thread.sleep(4000);

			By Submit_Button = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[2]/div[2]/button[4]");
			driver.findElement(Submit_Button).click();

			JavascriptExecutor java = (JavascriptExecutor) driver;
			java.executeScript("scroll(0,250)");

			Thread.sleep(4000);

		} catch (InterruptedException ex) {
			Logger.getLogger(Discharge_Summary.class.getName()).log(Level.SEVERE, null, ex);
		}

	}
}
