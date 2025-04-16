package drpdownListbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/nisha/OneDrive/Desktop/multi.html");
		WebElement cars = driver.findElement(By.id("cars"));
		
	Select carSelect=new Select(cars);
	carSelect.selectByIndex(0);
	carSelect.selectByValue("ferrari");
	carSelect.selectByVisibleText("Volvo");
	Thread.sleep(2000);
	carSelect.deselectAll();//this method only multiple select and deselect//
	

	}

}
