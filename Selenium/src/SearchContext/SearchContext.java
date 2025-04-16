package SearchContext;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchContext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.flipkart.com/");
WebElement ele = driver.findElement(By.id(""));
List<WebElement> all = driver.findElements(By.xpath(""));
	}

}
