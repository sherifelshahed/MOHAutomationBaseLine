package NUR_AssignBed_MarkPatientArrival;

import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Bed_Availability_Chart {
	public void assign_bed(WebDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, 60);
		try {

			org.openqa.selenium.Alert alert = driver.switchTo().alert();
			String alertMessage = driver.switchTo().alert().getText();
			System.out.println(alertMessage);

			alert.accept();

			String currentWindow = driver.getWindowHandle();
			Set<String> windows = driver.getWindowHandles();
			for (String window : windows) {
				driver.switchTo().window(window);
//				System.out.println(driver.getTitle());
			}
			if (driver.getTitle().contains("Bed Availability Chart")) {
//				System.out.println(driver.getCurrentUrl());

				driver.switchTo().frame(2);
				driver.switchTo().frame("f_query_add_mod");
				driver.switchTo().frame("criteria0");

				By Bed_Classification = By.name("bed_classification");
				driver.findElement(Bed_Classification).click();
				driver.findElement(Bed_Classification).sendKeys(Keys.ARROW_DOWN);
				driver.findElement(Bed_Classification).sendKeys(Keys.ARROW_DOWN);
				driver.findElement(Bed_Classification).sendKeys(Keys.TAB);

				By Search_Button = By.name("search_butt");
				driver.findElement(Search_Button).click();

				driver.switchTo().defaultContent();
				driver.switchTo().frame("result");

				Thread.sleep(1000);

				By BedNo = By.xpath("//input[@class = 'IP_GreenButton']");
				driver.findElement(BedNo).click();
				driver.findElement(BedNo).click();
//				driver.switchTo().window(currentWindow);
			}

		} catch (InterruptedException ex) {
			Logger.getLogger(Bed_Availability_Chart.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}