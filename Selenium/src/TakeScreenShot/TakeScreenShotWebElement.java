package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShotWebElement {

	public static void main(String[] args) throws IOException {
		String timestamp = LocalDate.now().toString().replace(":", "-");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		File temp = driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreenShot/"+timestamp+".png");
	org.openqa.selenium.io.FileHandler.copy(temp, dest);
	}
	
}
