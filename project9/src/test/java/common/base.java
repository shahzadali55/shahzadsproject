package common;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

@Test
public class base {
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
  }
  @BeforeMethod (alwaysRun=true)
  @Parameters({"url","brow"})
  public void beforeMethod(String url,String brow) throws InterruptedException, IOException {
	  
	  
	  ChromeDriver driver;
	if (brow.equalsIgnoreCase("chrome")){
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\17036\\eclipse-workspace\\project1\\folder1\\chromedriver.exe");
		driver=new ChromeDriver();  //opening browser
	  }
	  else if (brow.equalsIgnoreCase("firefox")) {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\17036\\eclipse-workspace\\project1\\folder1\\geckodriver.exe");
	driver=new FirefoxDriver();  //opening browser
	  }
	  
	  else {
	  System.setProperty("webdriver.edge.driver", "C:\\Users\\17036\\eclipse-workspace\\project1\\folder1\\msedgedriver.exe");
driver=new EdgeDriver();  //opening browser
	  }
	 
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	shotsv2("1");
  }
 
@AfterMethod
  public void afterMethod() {
  }

}
