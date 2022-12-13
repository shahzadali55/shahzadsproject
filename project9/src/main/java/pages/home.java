package pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



public class home {

public static WebDriver driver;

@FindBy(xpath="//*[@id='nav-link-accountList']") WebElement signin;
@FindBy(xpath="//*[text()='Start here.']") WebElement starthere;
@FindBy(xpath="//*[text()='Connect with friends and the world around you on Facebook.']") WebElement facebook;
@FindBy(xpath="//*[text()=@name='email']") WebElement fbEmail;



public home(WebDriver driver) {
home.driver=driver;
PageFactory.initElements(driver, this);
}


public void signin_function() {		
	Actions ob = new Actions(driver);
	ob.moveToElement(signin).build().perform();		
}


public void text_function() {

	String actualText= facebook.getText();
	//Assert.assertEquals(actualText,"Connect with friends and the world around you on Facebook");
	Assert.assertEquals(actualText, "Connect with friends and the world around you on Facebook.");

}


public void fbEmail_function_2(String string) {
	// TODO Auto-generated method stub
	
}
}

