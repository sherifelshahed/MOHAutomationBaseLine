package CMO_Manage_Patient_Order;

import static org.testng.Assert.assertTrue;

import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ACC_Place_Panel_Order {

	public void Order(WebDriver driver, String Patient_ID) {

		try {

			WebElement Manage_Patient_Order = driver.findElement(By.id("sd17"));
			Manage_Patient_Order.click();

			Thread.sleep(500);

			System.out.println("Accountant is Navigated to Manage Patient Order Page Successfully");
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

			WebElement SearchBTN = driver.findElement(By.name("search_button"));
			SearchBTN.click();

			driver.switchTo().defaultContent();
			driver.switchTo().frame("content");
			driver.switchTo().frame("BLChargePatientQueryFrame");
			driver.switchTo().frame("result_frame");
			Thread.sleep(2000);
			WebElement PatID = driver.findElement(By.xpath("//table[2]/tbody/tr[2]/td[4]/a"));
//			assertEquals(Patient, PatID.getText());
			System.out.println("Search button is working and result is displaying: " + PatID.getText());
			PatID.click();
			Thread.sleep(1000);

			Set<String> windows1 = driver.getWindowHandles();
			for (String window1 : windows1) {
				driver.switchTo().window(window1);
				if (driver.getTitle().contains("Charge Patient")) {

					driver.switchTo().parentFrame();
					driver.switchTo().defaultContent();
					driver.switchTo().frame("BLChargePatientEncounterTab");
					Thread.sleep(1000);
					WebElement NewOrder = driver.findElement(By.id("NewOrder"));
					NewOrder.click();

					driver.switchTo().parentFrame();
					driver.switchTo().defaultContent();
					driver.switchTo().frame("BLChargePatientEncounterTabPage");

					WebElement PanelBox = driver.findElement(By.id("serviceOrPanel"));
					PanelBox.click();

					WebElement Search = driver.findElement(By.name("add_mod"));
					Search.click();

					driver.switchTo().parentFrame();
					driver.switchTo().defaultContent();
					driver.switchTo().frame("BLChargePatientExisOrderTraverse");

					WebElement ServiceCode = driver.findElement(By.id("servCode_1"));
					ServiceCode.click();
					System.out.println(
							"Service " + driver.findElement(By.xpath("//table/tbody/tr/td[2]")) + " is Selected.");
					driver.switchTo().parentFrame();
					driver.switchTo().defaultContent();
					driver.switchTo().frame("BLChargePatientExisOrderServDetails");

					WebElement RecordBTN = driver.findElement(By.xpath("//table/tbody/tr[2]/td/input"));
					RecordBTN.click();

					driver.switchTo().parentFrame();
					driver.switchTo().defaultContent();
					driver.switchTo().frame("messageFrame");
					WebElement SuccessMSG = driver.findElement(By.xpath("/html/body/p"));
					System.out.println(SuccessMSG.getText());
					assertTrue(SuccessMSG.getText().contains("Operation Completed Successfully"));

				}
			}

		} catch (InterruptedException ex) {
			Logger.getLogger(ACC_Place_Panel_Order.class.getName()).log(Level.SEVERE, null, ex);
		}

	}
}