package amazon_project.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import amazon_project.pages.HeaderPage;

public class BaseTest 
{
	protected WebDriver driver;
	protected HeaderPage header_page;
	
	@Parameters({"browser","url"})
	@BeforeClass
	public void setup(String browser, String url)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			Assert.assertEquals(false, "No browser type is selected");
		}
		
		driver.get(url);
		Reporter.log("The website is opened by using the provided url");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		header_page=PageFactory.initElements(driver, HeaderPage.class);
	}
	
//	@AfterClass
//	public void close_app()
//	{
//		driver.quit();
//	}
}
