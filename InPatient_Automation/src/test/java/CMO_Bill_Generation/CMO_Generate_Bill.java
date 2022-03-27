package CMO_Bill_Generation;

import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CMO_Generate_Bill {
	public void generate_bill(WebDriver driver, String Patient_ID) {

		try {

			By Bill_Generation = By.id("sd15");
			driver.findElement(Bill_Generation).click();

			driver.switchTo().defaultContent();
			driver.switchTo().frame("content");
			driver.switchTo().frame("BLChargePatientQueryFrame");
			driver.switchTo().frame("search_frame");

			WebElement PatientIDText = driver.findElement(By.name("patient_id"));
			try {
				PatientIDText.clear();
			} catch (Exception e) {
			}
			PatientIDText.sendKeys(Patient_ID);

			Thread.sleep(500);

			By SearchBTN = By.name("search_button");
			driver.findElement(SearchBTN).click();

			driver.switchTo().defaultContent();
			driver.switchTo().frame("content");
			driver.switchTo().frame("BLChargePatientQueryFrame");
			driver.switchTo().frame("result_frame");

			Thread.sleep(2000);

			WebElement PatID = driver.findElement(By.xpath("//table[2]/tbody/tr[2]/td[4]/a"));
			PatID.click();

			org.openqa.selenium.Alert alert = driver.switchTo().alert();
			String alertMessage = driver.switchTo().alert().getText();
			System.out.println(alertMessage);
			Thread.sleep(1000);
			alert.accept();

			Set<String> windows1 = driver.getWindowHandles();
			for (String window1 : windows1) {
				driver.switchTo().window(window1);
				if (driver.getTitle().contains("Bill Generation")) {
					driver.switchTo().parentFrame();
					driver.switchTo().defaultContent();
					driver.switchTo().frame("BillReceiptInfo");

					WebElement GenerateBillBTN = driver.findElement(By.name("compute"));
					GenerateBillBTN.click();

					System.out.println("Generate button is Working.");

					Thread.sleep(3000);

					org.openqa.selenium.Alert alert2 = driver.switchTo().alert();
					String alertMessage2 = driver.switchTo().alert().getText();
					System.out.println(alertMessage2);
					Thread.sleep(1000);
					alert.accept();

					Thread.sleep(1000);

					String currentWindowx = driver.getWindowHandle();
					Set<String> windows1x = driver.getWindowHandles();
					for (String window1x : windows1x) {
						driver.switchTo().window(window1x);
						if (driver.getTitle().contains("Exemption Message")) {
							System.out.println(driver.getCurrentUrl());

							WebElement YesBTN = driver.findElement(By.name("yes"));
							YesBTN.click();
						}
					}

					org.openqa.selenium.Alert alert3 = driver.switchTo().alert();
					String alertMessage3 = driver.switchTo().alert().getText();
					System.out.println(alertMessage3);
					Thread.sleep(1000);
					alert.accept();

					Thread.sleep(7000);
					driver.switchTo().defaultContent();
					driver.switchTo().frame("BillReceiptInfo");

					WebElement Inpatient_Bill_type = driver.findElement(By.name("inPatBillType"));
					Inpatient_Bill_type.click();
					Inpatient_Bill_type.sendKeys(Keys.TAB);

					GenerateBillBTN.click();

				}
			}

		} catch (InterruptedException ex) {
			Logger.getLogger(CMO_Generate_Bill.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}