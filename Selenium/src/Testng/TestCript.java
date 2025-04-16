package Testng;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCript  extends BaseClass{
	@Test
	public void clickonBook() {
		driver.findElement(By.partialLinkText("BOOKS")).click();
		if(driver.getTitle().equals("Demo Web Shop.Books")) {
		Reporter.log("book page is display",true);
		
	}else {
		Reporter.log("book page is not  display",true);
	}
	

}}
