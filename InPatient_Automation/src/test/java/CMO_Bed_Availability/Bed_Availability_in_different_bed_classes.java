package CMO_Bed_Availability;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Bed_Availability_in_different_bed_classes {
	public void View_Bed_Availability(WebDriver driver) {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		try {

			WebElement Bed_Availability = driver.findElement(By.id("sd14"));
			Bed_Availability.click();

			System.out.println("we are at  ' Bed_Availability ' function");

			driver.switchTo().defaultContent();
			driver.switchTo().frame("content");
			driver.switchTo().frame("f_query_add_mod");
			driver.switchTo().frame("criteria0");

			By Nursing_Unit = By.name("nursing_unit");
			driver.findElement(Nursing_Unit).click();
			driver.findElement(Nursing_Unit).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Nursing_Unit).sendKeys(Keys.ENTER);

			By Specialty = By.name("Splcode");
			driver.findElement(Specialty).click();
			driver.findElement(Specialty).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Specialty).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Specialty).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Specialty).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Specialty).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Specialty).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Specialty).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Specialty).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Specialty).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Specialty).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Specialty).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Specialty).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Specialty).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Specialty).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Specialty).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Specialty).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Specialty).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Specialty).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Specialty).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Specialty).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Specialty).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Specialty).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Specialty).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Specialty).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Specialty).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Specialty).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Specialty).sendKeys(Keys.ENTER);

			By Bed_Class = By.name("Bedcode");
			driver.findElement(Bed_Class).click();
			driver.findElement(Bed_Class).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Bed_Class).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Bed_Class).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Bed_Class).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Bed_Class).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Bed_Class).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Bed_Class).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Bed_Class).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Bed_Class).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Bed_Class).sendKeys(Keys.ENTER);

			By Bed_Type = By.name("bed_type_code");
			driver.findElement(Bed_Type).click();
			driver.findElement(Bed_Type).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Bed_Type).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Bed_Type).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Bed_Type).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Bed_Type).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Bed_Type).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Bed_Type).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Bed_Type).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Bed_Type).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Bed_Type).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Bed_Type).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Bed_Type).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Bed_Type).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Bed_Type).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Bed_Type).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Bed_Type).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Bed_Type).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Bed_Type).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Bed_Type).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Bed_Type).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Bed_Type).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Bed_Type).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Bed_Type).sendKeys(Keys.TAB);

			By Bed_Classification = By.name("bed_classification");
			driver.findElement(Bed_Classification).click();
			driver.findElement(Bed_Classification).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Bed_Classification).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(Bed_Classification).sendKeys(Keys.TAB);

			By Bed_Status = By.name("search_by_beds");
			driver.findElement(Bed_Status).click();
			driver.findElement(Bed_Status).sendKeys(Keys.ARROW_UP);
			driver.findElement(Bed_Status).sendKeys(Keys.ARROW_UP);
			driver.findElement(Bed_Status).sendKeys(Keys.TAB);

			By Practitioner = By.name("pract_id_search");
			driver.findElement(Practitioner).click();

			String currentWindow = driver.getWindowHandle();
			Set<String> windows = driver.getWindowHandles();
			for (String window : windows) {
				driver.switchTo().window(window);
//			System.out.println(driver.getTitle());
			}
			if (driver.getTitle().contains("Practitioner")) {

				driver.switchTo().defaultContent();
				driver.switchTo().frame("close_frame");

				By close = By.name("close");
				driver.findElement(close).click();
			}

			driver.switchTo().window(currentWindow);

			Thread.sleep(500);

			driver.switchTo().frame(2);
			driver.switchTo().frame("f_query_add_mod");
			driver.switchTo().frame("criteria0");

			By Search_Button = By.name("search_butt");
			driver.findElement(Search_Button).click();

		} catch (InterruptedException ex) {
			Logger.getLogger(Bed_Availability_in_different_bed_classes.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
