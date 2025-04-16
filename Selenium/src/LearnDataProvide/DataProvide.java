package LearnDataProvide;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvide {
	@DataProvider
	public String[][] dataSender() {
		String[][]data= {{"admin","admin"},{"ad","admin"},{"admin","ad"},{"ad","ad"}};
		return data;
	}
	@Test(dataProviderClass=DataStorage.class,dataProvider="dataSender")
	public void Signin(String[]cred) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://accounts.saucelabs.com/am/XUI/#login/");
		driver.findElement(By.id("idToken1")).sendKeys(cred[0]);
		driver.findElement(By.id("idToken2")).sendKeys(cred[1]);
	}

}
