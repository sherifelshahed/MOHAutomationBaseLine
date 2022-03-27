package NUR_AssignBed_MarkPatientArrival;

import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assign_Bed_Mark_Patient_Arrival3 {
	public void assign_bed(WebDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, 60);
		try {

			Thread.sleep(1000);
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

//				Thread.sleep(1000);

//				By Record = By.name("record");
//				driver.findElement(Record).click();
			}

			Thread.sleep(2000);

			driver.switchTo().defaultContent();
			driver.switchTo().frame("content");
			driver.switchTo().frame("messageFrame");
			WebElement msg = driver.findElement(By.xpath("/html/body/p"));
			System.out.println(msg.getText());

			if (msg.getText().contains("Operation Completed Successfully.")) {
				System.out.println("the test is passed Patient Consumables are recoreded successfully");
			}

		} catch (InterruptedException ex) {
			Logger.getLogger(Assign_Bed_Mark_Patient_Arrival3.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}