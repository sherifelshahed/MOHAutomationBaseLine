package CMO_Admit_Patient;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Financial_Details_Cash {

	public void financial_details(WebDriver driver) {
    // Test
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {

			String currentWindow = driver.getWindowHandle();
			Set<String> windows = driver.getWindowHandles();
			for (String window : windows) {
				driver.switchTo().window(window);
				System.out.println(driver.getTitle());
			}
			if (driver.getTitle().contains("Financial Details")) {
				driver.switchTo().defaultContent();
				driver.switchTo().frame("MainFrame1");

				Thread.sleep(500);

				By Primary_Billing_Group = By.name("billing_group_desc");
				driver.findElement(Primary_Billing_Group).sendKeys("Cash Patient(Cash)" + Keys.ENTER);

				By waits = By.name("annual_income");
				driver.findElement(waits).click();

				Thread.sleep(900);

				By Close_Button = By.name("close_button");
				driver.findElement(Close_Button).click();

				Thread.sleep(50);
			}

		} catch (InterruptedException ex) {
			Logger.getLogger(Financial_Details_Cash.class.getName()).log(Level.SEVERE, null, ex);
		}

	}
}