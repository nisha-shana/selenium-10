package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
//decleration
	@FindBy(linkText = "Register")
	private WebElement Registerlink;
	@FindBy(xpath = "//a [text()=Log in")
	private WebElement Loginlink;
	
//initlization ctrl space
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	//getter
	public WebElement getRegisterlink() {
		return Registerlink;
		
	}
	public WebElement getLoginlink() {
		return Loginlink;
	}
	
	
		
	}
	


