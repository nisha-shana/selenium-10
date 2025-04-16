package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/products_page/17");
	driver.findElement(By.id("compare")).click();
	//System.out.println(driver.getCurrentUrl());
	Set<String> allwindow = driver.getWindowHandles();
		for(String id:allwindow) {
		System.out.println(id);
		driver.switchTo().window(id);
		
		

		//System.out.println(driver.getCurrentUrl());
		String url = driver.getCurrentUrl();
		if(url.equals("https://www.amazon.in/"));
		Thread.sleep(2000);
		driver.close();
	}
	

	}}


