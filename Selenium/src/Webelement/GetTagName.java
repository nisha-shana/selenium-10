package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	String tagname = driver.findElement(By.linkText("register")).getTagName();
	System.out.println(tagname);
	}

}
