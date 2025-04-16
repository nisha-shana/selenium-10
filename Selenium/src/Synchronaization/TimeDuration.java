package Synchronaization;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimeDuration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		//driver.findElement(By.id("loginBtn")).click();
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		
		System.out.println(alllinks.size());

	}

}
