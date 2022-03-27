package NUR_AssignBed_MarkPatientArrival;

import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assign_Bed_Mark_Patient_Arrival2 {
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

				By Attending_Practitioner = By.name("pract_id_search");
				driver.findElement(Attending_Practitioner).click();
			}

		} catch (InterruptedException ex) {
			Logger.getLogger(Assign_Bed_Mark_Patient_Arrival2.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}