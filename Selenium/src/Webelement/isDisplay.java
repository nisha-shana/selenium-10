package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.log.Log;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
lriver.findElement(By.xpath("//button[@type='submit']"));
		
		driver.findElement(By.name("username")).sendKeys("1234@");
		driver.findElement(By.name("password")).sendKeys("test@1234");
		System.out.println(LoginsEnabled());
		
	}

	private static char[] LoginsEnabled() {
		// TODO Auto-generated method stub
		return null;
	}

