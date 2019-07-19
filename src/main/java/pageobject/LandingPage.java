package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage 
{
   public WebDriver driver;
     
   
    By singin  = By.xpath("//span[contains(text(),'Login')]");
    
    public LandingPage(WebDriver driver) 
    {
		this.driver = driver;
	}

	public WebElement getLogin() 
    {
    	return driver.findElement(singin);
    }
    
    
}
