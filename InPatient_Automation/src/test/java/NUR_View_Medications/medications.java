package NUR_View_Medications;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class medications {
	public void select_form(WebDriver driver) {

		try {

			Thread.sleep(6000);

			By Click_medications = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/div/app-dashboard/div/gridster/gridster-item[4]/app-widget/div/div[1]/app-medication/div[1]/div[1]/img[2]");
			driver.findElement(Click_medications).click();

			Thread.sleep(6000);
			
			By close_icon = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/div/app-dashboard/div/gridster/gridster-item[4]/app-widget/div/div[1]/app-medication/div[1]/app-widget-header/div/img");
			driver.findElement(close_icon).click();

			

		} catch (InterruptedException ex) {
			Logger.getLogger(medications.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
