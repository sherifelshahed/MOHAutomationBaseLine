package NUR_Release_Blocked;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Nurse_Release_Blocked_Bed {
	public void bed(WebDriver driver) {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		try {

			WebElement Release_bed_btn = driver.findElement(By.id("sd9"));
			Release_bed_btn.click();

//			    driver.switchTo().defaultContent();
//			    driver.switchTo().frame(2);
//			    driver.switchTo().frame("f_query_add_mod");
//			    WebElement NursingUnit = driver.findElement(By.name("nursing_unit_desc"));
//			    System.out.println(NursingUnit.getText());
//			    WebElement NursingUnitTXT = driver.findElement(By.name("nursing_unit_desc"));
//			    NursingUnitTXT.sendKeys("A2GS");
//			    System.out.println("Nursing Unit is Text Field. "+NursingUnitTXT.getAttribute("value"));
//			    Thread.sleep(5000);

			driver.switchTo().defaultContent();
			driver.switchTo().frame(2);
			driver.switchTo().frame("f_query_add_mod");
			driver.switchTo().frame("ReleaseBed_main");

			WebElement search = driver.findElement(By.name("search"));
			search.click();

			Thread.sleep(100);

			// ReleaseBedDetail_Form

			driver.switchTo().defaultContent();
			driver.switchTo().frame(2);
			driver.switchTo().frame("f_query_add_mod");
			driver.switchTo().frame("ReleaseBed_details");

			WebElement checkbx = driver.findElement(By.name("select_1"));
			checkbx.click();

			driver.switchTo().parentFrame();
			driver.switchTo().defaultContent();
			driver.switchTo().frame("content");
			driver.switchTo().frame("commontoolbarFrame");
			System.out.println(driver.getPageSource());

			WebElement apply = driver.findElement(By.name("apply"));
			apply.click();

		} catch (

		InterruptedException ex) {
			Logger.getLogger(Nurse_Release_Blocked_Bed.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}