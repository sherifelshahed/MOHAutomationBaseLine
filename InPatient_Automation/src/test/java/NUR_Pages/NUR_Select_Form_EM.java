package NUR_Pages;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;

public class NUR_Select_Form_EM {

	public void select_form(WebDriver driver) {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

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