package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excer1 {
	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demoapps.qspiders.com/");

//js.executeScript("window.scrollBy(0,800)");//scrollBy
//js.executeScript("window.scrollTo(0,900)" );//scrollTo

JavascriptExecutor js = (JavascriptExecutor)driver;


	}

}