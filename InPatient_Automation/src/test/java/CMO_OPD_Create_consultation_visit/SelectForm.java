package CMO_OPD_Create_consultation_visit;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectForm {
	public void select_form(WebDriver driver) {

		try {

			Thread.sleep(4000);
			// Click on Action
			By Action = By.xpath("/html/body/app-root/app-crm/div/div/app-clinical-diary/div/div[1]/div[2]/div/div[2]");
			driver.findElement(Action).click();

			Thread.sleep(4000);

			// Select "Create Consultation Visit"
			By Consultation_Visit = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-clinical-diary/app-crm-forms-list/div/div[2]/div[2]/div[2]/div[3]");
			driver.findElement(Consultation_Visit).click();

		} catch (InterruptedException ex) {
			Logger.getLogger(SelectForm.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
