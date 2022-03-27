package NUR_Newborn_Registration_For_Patient;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Nurse_Newborn_Registration_for_inpatient_UI {

	public void newborn_registration(WebDriver driver) {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		try {

			WebElement Newborn_Registration_for_inpatient = driver.findElement(By.id("sd22"));
			Newborn_Registration_for_inpatient.click();

			Thread.sleep(500);

			System.out.println("Nurse is Navigated to Newborn Registration for inpatient Page Successfully");

		} catch (InterruptedException ex) {
			Logger.getLogger(Nurse_Newborn_Registration_for_inpatient_UI.class.getName()).log(Level.SEVERE, null, ex);
		}

	}
}
