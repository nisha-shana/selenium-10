package TestData;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commandata {

	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("./Testdata/commamdata.properties");
		Properties prop=new Properties();
		prop.load(file);
		String url = prop.getProperty("url");
		System.out.println(url);
	String email = prop.getProperty("email");
	System.out.println(email);
String pw = prop.getProperty("password");
System.out.println(pw);
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get(url);
 driver.findElement(By.xpath("//input[@value='Log in']"));
 driver.findElement(By.id("Email")).sendKeys("ancy123@gmail.com");//sendkeys(prop.getproperty("email"))
 driver.findElement(By.id("Password")).sendKeys("ancy@123");//sendkeys(prop.getproperty("password"))

	}

}

