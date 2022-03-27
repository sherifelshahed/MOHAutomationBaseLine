package NUR_Transfer_Bulk_practitioner;

import static org.testng.Assert.assertTrue;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Nurse_Transfer_Bulk_practitioner {

	public void Transfer(WebDriver driver) {

		try {

			WebElement Transfer_Bulk_practitioner = driver.findElement(By.id("sd11"));
			Transfer_Bulk_practitioner.click();
			Thread.sleep(500);
			System.out.println("Nurse is Navigated to Bulk Transfer Practitioner Page Successfully");

			driver.switchTo().defaultContent();
			driver.switchTo().frame(2);
			driver.switchTo().frame("f_query_add_mod");

			WebElement AttendingPrac1 = driver.findElement(By.name("practid_desc_from"));
			AttendingPrac1.sendKeys("Doctor El Zohour Inpatient 01");
			WebElement AttendingPrac1BTN = driver.findElement(By.name("pract_id_search"));
			AttendingPrac1BTN.click();

			WebElement TransferType = driver.findElement(By.name("transfer_type"));
			TransferType.click();
			TransferType.sendKeys(Keys.ARROW_DOWN);
			TransferType.sendKeys(Keys.ARROW_DOWN);
			TransferType.sendKeys(Keys.TAB);

			WebElement AttendingPrac2 = driver.findElement(By.name("practid_desc_to"));
			AttendingPrac2.sendKeys("Doctor El Zohour Inpatient 03");

			WebElement AttendingPrac2BTN = driver.findElement(By.name("pract_id_search"));
			AttendingPrac2BTN.click();

			Thread.sleep(2000);

			WebElement SearchBTN = driver.findElement(By.name("search"));
			SearchBTN.click();

			driver.switchTo().parentFrame();
			driver.switchTo().defaultContent();
			driver.switchTo().frame(2);
			driver.switchTo().frame("f_query_add_mod1");

			for (int i = 0; i < 35; i++) {

				try {

					WebElement CheckBox = driver.findElement(By.name("Check" + i + ""));
					CheckBox.click();
				} catch (Exception e) {

				}
			}
			driver.switchTo().defaultContent();
			driver.switchTo().parentFrame();
			driver.switchTo().defaultContent();
			driver.switchTo().frame("content");
			driver.switchTo().frame("commontoolbarFrame");

			WebElement ApplyBTN = driver.findElement(By.name("apply"));
			ApplyBTN.click();

			Thread.sleep(2000);

			driver.switchTo().defaultContent();
			driver.switchTo().frame("content");
			driver.switchTo().frame("messageFrame");
			WebElement msg = driver.findElement(By.xpath("/html/body/p"));
			System.out.println(msg.getText());
			assertTrue(msg.getText().contains("Operation Completed Successfully"));

		} catch (InterruptedException ex) {
			Logger.getLogger(Nurse_Transfer_Bulk_practitioner.class.getName()).log(Level.SEVERE, null, ex);
		}

	}
}
