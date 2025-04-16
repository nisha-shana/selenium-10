package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.abhibus.com/");
		WebElement bus = driver.findElement(By.xpath("//h2[text()='Online Bus Booking Services']"));
		Actions act = new Actions(driver);
		//act.scrollToElement(bus).perform();
		act.scrollByAmount(0, 500).perform();
		act.pause(2000).scrollByAmount(0,1000 ).perform();
	}

}
