package amazon_project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HeaderPage 
{
	WebDriver driver;
	
	public HeaderPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	// Locate Search Box and Search Button
	
	@FindBy(how=How.XPATH,using="//*[@id=\"twotabsearchtextbox\"]")
	WebElement search_textbox;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"nav-search-submit-button\"]")
	WebElement search_button;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"glow-ingress-block\"]")
	WebElement address_link;
	
	// Search Products Methods
	public void set_search_box(String data)
	{
		search_textbox.sendKeys(data);
	}
	
	public void click_search_button()
	{
		search_button.click();
	}
	
	public void click_address_link()
	{
		address_link.click();
	}
	
	public void search_products(String product)
	{
		set_search_box(product);
		click_search_button();
	}
}