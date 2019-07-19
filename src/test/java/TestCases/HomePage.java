package TestCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobject.LandingPage;
import pageobject.LoginPage;
import resources.Base;

public class HomePage extends Base 
{

	@Test(dataProvider ="getData")

 public void basePageNavigation(String username,String password,String text)throws IOException
{
	driver = initializeDriver();
	driver.get("http://qaclickacademy.com");
	//one is inheritance
	//creating object to that class and invoke a method of it
	LandingPage l = new LandingPage(driver);
	l.getLogin().click(); //driver.findelement(B.css)
	LoginPage lp = new LoginPage(driver);
	lp.getEmail().sendKeys("username");
	lp.getPassword().sendKeys("password");
	System.out.println("text");
	lp.getLogin().click();
}
	@DataProvider
	public Object[][] getData() 
	{
		//Row stands for how many different data types test should run
		//Column stands for how many values for each test
		//Array size is 2
		
		Object[][]Data = new Object[2][3];
		//0th rowhttps://in.downloadsearch.cnet.com/en/s?q=pin%20code%20number&qo=mid-related-searches
		Data[0][0] = "nonrestricteduser@qa.com";
		Data[0][1] = "123456";
		Data[0][2] = "restricteduser";
		//1 row
		Data[1][0] = "restricteduser@qa.com";
		Data[1][1] = "56789";
		Data[1][2] = "nonrestricteduser";
		return Data;
	}
}
