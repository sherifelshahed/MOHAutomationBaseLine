package CMO_Admit_Patient;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CMO_Admit_and_Register_Patient {

	public String PatientIDvalue;

	public String admit_patient(WebDriver driver) {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {

			By Admit_Patient = By.id("sd1");
			driver.findElement(Admit_Patient).click();

			driver.switchTo().parentFrame();
			driver.switchTo().defaultContent();
			driver.switchTo().frame(2);
			driver.switchTo().frame("f_query_add_mod");

			driver.switchTo().frame("Select_frame");

			System.out.println(driver.getTitle());

			By PatientIDsearch = By.name("patient_id_search");
			driver.findElement(PatientIDsearch).click();

			String currentWindow = driver.getWindowHandle();
			Set<String> windows = driver.getWindowHandles();
			for (String window : windows) {
				driver.switchTo().window(window);

				if (driver.getTitle().contains("Search Patient")) {

					driver.switchTo().defaultContent();
					driver.switchTo().frame("Pat_Search_Criteria_Frame");

					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

					Thread.sleep(500);
					
					By Patient_ID2 = By.name("Patient_Id");
					driver.findElement(Patient_ID2).sendKeys("757");

					driver.switchTo().defaultContent();
					driver.switchTo().frame("Pat_Search_Toolbar_Frame");

					By Search = By.name("Search");
					driver.findElement(Search).click();

					By Rregister_Patient = By.name("register");
					driver.findElement(Rregister_Patient).click();
					Thread.sleep(1000);

					String currentWindow1 = driver.getWindowHandle();
					Set<String> windows1 = driver.getWindowHandles();
					for (String window1 : windows1) {
						driver.switchTo().window(window1);
						System.out.println(driver.getTitle());

						if (driver.getTitle().contains("Register Patient")) {
							Thread.sleep(1000);
							driver.switchTo().defaultContent();
							driver.switchTo().frame(1);
							driver.switchTo().frame("patient_sub");

							By Patient_Series = By.name("pat_ser_grp_code");
							driver.findElement(Patient_Series).click();
							driver.findElement(Patient_Series).sendKeys(Keys.ARROW_DOWN);
							driver.findElement(Patient_Series).sendKeys(Keys.ENTER);

							By First_Name = By.name("first_name");
							driver.findElement(First_Name).sendKeys("test");

							By Family_Name = By.name("family_name");
							driver.findElement(Family_Name).sendKeys("degital_blx");

							By First_Name_الاسم_الاول = By.name("first_name_oth_lang");
							driver.findElement(First_Name_الاسم_الاول).sendKeys("اختبار");

							By Family_Nameاسم_العائلة = By.name("family_name_oth_lang");
							driver.findElement(Family_Nameاسم_العائلة).sendKeys("ديجتال بلوكس");

							By Gender = By.name("sex");
							driver.findElement(Gender).click();
							driver.findElement(Gender).sendKeys(Keys.ARROW_DOWN);
							driver.findElement(Gender).sendKeys(Keys.ARROW_DOWN);
							driver.findElement(Gender).sendKeys(Keys.ENTER);

							By Birth_Date = By.name("date_of_birth");
							driver.findElement(Birth_Date).sendKeys("20/04/1990");

							driver.switchTo().defaultContent();
							driver.switchTo().frame(1);
							driver.switchTo().frame("patient_main");

							Thread.sleep(50);

							By Financial_Details = By.id("findtl_tabspan");
							driver.findElement(Financial_Details).click();
							
							Thread.sleep(2000);
							
							String currentWindow2 = driver.getWindowHandle();
							Set<String> windows2 = driver.getWindowHandles();
							for (String window2 : windows2) {
								driver.switchTo().window(window2);
								System.out.println(driver.getTitle());

								if (driver.getTitle().contains("Financial Details")) {
									driver.switchTo().defaultContent();
									driver.switchTo().frame("MainFrame1");

									Thread.sleep(10000);

									By Primary_Billing_Group = By.name("billing_group_desc");
									driver.findElement(Primary_Billing_Group)
											.sendKeys("Cash Patient(Cash)" + Keys.ENTER);

									By Billing_search = By.name("blnggrpbut");
									driver.findElement(Billing_search).click();

									Thread.sleep(3000);

									By Family_Annual_Income = By.name("annual_income");
									driver.findElement(Family_Annual_Income).sendKeys("Test");

									By Responsible_for_Payment = By.name("resp_for_payment");
									driver.findElement(Responsible_for_Payment).sendKeys("Patient & Payer");

									By No_of_Dependants = By.name("no_of_dependants");
									driver.findElement(No_of_Dependants).sendKeys("70");

									By Relationship = By.name("pat_reln_with_resp_person");
									driver.findElement(Relationship).sendKeys("EMPLOYEE");

									By Relationship_search = By.name("patrelbut");
									driver.findElement(Relationship_search).click();

									Thread.sleep(2000);

									By Close_Button = By.name("close_button");
									driver.findElement(Close_Button).click();

									System.out.println(" Financial details will be saved ");

									Thread.sleep(50);

									String currentWindow3 = driver.getWindowHandle();
									Set<String> windows3 = driver.getWindowHandles();
									for (String window3 : windows3) {
										driver.switchTo().window(window3);
										System.out.println(driver.getTitle());

										if (driver.getTitle().contains("Register Patient")) {

											driver.switchTo().defaultContent();
											driver.switchTo().frame("commontoolbarFrame");

											Thread.sleep(2500);
											By Apply_button = By.name("apply");
											driver.findElement(Apply_button).click();

											Thread.sleep(2000);

											String currentWindow4 = driver.getWindowHandle();
											Set<String> windows4 = driver.getWindowHandles();
											for (String window4 : windows4) {
												driver.switchTo().window(window4);

												if (driver.getTitle().contains("eHospital Information System")) {

													driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

													Thread.sleep(1000);

													driver.switchTo().defaultContent();
													driver.switchTo().frame("content");
													driver.switchTo().frame("f_query_add_mod");
													driver.switchTo().frame("Select_frame");

													By click = By.name("booking_ref_no");
													driver.findElement(click).click();
													driver.findElement(click).click();

													Thread.sleep(1000);

													WebElement PatientID = driver.findElement(By.name("patient_id"));
													PatientIDvalue = PatientID.getAttribute("value");
													System.out.println("Patient ID : " + PatientIDvalue);

													Thread.sleep(5000);

													By Admission_For = By.name("admission_for");
													driver.findElement(Admission_For).click();
													driver.findElement(Admission_For).sendKeys(Keys.TAB);

													System.out.println("The yellow bar will be displayed to the user");

													driver.switchTo().defaultContent();
													driver.switchTo().frame(2);
													driver.switchTo().frame("f_query_add_mod");
													driver.switchTo().frame("Main_frame");

													By Specialty = By.name("SplDesc");
													driver.findElement(Specialty)
															.sendKeys("Gen Surg Splty" + Keys.ENTER);

													By Nursing_Unit = By.name("nursing_unit_desc");
													driver.findElement(Nursing_Unit)
															.sendKeys("Chemotherapy unit" + Keys.ENTER);

													Thread.sleep(300);

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
													driver.findElement(Admitting_Practitioner)
															.sendKeys("Doctor El Zohour Inpatient 01" + Keys.ENTER);

													By click2 = By.name("expecteddischargedate");
													driver.findElement(click2).click();

													Thread.sleep(3000);

													driver.switchTo().parentFrame();
													driver.switchTo().defaultContent();
													driver.switchTo().frame(2);
													driver.switchTo().frame("commontoolbarFrame");

													// Apply button

													By Apply = By.name("apply");
													driver.findElement(Apply).click();

													Thread.sleep(3000);

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

															Thread.sleep(500);

															String currentWindow6 = driver.getWindowHandle();
															Set<String> windows6 = driver.getWindowHandles();
															for (String window6 : windows6) {
																driver.switchTo().window(window6);

																if (driver.getTitle()
																		.contains("eHospital Information System")) {

																	driver.switchTo().parentFrame();
																	driver.switchTo().defaultContent();
																	driver.switchTo().frame(2);
																	driver.switchTo().frame("commontoolbarFrame");

																	// Apply button
																	Thread.sleep(300);
																	By ApplyBTN = By.name("apply");
																	driver.findElement(ApplyBTN).click();

//																	String currentWindow7 = driver.getWindowHandle();
//																	Set<String> windows7 = driver.getWindowHandles();
//																	for (String window7 : windows7) {
//																		driver.switchTo().window(window7);
//
//																		if (driver.getTitle()
//																				.contains("Admission Deposit")) {
//
//																			Thread.sleep(500);
//																			driver.switchTo().parentFrame();
//																			driver.switchTo().defaultContent();
//																			driver.switchTo().frame("details_frame");
//
//																			By rec_type_search = By.name("rec_type");
//																			driver.findElement(rec_type_search).click();
//
//																			Thread.sleep(4000);
//																			driver.switchTo().defaultContent();
//																			driver.switchTo().frame(3);
//
//																			By Add = By.name("add_bill_stlmt_button");
//																			driver.findElement(Add).click();
//
//																			Thread.sleep(1000);
//
//																			String currentWindow8 = driver
//																					.getWindowHandle();
//																			Set<String> windows8 = driver
//																					.getWindowHandles();
//																			for (String window8 : windows8) {
//																				driver.switchTo().window(window8);
//																				System.out.println(driver.getTitle());
//																				if (driver.getTitle().contains(
//																						"Add Bill Settlements Details")) {
//
//																					Thread.sleep(1000);
//
//																					driver.switchTo().defaultContent();
//																					driver.switchTo().frame(
//																							"BillSlmtToolBarFrame");
//
//																					By Accept = By
//																							.name("accept_button");
//																					driver.findElement(Accept).click();
//
//																					Thread.sleep(1500);
//
//																					driver.switchTo().window(window7);
//																					driver.switchTo().parentFrame();
//																					driver.switchTo().defaultContent();
//																					driver.switchTo().frame(4);
//
//																					By record_button = By
//																							.name("cancel_button");
//																					driver.findElement(record_button)
//																							.click();
//
//																					System.out.println(
//																							"Operation Completed Successfully");

																	Thread.sleep(3000);

																	String currentWindow9 = driver.getWindowHandle();
																	Set<String> windows9 = driver.getWindowHandles();
																	for (String window9 : windows9) {
																		driver.switchTo().window(window9);
																		System.out.println(driver.getTitle());
																		if (driver.getTitle()
																				.contains("Internal Reports")) {
																			System.out.println(driver.getCurrentUrl());
																			driver.close();

																			Thread.sleep(1000);

																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}

		} catch (

		InterruptedException ex) {
			Logger.getLogger(CMO_Admit_and_Register_Patient.class.getName()).log(Level.SEVERE, null, ex);
		}
		return PatientIDvalue;

	}

}
