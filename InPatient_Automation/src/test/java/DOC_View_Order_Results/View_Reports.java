package DOC_View_Order_Results;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class View_Reports {
	public void view(WebDriver driver) {

		try {

			Thread.sleep(5000);

			// Open Reports
			By Reports = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/div/app-dashboard/div/gridster/gridster-item[8]/app-widget/div/div[1]/app-reports/div/div[1]/img[2]");
			driver.findElement(Reports).click();

			Thread.sleep(2000);

			// click report
			By click_report = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/div/app-dashboard/div/gridster/gridster-item[1]/app-widget/div/div[1]/app-reports/div[1]/div[2]/div[1]/div[1]/div[2]/div");
			driver.findElement(click_report).click();

		} catch (InterruptedException ex) {
			Logger.getLogger(View_Reports.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
