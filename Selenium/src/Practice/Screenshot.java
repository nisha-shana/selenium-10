package Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.flipkart.com/");
//TakesScreenshot ts = (TakesScreenshot)driver;//
//File tem=ts.getScreenshotAs(OutputType.FILE);
//File des=new File("./Screen/ima.png");webpage//
//org.openqa.selenium.io.FileHandler.copy(tem, des);
File ts = driver.findElement(By.xpath("//img[@src='https://static-assets-web.flixcart.com/batman-returns/batman-returns/p/images/fkheaderlogo_exploreplus-44005d.svg']")).getScreenshotAs(OutputType.FILE);
File de = new File("./Screen/im.png/");//webelement
FileHandler.copy(ts, de);
	}

}
