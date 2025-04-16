package ScrollingWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		WebElement latestcourse = driver.findElement(By.xpath("//h3[text()='Latest Courses']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
	
		js.executeScript("arugment[0].scrollIntoView(true)", latestcourse);
	}

}
