package PCY_Issues_Return_Across_Facilities;

import static org.testng.Assert.assertTrue;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pharmacist_Issues_Return_Across_Facilities {

	public void issue_return(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		try {

			// openIssueReturn

			Thread.sleep(500);
			WebElement DispenseMed = driver.findElement(By.id("jd37"));
			DispenseMed.click();

			Thread.sleep(500);

			WebElement Issue = driver.findElement(By.id("jd43"));
			Issue.click();

			Thread.sleep(500);

			WebElement Issue_return = driver.findElement(By.id("sd49"));
			Issue_return.click();

			Thread.sleep(2000);

			// IssueReturn

			driver.switchTo().defaultContent();
			driver.switchTo().frame("content");
			driver.switchTo().frame("commontoolbarFrame");

			WebElement CRTBTN = driver.findElement(By.name("create"));
			CRTBTN.click();
			Thread.sleep(1000);

			String currentWindow = driver.getWindowHandle();
			Set<String> windows1 = driver.getWindowHandles();
			for (String window1 : windows1) {
				driver.switchTo().window(window1);
				if (driver.getTitle().contains("Modify Document Details")) {
					System.out.println(driver.getCurrentUrl());

					WebElement ToStore = driver.findElement(By.name("to_store_code"));
					ToStore.click();
					ToStore.sendKeys(Keys.ARROW_DOWN);
					ToStore.sendKeys(Keys.TAB);

					WebElement OKBTN = driver.findElement(By.name("record"));
					OKBTN.click();

					driver.switchTo().window(currentWindow);
					driver.switchTo().defaultContent();
					driver.switchTo().frame("content");
					driver.switchTo().frame("f_query_add_mod");

					driver.switchTo().frame("frameIssueReturnList");
					driver.switchTo().frame("frameIssueReturnListHeader");

					WebElement ItemTXT = driver.findElement(By.name("item_desc"));
					ItemTXT.sendKeys("RIFAMPIN 300MG HARD GELATIN CAPSULES");
					WebElement ItemBTN = driver.findElement(By.name("item_search"));
					ItemBTN.click();

					WebElement ItemQTY = driver.findElement(By.name("item_qty"));
					ItemQTY.sendKeys("5");

					Thread.sleep(1000);

					WebElement AddBTN = driver.findElement(By.name("apply"));
					AddBTN.click();
					Thread.sleep(2000);

					driver.switchTo().defaultContent();
					driver.switchTo().frame("content");
					driver.switchTo().frame("f_query_add_mod");
					driver.switchTo().frame("frameIssueReturnDetail");

					WebElement HyperBTN = driver.findElement(By.name("a_0"));
					HyperBTN.click();

					driver.switchTo().defaultContent();
					driver.switchTo().frame("content");
					driver.switchTo().frame("commontoolbarFrame");

					WebElement ApplyBn1x = driver.findElement(By.name("apply"));
					ApplyBn1x.click();
					Thread.sleep(1000);

					String currentWindowxu = driver.getWindowHandle();
					Set<String> windows1xu = driver.getWindowHandles();
					for (String window1xu : windows1xu) {
						driver.switchTo().window(window1xu);
						if (driver.getTitle().contains("Confirm Finalize")) {
							System.out.println(driver.getCurrentUrl());

							WebElement YesBTN = driver.findElement(By.name("yes"));
							YesBTN.click();
							Thread.sleep(5000);
							driver.switchTo().window(currentWindowxu);

							Set<String> windows1xy = driver.getWindowHandles();
							for (String window1xy : windows1xy) {
								Thread.sleep(1000);
								driver.switchTo().window(window1xy);
								if (driver.getTitle().contains("Confirm Printing")) {
									System.out.println(driver.getCurrentUrl());

									WebElement NoBTN = driver.findElement(By.name("no"));
									NoBTN.click();
									Thread.sleep(2000);

									driver.switchTo().window(currentWindowxu);
									driver.switchTo().parentFrame();
									driver.switchTo().defaultContent();
									driver.switchTo().frame("content");
									driver.switchTo().frame("messageFrame");
									WebElement Messagex = driver.findElement(By.xpath("/html/body/p"));
									System.out.println(Messagex.getText());
									assertTrue(Messagex.getText().contains("Operation Completed Successfully"));

								}
							}
						}

					}
				}
			}

			driver.switchTo().defaultContent();
			driver.switchTo().frame("content");
			driver.switchTo().frame("commontoolbarFrame");

			WebElement MenuBTNn = driver.findElement(By.name("home"));
			MenuBTNn.click();
			Thread.sleep(1000);

			driver.switchTo().defaultContent();
			driver.switchTo().frame(1);
			driver.switchTo().frame("menuFr");

			Thread.sleep(1000);
			WebElement Acknowledge = driver.findElement(By.id("jd68"));
			Acknowledge.click();
			Thread.sleep(500);
			WebElement AcknowledgeBTN = driver.findElement(By.id("sd69"));
			AcknowledgeBTN.click();

			Thread.sleep(2000);

			driver.switchTo().defaultContent();
			driver.switchTo().frame("content");
			driver.switchTo().frame("commontoolbarFrame");

			WebElement CreateBn = driver.findElement(By.name("create"));
			CreateBn.click();

			driver.switchTo().defaultContent();
			driver.switchTo().frame("content");
			driver.switchTo().frame("f_query_add_mod");
			driver.switchTo().frame("frameAcknowledgeHeader");

			WebElement TRN_Type = driver.findElement(By.name("trn_type"));
			TRN_Type.click();
			TRN_Type.sendKeys(Keys.ARROW_DOWN);
			TRN_Type.sendKeys(Keys.ARROW_DOWN);
			TRN_Type.sendKeys(Keys.TAB);

			WebElement Store = driver.findElement(By.name("store_code"));
			Store.click();
			Store.sendKeys(Keys.ARROW_DOWN);
			Store.sendKeys(Keys.ARROW_DOWN);
			Store.sendKeys(Keys.TAB);

			WebElement DocType = driver.findElement(By.name("doc_type_code"));
			DocType.click();
			DocType.sendKeys(Keys.ARROW_DOWN);
			DocType.sendKeys(Keys.ARROW_DOWN);
			DocType.sendKeys(Keys.ARROW_DOWN);
			DocType.sendKeys(Keys.ARROW_DOWN);
			DocType.sendKeys(Keys.ARROW_DOWN);
			DocType.sendKeys(Keys.ARROW_DOWN);
			DocType.sendKeys(Keys.ARROW_DOWN);
			DocType.sendKeys(Keys.TAB);

			WebElement SrchBTN = driver.findElement(By.name("search"));
			SrchBTN.click();

			driver.switchTo().defaultContent();
			driver.switchTo().frame("content");
			driver.switchTo().frame("f_query_add_mod");
			driver.switchTo().frame("frameAcknowledgeDetail");

			WebElement DOCNOhyp = driver.findElement(By.xpath("//table/tbody/tr[2]/td/font"));
			DOCNOhyp.click();

			driver.switchTo().defaultContent();
			driver.switchTo().frame("content");
			driver.switchTo().frame("f_query_add_mod");
			driver.switchTo().frame("frameAcknowledgeList");

			WebElement SavBTN = driver.findElement(By.name("save"));
			SavBTN.click();

			driver.switchTo().defaultContent();
			driver.switchTo().frame("content");
			driver.switchTo().frame("commontoolbarFrame");

			WebElement ApplyBn1 = driver.findElement(By.name("apply"));
			ApplyBn1.click();

			driver.switchTo().parentFrame();
			driver.switchTo().defaultContent();
			driver.switchTo().frame("content");
			driver.switchTo().frame("messageFrame");
			WebElement Message = driver.findElement(By.xpath("/html/body/p"));
			System.out.println(Message.getText());
			assertTrue(Message.getText().contains("Operation Completed Successfully"));

		} catch (InterruptedException ex) {
			Logger.getLogger(Pharmacist_Issues_Return_Across_Facilities.class.getName()).log(Level.SEVERE, null, ex);
		}

	}
}
