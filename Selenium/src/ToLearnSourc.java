import java.net.http.WebSocket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSourc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.get("https://www.instagram.com/ ");
String sourceCode=driver.getPageSource();
System.out.println(sourceCode);

	}

}
