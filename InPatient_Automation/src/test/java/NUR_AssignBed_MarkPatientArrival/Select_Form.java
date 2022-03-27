package NUR_AssignBed_MarkPatientArrival;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Select_Form {

	public void select_form(WebDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, 60);

		Set<String> windows = driver.getWindowHandles();

		Iterator<String> it = windows.iterator();
		String homePage = it.next();
		String systemEM = it.next();

		driver.switchTo().window(systemEM);

		driver.close();

		driver.switchTo().window(homePage);

		driver.get("http://10.209.1.5:7777/HIS/eCommon/jsp/eHIS.jsp");

//		int count = driver.findElements(By.tagName("frame")).size();
//		System.out.println("Count of select_form is  : " + count);

		driver.switchTo().frame(1);
		driver.switchTo().frame("menuFr");

		By Assign_Bed = By.id("sd2");
		driver.findElement(Assign_Bed).click();

	}
}