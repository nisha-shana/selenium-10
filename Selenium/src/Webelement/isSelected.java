package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement enable = driver.findElement(By.xpath("//label[text()='Excellent']/..//input[@id='pollanswers-1']"));
		System.out.println(enable.isSelected());
enable.click();
System.out.println(enable.isSelected());
	}

}
