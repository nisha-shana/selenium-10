package ScrollingWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg");
		WebElement hiddenEm = driver.findElement(By.id("Custom_gender"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='selenium'", hiddenEm);
		WebElement custom = driver.findElement(By.xpath("//label[text()='Custom']"));
		
		js.executeScript("arguments[0].click()", custom);
	}

}
