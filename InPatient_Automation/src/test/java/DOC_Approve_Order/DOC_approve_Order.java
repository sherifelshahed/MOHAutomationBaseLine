package DOC_Approve_Order;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DOC_approve_Order {

	public void Physicians_approve_Edge(WebDriver driver) {

		try {

			Thread.sleep(8000);
			// Approve Order
			By Tasks = By.xpath("/html/body/app-root/app-crm/div/app-navigation/div/div[1]/div/img");
			driver.findElement(Tasks).click();

			Thread.sleep(3000);

			By select_patient = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-crm-dairy/div/div[2]/div[2]/app-crm-task-list/div/div/div[2]/div/div/div[1]/div[2]/div[2]");
			driver.findElement(select_patient).click();

			Thread.sleep(1000);

			By Approve_Order = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-crm-dairy/div/div[2]/div[2]/app-crm-task-list/app-activity-modal/div[1]/div[2]/app-flash-card/div/div/div[1]/div/div/div[3]/div[2]/button[1]");
			driver.findElement(Approve_Order).click();

			By Remarks = By.xpath("//*[@id=\"REMARKS#0#REMARKS\"]/div/div/app-longtext/div/div[2]/textarea");
			driver.findElement(Remarks).sendKeys("Test");

			Thread.sleep(1000);

			By submit = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-crm-dairy/div/div[2]/div[2]/app-crm-task-list/app-activity-modal/div[1]/div[2]/app-flash-card/div/div/div[2]/div/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[2]/div[2]/button[4]");
			driver.findElement(submit).click();

			Thread.sleep(3000);

			By Close_icon = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-crm-dairy/div/div[2]/div[2]/app-crm-task-list/app-activity-modal/div[1]/div[2]/app-flash-card/div/div/div[1]/div/div/div[1]/div/div[2]/div/img");
			driver.findElement(Close_icon).click();

			JavascriptExecutor java = (JavascriptExecutor) driver;
			java.executeScript("scroll(0,250)");

			Thread.sleep(4000);

		} catch (InterruptedException ex) {
			Logger.getLogger(DOC_approve_Order.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}