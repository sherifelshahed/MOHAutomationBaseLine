package NUR_Prepare_Discharge_Advice;

import static org.testng.Assert.assertEquals;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Nurse_Prepare_Discharge_Advice {

	public void Prepare_Discharge_Advice(WebDriver driver, String Patient_ID) {

		try {
			By Prepare_Discharge_Advice = By.id("sd18");
			driver.findElement(Prepare_Discharge_Advice).click();

			Thread.sleep(500);
			System.out.println("Nurse is Navigated to Prepare Discharge Advice Page Successfully");

			driver.switchTo().defaultContent();
			driver.switchTo().frame(2);
			driver.switchTo().frame("f_query_add_mod");

			WebElement PatientID = driver.findElement(By.xpath("//table/tbody/tr[4]/td/table/tbody/tr/td"));
			System.out.println("Patinet ID is Existing with Title: " + PatientID.getText());

			WebElement PatientIDTXT = driver.findElement(By.xpath("//table/tbody/tr[4]/td/table/tbody/tr/td[2]/input"));
			PatientIDTXT.sendKeys(Patient_ID);
			assertEquals("Patient ID", PatientID.getText());

			WebElement SearchBTN = driver.findElement(By.xpath("//table[2]/tbody/tr/td[2]/input"));
			System.out.println("Search button is existing with title:  " + SearchBTN.getAttribute("value"));
			SearchBTN.click();
			Thread.sleep(1000);

			driver.switchTo().parentFrame();
			driver.switchTo().defaultContent();
			driver.switchTo().frame(2);
			driver.switchTo().frame("f_query_add_mod1");
			Thread.sleep(2000);
			WebElement PatientEncID = driver.findElement(By.xpath("//table[2]/tbody/tr[2]/td[3]/a"));
			System.out.println(PatientEncID.getText());
			PatientEncID.click();

			Thread.sleep(4000);

			Set<String> windows1 = driver.getWindowHandles();
			for (String window1 : windows1) {
				driver.switchTo().window(window1);
				if (driver.getTitle().contains("Prepare Discharge Advice")) {

					driver.switchTo().parentFrame();
					driver.switchTo().defaultContent();
					driver.switchTo().frame("f_query_add_mod");
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

					WebElement AuthorizationPractitionerBTN = driver
							.findElement(By.xpath("//table/tbody/tr/td[2]/input[2]"));
					AuthorizationPractitionerBTN.click();

					Thread.sleep(1000);

					WebElement DischargeType = driver.findElement(By.xpath("//table[2]/tbody/tr/td[2]/select"));
					DischargeType.click();
					DischargeType.sendKeys(Keys.ARROW_DOWN);
					DischargeType.sendKeys(Keys.TAB);

					Thread.sleep(500);

					WebElement DischargeStatus = driver.findElement(By.xpath("//table[2]/tbody/tr/td[4]/select"));
					DischargeStatus.click();
					DischargeStatus.sendKeys(Keys.ARROW_DOWN);
					DischargeStatus.sendKeys(Keys.TAB);

					WebElement DischargeDate = driver.findElement(By.id("calendrGif"));
					DischargeDate.click();

					Thread.sleep(2000);

					Set<String> windows2 = driver.getWindowHandles();
					for (String window2 : windows2) {
						driver.switchTo().window(window2);
						if (driver.getTitle().contains("Calendar")) {

							WebElement Date_Today = driver.findElement(By.className("thisday"));
							Date_Today.click();
							Date_Today.click();

							Thread.sleep(1000);

							driver.switchTo().window(window1);

							driver.switchTo().parentFrame();
							driver.switchTo().defaultContent();
							driver.switchTo().frame("f_query_add_mod_button");

							Thread.sleep(500);

							WebElement RecordBTN = driver.findElement(By.xpath("//table/tbody/tr/td[2]/input"));
							RecordBTN.click();

							org.openqa.selenium.Alert alert = driver.switchTo().alert();
							String alertMessage = driver.switchTo().alert().getText();
							System.out.println(alertMessage);
							Thread.sleep(2000);
							alert.accept();

							Thread.sleep(4000);
						}
					}
				}
			}

		} catch (InterruptedException ex) {
			Logger.getLogger(Nurse_Prepare_Discharge_Advice.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
