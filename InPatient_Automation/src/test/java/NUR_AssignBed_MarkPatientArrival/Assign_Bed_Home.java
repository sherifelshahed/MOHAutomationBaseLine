package NUR_AssignBed_MarkPatientArrival;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assign_Bed_Home {
	public void assign_bed(WebDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, 60);
		try {

			driver.switchTo().parentFrame();
			driver.switchTo().defaultContent();

//			List<WebElement> f = driver.findElements(By.tagName("frame"));
//			System.out.println("Total number " + f.size());

			driver.switchTo().frame(2);
			driver.switchTo().frame("f_query_add_mod");

			By Patient_Id = By.name("patient_id");
			driver.findElement(Patient_Id).sendKeys("E500000041");

			By Search_Button = By.name("search");
			driver.findElement(Search_Button).click();
			Thread.sleep(1000);

			driver.switchTo().defaultContent();

			driver.switchTo().frame(2);
			driver.switchTo().frame("f_query_add_mod1");

			Thread.sleep(1500);
			By Encounter_ID_Heiperlink = By.partialLinkText("100");
			driver.findElement(Encounter_ID_Heiperlink).click();

		} catch (InterruptedException ex) {
			Logger.getLogger(Assign_Bed_Home.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}