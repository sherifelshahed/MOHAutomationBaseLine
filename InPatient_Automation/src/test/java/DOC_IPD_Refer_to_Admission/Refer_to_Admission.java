package DOC_IPD_Refer_to_Admission;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Refer_to_Admission {

	public void Physicians_Refer_to_Admission_Edge(WebDriver driver) {

		try {

			// Fill in OP Hospitals Consultation
			Thread.sleep(3000);
			// Medical admission section
			By click__Medical_admission = By
					.xpath("//*[@id=\"OPHOSP001#0#OPHSP0001\"]/div/div/app-directive-linked/div/div[2]/input");
			driver.findElement(click__Medical_admission).click();

			By search_Medical_admission_Text = By.xpath("//*[@id=\"asdfasdf\"]");
			driver.findElement(search_Medical_admission_Text).sendKeys("Test Form child");

			Thread.sleep(3000);

			By select_Medical_admission = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[1]/div[2]/div[2]/div");
			driver.findElement(select_Medical_admission).click();

			Thread.sleep(3000);

			By click_doctor_recommendations_text = By
					.xpath("//*[@id=\"TESTFORMCHI#0#TAWSYAT\"]/div/div/app-longtext/div/div[2]/textarea");
			driver.findElement(click_doctor_recommendations_text).sendKeys("The patient is in good condition");

			By select_Abdominal = By
					.xpath("//*[@id=\"TESTFORMCHI#0#ABDOMINAL\"]/div/div/app-check/div/div/div[2]/div[1]/div/input");
			driver.findElement(select_Abdominal).click();

			// OCCUPATION section
			By click_OCCUPATION_sction = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[1]/div[3]/div/span[2]");
			driver.findElement(click_OCCUPATION_sction).click();

			By search_OCCUPATION_Text = By.xpath("//*[@id=\"asdfasdf\"]");
			driver.findElement(search_OCCUPATION_Text).sendKeys("Gastrointestinal system");

			Thread.sleep(3000);

			By select_OCCUPATION_item = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[1]/div[2]/div[2]/div/div");
			driver.findElement(select_OCCUPATION_item).click();

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

			// Pain assessment form section

			By click_assessment_form_section = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[1]/div[4]/div/span[2]");
			driver.findElement(click_assessment_form_section).click();

			By search_Pain_assessment_form_Text = By.xpath("//*[@id=\"asdfasdf\"]");
			driver.findElement(search_Pain_assessment_form_Text).sendKeys("Gastrointestinal system");

			Thread.sleep(3000);

			By select_Pain_assessment_form = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[1]/div[2]/div[2]/div/div");
			driver.findElement(select_Pain_assessment_form).click();

			Thread.sleep(3000);

			driver.findElement(select_Inspection).click();
			driver.findElement(fill_Umbilicus).sendKeys("Test");
			driver.findElement(select_Palpation).click();
			driver.findElement(fill_Consistency).sendKeys("Test");
			driver.findElement(select_Mass).click();
			driver.findElement(select_Rigidity).click();
			driver.findElement(select_Tenderness).click();
			driver.findElement(select_Rebound).click();
			driver.findElement(select_Hernia).click();

			// Allergy section

			By click_Allergy_section = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[1]/div[5]/div/span[2]");
			driver.findElement(click_Allergy_section).click();

			By select_Allergy = By.xpath(
					"//*[@id=\"ALGYREC#0#ALLERGYYESORNO1\"]/div/div/app-segment/div/div/div[2]/div[1]/div/input");
			driver.findElement(select_Allergy).click();

			By select_Allergy_Type = By
					.xpath("//*[@id=\"ALGYREC#0#ALLERGYTP\"]/div/div/app-segment/div/div/div[2]/div[4]/div/input");
			driver.findElement(select_Allergy_Type).click();

			// Investigations section
			By click_Investigations_section = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[1]/div[19]/div/span[2]");
			driver.findElement(click_Investigations_section).click();

			// Investigations section --> Place Lab Order
			By Select_Lab_order = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[1]/div[2]/div[3]/div[1]");
			driver.findElement(Select_Lab_order).click();

			// Investigations section --> Place Rad Order

			Thread.sleep(3000);

			Select Investigations_dropdown = new Select(driver.findElement(By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[1]/div[2]/div[2]/select")));
			Investigations_dropdown.selectByVisibleText("Radiology Orders");

			By Select_Rad_order = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[1]/div[2]/div[3]/div[1]");
			driver.findElement(Select_Rad_order).click();

			// Investigations section --> Place Treatment Order
			Investigations_dropdown.selectByVisibleText("Treatment Orders");

			By Select_Treatment_order = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[1]/div[2]/div[3]/div[1]");
			driver.findElement(Select_Treatment_order).click();

			// Investigations section --> Place Procedures Order

			Investigations_dropdown.selectByVisibleText("Procedures");

			By search_Procedures_Text = By.xpath("//*[@id=\"asdfasdf\"]");
			driver.findElement(search_Procedures_Text).sendKeys("Intestinal neobladder");

			Thread.sleep(3000);

			By Select_Procedures_order = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[1]/div[2]/div[3]/div[1]");
			driver.findElement(Select_Procedures_order).click();

			Thread.sleep(3000);

			// ICD11 Diagnosis section
			By click_ICD11_Diagnosis = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[1]/div[22]/div/span[2]");
			driver.findElement(click_ICD11_Diagnosis).click();

			By select_Diagnosis = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[1]/div[2]/div[2]/div[1]");
			driver.findElement(select_Diagnosis).click();

			By select_Diagnosis_Classification = By
					.xpath("//*[@id=\"1E70#0#SYSDIAGCAT\"]/div/div/app-segment/div/div/div[2]/div[1]/div/input");
			driver.findElement(select_Diagnosis_Classification).click();

			By select_Nature = By
					.xpath("//*[@id=\"1E70#0#DI00001\"]/div/div/app-segment/div/div/div[2]/div[1]/div/input");
			driver.findElement(select_Nature).click();

			By select_Accuracy = By
					.xpath("//*[@id=\"1E70#0#DIAGACCU\"]/div/div/app-segment/div/div/div[2]/div[1]/div/input");
			driver.findElement(select_Accuracy).click();

			Select Onset_Since_dropdown = new Select(
					driver.findElement(By.xpath("//*[@id=\"1E70#0#DIAGONSET\"]/div/div/app-timeperiod/div/select")));
			Onset_Since_dropdown.selectByVisibleText("Days");

			By enter_Onset_Since = By.xpath("//*[@id=\"1E70#0#DIAGONSET\"]/div/div/app-timeperiod/div/input");
			driver.findElement(enter_Onset_Since).sendKeys("6");

			// Prescription section
			Thread.sleep(1000);
			By select_Prescription_section = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[1]/div[23]/div/span[2]");
			driver.findElement(select_Prescription_section).click();

			By search_Prescription_Order = By.xpath("//*[@id=\"cns-pres-search\"]");
			driver.findElement(search_Prescription_Order).sendKeys("Paracetamol" + Keys.ENTER);

			Thread.sleep(5000);

			By Select_Prescription_order = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/app-consultation-note-prescription/div/div/div[1]/div[2]/div[3]/div[1]");
			driver.findElement(Select_Prescription_order).click();

			Thread.sleep(5000);

			// Investigations section --> Fill Prescription Order
			By select_Route = By
					.xpath("//*[@id=\"200-00337#0#PRESROUTE\"]/div/div/app-segment/div/div/div[2]/div[1]/div/input");
			driver.findElement(select_Route).click();

			Thread.sleep(3000);

			By select_Frequency = By
					.xpath("//*[@id=\"200-00337#0#PRESFRQ\"]/div/div/app-segment/div/div/div[2]/div[2]/div/input");
			driver.findElement(select_Frequency).click();

			By select_Duration = By
					.xpath("//*[@id=\"200-00337#0#\"]/div/div/app-composite-field/div/div[2]/span[4]/input");
			driver.findElement(select_Duration).click();

			// Plan of Care section

			By select_Plan_of_Care = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[1]/div[25]/div/span[2]");
			driver.findElement(select_Plan_of_Care).click();

			By enter_Patient_problems = By
					.xpath("//*[@id=\"PLANSMART#0#PTPROBLEM\"]/div/div/app-text/div/div[2]/input");
			driver.findElement(enter_Patient_problems).sendKeys("Test");

			By enter_Interventions = By.xpath("//*[@id=\"PLANSMART#0#PTINTERV\"]/div/div/app-text/div/div[2]/input");
			driver.findElement(enter_Interventions).sendKeys("Test");

			By enter_Measurable_goals = By.xpath("//*[@id=\"PLANSMART#0#MGOALSN\"]/div/div/app-text/div/div[2]/input");
			driver.findElement(enter_Measurable_goals).sendKeys("Test");

			By enter_Outcome = By.xpath("//*[@id=\"PLANSMART#0#PTOUTCOME\"]/div/div/app-text/div/div[2]/input");
			driver.findElement(enter_Outcome).sendKeys("Test");

			// Refer_to_Admission

			By select_Refer_to_Admission = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[1]/div[27]/div/span[2]");
			driver.findElement(select_Refer_to_Admission).click();

			By search_Refer_to_Admission_Text = By.xpath("//*[@id=\"cns-ref-search\"]");
			driver.findElement(search_Refer_to_Admission_Text).sendKeys("General Surgery");

			Thread.sleep(2000);

			By select_Refer_Admission = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/app-consultation-note-referral/div/div[1]/div[2]/div[2]/div");
			driver.findElement(select_Refer_Admission).click();

			Thread.sleep(3000);

			By enter_Reason_for_referral = By
					.xpath("//*[@id=\"REFERADM#0#REASON\"]/div/div/app-longtext/div/div[2]/textarea");
			driver.findElement(enter_Reason_for_referral).sendKeys("For Test");

			By select_Admission_Priority = By
					.xpath("//*[@id=\"REFERADM#0#ADMPR\"]/div/div/app-segment/div/div/div[2]/div[3]/div/input");
			driver.findElement(select_Admission_Priority).click();

//			By enter_Preferred_Date = By.xpath("//*[@id=\"vaadin-text-field-input-1\"]/slot[2]/input");
//			driver.findElement(enter_Preferred_Date).click();
//
//			By select_Today = By.xpath("//*[@id=\"button\"]");
//			driver.findElement(select_Today).click();

			By Close_Button = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[2]/button[3]");
			driver.findElement(Close_Button).click();

			Thread.sleep(3000);

			By Submit_Button = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[2]/div[2]/button[4]");
			driver.findElement(Submit_Button).click();

			JavascriptExecutor java = (JavascriptExecutor) driver;
			java.executeScript("scroll(0,250)");

			Thread.sleep(7000);

		} catch (InterruptedException ex) {
			Logger.getLogger(Refer_to_Admission.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}