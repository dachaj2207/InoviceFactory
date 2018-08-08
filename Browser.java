package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Browser {
	 public static WebDriver driver;
		
		@BeforeSuite
		public static void setUp() {
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
		
			}

	//	  @AfterSuite
		 //  public static void tearDown() {
		  // 	driver.close();
		  }