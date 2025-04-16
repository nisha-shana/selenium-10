package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LearnHardAssert {
@Test
public void login() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Log in")).click();
	Assert.assertEquals(driver.getTitle(),"Demo Web shop.Login","login page is not display");
	Reporter.log("Login page is displayed",true);
	driver.findElement(By.id("Email")).sendKeys("bavi123@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("bavi@123");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	Assert.assertEquals(driver.getTitle(),"Demo Web shop","Home page is not displayed");
	Reporter.log("Home page is displayed",true);
}
}

