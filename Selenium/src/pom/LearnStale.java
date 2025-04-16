package pom;

import java.security.Key;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnStale {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.flipkart.com/");
	//WebElement stf = driver.findElement(By.name("q"));
	Flipcartpage fp=new Flipcartpage(driver);
	fp.getSearchtextfield().sendKeys("moblies",Keys.ENTER);
	Actions act =new Actions(driver);
	act.keyDown(fp.getSearchtextfield(),Keys.CONTROL).keyDown("a").keyDown(Keys.BACK_SPACE).perform();
	act.keyUp(Keys.CONTROL).keyUp("a").keyUp(Keys.BACK_SPACE).perform();
	fp.getSearchtextfield().sendKeys("shoes",Keys.ENTER);
	
	
	

	}

}
