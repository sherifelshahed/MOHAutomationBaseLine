package NUR_AssignBed_MarkPatientArrival;

import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practitioner {
	public void assign_bed(WebDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, 60);
		try {

			String currentWindow = driver.getWindowHandle();
			Set<String> windows = driver.getWindowHandles();
			for (String window : windows) {
				driver.switchTo().window(window);
//				System.out.println(driver.getTitle());
			}
			if (driver.getTitle().contains("Practitioner")) {
//			System.out.println(driver.getCurrentUrl());
				driver.switchTo().defaultContent();
				driver.switchTo().frame("result_frame");

				Thread.sleep(1000);

				By Practitioner_Name = By.partialLinkText("Doctor El Zohour Inpatient 01");
				driver.findElement(Practitioner_Name).click();
			}

		} catch (InterruptedException ex) {
			Logger.getLogger(Practitioner.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}