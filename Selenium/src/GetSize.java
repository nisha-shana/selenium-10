import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.flipkart.com/");
org.openqa.selenium.Dimension size = driver.manage().window().getSize();
System.out.println(size.getHeight());
System.out.println(size.getWidth());

	}

}
