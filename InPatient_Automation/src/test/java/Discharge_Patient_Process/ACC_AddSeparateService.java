package Discharge_Patient_Process;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Iterator;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ACC_AddSeparateService {

	public void Add_Separate_Service(WebDriver driver, String Patient_ID) {

		try {
			Thread.sleep(200);
			Set<String> windows = driver.getWindowHandles();
			Iterator<String> it = windows.iterator();
			String homePage = it.next();
			String systemEM = it.next();

			driver.switchTo().window(systemEM);
			driver.close();
			driver.switchTo().window(homePage);
			driver.get("http://10.209.1.5:7777/HIS/eCommon/jsp/eHIS.jsp");

			driver.switchTo().frame(1);
			driver.switchTo().frame("menuFr");
			Thread.sleep(500);

			WebElement AsignBed = driver.findElement(By.id("sd17"));
			AsignBed.click();

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

			Thread.sleep(1000);

			WebElement PatID = driver.findElement(By.xpath("//table[2]/tbody/tr[2]/td[4]/a"));
			assertEquals(Patient_ID, PatID.getText());
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

					Thread.sleep(7000);

					WebElement NewOrder = driver.findElement(By.id("NewOrder"));
					NewOrder.click();

					driver.switchTo().parentFrame();
					driver.switchTo().defaultContent();
					driver.switchTo().frame("BLChargePatientEncounterTabPage");

					WebElement ServiceGroup = driver.findElement(By.id("serviceGroup"));
					ServiceGroup.click();
					ServiceGroup.sendKeys(Keys.ARROW_DOWN);
					ServiceGroup.sendKeys(Keys.ARROW_DOWN);
					ServiceGroup.sendKeys(Keys.ENTER);

					WebElement Classification = driver.findElement(By.id("serviceClassification"));
					Classification.sendKeys("Audiology");
					WebElement ClassificationBTN = driver.findElement(By.id("serviceClass_btn"));
					ClassificationBTN.click();

					WebElement Search = driver.findElement(By.name("add_mod"));
					Search.click();

					driver.switchTo().parentFrame();
					driver.switchTo().defaultContent();
					driver.switchTo().frame("BLChargePatientExisOrderTraverse");

					WebElement ServiceCode = driver.findElement(By.id("servCode_1"));
					ServiceCode.click();

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
			Logger.getLogger(ACC_AddSeparateService.class.getName()).log(Level.SEVERE, null, ex);
		}

	}
}