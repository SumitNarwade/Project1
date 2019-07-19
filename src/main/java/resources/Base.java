package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public WebDriver driver;

	public WebDriver initializeDriver() throws IOException
	{
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		FileInputStream fis =  new FileInputStream("C:\\Users\\lenovo\\FrameworkProject\\src\\main\\java\\resources\\Data.properties");
        prop.load(fis);
        //this file connect above two files
        String browserName =prop.getProperty("browser");
        System.out.println(browserName);
        if(browserName.equals("Chrome") ) 
        {
        	System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
        	driver = new ChromeDriver();
        	//execute in chrome driver
        }
        else if(browserName=="Firefox") 
        {
        	System.setProperty("webdriver.gecko.driver", "C:\\Work\\geckodriver-v0.22.0-win64\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
	}

}
