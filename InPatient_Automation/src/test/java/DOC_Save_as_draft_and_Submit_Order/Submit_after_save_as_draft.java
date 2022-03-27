package DOC_Save_as_draft_and_Submit_Order;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Submit_after_save_as_draft {
	public void select_form(WebDriver driver) {

		try {

			Thread.sleep(8000);
			// Click on Action
			By Action = By.xpath("/html/body/app-root/app-crm/div/div/app-patient-view/div/div/div[2]/div/div[7]");
			driver.findElement(Action).click();

			Thread.sleep(4000);

			// Mouse Hover action
			Actions action = new Actions(driver);
			WebElement edit = driver.findElement(By.xpath("//*[@id=\"popover-content\"]/div/div[2]/div[1]"));
			action.moveToElement(edit).build().perform();

			Thread.sleep(3000);

			// Select Saved drafts
			By Saved_drafts = By.xpath("//*[@id=\"popover-content\"]/div/div[2]/div[3]/img[1]");
			driver.findElement(Saved_drafts).click();

			Thread.sleep(4000);

			// Submit the Form
			By Submit_Button = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[2]/div[2]/button[4]");
			driver.findElement(Submit_Button).click();

		} catch (InterruptedException ex) {
			Logger.getLogger(Submit_after_save_as_draft.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
