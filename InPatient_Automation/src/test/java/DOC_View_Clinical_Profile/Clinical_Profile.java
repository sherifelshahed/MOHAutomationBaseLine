package DOC_View_Clinical_Profile;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Clinical_Profile {
	public void select_form(WebDriver driver) {

		try {

			Thread.sleep(5000);

			By Clinical_Profile = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/div/app-dashboard/div/gridster/gridster-item[2]/app-widget/div/div[1]/app-clinical-profile/div[1]/div[1]/img[2]");
			driver.findElement(Clinical_Profile).click();

			Thread.sleep(3000);

			// patients Vitals and Allergies

			By Allergies = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/div/app-dashboard/div/gridster/gridster-item[2]/app-widget/div/div[1]/app-clinical-profile/div[1]/div[2]/div[1]/p");
			driver.findElement(Allergies).click();

			Thread.sleep(3000);

			By back_arrow = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/div/app-dashboard/div/gridster/gridster-item[2]/app-widget/div/div[2]/app-clinical-profile-items/div/div[1]/span/img");
			driver.findElement(back_arrow).click();

			By Diagnosis = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/div/app-dashboard/div/gridster/gridster-item[2]/app-widget/div/div[1]/app-clinical-profile/div[1]/div[2]/div[2]/p");
			driver.findElement(Diagnosis).click();

			Thread.sleep(3000);

			By close_icon = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/div/app-dashboard/div/gridster/gridster-item[2]/app-widget/div/div[2]/app-clinical-profile-items/div/app-widget-header/div/img");
			driver.findElement(close_icon).click();

		} catch (InterruptedException ex) {
			Logger.getLogger(Clinical_Profile.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
