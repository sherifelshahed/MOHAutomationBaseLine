package PCY_Dispense_Medication;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Deliver {

	public void deliver(WebDriver driver, String Patient_ID) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		try {

			By Dispense_Medication = By.id("sd1");
			driver.findElement(Dispense_Medication).click();

			String Current_window = driver.getWindowHandle();
			for (String WindowID : driver.getWindowHandles()) {
				String Title = driver.switchTo().window(WindowID).getTitle();
//				System.out.println(Title);
				if (Title.equals("Dispensing Medication Login")) {
//					System.out.println(driver.getCurrentUrl());

					WebElement pass = driver.findElement(By.name("password"));
					pass.sendKeys("egy123");

					WebElement Dispense_Location = driver.findElement(By.name("disp_locn"));
					Dispense_Location.click();
					Dispense_Location.sendKeys(Keys.ARROW_DOWN);
					Dispense_Location.sendKeys(Keys.TAB);

					WebElement Dispense_Stages = driver.findElement(By.name("disp_stage"));
					Dispense_Stages.click();
					Dispense_Stages.sendKeys(Keys.ARROW_DOWN);
					Dispense_Stages.sendKeys(Keys.ARROW_DOWN);
					Dispense_Stages.sendKeys(Keys.TAB);

					By WithoutFill_List = By.xpath("//input[@value='DF']");
					driver.findElement(WithoutFill_List).click();

					WebElement OkBtn = driver.findElement(By.xpath("//input[@value='OK']"));
					OkBtn.click();

				}
			}

			driver.switchTo().window(Current_window);

			driver.switchTo().defaultContent();
			driver.switchTo().frame("content");
			driver.switchTo().frame("f_query_add_mod");
			driver.switchTo().frame("f_query_criteria");

			WebElement patientIDText = driver.findElement(By.name("patient_id"));
			patientIDText.sendKeys(Patient_ID);

			driver.switchTo().defaultContent();
			driver.switchTo().frame("content");
			driver.switchTo().frame("f_query_add_mod");
			driver.switchTo().frame("f_query_criteria_buttons");

			WebElement Refresh_button = driver.findElement(By.name("btnSearch"));
			Refresh_button.click();

			Thread.sleep(3000);
			driver.switchTo().defaultContent();
			driver.switchTo().frame("content");
			driver.switchTo().frame("f_query_add_mod");
			driver.switchTo().frame("f_query_result");
			driver.switchTo().frame("DispMedicationPatDetFrame_3");
			driver.switchTo().frame("f_disp_medication_all_stages_legends");

			WebElement Complete_Deliver = driver.findElement(By.name("btnDelivery"));
			Complete_Deliver.click();

			System.out.println(" PCY Deliver Medications successfully ");

			Thread.sleep(1000);

			String CurrentWindowp = driver.getWindowHandle();
			for (String Windowp : driver.getWindowHandles()) {
				String Title = driver.switchTo().window(Windowp).getTitle();
				System.out.println(Title);
				if (Title.equals("Print/Edit Label")) {

					driver.switchTo().defaultContent();
					driver.switchTo().frame("buttonFrame");

					WebElement Cancel = driver.findElement(By.name("btnCancel"));
					Cancel.click();
				}
			}

		} catch (InterruptedException ex) {
			Logger.getLogger(Deliver.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}