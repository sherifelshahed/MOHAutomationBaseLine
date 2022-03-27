package NUR_View_Uploaded_documents;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Uploaded_documents {
	public void select_form(WebDriver driver) {

		try {

			Thread.sleep(6000);

			By Uploaded_documents = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/div/app-dashboard/div/gridster/gridster-item[6]/app-widget/div/div[1]/app-uploaded-docs/div/div[1]/div[2]/img[2]");
			driver.findElement(Uploaded_documents).click();

			Thread.sleep(4000);

			By close_icon = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/div/app-dashboard/div/gridster/gridster-item[6]/app-widget/div/div[1]/app-uploaded-docs/div/app-widget-header/div/img");
			driver.findElement(close_icon).click();

		} catch (InterruptedException ex) {
			Logger.getLogger(Uploaded_documents.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
