package DOC_Reject_Order;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DOC_reject_Order {

	public void Physicians_approve_Edge(WebDriver driver) {

		try {

			Thread.sleep(8000);
			// Approve Order
			By Tasks = By.xpath("/html/body/app-root/app-crm/div/app-navigation/div/div[1]/div/img");
			driver.findElement(Tasks).click();

			Thread.sleep(3000);
			
			By checkbox_Unassigned = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-crm-dairy/div/div[2]/div[1]/app-crm-quick-filters/div/div/div[3]/div[4]/span/input");
			driver.findElement(checkbox_Unassigned).click();

			By select_patient = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-crm-dairy/div/div[2]/div[2]/app-crm-task-list/div/div/div[2]/div/div/div[1]/div[2]/div[2]");
			driver.findElement(select_patient).click();

			Thread.sleep(2000);

			By Reject_Order = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-crm-dairy/div/div[2]/div[2]/app-crm-task-list/app-activity-modal/div[1]/div[2]/app-flash-card/div/div/div[1]/div/div/div[3]/div[2]/button[2]");
			driver.findElement(Reject_Order).click();

			By Remarks = By.xpath("//*[@id=\"REMARKS#0#REMARKS\"]/div/div/app-longtext/div/div[2]/textarea");
			driver.findElement(Remarks).sendKeys("Test");

			Thread.sleep(2000);

			By Next_Button = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-crm-dairy/div/div[2]/div[2]/app-crm-task-list/app-activity-modal/div[1]/div[2]/app-flash-card/div/div/div[2]/div/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[2]/div[2]/button[2]");
			driver.findElement(Next_Button).click();

			Thread.sleep(3000);
			
			By submit = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-crm-dairy/div/div[2]/div[2]/app-crm-task-list/app-activity-modal/div[1]/div[2]/app-flash-card/div/div/div[2]/div/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[2]/div[2]/button[4]");
			driver.findElement(submit).click();

			JavascriptExecutor java = (JavascriptExecutor) driver;
			java.executeScript("scroll(0,250)");
		} catch (InterruptedException ex) {
			Logger.getLogger(DOC_reject_Order.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}