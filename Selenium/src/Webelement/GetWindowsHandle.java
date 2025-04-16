package Webelement;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowsHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String parentid = driver.getWindowHandle();
		System.out.println(parentid);
		driver.findElement(By.linkText("facebook")).click();
		Set<String> childid = driver.getWindowHandles();
		System.out.println(childid);
		
		
	}

}
