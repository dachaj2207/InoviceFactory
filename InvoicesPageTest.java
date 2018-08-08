package Tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Pages.InvoicesPage;
  


public class InvoicesPageTest extends Browser {
	public static void sleep(int seconds) {
		int miliseconds = seconds * 1000;
		try {
			Thread.sleep(miliseconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
	
	
	InvoicesPage invoices;
	
	@Test(priority = 10)
	public void testActivityLog() {
		invoices = new InvoicesPage(driver);
		invoices.ActivityLog();
		assertTrue(invoices.ActivityLogDisplayed());
		driver.navigate().back();
		
		
		
				
		
		
	}
@Test(priority = 11)
public void clientButton() {
	invoices = new InvoicesPage(driver);
	invoices.clientList();
	//assertTrue(invoices.ClientListIsDisplayed());
	driver.navigate().refresh();
	
}
	@Test(priority = 12)
	public void fromField() {
		invoices = new InvoicesPage(driver);
		invoices.fromButton();
		sleep(3);
		
		
	//	assertEquals("2018-08-09",invoices.fromFieldText());
		//driver.close();
	}
	@Test(priority = 13)
	public void toField() {
		invoices = new InvoicesPage(driver);
		invoices.toButton();
		sleep(3);
	//	assertEquals("2018-08-09",invoices.toFieldText());
	
	}
	@Test(priority = 14)
	public void filterPeriodButton() {
		invoices = new InvoicesPage(driver);
		invoices.filterPeriodButton();
		
		
	}
	
	//@Test(priority = 15)
	//public void changeStatus() {
		//invoices = new InvoicesPage(driver);
		//invoices.statusButton();
		
		
		//sleep(4);
		
	//}
	@Test(priority = 16)
	public void addNewInv() {
		invoices = new InvoicesPage(driver);
				invoices.addNewInvoice();
		assertTrue(invoices.addContentIsvisible());
	}
	@Test(priority = 17)
	public void logout() {
		invoices = new InvoicesPage(driver);
		invoices.logoutButton();
		driver.getCurrentUrl().indexOf("http://app.invoice-factory.source-code.rs/login");
		
	}
	
}
