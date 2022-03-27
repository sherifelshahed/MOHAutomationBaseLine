package PCY_Scrappes_Medicine;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pharmacist_Scrappes_Medicine {

	public void scrappes_medicine(WebDriver driver) throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement PH_Transactions = driver.findElement(By.linkText("PH Transactions"));
		PH_Transactions.click();
		WebElement incident_reports = driver.findElement(By.id("sd106"));
		incident_reports.click();

		driver.switchTo().defaultContent();
		driver.switchTo().frame("content");
		driver.switchTo().frame("commontoolbarFrame");
		WebElement createBtn = driver.findElement(By.name("create"));
		createBtn.click();

		driver.switchTo().defaultContent();
		driver.switchTo().frame("content");
		driver.switchTo().frame("f_query_add_mod");

		WebElement in_remarks_textarea = driver.findElement(By.name("incident_desc"));
		in_remarks_textarea.sendKeys("here we are");

		WebElement locationType = driver.findElement(By.name("locn_type"));
		locationType.click();
		locationType.sendKeys(Keys.ARROW_DOWN);
		locationType.sendKeys(Keys.TAB);

		WebElement nursingUnit = driver.findElement(By.name("location"));
		nursingUnit.sendKeys("Dental");
		WebElement nursingUnitLookup = driver.findElement(By.name("location_desc"));
		nursingUnitLookup.click();

		String Current_window = driver.getWindowHandle();
		for (String WindowID : driver.getWindowHandles()) {
			String Title = driver.switchTo().window(WindowID).getTitle();
			if (Title.equals("Location")) {
				// System.out.println(driver.getCurrentUrl());
				driver.switchTo().frame("lookup_detail");
				WebElement nurse_unit_hyperlink = driver.findElement(By.xpath("//td[contains(.,'DN1')]"));
				nurse_unit_hyperlink.click();
			}
		}
		driver.switchTo().window(Current_window);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("content");
		driver.switchTo().frame("f_query_add_mod");

		WebElement CauseofSpill = driver.findElement(By.name("spill"));
		CauseofSpill.click();
		CauseofSpill.sendKeys(Keys.ARROW_DOWN);
		CauseofSpill.sendKeys(Keys.TAB);

		WebElement Dosage = driver.findElement(By.name("dosage_drug"));
		Dosage.click();
		Dosage.sendKeys(Keys.ARROW_DOWN);
		Dosage.sendKeys(Keys.TAB);

		WebElement VolumeTxt = driver.findElement(By.name("volume"));
		VolumeTxt.sendKeys("1");
		WebElement WeightTxt = driver.findElement(By.name("weight"));
		WeightTxt.sendKeys("2");

		String Current1 = driver.getWindowHandle();
		WebElement drug_name_lookup = driver.findElement(By.name("drug_desc"));
		drug_name_lookup.click();
		for (String WindowID : driver.getWindowHandles()) {
			String Title = driver.switchTo().window(WindowID).getTitle();
			// System.out.println(driver.getTitle());
			if (Title.equals("Drug Search")) {
				// System.out.println(driver.getCurrentUrl());
				driver.switchTo().frame("lookup_header");
				WebElement drugTxt1 = driver.findElement(By.name("searchText"));
				drugTxt1.sendKeys("PARACETAMOL 500MG TABLET");
				WebElement searchbtn = driver.findElement(By.name("btnCriteriaSearch"));
				searchbtn.click();
				driver.switchTo().defaultContent();
				driver.switchTo().frame("lookup_footer");
				WebElement drug_hyperlink = driver.findElement(By.id("drug_name1"));
				drug_hyperlink.click();
			}

		}
		driver.switchTo().window(Current1);
		driver.switchTo().frame("content");
		driver.switchTo().frame("commontoolbarFrame");
		WebElement applyBtn = driver.findElement(By.name("apply"));
		String Current2 = driver.getWindowHandle();
		applyBtn.click();

		driver.switchTo().alert();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

		driver.switchTo().window(Current2);
		driver.switchTo().frame("content");
		driver.switchTo().frame("messageFrame");
		WebElement msg = driver.findElement(By.xpath("/html/body/p"));
		System.out.println(msg.getText());
		if (msg.getText().contains("Operation Completed Successfully....")) {
			System.out.println("the Medication is Scrapped successfully");
		}
	}
}