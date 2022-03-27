package PCY_Cancel_Request;

import static org.testng.Assert.assertTrue;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cancel_request {

	public void cancel(WebDriver driver) throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		By ST_Transactions = By.id("jd37");
		driver.findElement(ST_Transactions).click();

		Thread.sleep(500);

		By Issue = By.id("jd43");
		driver.findElement(Issue).click();

		Thread.sleep(500);

		By cancelReq = By.id("sd46");
		driver.findElement(cancelReq).click();

		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		driver.switchTo().frame("content");
		driver.switchTo().frame("commontoolbarFrame");

		WebElement QueryBTN = driver.findElement(By.name("query"));
		QueryBTN.click();

		driver.switchTo().defaultContent();
		driver.switchTo().frame("content");
		driver.switchTo().frame("f_query_add_mod");
		driver.switchTo().frame("CancelRequestQueryHeaderFrame");

		WebElement Req_By_Store = driver.findElement(By.name("request_by_store"));
		Req_By_Store.click();
		Req_By_Store.sendKeys(Keys.ARROW_DOWN);
		Req_By_Store.sendKeys(Keys.TAB);

		WebElement Req_On_Store = driver.findElement(By.name("request_on_store"));
		Req_On_Store.click();
		Req_On_Store.sendKeys(Keys.ARROW_DOWN);
		Req_On_Store.sendKeys(Keys.TAB);

		WebElement searchBTN = driver.findElement(By.name("search"));
		searchBTN.click();
		Thread.sleep(1000);

		driver.switchTo().defaultContent();
		driver.switchTo().frame("content");
		driver.switchTo().frame("f_query_add_mod");
		driver.switchTo().frame("CancelRequestQueryResultFrame");

		WebElement cancel_checkBox = driver.findElement(By.name("doc_0"));
		cancel_checkBox.click();

		WebElement Remarks = driver.findElement(By.name("img_0"));
		Remarks.click();

		String currentWindow = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		for (String window : windows) {
			driver.switchTo().window(window);
//			System.out.println(driver.getTitle());

			if (driver.getTitle().contains("Cancellation Remarks")) {
				System.out.println(driver.getCurrentUrl());

				WebElement text = driver.findElement(By.name("remarks"));
				text.sendKeys("D");

				WebElement searchicon = driver.findElement(By.name("remark"));
				searchicon.click();

				WebElement close = driver.findElement(By.name("close"));
				close.click();
			}
		}

		driver.switchTo().window(currentWindow);
		Thread.sleep(1000);

		driver.switchTo().defaultContent();
		driver.switchTo().frame("content");
		driver.switchTo().frame("commontoolbarFrame");

		WebElement ApplyBTN = driver.findElement(By.name("apply"));
		ApplyBTN.click();

		Thread.sleep(500);

		String currentWindow1 = driver.getWindowHandle();
		Set<String> windows1 = driver.getWindowHandles();
		for (String window1 : windows1) {
			driver.switchTo().window(window1);
//			System.out.println(driver.getTitle());
		}
		if (driver.getTitle().contains("Confirm Cancel")) {
//			System.out.println(driver.getCurrentUrl());

			WebElement YesBTN = driver.findElement(By.name("yes"));
			YesBTN.click();
		}

		String currentWindow2 = driver.getWindowHandle();
		Set<String> windows2 = driver.getWindowHandles();
		for (String window2 : windows2) {
			driver.switchTo().window(window2);
			System.out.println(driver.getTitle());

			if (driver.getTitle().contains("Confirm Printing")) {
				System.out.println(driver.getCurrentUrl());
				System.out.println("test");
				WebElement NoBTN = driver.findElement(By.name("no"));
				NoBTN.click();

//				Thread.sleep(6000);
			}
		}
		Thread.sleep(4000);

		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("content");
		driver.switchTo().frame("messageFrame");
		WebElement Message = driver.findElement(By.xpath("/html/body/p"));
		System.out.println(Message.getText());
		assertTrue(Message.getText().contains("Operation Completed Successfully"));

		Thread.sleep(2000);

	}
}