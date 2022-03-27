package NUR_Pain_Assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Pain_Assessment {

	public void Physicians_pain_Edge(WebDriver driver) {

		try {

			// Fill in the form

			By enter_Date_Time = By.xpath("//*[@id=\"PAINASSESS#0#DATE243123423\"]/div/div/app-dateandtime/input");
			driver.findElement(enter_Date_Time).click();

			Thread.sleep(2000);

			By select_update = By.xpath("//*[@id=\"owl-dt-picker-0\"]/div[2]/div/button[2]/span");
			driver.findElement(select_update).click();

			By enter_used_scale = By
					.xpath("//*[@id=\"PAINASSESS#0#ALMKYAS\"]/div/div/app-check/div/div/div[2]/div[4]/div/input");
			driver.findElement(enter_used_scale).click();

			By enter_Pain_scale_use = By
					.xpath("//*[@id=\"PAINASSESS#0#TAKYEEM\"]/div/div/app-check/div/div/div[2]/div[2]/div/input");
			driver.findElement(enter_Pain_scale_use).click();

			By enter_Pain_Scale = By
					.xpath("//*[@id=\"PAINASSESS#0#\"]/div/div/app-pain-score-field/div/div[2]/div[1]/input");
			driver.findElement(enter_Pain_Scale).click();

			By enter_Severity_of_pain = By
					.xpath("//*[@id=\"PAINASSESS#0#SEVERITY\"]/div/div/app-segment/div/div/div[2]/div[1]/div/input");
			driver.findElement(enter_Severity_of_pain).click();

			By enter_pain_description = By
					.xpath("//*[@id=\"PAINASSESS#0#WASF\"]/div/div/app-check/div/div/div[2]/div[7]/div/input");
			driver.findElement(enter_pain_description).click();

			By enter_intervention = By
					.xpath("//*[@id=\"PAINASSESS#0#TADO5L\"]/div/div/app-check/div/div/div[2]/div[1]/div/input");
			driver.findElement(enter_intervention).click();

			By enter_patient_response = By
					.xpath("//*[@id=\"PAINASSESS#0#ESTGAPT\"]/div/div/app-check/div/div/div[2]/div[1]/div/input");
			driver.findElement(enter_patient_response).click();

			By select_pain_heard = By
					.xpath("//*[@id=\"PAINASSESS#0#HAL\"]/div/div/app-check/div/div/div[2]/div[2]/div/input");
			driver.findElement(select_pain_heard).click();

			Thread.sleep(3000);

			By next_button = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[2]/div[2]/button[2]");
			driver.findElement(next_button).click();

			Thread.sleep(4000);

			By submit_button = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[2]/div[2]/button[4]");
			driver.findElement(submit_button).click();

			JavascriptExecutor java = (JavascriptExecutor) driver;
			java.executeScript("scroll(0,250)");
		} catch (InterruptedException ex) {
			Logger.getLogger(Pain_Assessment.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}