package Rad_Technician_Orders;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Register_Rad_Order {

	public void register(WebDriver driver, String Patient_ID) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {

			Thread.sleep(500);

			driver.switchTo().defaultContent();
			driver.switchTo().frame("content");
			driver.switchTo().frame("menuFrame");

			By Register_Order = By.id("sobj1");
			driver.findElement(Register_Order).click();

			driver.switchTo().parentFrame();
			driver.switchTo().defaultContent();
			driver.switchTo().frame("content");
			driver.switchTo().frame("workAreaFrame");
			driver.switchTo().frame("RegisterOrderSearch");

			By Order_Category = By.name("ord_cat");
			driver.findElement(Order_Category).click();
			driver.findElement(Order_Category).sendKeys(Keys.ARROW_UP);
			driver.findElement(Order_Category).sendKeys(Keys.TAB);

			By Patient_IDText = By.name("patientId");
			driver.findElement(Patient_IDText).sendKeys(Patient_ID);

			By search_btn = By.name("search_btn");
			driver.findElement(search_btn).click();

			driver.switchTo().defaultContent();
			driver.switchTo().frame("content");
			driver.switchTo().frame("workAreaFrame");
			driver.switchTo().frame("RegisterOrderResult");

			By checkBox = By.name("chk0");
			driver.findElement(checkBox).click();

			driver.switchTo().defaultContent();
			driver.switchTo().frame("content");
			driver.switchTo().frame("workAreaFrame");
			driver.switchTo().frame("RegisterOrderBtn");

			By RegisterBTN = By.name("register");
			driver.findElement(RegisterBTN).click();

			driver.switchTo().parentFrame();
			driver.switchTo().defaultContent();
			driver.switchTo().frame("content");
			driver.switchTo().frame("messageFrame");
			WebElement Message = driver.findElement(By.xpath("/html/body/p"));
			System.out.println(Message.getText());
			assertTrue(Message.getText().contains("Operation Completed Successfully"));

		} catch (InterruptedException ex) {
			Logger.getLogger(Register_Rad_Order.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}