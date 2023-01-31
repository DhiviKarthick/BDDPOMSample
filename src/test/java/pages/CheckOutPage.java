package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.TestBase;

public class CheckOutPage extends TestBase {
	
	@FindBy(id = "billing-coupon")
	WebElement chkBoxCoupon; 
	@FindBy(id = "coupon") 
	WebElement inpCoupon; @FindBy(xpath = "//button[contains(text(), 'Apply')]") 
	WebElement applyBtn; 
	@FindBy(xpath= "//button[contains(text(), 'Checkout')]") WebElement chkoutBtn; 
	@FindBy(xpath = "//button[contains(text(), 'Empty Cart')]") WebElement emptyCartBtn; 


	public  CheckOutPage() 
	{ 
		PageFactory.initElements(driver, this); }
	
	public void applyCoupon() 
	{ chkBoxCoupon.click();
	 inpCoupon.sendKeys("C100"); 
	 applyBtn.click(); 
	} 
	public void doCheckout() { chkoutBtn.click(); }
	 public void doEmptyCart() { emptyCartBtn.click(); }
	 }
	 





