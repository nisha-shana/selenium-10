package Synchronaization;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit {

	private static final String ExcpetedCondition = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/products_page/17");
		driver.findElement(By.id("Check Delivery")).sendKeys("560010");
		WebElement checkBtn = driver.findElement(By.id("check"));
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
		 wait.until(ExpectedConditions.elementToBeClickable(checkBtn));
		 checkBtn.click();
	}

	

}
