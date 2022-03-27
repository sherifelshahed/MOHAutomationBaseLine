package CMO_Block_Bed;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Block_Bed {
	public void block(WebDriver driver) {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		try {

			By Block_Bed = By.id("sd11");
			driver.findElement(Block_Bed).click();
			driver.switchTo().parentFrame();
			driver.switchTo().defaultContent();

			driver.switchTo().frame(2);
			driver.switchTo().frame("f_query_add_mod");

			By Nursing_Unit = By.name("nursing_unit_desc");
			driver.findElement(Nursing_Unit).sendKeys("General Surgery" + Keys.ENTER);

			// Select Bed No
			By Bed_No = By.name("search_bed");
			driver.findElement(Bed_No).click();

			WebElement BedNumberTXT = driver.findElement(By.xpath("//table/tbody/tr[2]/td[4]/input[2]"));
			Thread.sleep(500);
			BedNumberTXT.click();

			String currentWindow = driver.getWindowHandle();
			Set<String> windows1 = driver.getWindowHandles();
			for (String window1 : windows1) {
				driver.switchTo().window(window1);
			}
			if (driver.getTitle().contains("Bed Availability Chart")) {
				driver.switchTo().parentFrame();
				driver.switchTo().defaultContent();
				driver.switchTo().frame("result");
				// System.out.println(driver.getTitle());
				Thread.sleep(2000);
				By BedNo = By.xpath("//input[@class = 'IP_GreenButton']");
				driver.findElement(BedNo).click();
				driver.findElement(BedNo).click();
			}
			driver.switchTo().window(currentWindow);
			driver.switchTo().defaultContent();
			driver.switchTo().frame(2);
			driver.switchTo().frame("f_query_add_mod");

			By Reason_for_Blocking = By.name("blocktype");
			driver.findElement(Reason_for_Blocking).click();
			driver.findElement(Reason_for_Blocking).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Reason_for_Blocking).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Reason_for_Blocking).sendKeys(Keys.ENTER);

			By Remarks = By.name("remarks");
			driver.findElement(Remarks).sendKeys("Test");

			By fromdate = By.name("from_date");
			driver.findElement(fromdate).sendKeys("20/12/2021 19:40");

			By untildate = By.name("until_date");
			driver.findElement(untildate).sendKeys("22/12/2021 19:40");

			driver.switchTo().parentFrame();
			driver.switchTo().defaultContent();
			driver.switchTo().frame("content");
			driver.switchTo().frame("commontoolbarFrame");

//			System.out.println(driver.getPageSource());

			WebElement Apply = driver.findElement(By.name("apply"));

			Apply.click();

			Thread.sleep(2000);

			driver.switchTo().defaultContent();
			driver.switchTo().frame("content");
			driver.switchTo().frame("messageFrame");
			WebElement msg = driver.findElement(By.xpath("/html/body/p"));
			System.out.println(msg.getText());

			if (msg.getText().contains("Operation Completed Successfully.")) {
				System.out.println("the test is passed Patient Consumables are recoreded successfully");
			}

		} catch (InterruptedException ex) {
			Logger.getLogger(Block_Bed.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}