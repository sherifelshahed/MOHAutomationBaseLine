package NUR_Administer_Medication;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Nurse_Record_Administer_Medication {

	public void Medication(WebDriver driver) {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		try {
			WebElement Medication_Administration_btn = driver.findElement(By.id("sd12"));
			Medication_Administration_btn.click();

			Thread.sleep(500);
			System.out.println("Nurse is Navigated to Medication Administration Page Successfully");

			driver.switchTo().defaultContent();
			driver.switchTo().frame(2);
			driver.switchTo().frame("f_search");

			// WebElement location = driver.findElement(By.name("nursing_unit_desc"));
			// location.sendKeys(Location);
			WebElement location_lookup = driver.findElement(By.name("location_search"));
			location_lookup.click();

			String CurrentWindow1 = driver.getWindowHandle();
			for (String WindowID : driver.getWindowHandles()) {
				String Title = driver.switchTo().window(WindowID).getTitle();
				// System.out.println(Title);

				if (driver.switchTo().window(WindowID).getTitle().equals("Location")) {
					// System.out.println(driver.getCurrentUrl());
					driver.switchTo().frame(1);
					driver.switchTo().defaultContent();
					driver.switchTo().frame("lookup_head");
					WebElement searchBTN = driver.findElement(By.name("Search"));
					searchBTN.click();
					driver.switchTo().defaultContent();
					driver.switchTo().frame("lookup_detail");
					WebElement nurse_unit_hyperlink = driver.findElement(By.xpath("//td[contains(.,'A2GS')]"));
					nurse_unit_hyperlink.click();
					// driver.close();
				}

			}
			driver.switchTo().window(CurrentWindow1);
			driver.switchTo().defaultContent();
			driver.switchTo().frame(2);
			driver.switchTo().frame("f_search");
			WebElement SearchBtn = driver.findElement(By.name("Search"));
			SearchBtn.click();

			driver.switchTo().defaultContent();
			driver.switchTo().frame(2);
			driver.switchTo().frame("f_query_add_mod");
			driver.switchTo().frame("f_patient_details");
			driver.switchTo().frame("f_bedheader");
			WebElement PatientIDHyperLink = driver.findElement(By.xpath("//label[contains(.,'Test')]"));
			PatientIDHyperLink.click();

			Thread.sleep(2000);

			driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
			driver.switchTo().defaultContent();
			driver.switchTo().frame(2);
			driver.switchTo().frame("f_query_add_mod");
			driver.switchTo().frame("f_admin_chart");
			WebElement check = driver.findElement(By.name("pat_brought_med_1"));
			check.click();

			Thread.sleep(100);

			WebElement Batch_ID = driver.findElement(By.name("non_iv_shared_drug_1"));
			Batch_ID.click();

			Thread.sleep(100);

			WebElement Admin_Dose = driver.findElement(By.name("non_iv_admin_qty_1"));
			try {
				Admin_Dose.clear();
			} catch (Exception e) {
			}
			Admin_Dose.sendKeys("2");

			Thread.sleep(1000);

			driver.switchTo().defaultContent();
			driver.switchTo().frame(2);
			driver.switchTo().frame("commontoolbarFrame");
			WebElement Apply = driver.findElement(By.name("apply"));
			Apply.click();

			driver.switchTo().defaultContent();
			driver.switchTo().frame("content");
			driver.switchTo().frame("messageFrame");
			WebElement successMsg = driver.findElement(By.xpath("html/body/p"));
			System.out.println(successMsg.getText());

			Thread.sleep(1000);

		} catch (InterruptedException ex) {
			Logger.getLogger(Nurse_Record_Administer_Medication.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

}
