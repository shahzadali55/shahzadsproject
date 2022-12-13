package shahzad9.project9;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	public static WebDriver driver;

  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\17036\\eclipse-workspace\\project1\\folder1\\chromedriver.exe");
		driver=new ChromeDriver();  //opening browser
		
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
  }
  
  
  @Test
  public void test() {
  }
  

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
