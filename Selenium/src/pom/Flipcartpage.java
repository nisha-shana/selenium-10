package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipcartpage {
@FindBy(name="q")
private WebElement searchtextfield;

public Flipcartpage(WebDriver driver) {
	PageFactory.initElements(driver,this);
		
}

public WebElement getSearchtextfield() {
	return searchtextfield;
}
}
