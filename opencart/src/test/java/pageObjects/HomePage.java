package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement lnkMyaccou;
	
	@FindBy(linkText="Register")
	WebElement lnkRegister;
	
	@FindBy(linkText="Login")
	WebElement lnkLogin;
	
	
	public void clickMyaccount() {
		
		lnkMyaccount.click();
	}
	
    public void clickRegister() {
		
		lnkRegister.click();
	}
    
    public void clickLogin() {
		
		lnkLogin.click();
	}
	
	

}
