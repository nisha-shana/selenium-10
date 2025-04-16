package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkes {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://petdiseasealerts.org/alert-subscriptions/#/register");
		WebElement em = driver.findElement(By.xpath("//input[@type='text']"));
		em.sendKeys("bavi123@gmail.com");

	}

}
