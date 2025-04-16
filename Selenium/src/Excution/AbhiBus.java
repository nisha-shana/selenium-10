package Excution;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.abhibus.com/");

JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
WebElement hd = driver.findElement(By.linkText("https://www.abhibus.com/buses/1/Hyderabad-Bangalore"));

	}

}
