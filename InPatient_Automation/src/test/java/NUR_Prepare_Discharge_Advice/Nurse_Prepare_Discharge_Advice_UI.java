package NUR_Prepare_Discharge_Advice;

import static org.testng.Assert.assertEquals;

import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Nurse_Prepare_Discharge_Advice_UI {

	public void discharge_advice(WebDriver driver, String Patient_ID) {

		try {

			WebElement Prepare_Discharge_Advice = driver.findElement(By.id("sd18"));
			Prepare_Discharge_Advice.click();

			Thread.sleep(500);
			System.out.println("Nurse is Navigated to Prepare Discharge Advice Page Successfully");

			driver.switchTo().defaultContent();
			driver.switchTo().frame(2);
			driver.switchTo().frame("f_query_add_mod");

			WebElement NursingUnit = driver.findElement(By.xpath("//table/tbody/tr/td"));
			System.out.println("Nursing Unit is existing with Title: " + NursingUnit.getText());

			WebElement NursingUnitTXT = driver.findElement(By.xpath("//table/tbody/tr/td[2]/input"));
			NursingUnitTXT.sendKeys("A2GS");
			Thread.sleep(1000);
			System.out.println("Nursing Unit is:  " + NursingUnitTXT.getAttribute("value"));
			Thread.sleep(2000);

			WebElement AdmissionDateFrom = driver.findElement(By.xpath("//table/tbody/tr/td[3]"));
			System.out.println("Admission Date From is existing with title:  " + AdmissionDateFrom.getText());

			WebElement DateFrom = driver.findElement(By.xpath("//table/tbody/tr/td[4]/input"));
			DateFrom.sendKeys("31/12/2021");

			WebElement DateTO = driver.findElement(By.xpath("//table/tbody/tr/td[4]/input[2]"));
			DateTO.sendKeys("14/12/2022");

			WebElement Speciality = driver.findElement(By.xpath("//table/tbody/tr[2]/td"));
			System.out.println("Speciality is existing with title:  " + Speciality.getText());

			WebElement SpecialityTXT = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]/input"));
			SpecialityTXT.sendKeys("ANC");

			WebElement SpecialityBTN = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]/input[3]"));
			SpecialityBTN.click();

			String currentWindowx = driver.getWindowHandle();
			Set<String> windowsx = driver.getWindowHandles();
			for (String window1 : windowsx) {
				driver.switchTo().window(window1);
				if (driver.getTitle().contains("Specialty")) {
					driver.switchTo().defaultContent();
					driver.switchTo().frame("lookup_head");
					System.out.println(driver.getCurrentUrl());
					WebElement SearchBTN = driver.findElement(By.xpath("//table/tbody/tr[2]/td[5]/input"));
					SearchBTN.click();
					Thread.sleep(500);
					driver.switchTo().defaultContent();
					driver.switchTo().frame("lookup_detail");
					WebElement SpecSelection = driver.findElement(By.xpath("//table[2]/tbody/tr[2]/td[1]"));
					System.out.println(SpecSelection.getText());
					SpecSelection.click();
					Thread.sleep(500);
					driver.switchTo().window(currentWindowx);
				}
			}

			driver.switchTo().defaultContent();
			driver.switchTo().frame(2);
			driver.switchTo().frame("f_query_add_mod");
			System.out.println("'Speciality' is Text Field. " + SpecialityTXT.getAttribute("value"));
			Thread.sleep(500);

			WebElement PractionerTXT = driver.findElement(By.xpath("//table/tbody/tr[2]/td[4]/input"));
			PractionerTXT.sendKeys("AHMEDSHERIF");

			WebElement PractionerTBTN = driver.findElement(By.xpath("//table/tbody/tr[2]/td[4]/input[3]"));
			PractionerTBTN.click();
			Thread.sleep(300);

			driver.switchTo().defaultContent();
			driver.switchTo().frame(2);
			driver.switchTo().frame("f_query_add_mod");

			WebElement EncounterIDTXT = driver.findElement(By.xpath("//table/tbody/tr[3]/td"));
			System.out.println("Encounter ID is existing with title:  " + EncounterIDTXT.getText());

			WebElement EncounterID = driver.findElement(By.xpath("//table/tbody/tr[3]/td/input"));
			EncounterID.sendKeys("123");

			WebElement PatientID = driver.findElement(By.xpath("//table/tbody/tr[4]/td/table/tbody/tr/td"));
			System.out.println("Patinet ID is Existing with Title: " + PatientID.getText());
			WebElement PatientIDTXT = driver.findElement(By.xpath("//table/tbody/tr[4]/td/table/tbody/tr/td[2]/input"));
			PatientIDTXT.sendKeys("123");
			assertEquals("Patient ID", PatientID.getText());
			driver.switchTo().defaultContent();
			driver.switchTo().frame(2);
			driver.switchTo().frame("f_query_add_mod");

			WebElement SearchBTN = driver.findElement(By.xpath("//table[2]/tbody/tr/td[2]/input"));
			System.out.println("Search button is existing with title:  " + SearchBTN.getAttribute("value"));
			SearchBTN.click();
			Thread.sleep(1000);
			org.openqa.selenium.Alert alert = driver.switchTo().alert();
			alert.accept();
			Thread.sleep(1000);

			WebElement ClearBTN = driver.findElement(By.xpath("//table[2]/tbody/tr/td[2]/input[2]"));
			System.out.println("Clear button is existing with title:  " + ClearBTN.getAttribute("value"));
			ClearBTN.click();
			Thread.sleep(500);

			driver.switchTo().parentFrame();
			driver.switchTo().defaultContent();
			driver.switchTo().frame("content");
			driver.switchTo().frame("commontoolbarFrame");

			WebElement ResetBTN = driver
					.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td/input"));
			System.out.println("Reset button is existing with title:  " + ResetBTN.getAttribute("value"));
			ResetBTN.click();
			Thread.sleep(1000);

			driver.switchTo().parentFrame();
			driver.switchTo().defaultContent();
			driver.switchTo().frame("content");
			driver.switchTo().frame("commontoolbarFrame");

			WebElement Menu = driver
					.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td[3]/input"));
			System.out.println("Menu Button is Existing with title: " + Menu.getAttribute("value"));
			Menu.click();

		} catch (InterruptedException ex) {
			Logger.getLogger(Nurse_Prepare_Discharge_Advice.class.getName()).log(Level.SEVERE, null, ex);
		}

	}
}
