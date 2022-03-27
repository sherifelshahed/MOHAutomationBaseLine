package NUR_AssignBed_MarkPatientArrival;

import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assign_Bed_Mark_Patient_Arrival1 {
	public void assign_bed(WebDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, 60);
		try {

			String currentWindow = driver.getWindowHandle();
			Set<String> windows = driver.getWindowHandles();
			for (String window : windows) {
				driver.switchTo().window(window);
//				System.out.println(driver.getTitle());
			}
			if (driver.getTitle().contains("Assign Bed / Mark Patient Arrival")) {
//				System.out.println(driver.getCurrentUrl());

				driver.switchTo().defaultContent();
				driver.switchTo().frame("message");

				Thread.sleep(1000);

				By Bed_No = By.name("bed_avail_chart");
				driver.findElement(Bed_No).click();

				By BedNumberTXT = By.xpath("//table/tbody/tr[2]/td[4]/input[2]");
				Thread.sleep(500);
				driver.findElement(BedNumberTXT).click();
			}

//			org.openqa.selenium.Alert alert = driver.switchTo().alert();
//			String alertMessage = driver.switchTo().alert().getText();
//			System.out.println(alertMessage);
//
//			alert.accept();
//			
//			By Body = By.id("b");
//			driver.findElement(Body).sendKeys(Keys.ENTER);

		} catch (InterruptedException ex) {
			Logger.getLogger(Assign_Bed_Mark_Patient_Arrival1.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}