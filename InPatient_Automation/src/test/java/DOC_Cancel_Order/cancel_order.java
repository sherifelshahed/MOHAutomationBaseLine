package DOC_Cancel_Order;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class cancel_order {
	public void cancel(WebDriver driver) {

		try {

			Thread.sleep(6000);

			By Recent_Order = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/div/app-dashboard/div/gridster/gridster-item[3]/app-widget/div/div[1]/app-order/div[1]/div[1]/img[2]");
			driver.findElement(Recent_Order).click();

			Thread.sleep(3000);

//			By click_order = By.xpath(
//					"");
//			driver.findElement(click_order).click();

			// Mouse Hover action
			Actions action = new Actions(driver);
			WebElement edit = driver.findElement(By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/div/app-dashboard/div/gridster/gridster-item[3]/app-widget/div/div[1]/app-order/div[1]/div[2]/div[2]/div[4]/div[3]"));
			action.moveToElement(edit).build().perform();

			By click_order = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/div/app-dashboard/div/gridster/gridster-item[3]/app-widget/div/div[1]/app-order/div[1]/div[2]/div[2]/div[4]/div[3]/button");
			driver.findElement(click_order).click();

			Thread.sleep(3000);

			By close_icon = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/div/app-dashboard/div/gridster/gridster-item[3]/app-widget/div/div[1]/app-order/div[1]/app-widget-header/div/img");
			driver.findElement(close_icon).click();

		} catch (InterruptedException ex) {
			Logger.getLogger(cancel_order.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
