package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandleOverlas {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
		driver.findElement(By.xpath("//p[@data-cy='departureDate']")).click();
		Actions act=new Actions(driver);
		act.scrollByAmount(0, 300).perform();
		Thread.sleep(3000);
		while(true) {
			try {
			driver.findElement(By.xpath("//div[text()='August 2025']/../..//p[text()='15']")).click();
			break;
			}catch (Exception e) {
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
		
		
	

	}

}
