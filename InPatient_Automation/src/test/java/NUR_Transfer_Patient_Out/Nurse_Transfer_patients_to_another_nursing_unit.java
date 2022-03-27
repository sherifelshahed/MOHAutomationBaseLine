package NUR_Transfer_Patient_Out;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Nurse_Transfer_patients_to_another_nursing_unit {
	public void transfer(WebDriver driver, String Patient_ID) {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		try {

			WebElement AsignBed = driver.findElement(By.id("sd3"));
			AsignBed.click();
			Thread.sleep(500);
			System.out.println("Nurse is Navigated to Transfer Patient Out Page Successfully");

			driver.switchTo().defaultContent();
			driver.switchTo().frame(2);
			driver.switchTo().frame("f_query_add_mod");

			WebElement PatientIDTXT = driver.findElement(By.xpath("//table/tbody/tr[7]/td/table/tbody/tr/td[2]/input"));
			PatientIDTXT.sendKeys(Patient_ID);

			WebElement SearchBTN = driver.findElement(By.xpath("//table[2]/tbody/tr/td[2]/input"));
			SearchBTN.click();

			driver.switchTo().parentFrame();
			driver.switchTo().defaultContent();
			driver.switchTo().frame(2);
			driver.switchTo().frame("f_query_add_mod1");

			WebElement PatientEncID = driver.findElement(By.xpath("//table[2]/tbody/tr[2]/td[3]/a"));
			System.out.println(PatientEncID.getText());
			PatientEncID.click();

			Set<String> windowsx = driver.getWindowHandles();
			for (String window1 : windowsx) {
				driver.switchTo().window(window1);
				if (driver.getTitle().contains("Transfer Patient Out")) {

					driver.switchTo().defaultContent();
					driver.switchTo().frame("Transfer_frame");

					WebElement Reason = driver.findElement(By.xpath("//table/tbody/tr[3]/td[4]/select"));
					Reason.click();
					Reason.sendKeys(Keys.ARROW_DOWN);
					Reason.sendKeys(Keys.ARROW_DOWN);
					Reason.sendKeys(Keys.TAB);

					driver.switchTo().parentFrame();
					driver.switchTo().defaultContent();
					driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name = 'Transfer_frame'][2]")));

					WebElement NursingUnitTXT = driver.findElement(By.xpath("//table/tbody/tr[3]/td[4]/input"));
					NursingUnitTXT.sendKeys("Internal medicine");
					WebElement NursingUnitBTN = driver.findElement(By.xpath("//table/tbody/tr[3]/td[4]/input[2]"));
					NursingUnitBTN.click();

					WebElement Service = driver.findElement(By.xpath("//table/tbody/tr[4]/td[4]/select"));
					Service.click();
					Service.sendKeys(Keys.ARROW_DOWN);
					Service.sendKeys(Keys.TAB);

					WebElement BedClassChange = driver.findElement(By.xpath("//table/tbody/tr[6]/td[4]/input"));
					BedClassChange.click();

					WebElement BedClass = driver.findElement(By.xpath("//table/tbody/tr[7]/td[4]/select"));
					BedClass.click();
					BedClass.sendKeys(Keys.ARROW_DOWN);
					BedClass.sendKeys(Keys.TAB);

					WebElement BedType = driver.findElement(By.xpath("//table/tbody/tr[8]/td[4]/select"));
					BedType.click();
					BedType.sendKeys(Keys.ARROW_DOWN);
					BedType.sendKeys(Keys.TAB);

					WebElement Spec = driver.findElement(By.name("Splcode_desc"));

					try {
						Spec.clear();
					} catch (InvalidElementStateException e) {
						Thread.sleep(500);
						Spec.sendKeys("Gen Surg Splty");
					}

					WebElement SpecBTN = driver.findElement(By.name("Splcode_lookup"));
					SpecBTN.click();

					WebElement Prac = driver.findElement(By.name("pract_desc"));

					try {
						Prac.clear();
					} catch (InvalidElementStateException e) {
						Thread.sleep(500);
						Prac.sendKeys("Ophthalmologist El Zohour");
					}

					WebElement PracBTN = driver.findElement(By.name("pract_id_search"));
					PracBTN.click();

					driver.switchTo().parentFrame();
					driver.switchTo().defaultContent();
					driver.switchTo().frame("Button_frame");

					WebElement RecordBTN = driver.findElement(By.name("button_s"));
					RecordBTN.click();
					Thread.sleep(2000);
					org.openqa.selenium.Alert alert = driver.switchTo().alert();
					String alertMessage = driver.switchTo().alert().getText();
					System.out.println(alertMessage);
					Thread.sleep(2000);
					alert.accept();

				}

			}

		} catch (

		InterruptedException ex) {
			Logger.getLogger(Nurse_Transfer_patients_to_another_nursing_unit.class.getName()).log(Level.SEVERE, null,
					ex);
		}
	}
}