package NUR_Transfer_Patient_Out;

import static org.testng.Assert.assertEquals;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Nurse_Check_Transfer_Patient_Out_UI {
	public void transfer(WebDriver driver, String Patient_ID) {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		try {

			WebElement Transfer_Patient_Out = driver.findElement(By.id("sd3"));
			Transfer_Patient_Out.click();
			Thread.sleep(500);
			System.out.println("Nurse is Navigated to Transfer Patient Out Page Successfully");

			driver.switchTo().defaultContent();
			driver.switchTo().frame(2);
			driver.switchTo().frame("f_query_add_mod");

			WebElement NursingUnit = driver.findElement(By.xpath("//table/tbody/tr[2]/td"));
			System.out.println(NursingUnit.getText());

			WebElement NursingUnitTXT = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]/input"));
			WebElement NursingUnitBTN = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]/input[3]"));
			NursingUnitTXT.sendKeys("A2GS");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			NursingUnitBTN.click();

			WebElement NursingUnitTO = driver.findElement(By.xpath("//table/tbody/tr[2]/td[3]"));
			System.out.println(NursingUnitTO.getText());
			WebElement NursingUnitTXTTO = driver.findElement(By.xpath("//table/tbody/tr[2]/td[4]/input"));
			NursingUnitTXTTO.sendKeys("A2IC");
			WebElement NursingUnitTOBTN = driver.findElement(By.xpath("//table/tbody/tr[2]/td[4]/input[3]"));
			NursingUnitTOBTN.click();
			Thread.sleep(500);
			System.out.println("'Nursing Unit To' is Text Field. " + NursingUnitTXTTO.getAttribute("value"));
			Thread.sleep(500);

			WebElement SpecialityTXT = driver.findElement(By.xpath("//table/tbody/tr[3]/td"));
			System.out.println(SpecialityTXT.getText());
			WebElement SpecialityTXTFrom = driver.findElement(By.xpath("//table/tbody/tr[3]/td[2]/input"));
			SpecialityTXTFrom.sendKeys("ANC");
			WebElement SpecialityFromBTN = driver.findElement(By.xpath("//table/tbody/tr[3]/td[2]/input[3]"));
			SpecialityFromBTN.click();
			Thread.sleep(500);

			String currentWindow = driver.getWindowHandle();
			Set<String> windows1 = driver.getWindowHandles();
			for (String window1 : windows1) {
				driver.switchTo().window(window1);
				if (driver.getTitle().contains("Specialty")) {
					driver.switchTo().defaultContent();
					driver.switchTo().frame("lookup_head");
					WebElement SearchBTN = driver.findElement(By.xpath("//table/tbody/tr[2]/td[5]/input"));
					SearchBTN.click();
					Thread.sleep(500);
					driver.switchTo().defaultContent();
					driver.switchTo().frame("lookup_detail");
					WebElement SpecSelection = driver.findElement(By.xpath("//table[2]/tbody/tr[2]/td[1]"));
					System.out.println(SpecSelection.getText());
					SpecSelection.click();
					Thread.sleep(500);
					driver.switchTo().window(currentWindow);
				}
			}

			driver.switchTo().defaultContent();
			driver.switchTo().frame(2);
			driver.switchTo().frame("f_query_add_mod");
			System.out.println("'Speciality From' is Text Field. " + SpecialityTXTFrom.getAttribute("value"));
			Thread.sleep(500);

			WebElement SpecialityTO = driver.findElement(By.xpath("//table/tbody/tr[3]/td[3]"));
			System.out.println(SpecialityTO.getText());
			WebElement SpecialityTXTTO = driver.findElement(By.xpath("//table/tbody/tr[3]/td[4]/input"));
			SpecialityTXTTO.clear();
			SpecialityTXTTO.sendKeys("ANES");
			WebElement SpecialityTOBTN = driver.findElement(By.xpath("//table/tbody/tr[3]/td[4]/input[3]"));
			SpecialityTOBTN.click();
			Thread.sleep(2000);

			String currentWindowx = driver.getWindowHandle();
			Set<String> windowsx = driver.getWindowHandles();
			for (String window1 : windowsx) {
				driver.switchTo().window(window1);
				if (driver.getTitle().contains("Specialty")) {
					driver.switchTo().defaultContent();
					driver.switchTo().frame("lookup_head");
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
			System.out.println("'Speciality TO' is Text Field. " + SpecialityTXTTO.getAttribute("value"));
			Thread.sleep(500);

			WebElement PractionerFrom = driver.findElement(By.xpath("//table/tbody/tr[4]/td[1]"));
			System.out.println("Practioner From is existing with title: " + PractionerFrom.getText());
			WebElement PractionerFromTXT = driver.findElement(By.xpath("//table/tbody/tr[4]/td[2]/input"));
			PractionerFromTXT.clear();
			PractionerFromTXT.sendKeys("AHMEDSHERIF");
			WebElement PractionerFromBTN = driver.findElement(By.xpath("//table/tbody/tr[4]/td[2]/input[3]"));
			PractionerFromBTN.click();
			Thread.sleep(2000);

			WebElement PractionerTO = driver.findElement(By.xpath("//table/tbody/tr[4]/td[3]"));
			System.out.println("Practioner TO is existing with title: " + PractionerTO.getText());
			WebElement PractionerTOTXT = driver.findElement(By.xpath("//table/tbody/tr[4]/td[4]/input"));
			PractionerTOTXT.clear();
			PractionerTOTXT.sendKeys("N01619");
			WebElement PractionerTOBTN = driver.findElement(By.xpath("//table/tbody/tr[4]/td[4]/input[3]"));
			PractionerTOBTN.click();
			Thread.sleep(2000);

			WebElement EncounterID = driver.findElement(By.xpath("//table/tbody/tr[5]/td"));
			System.out.println("Encounter ID is existing with Title: " + EncounterID.getText());

			WebElement EncounterIDTXT = driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]/input"));
			EncounterIDTXT.clear();
			EncounterIDTXT.sendKeys("ENC123");
			Thread.sleep(500);

			WebElement AdmissionDate = driver.findElement(By.xpath("//table/tbody/tr[5]/td[3]"));
			System.out.println("AdmissionDate is existing with Title: " + AdmissionDate.getText());

			WebElement AdmissionDateFrom = driver.findElement(By.xpath("//table/tbody/tr[5]/td[4]/input"));
			AdmissionDateFrom.sendKeys("22/12/2021");

			WebElement AdmissionDateTO = driver.findElement(By.xpath("//table/tbody/tr[5]/td[4]/input[2]"));
			AdmissionDateTO.sendKeys("13/01/2022");

			WebElement Request_Inpatient = driver.findElement(By.xpath("//table/tbody/tr[6]/td"));
			System.out.println("Request/Inpatient is existing with Titl: " + Request_Inpatient.getText());

			WebElement Request_InpatientList = driver.findElement(By.xpath("//table/tbody/tr[6]/td[2]/select"));
			Request_InpatientList.sendKeys(Keys.ENTER);
			Request_InpatientList.sendKeys(Keys.ARROW_DOWN);
			Request_InpatientList.sendKeys(Keys.ENTER);
			Thread.sleep(1000);

			WebElement PatientID = driver.findElement(By.xpath("//table/tbody/tr[7]/td/table/tbody/tr/td"));
			System.out.println("Patinet ID is Existing with Title: " + PatientID.getText());

			WebElement PatientIDTXT = driver.findElement(By.xpath("//table/tbody/tr[7]/td/table/tbody/tr/td[2]/input"));
			PatientIDTXT.sendKeys(Patient_ID);

			assertEquals("Patient ID", PatientID.getText());
			driver.switchTo().defaultContent();
			driver.switchTo().frame(2);
			driver.switchTo().frame("f_query_add_mod");

			WebElement SearchBTN = driver.findElement(By.xpath("//table[2]/tbody/tr/td[2]/input"));
			System.out.println("Search button is Existing with Title: " + SearchBTN.getAttribute("value"));

			WebElement ClearBTN = driver.findElement(By.xpath("//table[2]/tbody/tr/td[2]/input[2]"));
			System.out.println("Clear button is Existing with Title: " + ClearBTN.getAttribute("value"));
			ClearBTN.click();

			Thread.sleep(5000);
		} catch (

		InterruptedException ex) {
			Logger.getLogger(Nurse_Check_Transfer_Patient_Out_UI.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}