package NUR_Ward_Occupancy;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Check_Ward_Occupancy {
	public void View_Ward_Occupancy(WebDriver driver) {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Navigating to Ward Occupancy
		WebElement Ward_occupancy = driver.findElement(By.id("sd6"));
		Ward_occupancy.click();

		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		// driver.switchTo().frame(2);
		driver.switchTo().frame("content");
		driver.switchTo().frame("criteria");

		WebElement search = driver.findElement(By.name("search"));
		search.click();
		if (search.isEnabled()) {
			System.out.println("search button is enabled and functional");
		}
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		// driver.switchTo().frame(2);
		driver.switchTo().frame("content");
		driver.switchTo().frame("result");
		WebElement result = driver.findElement(By.xpath("//table/tbody/tr[2]/td"));

		if (result.isDisplayed()) {
			System.out.println("results are displayed");
		}

	}
}
