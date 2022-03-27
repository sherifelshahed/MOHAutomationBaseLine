package PCY_Pages;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Login_EM_Inventory_Management {

	public void login(WebDriver driver) {

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		By username = By.name("name");
		driver.findElement(username).sendKeys("PCYIPD01");

		By password = By.name("password");
		driver.findElement(password).sendKeys("egy123");

		By loginButton = By.id("loginID");
		driver.findElement(loginButton).click();

		By Responsibility = By.xpath("//table/tbody/tr[2]/td/table/tbody/tr[4]/td/span/div/input");
		driver.findElement(Responsibility).click();
		driver.findElement(Responsibility).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(Responsibility).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(Responsibility).sendKeys(Keys.ENTER);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String homePage = it.next();
		String systemEM = it.next();

		driver.switchTo().window(systemEM);
		driver.close();
		driver.switchTo().window(homePage);
		driver.get("http://10.209.1.5:7777/HIS/eCommon/jsp/eHIS.jsp");

		driver.switchTo().frame(1);
		driver.switchTo().frame("menuFr");

	}
}
