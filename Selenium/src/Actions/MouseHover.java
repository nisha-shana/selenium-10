package Actions;

import java.time.Duration;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://www.flipkart.com/");
//WebElement elect = driver.findElement(By.xpath("//span[text()='Electronics']"));
Actions act=new Actions(driver);
act.moveByOffset(648,117).perform();
//WebElement gam = driver.findElement(By.linkText("Gaming"));
//act.moveToElement(gam).perform();

	}

}
