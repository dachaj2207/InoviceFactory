package Tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pages.LoginPage;



public class LoginPagetTest extends Browser {
	public static void sleep(int seconds) {
		int miliseconds = seconds * 1000;
		try {
			Thread.sleep(miliseconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
	
	
  

   String url = "http://app.invoice-factory.source-code.rs/login";
   String goodEmail = "dachaj2207@gmail.com";
   String goodPassword = "qwe123";
   String smallPassword = "qwe12";
   String bigPassword = "3fdfewr24332233242rfdsf3434255";
   String capsEmail = "DACHAJ2207@GMAIL.COM";
   String spaceEmail = "  dachaj2207@gmail.com";
   String wrongMail = "dasdnnkjsanfnja@gmail.com";
		   
	
	
	LoginPage logIn;
		

@Test (priority = 0)
public void emptyInputs(){
	logIn = new LoginPage(driver);
	
	driver.get(url); 
	
	logIn.signIn();
    assertTrue(logIn.wrongMail());
		
	}
@Test(priority = 1)
public void wrongMail() {
	logIn = new LoginPage(driver);
	driver.get(url);
	logIn.signInInputs(wrongMail, "");
	logIn.signIn();
	assertTrue(logIn.wrongPass());
	
}
@Test(priority = 2)
public void onlyPass() {
	logIn = new LoginPage(driver);
	driver.get(url);
	logIn.signInInputs("", goodPassword);
	logIn.signIn();
	assertTrue(logIn.wrongMail());
}
@Test(priority = 3)
public void wrongMailGoodPass() {
	logIn = new LoginPage(driver);
	driver.get(url);
	logIn.signInInputs(wrongMail, goodPassword);
	sleep(4);
//	assertTrue(logIn.isInvalidCredentialsDisplayed());
	}
//@Test(priority = 4)
//public void CapsLock() {
	//logIn = new LoginPage(driver);
	//driver.get(url);
	//logIn.signInInputs(capsEmail,goodPassword );
	//logIn.signIn();
	//sleep(3);
	//assertTrue(logIn.getUsername());
	//driver.get(url);
	
	
	
	
//}
	
@Test(priority = 5)
public void lowB(){
	logIn = new LoginPage(driver);
	driver.get(url);
	logIn.signInInputs(goodEmail, smallPassword);
	assertTrue(!logIn.isLowBisDisplayed());
	
}
@Test(priority = 6)
public void longB() {
	logIn = new LoginPage(driver);
	driver.get(url);
	logIn.signInInputs(goodEmail, bigPassword);
	assertTrue(!logIn.isLongBisDisplayed());
	}
@Test(priority = 7)
public void emailWithSpace() {
	logIn = new LoginPage(driver);
	driver.get(url);
	logIn.signInInputs(spaceEmail, goodPassword);
	assertTrue(logIn.validEmailError());
}
@Test(priority = 8)
public void isVisibilityButtonTogglesPass() {
	logIn = new LoginPage(driver);
	driver.get(url);
    
    String prevType = logIn.password.getAttribute("type");
    logIn.geteye().click();;
    String nextType = logIn.password.getAttribute("type");
    
    assertNotEquals(prevType, nextType);
}
@Test(priority = 9)
public void goodInputs() {
	logIn = new LoginPage(driver);
	driver.get(url);
	logIn.signInInputs(goodEmail, goodPassword);
	logIn.signIn();
	assertEquals(logIn.getUsername(),"Danijel");
	
	
	
}
}