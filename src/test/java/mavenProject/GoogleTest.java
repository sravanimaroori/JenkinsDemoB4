package mavenProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class GoogleTest {
	WebDriver driver;
	
  @Test
  public void LaunchTest() {
	  String Expected="Google";
	  String Actual=driver.getTitle();
	  Assert.assertEquals(Expected, Actual);
	  
  }
  @BeforeTest
  public void LaunchAppTest() {
	System.setProperty("webdriver.chrome.driver", "C:\\IBM_Selenium_CMD\\driver\\chromedriver.exe");  
	driver = new ChromeDriver();
    driver.get("https://www.google.com/");
  }

  @AfterTest
  public void BrowserCloseTest() {
	  driver.quit();
  }

}
