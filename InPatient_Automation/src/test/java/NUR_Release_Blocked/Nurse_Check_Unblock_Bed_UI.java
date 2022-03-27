package NUR_Release_Blocked;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Nurse_Check_Unblock_Bed_UI {
	public void bed(WebDriver driver) {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		try {

			WebElement ReleaseBlockBedPage = driver.findElement(By.id("sd9"));
			ReleaseBlockBedPage.click();
			Thread.sleep(500);
			System.out.println("Nurse is Navigated to Release Blocked Bed Page Successfully");

			driver.switchTo().defaultContent();
			driver.switchTo().frame(2);
			driver.switchTo().frame("f_query_add_mod");
			driver.switchTo().frame("ReleaseBed_main");
			WebElement NursingUnit = driver.findElement(By.xpath("//table/tbody/tr/td"));
			System.out.println(NursingUnit.getText());
			WebElement NursingUnitTXT = driver.findElement(By.xpath("//table/tbody/tr/td[2]/input"));
			NursingUnitTXT.sendKeys("A2GS");
			System.out.println("Nursing Unit is Text Field. " + NursingUnitTXT.getAttribute("value"));
			Thread.sleep(1000);

			WebElement BedClassTXT = driver.findElement(By.xpath("//table/tbody/tr/td[3]"));
			System.out.println("Bed Class is Existing with Title: " + BedClassTXT.getText());

			WebElement BedClassField = driver.findElement(By.xpath("//table/tbody/tr/td[4]/input"));
			BedClassField.sendKeys("AR");

			WebElement BedClassBTN = driver.findElement(By.xpath("//table/tbody/tr/td[4]/input[2]"));
			BedClassBTN.click();
			Thread.sleep(500);

			WebElement BlockedThroughTXT = driver.findElement(By.xpath("//table/tbody/tr[2]/td"));
			System.out.println("Blocked Through is Existing with Title: " + BlockedThroughTXT.getText());

			WebElement BlockedThroughBTN = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]/select"));
			BlockedThroughBTN.click();
			BlockedThroughBTN.sendKeys(Keys.ARROW_DOWN);
			BlockedThroughBTN.sendKeys(Keys.TAB);

			WebElement BlockTypeTXT = driver.findElement(By.xpath("//table/tbody/tr[2]/td[3]"));
			System.out.println("Block Type is Existing with Title: " + BlockTypeTXT.getText());

			WebElement BlockTypeBTN = driver.findElement(By.xpath("//table/tbody/tr[2]/td[4]/select"));
			BlockTypeBTN.click();
			BlockTypeBTN.sendKeys(Keys.ARROW_DOWN);
			BlockTypeBTN.sendKeys(Keys.ARROW_DOWN);
			BlockTypeBTN.sendKeys(Keys.TAB);

			WebElement BlockedFromDateTXT = driver.findElement(By.xpath("//table/tbody/tr[3]/td"));
			System.out.println("Blocked From Date is Existing with Title: " + BlockedFromDateTXT.getText());

			WebElement FromDate = driver.findElement(By.xpath("//table/tbody/tr[3]/td[2]/input"));
			FromDate.sendKeys("30/12/2021");

			WebElement BlockedUntilDateTXT = driver.findElement(By.xpath("//table/tbody/tr[3]/td[3]"));
			System.out.println("Blocked To Date is Existing with Title: " + BlockedUntilDateTXT.getText());

			WebElement TODate = driver.findElement(By.xpath("//table/tbody/tr[3]/td[4]/input"));
			TODate.sendKeys("06/01/2022");

			WebElement IncludeTXT = driver.findElement(By.xpath("//table/tbody/tr[4]/td"));
			System.out.println("Include is Existing with Title: " + IncludeTXT.getText());

			WebElement IncludeLIST = driver.findElement(By.xpath("//table/tbody/tr[4]/td[2]/select"));
			IncludeLIST.click();
			IncludeLIST.sendKeys(Keys.ARROW_DOWN);
			IncludeLIST.sendKeys(Keys.TAB);

			WebElement SearchBTN = driver.findElement(By.xpath("//table/tbody/tr[4]/td[4]/input"));
			System.out.println("Search Button is existing with Title: " + SearchBTN.getAttribute("value"));
			Thread.sleep(1000);
			SearchBTN.click();
			org.openqa.selenium.Alert alert = driver.switchTo().alert();
			alert.accept();

			WebElement ClearBTN = driver.findElement(By.xpath("//table/tbody/tr[4]/td[4]/input[2]"));
			System.out.println("Clear Button is existing with Title: " + ClearBTN.getAttribute("value"));
			ClearBTN.click();

			driver.switchTo().parentFrame();
			driver.switchTo().defaultContent();
			driver.switchTo().frame("content");
			driver.switchTo().frame("commontoolbarFrame");

			WebElement ApplyBTN = driver
					.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td[1]/input"));
			System.out.println("Apply Button is Existing. " + ApplyBTN.getAttribute("value"));

			WebElement ResetBTN = driver
					.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td[2]/input"));
			System.out.println("Reset Button is Existing. " + ResetBTN.getAttribute("value"));
			ResetBTN.click();

			WebElement Menu = driver
					.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td[4]/input"));
			System.out.println("Menu Button is Existing. " + Menu.getAttribute("value"));
			Menu.click();

		} catch (

		InterruptedException ex) {
			Logger.getLogger(Nurse_Check_Unblock_Bed_UI.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}