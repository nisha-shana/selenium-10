import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demowebshop.tricentis.com/");
boolean status = driver.findElement(By.xpath("//input[@value='Log in']")).isDisplayed();
System.out.println(status);
	}

}
