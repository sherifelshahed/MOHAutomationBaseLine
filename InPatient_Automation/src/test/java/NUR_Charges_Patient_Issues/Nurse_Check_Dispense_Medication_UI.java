package NUR_Charges_Patient_Issues;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Nurse_Check_Dispense_Medication_UI {

	public void Medication(WebDriver driver) {

		try {

			WebElement Charges_Patient_Issue = driver.findElement(By.id("sd13"));
			Charges_Patient_Issue.click();

			Thread.sleep(500);
			System.out.println("Nurse is Navigated to Charges / Patient Issue Page Successfully");

			driver.switchTo().defaultContent();
			// driver.switchTo().frame(1);
			driver.switchTo().frame("content");
			driver.switchTo().frame("commontoolbarFrame");
			WebElement createBtn = driver.findElement(By.name("create"));
			if (createBtn.isEnabled()) {
				System.out.println("Create button is exiting and enabled");
			}
			WebElement QueryBtn = driver.findElement(By.name("query"));
			if (QueryBtn.isEnabled()) {
				System.out.println("Query button is exiting and enabled");
			}
			WebElement DeleteBtn = driver.findElement(By.xpath("//input[@value='Delete']"));
			if (DeleteBtn.isEnabled()) {
				System.out.println("Delete button is exiting and enabled");
			}

			WebElement ApplyBtn = driver.findElement(By.name("apply"));
			if (ApplyBtn.isEnabled()) {
				System.out.println("Apply button is exiting and enabled");
			}

			WebElement ResetBtn = driver.findElement(By.name("reset"));
			if (ResetBtn.isEnabled()) {
				System.out.println("Reset button is exiting and enabled");
			}
			WebElement MenuBtn = driver.findElement(By.name("home"));
			if (MenuBtn.isEnabled()) {
				System.out.println("Menu button is exiting and enabled");
			}
			createBtn.click();
			driver.switchTo().defaultContent();
			driver.switchTo().frame(2);
			driver.switchTo().frame("f_query_add_mod");
			driver.switchTo().frame("frameSalesList");
			driver.switchTo().frame("frameSalesListHeader");
			WebElement editBtn = driver.findElement(By.name("edit"));
			
			if (editBtn.isEnabled()) {
				System.out.println("Edit button is exiting and enabled");
			}
			WebElement CancelBtn = driver.findElement(By.name("Cancel"));
			if (CancelBtn.isEnabled()) {
				System.out.println("Cancel button is exiting and enabled");
			}
			WebElement AddBtn = driver.findElement(By.xpath("//input[@value='Add']"));
			if (AddBtn.isEnabled()) {
				System.out.println("Add button is exiting and enabled");
			}
			WebElement batchsearchBtn = driver.findElement(By.name("batchsearch"));
			if (batchsearchBtn.isEnabled()) {
				System.out.println("Batch search button is exiting and enabled");
			}

		} catch (InterruptedException ex) {
			Logger.getLogger(Nurse_Check_Dispense_Medication_UI.class.getName()).log(Level.SEVERE, null, ex);
		}

	}
}
