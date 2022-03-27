package PCY_Create_Review_Request;

import static org.testng.Assert.assertTrue;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Create_Review_request {

	public void create_review(WebDriver driver) throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		By ST_Transactions = By.id("jd37");
		driver.findElement(ST_Transactions).click();

		By Issue = By.id("jd43");
		driver.findElement(Issue).click();

		Thread.sleep(50);

		By Create_ReviewReq = By.id("sd45");
		driver.findElement(Create_ReviewReq).click();

		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		driver.switchTo().frame("content");
		driver.switchTo().frame("commontoolbarFrame");

		WebElement CreateBTN = driver.findElement(By.name("create"));
		CreateBTN.click();

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
				driver.switchTo().frame("RequestDetailFrame");

				WebElement ItemTXT = driver.findElement(By.name("item_desc"));
				ItemTXT.sendKeys("200-00546");
				WebElement ItemBTN = driver.findElement(By.xpath("//table/tbody/tr/td/input[3]"));
				ItemBTN.click();
				Thread.sleep(1000);

				WebElement REQQty = driver.findElement(By.name("req_uom_qty"));
				REQQty.sendKeys("5");

				WebElement ADDBTN = driver.findElement(By.name("add"));
				ADDBTN.click();
				Thread.sleep(1000);

				driver.switchTo().defaultContent();
				driver.switchTo().frame("content");
				driver.switchTo().frame("commontoolbarFrame");

				WebElement ApplyBTN = driver.findElement(By.name("apply"));
				ApplyBTN.click();
				Thread.sleep(1000);

				String currentWindowz = driver.getWindowHandle();
				Set<String> windows1z = driver.getWindowHandles();
				for (String window1z : windows1z) {
					driver.switchTo().window(window1z);
					if (driver.getTitle().contains("Current Pending Request")) {
						System.out.println(driver.getCurrentUrl());

						WebElement continueBTN = driver.findElement(By.name("continue"));
						continueBTN.click();

//						Thread.sleep(500);

						Thread.sleep(3000);

						String currentWindowx = driver.getWindowHandle();
						Set<String> windows1x = driver.getWindowHandles();
						for (String window1x : windows1x) {
							driver.switchTo().window(window1x);
							if (driver.getTitle().contains("Confirm Authorize")) {
								System.out.println(driver.getCurrentUrl());

								WebElement YesBTN = driver.findElement(By.name("yes"));
								YesBTN.click();

								Thread.sleep(2000);
								Set<String> windows1xy = driver.getWindowHandles();
								for (String window1xy : windows1xy) {
									driver.switchTo().window(window1xy);
									if (driver.getTitle().contains("Confirm Printing")) {
										System.out.println(driver.getCurrentUrl());

										WebElement NoBTN = driver.findElement(By.name("no"));
										NoBTN.click();
										Thread.sleep(2000);

										driver.switchTo().window(currentWindowx);
										driver.switchTo().parentFrame();
										driver.switchTo().defaultContent();
										driver.switchTo().frame("content");
										driver.switchTo().frame("messageFrame");

										WebElement Message = driver.findElement(By.xpath("/html/body/p"));
										System.out.println(Message.getText());
										assertTrue(Message.getText().contains("Operation Completed Successfully"));

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