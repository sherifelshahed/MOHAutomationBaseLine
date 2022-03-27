package Outpatient_Refer_to_Admission;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class test {

	public void login_Edge(WebDriver driver) {
	
		  driver.navigate().to("https://10.107.169.194/%22");

//	 Login to HP Web
		  driver.findElement(By.xpath("/html/body/main/div/div/div/div/div[2]/form/div[3]/a")).click();

	        By test1 = By.id("select2-ServiceTypeId-container");
	        driver.findElement(test1).click();

	        Actions action = new Actions(driver);
	        WebElement edit = driver.findElement(By.id("select2-ServiceTypeId-result-rkrf-1"));
	        action.click();
	}

}
