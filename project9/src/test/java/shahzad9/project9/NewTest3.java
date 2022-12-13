package shahzad9.project9;


import org.testng.annotations.Test;
import pages.home;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;


public class NewTest3 {
	public WebDriver driver;
	

  @BeforeMethod (alwaysRun=true)
  @Parameters({"url","brow"})
  public void beforeMethod(String url,String brow) throws InterruptedException, IOException {
	  
	  
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
  
  @Test
 public void a1() throws InterruptedException, IOException {
	  System.out.println("this is test 1");
	  home ob1= new home(driver);
	  ob1.fbEmail_function_2("abc@yahoo.com");
	  Thread.sleep(5000);
shotsv2("2");
 
}
  
  @Test
public void a2() throws InterruptedException {
	  System.out.println("this is test 1");
	  home ob1= new home(driver);
	  ob1.fbEmail_function_2("def@yahoo.com");
	  Thread.sleep(5000);
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }
  
 public void shots1() throws IOException {
	 Date dt = new Date(0);
	  String currentdt= dt.toString().replace(" ", "_").replace(":", "_");

	 
	 
	 
	File cap=  ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(cap, new File("C:\\Users\\17036\\eclipse-workspace\\project9\\pictures\\"+currentdt+".png"));
  }

 public void shotsv2(String ss) throws IOException {
		File cap=  ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(cap, new File("C:\\Users\\17036\\eclipse-workspace\\project9\\pictures\\"+ss+".png"));
  
 }
}