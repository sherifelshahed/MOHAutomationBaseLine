package NUR_Block_Bed;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Nurse_Check_Block_Bed_UI {
	public void bed(WebDriver driver) {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		try {

			WebElement Block_Bed = driver.findElement(By.id("sd7"));
			Block_Bed.click();
			Thread.sleep(500);
			System.out.println("Nurse is Navigated to Block Bed Page Successfully");

			driver.switchTo().defaultContent();
			driver.switchTo().frame(2);
			driver.switchTo().frame("f_query_add_mod");
			WebElement NursingUnit = driver.findElement(By.xpath("//table/tbody/tr[2]/td"));
			System.out.println("Nursing Unit is existing with Title: " + NursingUnit.getText());
			WebElement NursingUnitTXT = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]/input"));
			NursingUnitTXT.sendKeys("A2GS");
			System.out.println("Nursing Unit is Text Field. " + NursingUnitTXT.getAttribute("value"));
			Thread.sleep(1000);

			WebElement BedNumber = driver.findElement(By.xpath("//table/tbody/tr[2]/td[3]"));
			System.out.println(BedNumber.getText());
			Thread.sleep(900);

			WebElement BedNumberTXTF = driver.findElement(By.xpath("//table/tbody/tr[2]/td[4]/input"));
			WebElement BedNumberTXT = driver.findElement(By.xpath("//table/tbody/tr[2]/td[4]/input[2]"));
			Thread.sleep(500);
			BedNumberTXT.click();
			Thread.sleep(500);
			BedNumberTXT.click();

			String currentWindow = driver.getWindowHandle();
			Set<String> windows1 = driver.getWindowHandles();
			for (String window1 : windows1) {
				driver.switchTo().window(window1);
				if (driver.getTitle().contains("Bed Availability Chart")) {
					System.out.println(driver.getCurrentUrl());
					driver.switchTo().parentFrame();
					driver.switchTo().defaultContent();
					driver.switchTo().frame("result");

					Thread.sleep(2000);
					WebElement BedNo = driver.findElement(By.xpath("//input[@class = 'IP_GreenButton']"));
					BedNo.click();
					System.out.println(BedNo.getText());
					BedNo.click();
					Thread.sleep(2000);
					driver.switchTo().window(currentWindow);
					driver.switchTo().defaultContent();
					driver.switchTo().frame(2);
					driver.switchTo().frame("f_query_add_mod");
				}
			}

			System.out.println("Bed Number is Text Field. " + BedNumberTXTF.getAttribute("value"));
			WebElement BedClass = driver.findElement(By.xpath("//table/tbody/tr[3]/td[1]"));
			WebElement BedClassR = driver.findElement(By.xpath("//table/tbody/tr[3]/td[2]"));
			System.out.println("Bed Class field is existing with title: " + BedClass.getText() + " With Type: "
					+ BedClassR.getText());

			WebElement RoomNO = driver.findElement(By.xpath("//table/tbody/tr[3]/td[3]"));
			WebElement RoomNOR = driver.findElement(By.xpath("//table/tbody/tr[3]/td[4]"));
			System.out.println("Room number field is existing with title: " + RoomNO.getText() + " With Room number: "
					+ RoomNOR.getText());
			RoomNO.click();

			WebElement ReasonForBlocking = driver.findElement(By.xpath("//table/tbody/tr[6]/td[1]"));
			System.out.println("Reason for Blocking list is existing with title: " + ReasonForBlocking.getText());

			WebElement Reason = driver.findElement(By.xpath("//table/tbody/tr[6]/td[2]/select"));
			Reason.click();
			Reason.sendKeys(Keys.ARROW_DOWN);
			Reason.sendKeys(Keys.ARROW_DOWN);
			Reason.sendKeys(Keys.ARROW_DOWN);
			Reason.sendKeys(Keys.TAB);

			WebElement OverRide = driver.findElement(By.xpath("//table/tbody/tr[7]/td[1]"));
			System.out.println("OverRide field is existing with title: " + OverRide.getText());

			WebElement Remarks = driver.findElement(By.xpath("//table/tbody/tr[8]/td[1]"));
			System.out.println("Remarks field is existing with title: " + Remarks.getText());

			WebElement RemarksTXT = driver.findElement(By.xpath("//table/tbody/tr[8]/td[2]/input"));
			RemarksTXT.sendKeys("ATEST");

			WebElement FromDate = driver.findElement(By.xpath("//table/tbody/tr[9]/td[1]"));
			System.out.println("From Date field is existing with title: " + FromDate.getText());

			WebElement FromDateTXT = driver.findElement(By.xpath("//table/tbody/tr[9]/td[2]/input"));
			FromDateTXT.sendKeys("19/12/2022 19:40");
			FromDateTXT.sendKeys(Keys.TAB);

			WebElement UntilDate = driver.findElement(By.xpath("//table/tbody/tr[9]/td[3]"));
			System.out.println("Until Date field is existing with title: " + UntilDate.getText());

			WebElement UntilDateTXT = driver.findElement(By.xpath("//table/tbody/tr[9]/td[4]/input"));
			UntilDateTXT.sendKeys(Keys.TAB);

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
			Logger.getLogger(Nurse_Check_Block_Bed_UI.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}