package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetCssValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//input[@value='value'='log in']")).click();
		WebElement errormsg = driver.findElement(By.xpath("//div[@class='validation-summary-errors']"));
		System.out.println(errormsg);
		 String color=errormsg.getCssValue("color");
System.out.println(color);
	
	

}}
