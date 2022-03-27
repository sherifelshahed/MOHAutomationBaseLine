package DOC_View_Visit_Summary;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Visit_Summary {
	public void select_form(WebDriver driver) {

		try {

			Thread.sleep(6000);

			By orders_summary = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/div/app-dashboard/div/gridster/gridster-item[5]/app-widget/div/div[1]/app-visit/div[1]/div[1]/img[2]");
			driver.findElement(orders_summary).click();

			Thread.sleep(3000);

			By last_visit = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/div/app-dashboard/div/gridster/gridster-item[5]/app-widget/div/div[1]/app-visit/div[1]/div[2]/div[2]/div[2]");
			driver.findElement(last_visit).click();

			Thread.sleep(3000);

			// Select The Form
			By Close_icon = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/div/app-dashboard/div/gridster/gridster-item[5]/app-widget/div/div[2]/app-visit-info/div/app-widget-header/div/img");
			driver.findElement(Close_icon).click();

		} catch (InterruptedException ex) {
			Logger.getLogger(Visit_Summary.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
