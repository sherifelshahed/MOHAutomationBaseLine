package NUR_Charges_Patient_Issues;

import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Nurse_Dispense_Medication {

	public void Medication(WebDriver driver, String Patient_ID) {

		try {

			WebElement Charges_Patient_Issue = driver.findElement(By.id("sd13"));
			Charges_Patient_Issue.click();

			Thread.sleep(500);
			System.out.println("Nurse is Navigated to Charges / Patient Issue Page Successfully");

			driver.switchTo().defaultContent();
			// driver.switchTo().frame(1);
			driver.switchTo().frame("content");
			driver.switchTo().frame("commontoolbarFrame");
			WebElement createBtn = driver.findElement(By.name("create"));
			createBtn.click();

			driver.switchTo().defaultContent();
			driver.switchTo().frame(2);
			driver.switchTo().frame("f_query_add_mod");
			driver.switchTo().frame("frameSalesHeader");
			WebElement SalesTypeDDL = driver.findElement(By.name("sal_trn_type"));
			SalesTypeDDL.click();
			SalesTypeDDL.sendKeys(Keys.ARROW_DOWN);
			SalesTypeDDL.sendKeys(Keys.TAB);
			WebElement patientId = driver.findElement(By.name("patient_id"));
			patientId.sendKeys(Patient_ID);

			driver.switchTo().defaultContent();
			driver.switchTo().frame(2);
			driver.switchTo().frame("f_query_add_mod");
			driver.switchTo().frame("frameSalesList");
			driver.switchTo().frame("frameSalesListHeader");
			WebElement itemdsc = driver.findElement(By.name("item_desc"));
			// itemdsc.click();
			itemdsc.sendKeys("سرنجة 50 مج");
			WebElement item = driver.findElement(By.name("item_search"));
			item.click();

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			WebElement QuantityTxt = driver.findElement(By.name("item_qty"));
			QuantityTxt.sendKeys("1");
			Thread.sleep(3000);
			WebElement AddBtn = driver.findElement(By.xpath("//input[@value='Add']"));
			AddBtn.click();
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.switchTo().defaultContent();
			driver.switchTo().frame(2);
			driver.switchTo().frame("f_query_add_mod");
			driver.switchTo().frame("frameSalesDetail");
			WebElement transBtn = driver.findElement(By.xpath("//font[@id='font_0']"));
			transBtn.click();

			driver.switchTo().defaultContent();
			driver.switchTo().frame("content");
			driver.switchTo().frame("commontoolbarFrame");
			WebElement ApplyBtn = driver.findElement(By.name("apply"));
			ApplyBtn.click();

			String currentWindow2 = driver.getWindowHandle();
			Set<String> windows3 = driver.getWindowHandles();
			for (String window1 : windows3) {
				driver.switchTo().window(window1);
				System.out.println(driver.getTitle());
				if (driver.getTitle().contains("Confirm Finalize")) {
					System.out.println(driver.getCurrentUrl());
					WebElement OkBtn = driver.findElement(By.name("yes"));
					OkBtn.click();

				}
				driver.switchTo().window(currentWindow2);
			}

			String currentWindow3 = driver.getWindowHandle();
			Set<String> windows4 = driver.getWindowHandles();
			for (String window1 : windows4) {
				driver.switchTo().window(window1);
				System.out.println(driver.getTitle());
				driver.switchTo().defaultContent();
				if (driver.getTitle().contains("Confirm Printing")) {
					System.out.println(driver.getCurrentUrl());
					WebElement OkBtn = driver.findElement(By.name("no"));
					OkBtn.click();

				}
			}

			driver.switchTo().window(currentWindow3);
			driver.switchTo().defaultContent();
			driver.switchTo().frame("content");
			driver.switchTo().frame("messageFrame");
			WebElement msg = driver.findElement(By.xpath("/html/body/p"));
			System.out.println(msg.getText());
			if (msg.getText().contains("Operation Completed Successfully.")) {
				System.out.println("the test is passed Patient Consumables are recoreded successfully");
			}
		} catch (InterruptedException ex) {
			Logger.getLogger(Nurse_Dispense_Medication.class.getName()).log(Level.SEVERE, null, ex);
		}

	}
}
