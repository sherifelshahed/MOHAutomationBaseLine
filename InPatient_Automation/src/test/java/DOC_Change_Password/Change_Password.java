package DOC_Change_Password;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Change_Password {

	public void Change_Edge(WebDriver driver) {

		try {

			Thread.sleep(15000);

			// User_Profile
			By User_Profile_icon = By.xpath("//*[@id=\"user-profile-icon\"]/div/div");
			driver.findElement(User_Profile_icon).click();

			Thread.sleep(2000);

			By My_Profile = By.xpath("//*[@id=\"user-profile-actions\"]/div[2]/div[2]/p");
			driver.findElement(My_Profile).click();

			Thread.sleep(2000);

			// select Change password
			By Change_password = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-crm-leads/app-crm-header/app-profile/div/div[2]/div/div[2]/div[1]/div[2]/div/p");
			driver.findElement(Change_password).click();

			Thread.sleep(2000);

			By Enter_old_password = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-crm-leads/app-crm-header/app-profile/div/div[2]/div/div[2]/div[2]/div/div/div/div/div[2]/div[1]/input");
			driver.findElement(Enter_old_password).sendKeys("egy123");

			Thread.sleep(2000);

			By Enter_new_password = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-crm-leads/app-crm-header/app-profile/div/div[2]/div/div[2]/div[2]/div/div/div/div/div[2]/div[2]/input");
			driver.findElement(Enter_new_password).sendKeys("egy456");

			Thread.sleep(2000);

			By Reenter_password = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-crm-leads/app-crm-header/app-profile/div/div[2]/div/div[2]/div[2]/div/div/div/div/div[2]/div[3]/input");
			driver.findElement(Reenter_password).sendKeys("egy456");

			Thread.sleep(2000);

			// Update icon
			By Update_icon = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-crm-leads/app-crm-header/app-profile/div/div[2]/div/div[2]/div[2]/div/div/div/div/div[2]/div[4]");
			driver.findElement(Update_icon).click();

			Thread.sleep(2000);

			// Close icon
			By Close_icon = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-crm-leads/app-crm-header/app-profile/div/div[2]/div/div[1]/div/img");
			driver.findElement(Close_icon).click();

		} catch (InterruptedException ex) {
			Logger.getLogger(Change_Password.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

}
