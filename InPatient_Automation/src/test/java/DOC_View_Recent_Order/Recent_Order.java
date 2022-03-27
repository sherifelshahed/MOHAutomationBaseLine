package DOC_View_Recent_Order;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Recent_Order {
	public void select_form(WebDriver driver) {

		try {

			Thread.sleep(6000);

			By Recent_Order = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/div/app-dashboard/div/gridster/gridster-item[3]/app-widget/div/div[1]/app-order/div[1]/div[1]/img[2]");
			driver.findElement(Recent_Order).click();

			Thread.sleep(3000);

			By click_order = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/div/app-dashboard/div/gridster/gridster-item[3]/app-widget/div/div[1]/app-order/div[1]/div[2]/div[2]/div[2]/div[2]/div/p[1]");
			driver.findElement(click_order).click();

			Thread.sleep(3000);

			By close_icon = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/div/app-dashboard/div/gridster/gridster-item[3]/app-widget/div/div[1]/app-order/div[1]/app-widget-header/div/img");
			driver.findElement(close_icon).click();

		} catch (InterruptedException ex) {
			Logger.getLogger(Recent_Order.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
