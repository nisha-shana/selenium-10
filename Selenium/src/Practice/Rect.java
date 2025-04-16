package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rect {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		 Dimension rec = driver.findElement(By.xpath("//input[@value='Subscribe']")).getSize();
		System.out.println(rec.getHeight());
	System.out.println(rec.getWidth());
		//System.out.println(rec.getX());
	//	System.out.println(rec.getY());
		

	}

}
