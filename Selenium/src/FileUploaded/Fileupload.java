package FileUploaded;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class Fileupload {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.naukri.com/registration/createAccount");
		//Actions act=new  Actions(driver);
		//act.scrollByAmount(0, 200).perform();
driver.findElement(By.xpath("//h2[text()=\"I'm experienced\"]")).click();
driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\nisha\\OneDrive\\Desktop\\ANCY.N-REUMW.docx");
	}

}
