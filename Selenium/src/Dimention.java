import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dimention {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.flipkart.com/");
 Dimension size = driver.manage().window().getSize();
System.out.println(size.getHeight());
System.out.println(size.getWidth());
driver.manage().window().setSize(new Dimension(800, 600));//width-800,height-600//1000x1200//
	}

}
