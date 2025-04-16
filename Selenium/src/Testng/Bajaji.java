package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Bajaji {

	@Test(groups="smoke")
	public void launch() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("www.bajajauto.com/");
		Reporter.log("welcome to bajaji website");
	}
}
