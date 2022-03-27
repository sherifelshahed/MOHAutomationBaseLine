package DOC_Save_as_draft_and_Submit_Progress_Notes;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Save_as_draft_Progress_Notes {

	public void Physicians_progress_note_Edge(WebDriver driver) {

		try {

			// Fill in Progress Notes Form

			Thread.sleep(2000);

			By click_Presenting_Complaints = By
					.xpath("//*[@id=\"PROGRESSN#0#OPNOTE\"]/div/div/app-directive-linked/div/div[2]/input");
			driver.findElement(click_Presenting_Complaints).click();

			By select_Presenting_Complaints = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[1]/div[2]/div[2]/div[1]");
			driver.findElement(select_Presenting_Complaints).click();

			// Fill in Presenting Complaints

			By select_Since = By.xpath("//*[@id=\"48694002#0#\"]/div/div/app-composite-field/div/div[2]/span[5]/input");
			driver.findElement(select_Since).click();

			By select_Complaint_Type = By
					.xpath("//*[@id=\"48694002#0#COMPTYPE\"]/div/div/app-segment/div/div/div[2]/div[1]/div/input");
			driver.findElement(select_Complaint_Type).click();

			By select_Course = By
					.xpath("//*[@id=\"48694002#0#COURSE\"]/div/div/app-segment/div/div/div[2]/div[2]/div/input");
			driver.findElement(select_Course).click();

			By select_Onset = By
					.xpath("//*[@id=\"48694002#0#ONSET1\"]/div/div/app-segment/div/div/div[2]/div[2]/div/input");
			driver.findElement(select_Onset).click();

			By select_Aggravating_factors = By
					.xpath("//*[@id=\"48694002#0#AGGFAC\"]/div/div/app-segment/div/div/div[2]/div[2]/div/input");
			driver.findElement(select_Aggravating_factors).click();

			By select_Relieving_factors = By.xpath(
					"//*[@id=\"48694002#0#RELIEVINGFACTORS\"]/div/div/app-segment/div/div/div[2]/div[2]/div/input");
			driver.findElement(select_Relieving_factors).click();

			By enter_Notes_Text = By.xpath("//*[@id=\"48694002#0#NOTE1\"]/div/div/app-longtext/div/div[2]/textarea");
			driver.findElement(enter_Notes_Text).sendKeys("Physician Test progress notes");

			// Fill in progress notes

			By click_progress_notes = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[1]/div[2]/div/span[2]");
			driver.findElement(click_progress_notes).click();

			By search_progress_notes_Text = By.xpath("//*[@id=\"asdfasdf\"]");
			driver.findElement(search_progress_notes_Text).sendKeys("Gastrointestinal system");

			Thread.sleep(4000);

			By select_progress_notes = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[1]/div[2]/div[2]/div[1]");
			driver.findElement(select_progress_notes).click();

			Thread.sleep(3000);

			By select_Inspection = By
					.xpath("//*[@id=\"0008#0#INSPECTION\"]/div/div/app-check/div/div/div[2]/div[1]/div/input");
			driver.findElement(select_Inspection).click();

			By fill_Umbilicus = By.xpath("//*[@id=\"0008#0#UMBILICUS\"]/div/div/app-text/div/div[2]/input");
			driver.findElement(fill_Umbilicus).sendKeys("Test");

			By select_Palpation = By
					.xpath("//*[@id=\"0008#0#PALPATION\"]/div/div/app-check/div/div/div[2]/div[1]/div/input");
			driver.findElement(select_Palpation).click();

			By fill_Consistency = By.xpath("//*[@id=\"0008#0#CONSISTENC\"]/div/div/app-text/div/div[2]/input");
			driver.findElement(fill_Consistency).sendKeys("Test");

			By select_Mass = By.xpath("//*[@id=\"0008#0#MASS\"]/div/div/app-radio/div/div/div[2]/div[2]/div/input");
			driver.findElement(select_Mass).click();

			By select_Rigidity = By
					.xpath("//*[@id=\"0008#0#RIGIDITY\"]/div/div/app-radio/div/div/div[2]/div[2]/div/input");
			driver.findElement(select_Rigidity).click();

			By select_Tenderness = By
					.xpath("//*[@id=\"0008#0#TENDERNESS\"]/div/div/app-radio/div/div/div[2]/div[2]/div/input");
			driver.findElement(select_Tenderness).click();

			By select_Rebound = By
					.xpath("//*[@id=\"0008#0#REBOUND\"]/div/div/app-radio/div/div/div[2]/div[1]/div/input");
			driver.findElement(select_Rebound).click();

			By select_Hernia = By.xpath("//*[@id=\"0008#0#HERNIA\"]/div/div/app-radio/div/div/div[2]/div[2]/div/input");
			driver.findElement(select_Hernia).click();

			By Close_Button = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[2]/button[3]");
			driver.findElement(Close_Button).click();

			Thread.sleep(2000);

			By Save_as_draft_Button = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[2]/div[2]/button[3]");
			driver.findElement(Save_as_draft_Button).click();

			JavascriptExecutor java = (JavascriptExecutor) driver;
			java.executeScript("scroll(0,250)");

			Thread.sleep(4000);

		} catch (InterruptedException ex) {
			Logger.getLogger(Save_as_draft_Progress_Notes.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}