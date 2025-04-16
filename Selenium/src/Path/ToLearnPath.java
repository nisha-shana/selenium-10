package Path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("file:///C:/Users/nisha/OneDrive/Desktop/Movie.html");
String movie = "PUSPHA";

String collection = driver.findElement(By.xpath("//td[text()='"+movie+"']/preceding-sibling::td")).getText();
String position = driver.findElement(By.xpath("//td[text()='"+movie+"']/following-sibling::td[1]")).getText();

System.out.println("puspha collection is" +collection);
System.out.println("puspha position is"+position);
	}

}
