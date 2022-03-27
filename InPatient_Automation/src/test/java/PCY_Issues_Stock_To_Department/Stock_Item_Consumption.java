package PCY_Issues_Stock_To_Department;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Stock_Item_Consumption {

	public void stock_item(WebDriver driver) {

		try {

			WebElement ST_Transactions = driver.findElement(By.id("jd37"));
			ST_Transactions.click();

			WebElement issues = driver.findElement(By.id("jd43"));
			issues.click();

			WebElement stockitem_consumption = driver.findElement(By.id("sd50"));
			stockitem_consumption.click();

			driver.switchTo().parentFrame();
			driver.switchTo().defaultContent();
			driver.switchTo().frame("content");
			driver.switchTo().frame("commontoolbarFrame");
			WebElement create = driver.findElement(By.name("create"));
			create.click();

			String Current_window = driver.getWindowHandle();
			for (String WindowID : driver.getWindowHandles()) {
				String Title = driver.switchTo().window(WindowID).getTitle();
				if (Title.equals("Modify Document Details")) {

					WebElement doctype = driver.findElement(By.name("doc_type_code"));
					// doctype.click();
					doctype.sendKeys(Keys.ARROW_DOWN);
					WebElement OK = driver.findElement(By.name("record"));
					OK.click();

				}

			}
			driver.switchTo().window(Current_window);
			driver.switchTo().defaultContent();
			driver.switchTo().frame(2);
			driver.switchTo().frame("f_query_add_mod");
			driver.switchTo().frame("frameStockItemConsumptionHeader");

			WebElement remarkbtn = driver.findElement(By.name("remark"));
			remarkbtn.click();
			Thread.sleep(500);
			String Current_window1 = driver.getWindowHandle();
			for (String WindowIDo : driver.getWindowHandles()) {
				String Title1 = driver.switchTo().window(WindowIDo).getTitle();
				if (Title1.equals("Remarks")) {
					driver.switchTo().parentFrame();
					// driver.switchTo().defaultContent();
					// driver.switchTo().frame(2);
					// driver.switchTo().frame("f_query_add_mod");
					driver.switchTo().frame("lookup_head");
//		        	    WebElement search = driver.findElement(By.name("search_criteria"));
//		        	    search.click();
//		        	    search.sendKeys(Keys.ARROW_DOWN);
//		        	    search.sendKeys(Keys.ARROW_DOWN); 
//		        	    WebElement searchtxt = driver.findElement(By.name("search_text"));
//		        	    searchtxt.sendKeys("default");
					WebElement searchbtn = driver.findElement(By.name("Search"));
					searchbtn.click();

					driver.switchTo().parentFrame();
					driver.switchTo().defaultContent();
					driver.switchTo().frame("lookup_detail");

					WebElement Encounter_ID_hyperlink = driver.findElement(By.xpath("//table[2]/tbody/tr[2]/td[1]"));
					System.out.println(Encounter_ID_hyperlink.getText());
					Encounter_ID_hyperlink.click();
					driver.switchTo().window(Current_window1);
				}

			}
			driver.switchTo().defaultContent();

			driver.switchTo().frame("content");
			driver.switchTo().frame("f_query_add_mod");
			driver.switchTo().frame("frameStockItemConsumptionList");
			driver.switchTo().frame("frameStockItemConsumptionListHeader");
			WebElement item_search = driver.findElement(By.name("item_desc"));
			item_search.sendKeys("200-00546");
			WebElement itemdsc = driver.findElement(By.name("item_search"));
			itemdsc.click();
			Thread.sleep(700);
			WebElement item_qty = driver.findElement(By.name("item_qty"));
			item_qty.sendKeys("1");
			WebElement addbtn = driver.findElement(By.name("apply"));
			addbtn.click();

			driver.switchTo().defaultContent();
			driver.switchTo().frame("content");
			driver.switchTo().frame("f_query_add_mod");
			driver.switchTo().frame("frameStockItemConsumptionDetail");

			WebElement hyperlink = driver.findElement(By.name("a_0"));
			hyperlink.click();

			driver.switchTo().defaultContent();
			driver.switchTo().frame("content");
			driver.switchTo().frame("commontoolbarFrame");

			WebElement applybtn = driver.findElement(By.name("apply"));
			applybtn.click();

			driver.switchTo().parentFrame();
			driver.switchTo().defaultContent();
			driver.switchTo().frame("content");
			driver.switchTo().frame("messageFrame");
			WebElement SuccessMSG = driver.findElement(By.xpath("/html/body/p"));
			if (SuccessMSG.isDisplayed()) {
				System.out.println(SuccessMSG.getText());
			}

//		                assertTrue(SuccessMSG.getText().contains("Operation Completed Successfully"));

//		    	
//			    String currentWindow = driver.getWindowHandle();
//			       Set<String> windows1 = driver.getWindowHandles();
//				    
//			    for (String window1 : windows1) {
//				    	driver.switchTo().window(window1);
//				    	System.out.println(driver.getTitle());
//				    	//System.out.println(driver.getCurrentUrl());
			//
//			    if (driver.getTitle().contains("Modify Document Details")); 
//			    {
//			    	System.out.println(driver.getCurrentUrl());
//			    	System.out.println(driver.getTitle());
//			    	WebElement doctype = driver.findElement(By.name("doc_type_code"));
//			    	doctype.click();
//			    	doctype.sendKeys(Keys.ARROW_DOWN);
//			    }
//			    }

		} catch (

		InterruptedException ex) {
			Logger.getLogger(Stock_Item_Consumption.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}