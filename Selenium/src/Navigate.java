import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//driver.get("https://www.flipkart.com/");
		driver.navigate().to(new URL("https://www.flipkart.com/"));
		Thread.sleep(20000);
		driver.navigate().back();
		Thread.sleep(20000);
		driver.navigate().forward();
		Thread.sleep(20000);
		driver.navigate().refresh();

	}

}
