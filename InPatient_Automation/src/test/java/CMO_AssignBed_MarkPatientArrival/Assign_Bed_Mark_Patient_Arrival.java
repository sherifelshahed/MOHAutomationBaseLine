package CMO_AssignBed_MarkPatientArrival;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Assign_Bed_Mark_Patient_Arrival {
	public void assign_bed(WebDriver driver, String Patient_ID) {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		try {
			WebElement Assign_Bed_btn = driver.findElement(By.id("sd2"));
			Assign_Bed_btn.click();

			driver.switchTo().defaultContent();
			driver.switchTo().frame(2);
			driver.switchTo().frame("commontoolbarFrame");

			driver.switchTo().defaultContent();
			driver.switchTo().frame(2);
			driver.switchTo().frame("f_query_add_mod");

			WebElement patientId = driver.findElement(By.name("patient_id"));
			patientId.sendKeys(Patient_ID);

			WebElement SearchBtn = driver.findElement(By.name("search"));
			SearchBtn.click();

			driver.switchTo().defaultContent();
			driver.switchTo().frame(2);
			driver.switchTo().frame("f_query_add_mod1");

			WebElement Encounter_ID_hyperlink = driver.findElement(By.partialLinkText("1000"));
			Encounter_ID_hyperlink.click();

			System.out.println(
					" Encounter ID hyperlink is working  and user is directed to Assign Bed/Mark Patient Arrival page ");
			
			Thread.sleep(2000);
			
			String currentWindow = driver.getWindowHandle();
			for (String WindowID : driver.getWindowHandles()) {
				String Title = driver.switchTo().window(WindowID).getTitle();
				System.out.println(driver.getTitle());
				if (Title.equals("Assign Bed / Mark Patient Arrival")) {
					driver.switchTo().frame("message");

					WebElement Attending_Practitioner_txt = driver.findElement(By.name("pract_desc"));
					Attending_Practitioner_txt.sendKeys("Doctor El Zohour Inpatient 01");

					WebElement pract_id_lookup = driver.findElement(By.name("pract_id_search"));
					pract_id_lookup.click();

					WebElement bed_no_lookup = driver.findElement(By.name("bed_avail_chart"));
					bed_no_lookup.click();

					Thread.sleep(2000);

					String Current_window = driver.getWindowHandle();
					for (String WindowID1 : driver.getWindowHandles()) {
						String Title1 = driver.switchTo().window(WindowID1).getTitle();
						if (Title1.equals("Bed Availability Chart")) {

							System.out.println(driver.getCurrentUrl());
							driver.switchTo().parentFrame();
							driver.switchTo().defaultContent();
							driver.switchTo().frame("result");

							Thread.sleep(5000);

							WebElement BedNo = driver.findElement(By.xpath("//input[@class = 'IP_GreenButton'][1]"));
							BedNo.click();

							System.out.println("Bed Selected is:" + BedNo.getText());
							BedNo.click();

							Thread.sleep(2000);

							for (String Windowa : driver.getWindowHandles()) {
								String Title2 = driver.switchTo().window(Windowa).getTitle();
								if (Title2.equals("Assign Bed / Mark Patient Arrival")) {

									Thread.sleep(800);

									driver.switchTo().defaultContent();
									driver.switchTo().frame("message");

									By Record = By.name("record");
									driver.findElement(Record).click();

									Thread.sleep(2000);

									org.openqa.selenium.Alert alert = driver.switchTo().alert();
									String alertMessage = driver.switchTo().alert().getText();
									System.out.println(alertMessage);
									Thread.sleep(1000);
									alert.accept();

									Thread.sleep(500);

									System.out.println("Operation Completed Successfully");
								}
							}
						}
					}
				}

			}
		} catch (InterruptedException ex) {
			Logger.getLogger(Assign_Bed_Mark_Patient_Arrival.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}