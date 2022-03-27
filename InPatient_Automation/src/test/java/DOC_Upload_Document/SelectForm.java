package DOC_Upload_Document;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectForm {
	public void select_form(WebDriver driver) {

		try {

			Thread.sleep(7000);

			// Click on Action
			By Action = By.xpath("//div[text()='Actions ']");
			driver.findElement(Action).click();

			Thread.sleep(10000);

			// Select Upload_Document
			By Upload_Document = By.xpath("//*[@id=\"popover-content\"]/div/p");
			driver.findElement(Upload_Document).click();

		} catch (InterruptedException ex) {
			Logger.getLogger(SelectForm.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
