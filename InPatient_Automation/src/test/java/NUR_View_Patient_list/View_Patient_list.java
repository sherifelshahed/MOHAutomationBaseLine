package NUR_View_Patient_list;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class View_Patient_list {
	public void list(WebDriver driver) {

		JavascriptExecutor java = (JavascriptExecutor) driver;
		java.executeScript("scroll(0,1500)");

		System.out.println("Nurse view Patient list successfully");
	}
}
