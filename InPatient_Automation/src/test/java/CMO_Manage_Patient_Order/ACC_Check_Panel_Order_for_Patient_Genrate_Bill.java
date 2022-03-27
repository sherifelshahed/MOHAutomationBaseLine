package CMO_Manage_Patient_Order;

import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ACC_Check_Panel_Order_for_Patient_Genrate_Bill {

	public void genrate_bill(WebDriver driver, String Patient_ID) {

		try {

			// OpenBillGeneratePage

			WebElement Generate_Bill = driver.findElement(By.id("sd15"));
			Generate_Bill.click();

			Thread.sleep(500);
			System.out.println("Admission Officer is Navigated to Bill Generation Page Successfully");
			driver.switchTo().defaultContent();
			driver.switchTo().frame("content");
			driver.switchTo().frame("BLChargePatientQueryFrame");
			driver.switchTo().frame("search_frame");

			// searchPatientCMO
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

			WebElement EncPeriod = driver.findElement(By.id("encounter_period"));
			EncPeriod.click();
			EncPeriod.sendKeys(Keys.ARROW_DOWN);
			EncPeriod.sendKeys(Keys.TAB);

			WebElement dateFrom = driver.findElement(By.id("encounter_from_date"));
			try {
				dateFrom.clear();
			} catch (Exception e) {
			}

			dateFrom.sendKeys("01/08/2021");
			dateFrom.sendKeys(Keys.TAB);

			WebElement dateTo = driver.findElement(By.id("encounter_to_date"));
			try {
				dateTo.clear();
			} catch (Exception e) {
			}
			dateTo.sendKeys("23/12/2021");
			dateTo.sendKeys(Keys.TAB);

			WebElement SearchBTN = driver.findElement(By.name("search_button"));
			SearchBTN.click();

			driver.switchTo().defaultContent();
			driver.switchTo().frame("content");
			driver.switchTo().frame("BLChargePatientQueryFrame");
			driver.switchTo().frame("result_frame");
			Thread.sleep(2000);
			WebElement PatID = driver.findElement(By.xpath("//table[2]/tbody/tr[2]/td[4]/a"));
//				assertEquals(Patient, PatID.getText());
			System.out.println("Search button is working and result is displaying: " + PatID.getText());
			PatID.click();

			// GenerateBill
			Thread.sleep(1000);
			try {
				Thread.sleep(1000);

				org.openqa.selenium.Alert alert1 = driver.switchTo().alert();
				String alertMessage1 = driver.switchTo().alert().getText();
				System.out.println(alertMessage1);
				Thread.sleep(1000);
				alert1.accept();
				Thread.sleep(1000);
			} catch (Exception e) {

			}

			Set<String> windows1 = driver.getWindowHandles();
			for (String window1 : windows1) {
				driver.switchTo().window(window1);
				if (driver.getTitle().contains("Bill Generation")) {
					System.out.println(driver.getCurrentUrl());
					Thread.sleep(1000);
					try {
						org.openqa.selenium.Alert alert = driver.switchTo().alert();
						String alertMessage = driver.switchTo().alert().getText();
						System.out.println(alertMessage);
						Thread.sleep(1000);
						alert.accept();
					} catch (Exception e) {
						// TODO: handle exception
					}

					driver.switchTo().parentFrame();
					driver.switchTo().defaultContent();
					driver.switchTo().frame("BillReceiptInfo");

					WebElement BillType = driver.findElement(By.id("inPatBillType"));
					BillType.click();
					BillType.sendKeys(Keys.ARROW_UP);
					// BillType.sendKeys(Keys.ARROW_UP);
					BillType.sendKeys(Keys.ENTER);

					try {
						org.openqa.selenium.Alert alert = driver.switchTo().alert();
						String alertMessage = driver.switchTo().alert().getText();
						System.out.println(alertMessage);
						Thread.sleep(1000);
						alert.accept();
					} catch (Exception e) {

					}

					WebElement GenerateBillBTN = driver.findElement(By.name("compute"));
					GenerateBillBTN.click();
					System.out.println("Generate button is Working.");
					Thread.sleep(3000);

					try {
						org.openqa.selenium.Alert alert = driver.switchTo().alert();
						String alertMessage = driver.switchTo().alert().getText();
						System.out.println(alertMessage);
						Thread.sleep(1000);
						alert.accept();
						Thread.sleep(1000);
					} catch (Exception e) {

					}

				}
			}

		} catch (

		InterruptedException ex) {
			Logger.getLogger(ACC_Check_Panel_Order_for_Patient_Genrate_Bill.class.getName()).log(Level.SEVERE, null,
					ex);
		}

	}
}