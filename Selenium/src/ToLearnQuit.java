import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnQuit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https:shoppersstack.com/products_page/24");
Thread.sleep(20000);
driver.findElement(By.id("compare")).click();
driver.quit();
	}

}
