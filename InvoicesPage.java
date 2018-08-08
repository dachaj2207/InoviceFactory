package Pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InvoicesPage extends PageObject {

	public InvoicesPage(WebDriver driver) {
	super(driver);
	}
		public static void sleep(int seconds) {
			int miliseconds = seconds * 1000;
			try {
				Thread.sleep(miliseconds);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	@FindBy(id = "home-page-user")
	WebElement userLogIn;
	@FindBy(id = "navbar-logout-btn")
	WebElement logoutButton;
	@FindBy(id = "navbar-logout")
	WebElement logout;
	@FindBy(id = "navbar-activities")
	WebElement activitiesLog;
	@FindBy(id = "filter-client")
	WebElement selectClient;
	@FindBy(id = "filter-from")
	WebElement fromField;
	@FindBy(id = "filter-to")
	WebElement toField;
	@FindBy(id = "filter-period")
	WebElement periodButton;
	@FindBy(id = "filter-reset")
	WebElement refreshButton;
	@FindBy(id = "this-month")
	WebElement thisMonthButton;
	@FindBy(id= "last-month")
	WebElement lastMonthButton;
	@FindBy(id = "reset-dates")
	WebElement resetDatesButton;
	@FindBy(id = "inv-status-btn-2018-MIR2")
	WebElement changeStatusButton;
	@FindBy(id = "add-new-invoice")
	WebElement addNewInvoice;
	@FindBy(id = "inv-status-dialog-no-2018-STA1")
	WebElement changeStatusNo;
	@FindBy(id = "\"#inv-status-dialog-yes-2018-JUI4 > div")
	WebElement changeStatusYes;
//	@FindBy(css ="#inv-status-dialog-yes-2018-JUI4 > div")
	//WebElement changedStatus;
	@FindBy(xpath = "//*[@id=\'app\']/div[3]/main/div/div/div[1]/div")
	WebElement ActivityLogPage;
	@FindBy(xpath = "//*[@id=\'app\']/div[15]")
	WebElement selectClientList;
	@FindBy (xpath = "//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/table/tbody/tr[2]/td[5]/button/div")
	WebElement calendarFrom15;
	@FindBy (xpath = "//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/table/tbody/tr[2]/td[5]/button/div")
	WebElement calendarTo15;
	@FindBy(id = "filter-from-ok")
	WebElement calendarOk;
	@FindBy(id = "filter-to-ok")
	WebElement calendarToOk;
	@FindBy( id = "filter-period")
	WebElement filterPeriodButton;
	@FindBy (xpath = "//*[@id=\'app\']/div[20]/main/div/div/div[2]/div/div[2]/div/div[5]/div/div[2]/div/div/div[1]/div/div/div/div[2]/div/i")
	WebElement arrowStatus;
	@FindBy( xpath = "//*[@id=\'app\']/div[12]/div/div/div[3]/a/div")
	WebElement selectStatus;
	@FindBy(id = "add-content-btn")
	WebElement addContent;
	@FindBy (id = "logut-yes")
	WebElement logoutYes;
	
	public void ActivityLog() {
		logout.click();
		activitiesLog.click();
		driver.navigate().back();
	}
	public void clientList() {
		selectClient.click();
	}
		public void fromButton() {
			fromField.click();
			sleep(3);
			calendarFrom15.click();
			sleep(2);
			calendarOk.click();
		}
		public void toButton() {
			toField.click();
			sleep(2);
			calendarTo15.click();
			calendarToOk.click();
			
		}
		public void filterPeriodButton() {
			periodButton.click();
			thisMonthButton.click();
		//	assertEquals("2018-08-31",toField());
			sleep(2);
			periodButton.click();
			lastMonthButton.click();
		//	assertEquals("2018-07-31",toField());
			sleep(2);
			periodButton.click();
			refreshButton.click();
			sleep(2);
		}
			public void statusButton() {
				changeStatusButton.click();
				arrowStatus.click();
				selectStatus.click();
				sleep (3);
				changeStatusYes.click();
				
				
				
				
				//changeStatusYes.click();
				
				
				
				
			}
public void logoutButton() {
	logout.click();
	logoutButton.click();
	logoutYes.click();
	
				
			
				
				
			}
	public void addNewInvoice() {
		addNewInvoice.click();
		
	}
		public String fromFieldText() {
			return calendarFrom15.getText();
		}
		public String toField() {
			return toField.getText();
		}

		public String toFieldText() {
			return calendarTo15.getText();
		}
			
			
		
		
	
	public boolean ActivityLogDisplayed() {
		return ActivityLogPage.isDisplayed();
}
	
	public boolean ClientListIsDisplayed() {
		return selectClientList.isDisplayed();

}
	public boolean addContentIsvisible() {
		return addContent.isDisplayed();
	}
}
	
