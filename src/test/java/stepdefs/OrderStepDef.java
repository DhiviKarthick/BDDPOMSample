package stepdefs;

import org.testng.annotations.Test;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SearchResultPage;

public class OrderStepDef extends TestBase {
	
	HomePage homePage;
	SearchResultPage resultPage;
  
  @Given("User is on home page")
  public void user_is_on_home_page() {
	  initialize();
     
  }

  @When("User search an item")
  public void user_search_an_item(String strItem) {
	  homePage=new HomePage();
	  resultPage=homePage.searchItem(strItem);
  }

  @Then("Item must be displayed in search page")
  public void item_must_be_displayed_in_search_page() {
    
  }

  @Given("Item must be displayed")
  public void item_must_be_displayed() {
    
  }

  @When("User add item to cart")
  public void user_add_item_to_cart() {
   
  }

  @Then("Item must be listed in cart")
  public void item_must_be_listed_in_cart() {
    
  }

}
