package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleiframe {
	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
		driver.get("https://www.dream11.com/");
		//driver.switchTo().frame(0);//it is one type of program//
		//driver.switchTo().frame("send-sms-iframe");//it is anther type of program//
		WebElement iframe = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));//this is another type program all method including one program//
		driver.switchTo().frame(iframe);
		driver.findElement(By.id("regEmail")).sendKeys("123456");
		driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		driver.findElement(By.id("hamburger")).click();
		
		
	
	}

}
