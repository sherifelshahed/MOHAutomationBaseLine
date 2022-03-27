package PCY_Return_Medication;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Accept_Return_Medication {
	public void Medication(WebDriver driver, String Patient_ID) {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		try {

			WebElement PH_Transactions = driver.findElement(By.linkText("PH Transactions"));
			PH_Transactions.click();
			WebElement ward_return = driver.findElement(By.linkText("Ward Return"));
			ward_return.click();

			driver.switchTo().defaultContent();
			driver.switchTo().frame("content");
			driver.switchTo().frame("f_query_criteria");
			driver.switchTo().frame("wardretmedicationqueryframe");

			WebElement patientID = driver.findElement(By.name("Patient_Id"));
			patientID.sendKeys(Patient_ID);

			WebElement searchBtn = driver.findElement(By.name("Search"));
			searchBtn.click();

			driver.switchTo().defaultContent();
			driver.switchTo().frame("content");
			driver.switchTo().frame("f_query_criteria");
			driver.switchTo().frame("wardretmedicationdrugframe");
			WebElement drugCheckBox = driver.findElement(By.name("DrugSelect"));
			drugCheckBox.click();

			driver.switchTo().defaultContent();
			driver.switchTo().frame("content");
			driver.switchTo().frame("f_query_criteria");
			driver.switchTo().frame("wardretmedicationremarksframe");

			WebElement ReasonForReturn = driver.findElement(By.name("ReturnRemarks"));
			ReasonForReturn.click();
			ReasonForReturn.sendKeys(Keys.ARROW_DOWN);
			ReasonForReturn.sendKeys(Keys.ENTER);

			WebElement ProceedBtn = driver.findElement(By.name("proceed"));
			ProceedBtn.click();

			driver.switchTo().defaultContent();
			driver.switchTo().frame("content");
			driver.switchTo().frame("f_query_criteria");
			driver.switchTo().frame("wardretmedicationactionframe");

			WebElement ReturnQntty = driver.findElement(By.name("actualReturn1"));
			ReturnQntty.sendKeys("1");

			driver.switchTo().defaultContent();
			driver.switchTo().frame("content");
			driver.switchTo().frame("f_query_criteria");
			driver.switchTo().frame("wardretmedicationbuttonframe");

			WebElement ReturnBtn = driver.findElement(By.name("Return"));
			ReturnBtn.click();

			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().dismiss();

			driver.switchTo().defaultContent();
			driver.switchTo().frame("content");
			driver.switchTo().frame("messageFrame");
			WebElement successMsg = driver.findElement(By.xpath("html/body/p"));
			System.out.println(successMsg.getText());

			driver.navigate().refresh();
			driver.switchTo().frame(1);
			driver.switchTo().frame("menuFr");

			WebElement PH_Transactions2 = driver.findElement(By.linkText("PH Transactions"));
			PH_Transactions2.click();

			WebElement return_medication = driver.findElement(By.linkText("Return Medication"));
			return_medication.click();

			String CurrentWindow = driver.getWindowHandle();
			for (String WindowID : driver.getWindowHandles()) {
				String Title = driver.switchTo().window(WindowID).getTitle();
				System.out.println(Title);
				if (Title.equals("Return Medication Login")) {

					System.out.println(driver.getCurrentUrl());
					WebElement pass = driver.findElement(By.name("password"));
					pass.sendKeys("egy123");

					WebElement DispenseStage = driver.findElement(By.name("Patient_Category"));
					DispenseStage.click();
					DispenseStage.sendKeys(Keys.ARROW_DOWN);
					DispenseStage.sendKeys(Keys.TAB);

					WebElement LocationOptions = driver.findElement(By.name("disp_locn"));
					LocationOptions.click();
					LocationOptions.sendKeys(Keys.ARROW_DOWN);
					LocationOptions.sendKeys(Keys.TAB);
					WebElement OkBtn = driver.findElement(By.xpath("//input[@value='OK']"));
					OkBtn.click();
				}
			}
			driver.switchTo().window(CurrentWindow);
			driver.switchTo().frame("content");
			driver.switchTo().frame("f_query_add_mod");
			driver.switchTo().frame("retmedicationqueryframe");
			Thread.sleep(5000);

			WebElement RMpatientID = driver.findElement(By.name("Patient_Id"));
			RMpatientID.sendKeys(Patient_ID);
			WebElement RMsearchBtn = driver.findElement(By.name("Search1"));
			RMsearchBtn.click();

			driver.switchTo().defaultContent();
			driver.switchTo().frame("content");
			driver.switchTo().frame("f_query_add_mod");
			driver.switchTo().frame("retmedicationactionframe");
			WebElement drugCheckBox1 = driver.findElement(By.name("check_name1"));
			drugCheckBox1.click();
			WebElement Allo_Qntty = driver.findElement(By.name("AcceptedQty1"));
			Allo_Qntty.sendKeys("1");

			driver.switchTo().defaultContent();
			driver.switchTo().frame("content");
			driver.switchTo().frame("f_query_add_mod");
			driver.switchTo().frame("retmedicationbuttonframe");
			WebElement ReturnBTN = driver.findElement(By.name("Return"));
			ReturnBTN.click();

			driver.switchTo().alert();
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();

			driver.switchTo().defaultContent();
			driver.switchTo().frame("content");
			driver.switchTo().frame("messageFrame");
			WebElement successMsg1 = driver.findElement(By.xpath("html/body/p"));
			System.out.println(successMsg1.getText());

			Thread.sleep(3000);

		} catch (InterruptedException ex) {
			Logger.getLogger(Accept_Return_Medication.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}