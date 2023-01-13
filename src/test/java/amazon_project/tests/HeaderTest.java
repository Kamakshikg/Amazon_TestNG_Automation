package amazon_project.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class HeaderTest extends BaseTest 
{
	@Test(priority=1)
	public void tc_search()
	{
		header_page.search_products("Mobile Phones");
		Reporter.log("The product is searched successfully");
	}
	
	@Test(priority=2)
	public void tc_address_link()
	{
		header_page.click_address_link();
		Reporter.log("The logo is present");
	}
}
