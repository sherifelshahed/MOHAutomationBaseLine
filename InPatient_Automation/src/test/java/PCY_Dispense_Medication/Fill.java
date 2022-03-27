package PCY_Dispense_Medication;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Fill {

	public void fill(WebDriver driver, String Patient_ID) {
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
					Dispense_Stages.sendKeys(Keys.TAB);

					WebElement OkBtn = driver.findElement(By.xpath("//input[@value='OK']"));
					OkBtn.click();

					driver.switchTo().window(Current_window);

					driver.switchTo().defaultContent();
					driver.switchTo().frame("content");
					driver.switchTo().frame("f_query_add_mod");
					driver.switchTo().frame("f_query_criteria");

					WebElement patientIDText = driver.findElement(By.name("patient_id"));
					patientIDText.sendKeys(Patient_ID);

					Thread.sleep(500);

					driver.switchTo().defaultContent();
					driver.switchTo().frame("content");
					driver.switchTo().frame("f_query_add_mod");
					driver.switchTo().frame("f_query_criteria_buttons");

					WebElement Refresh_button = driver.findElement(By.name("btnSearch"));
					Refresh_button.click();

					Thread.sleep(500);

					driver.switchTo().defaultContent();
					driver.switchTo().frame("content");
					driver.switchTo().frame("f_query_add_mod");
					driver.switchTo().frame("f_query_result");
					driver.switchTo().frame("DispMedicationPatDetFrame_3");
					driver.switchTo().frame("f_disp_medication_header");

					WebElement Fill_button = driver.findElement(By.name("btnFill"));
					Fill_button.click();

					String currentWindow = driver.getWindowHandle();
					Set<String> windows = driver.getWindowHandles();
					for (String window : windows) {
						driver.switchTo().window(window);
						System.out.println(driver.getTitle());

						if (driver.getTitle().contains("Fill / Refill")) {

							Thread.sleep(500);

							driver.switchTo().defaultContent();
							driver.switchTo().frame("f_drug_entry");

							By Allocated_Quantity = By.name("issue_qty0");
							driver.findElement(Allocated_Quantity).sendKeys("1");

							Thread.sleep(300);

							driver.switchTo().defaultContent();
							driver.switchTo().frame("f_buttons");

							By Fill_for_Drug = By.name("stock_alloc_butt");
							driver.findElement(Fill_for_Drug).click();

							Thread.sleep(300);

							driver.close();

							Thread.sleep(50);

							driver.switchTo().window(Current_window);

							Thread.sleep(50);
							driver.switchTo().defaultContent();
							driver.switchTo().frame("content");
							driver.switchTo().frame("f_query_add_mod");
							driver.switchTo().frame("f_query_result");
							driver.switchTo().frame("DispMedicationPatDetFrame_3");
							driver.switchTo().frame("f_disp_medication_all_stages_legends");

							WebElement Complete_Fill = driver.findElement(By.id("filling_butt"));
							Complete_Fill.click();

							String currentWindow2 = driver.getWindowHandle();
							Set<String> windows2 = driver.getWindowHandles();
							for (String window2 : windows2) {
								driver.switchTo().window(window2);
								System.out.println(driver.getTitle());
								if (driver.getTitle().contains("Filling Person Detail")) {

									Thread.sleep(300);
									WebElement Ok = driver.findElement(By.name("btnOk"));
									Ok.click();

									Thread.sleep(500);

//									String CurrentWindowp = driver.getWindowHandle();
//									for (String Windowp : driver.getWindowHandles()) {
//										String Title2 = driver.switchTo().window(Windowp).getTitle();
//										System.out.println(Title2);
//										if (Title.equals("Print/Edit Label")) {
//
//											driver.switchTo().defaultContent();
//											driver.switchTo().frame("buttonFrame");
//
//											WebElement Cancel = driver.findElement(By.name("btnCancel"));
//							         		Cancel.click();
//
//											Thread.sleep(300);

									System.out.println(" PCY Fill Medications successfully ");

								}
							}
						}
					}
				}
			}

		} catch (

		InterruptedException ex) {
			Logger.getLogger(Fill.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}