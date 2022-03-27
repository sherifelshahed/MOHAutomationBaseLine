package CMO_Admit_Patient;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class CMO_Admit_Referrral_Patient {

	public void admit_patient(WebDriver driver, String Patient_ID) {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {

			By Admit_Patient = By.id("sd1");
			driver.findElement(Admit_Patient).click();

			Thread.sleep(500);
			driver.switchTo().parentFrame();
			driver.switchTo().defaultContent();
			driver.switchTo().frame("content");
			driver.switchTo().frame("f_query_add_mod");
			driver.switchTo().frame("Select_frame");

			By Admission_For = By.name("admission_for");
			driver.findElement(Admission_For).click();
			driver.findElement(Admission_For).sendKeys(Keys.TAB);

			By PatientID_Text = By.name("patient_id");
			driver.findElement(PatientID_Text).sendKeys(Patient_ID + Keys.ENTER);

			By click = By.name("booking_ref_no");
			driver.findElement(click).click();
			driver.findElement(click).click();

			Thread.sleep(2000);

			System.out.println("The yellow bar will be displayed to the user");

			driver.switchTo().defaultContent();
			driver.switchTo().frame(2);
			driver.switchTo().frame("f_query_add_mod");
			driver.switchTo().frame("Main_frame");

			By Specialty = By.name("SplDesc");
			driver.findElement(Specialty).sendKeys("Gen Surg Splty" + Keys.ENTER);

			By Nursing_Unit = By.name("nursing_unit_desc");
			driver.findElement(Nursing_Unit).sendKeys("General Surgery" + Keys.ENTER);

			By Service = By.name("service");
			driver.findElement(Service).click();
			driver.findElement(Service).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Service).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Service).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Service).sendKeys(Keys.TAB);

			By Bed_Class = By.name("Bedcode");
			driver.findElement(Bed_Class).click();
			driver.findElement(Bed_Class).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Bed_Class).sendKeys(Keys.TAB);

			By Bed_Type = By.name("bed_type");
			driver.findElement(Bed_Type).click();
			driver.findElement(Bed_Type).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Bed_Type).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Bed_Type).sendKeys(Keys.TAB);

			By Admission_Type = By.name("visit_adm_type");
			driver.findElement(Admission_Type).click();
			driver.findElement(Admission_Type).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Admission_Type).sendKeys(Keys.TAB);

			By Admitting_Practitioner = By.name("practid_desc");
			driver.findElement(Admitting_Practitioner).sendKeys("Doctor El Zohour Inpatient 01" + Keys.ENTER);

			By click2 = By.name("expecteddischargedate");
			driver.findElement(click2).click();

			driver.switchTo().parentFrame();
			driver.switchTo().defaultContent();
			driver.switchTo().frame(2);
			driver.switchTo().frame("commontoolbarFrame");

			// Apply button

			By Apply_button = By.name("apply");
			driver.findElement(Apply_button).click();

			Thread.sleep(1000);

			driver.switchTo().defaultContent();
			driver.switchTo().frame("content");
			driver.switchTo().frame("f_query_add_mod");
			driver.switchTo().frame("Main_frame");

			By Financial_Details_Tab = By.className("tabASpan");
			driver.findElement(Financial_Details_Tab).click();

			String currentWindow5 = driver.getWindowHandle();
			Set<String> windows5 = driver.getWindowHandles();
			for (String window5 : windows5) {
				driver.switchTo().window(window5);
				System.out.println(driver.getTitle());

				if (driver.getTitle().contains("Financial Details")) {
					driver.switchTo().defaultContent();
					driver.switchTo().frame("MainFrame1");

					Thread.sleep(500);

					By Close = By.name("close_button");
					driver.findElement(Close).click();

					System.out.println(" Financial details will be saved ");

					Thread.sleep(300);

					String currentWindow6 = driver.getWindowHandle();
					Set<String> windows6 = driver.getWindowHandles();
					for (String window6 : windows6) {
						driver.switchTo().window(window6);

						if (driver.getTitle().contains("eHospital Information System")) {

							driver.switchTo().parentFrame();
							driver.switchTo().defaultContent();
							driver.switchTo().frame(2);
							driver.switchTo().frame("commontoolbarFrame");

							// Apply button

							Thread.sleep(300);
							By ApplyBTN = By.name("apply");
							driver.findElement(ApplyBTN).click();

//							String currentWindow7 = driver.getWindowHandle();
//							Set<String> windows7 = driver.getWindowHandles();
//							for (String window7 : windows7) {
//								driver.switchTo().window(window7);
//
//								if (driver.getTitle()
//										.contains("Admission Deposit")) {
//
//									Thread.sleep(500);
//									driver.switchTo().parentFrame();
//									driver.switchTo().defaultContent();
//									driver.switchTo().frame("details_frame");
//
//									By rec_type_search = By.name("rec_type");
//									driver.findElement(rec_type_search).click();
//
//									Thread.sleep(4000);
//									driver.switchTo().defaultContent();
//									driver.switchTo().frame(3);
//
//									By Add = By.name("add_bill_stlmt_button");
//									driver.findElement(Add).click();
//
//									Thread.sleep(1000);
//
//									String currentWindow8 = driver
//											.getWindowHandle();
//									Set<String> windows8 = driver
//											.getWindowHandles();
//									for (String window8 : windows8) {
//										driver.switchTo().window(window8);
//										System.out.println(driver.getTitle());
//										if (driver.getTitle().contains(
//												"Add Bill Settlements Details")) {
//
//											Thread.sleep(1000);
//
//											driver.switchTo().defaultContent();
//											driver.switchTo().frame(
//													"BillSlmtToolBarFrame");
//
//											By Accept = By
//													.name("accept_button");
//											driver.findElement(Accept).click();
//
//											Thread.sleep(1500);
//
//											driver.switchTo().window(window7);
//											driver.switchTo().parentFrame();
//											driver.switchTo().defaultContent();
//											driver.switchTo().frame(4);
//
//											By record_button = By
//													.name("cancel_button");
//											driver.findElement(record_button)
//													.click();
//
//											System.out.println(
//													"Operation Completed Successfully");

							Thread.sleep(3000);

							String currentWindow9 = driver.getWindowHandle();
							Set<String> windows9 = driver.getWindowHandles();
							for (String window9 : windows9) {
								driver.switchTo().window(window9);
								System.out.println(driver.getTitle());
								if (driver.getTitle().contains("Internal Reports")) {
									System.out.println(driver.getCurrentUrl());
									driver.close();

									Thread.sleep(1000);

								}
							}
						}
					}
				}
			}

		} catch (

		InterruptedException ex) {
			Logger.getLogger(CMO_Admit_Referrral_Patient.class.getName()).log(Level.SEVERE, null, ex);
		}

	}
}