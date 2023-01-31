package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(name="searchbar")  //Finding all elements in page
	WebElement searchBox;
	
	@FindBy(id="button-search")
	WebElement btnSearch;
	
	
	@FindBy(id="login")
	WebElement loginBtn;
	
	@FindBy(id="signup")
	WebElement signupBtn;
	
	@FindBy(id="cart")
	WebElement cartBtn;
	
	

public HomePage()
{
	PageFactory.initElements(driver, this);
}

public SearchResultPage searchItem(String strItem)
		
{
	System.out.println("home page");
	searchBox.sendKeys(strItem);
	System.out.println("search page");
	btnSearch.click();
	return new SearchResultPage();
	
}
}