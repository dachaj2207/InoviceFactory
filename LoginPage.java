package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends PageObject {

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	public @FindBy(id = "login-form-email")
	WebElement email;
    public	@FindBy(id = "login-pass")
	WebElement password;
	@FindBy(id = "login-form-btn")
	WebElement logInButton;
	@FindBy(xpath = "//*[@id=\'app\']/div/main/div/div/div/div/form/div[1]/div[2]/div/div[1]/div[2]/div/i")
	WebElement VisibiltyButton;
@FindBy (xpath = "//div[@class='v-messages__message' and string()='The email field is required.']")
WebElement reqMail;
@FindBy(xpath = "//*[@id=\'app\']/div/main/div/div/div/div/form/div[1]/div[2]/div/div[2]/div[1]")
WebElement reqPass;
@FindBy(xpath = "//p[string()='Invalid credentials.']")
WebElement invalidCredentials;
@FindBy(xpath = "//*[@id=\'app\']/div/main/div/div/div/div/form/div[1]/div[2]/div/div[2]/div[1]/div/div")
WebElement lowB;
@FindBy(xpath = "//*[@id=\'app\']/div/main/div/div/div/div/form/div[1]/div[2]/div/div[2]/div[1]/div/div")
WebElement longB;
@FindBy(xpath = "//*[@id=\'app\']/div/main/div/div/div/div/form/div[1]/div[1]/div/div[2]/div/div")
WebElement validEmail;
@FindBy(xpath = "//i[string()='visibility_off']")
WebElement eye;
@FindBy(id = "home-page-user")
WebElement userLogIn;
public void signInInputs (String email, String password) {
	
	//this.email.clear();
	this.email.sendKeys(email);
	
	
	//this.password.clear();
	this.password.sendKeys(password);
	}
public void signIn () {
	
	logInButton.click();
}
public void visibility() {
	VisibiltyButton.click();
	
}
public boolean wrongMail(){
	return reqMail.isDisplayed();
	}
public boolean wrongPass() {
	return reqPass.isDisplayed();
}
public boolean isInvalidCredentialsDisplayed() {
    wait.until(ExpectedConditions.visibilityOf(invalidCredentials));
    return invalidCredentials.isDisplayed();}
public boolean isLowBisDisplayed() {
	return lowB.isDisplayed();
}
public boolean isLongBisDisplayed() {
	return longB.isDisplayed();
}
public boolean validEmailError() {
	return validEmail.isDisplayed()
;}
public WebElement geteye() {
	return eye;
	
}
public boolean getUsername() {
	return userLogIn.isDisplayed();
}
}
