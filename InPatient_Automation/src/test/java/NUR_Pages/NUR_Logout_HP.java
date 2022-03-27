package NUR_Pages;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NUR_Logout_HP {

	public void logout_Edge(WebDriver driver) {

		try {

			Thread.sleep(4000);

			// Logout to HP Web
			By User_Profile_icon = By.xpath("//*[@id=\"user-profile-icon\"]/div/div");
			driver.findElement(User_Profile_icon).click();

			Thread.sleep(2000);

			By logout_button = By.xpath("//*[@id=\"user-profile-actions\"]/div[2]/div[3]");
			driver.findElement(logout_button).click();

		} catch (InterruptedException ex) {
			Logger.getLogger(NUR_Logout_HP.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

}
