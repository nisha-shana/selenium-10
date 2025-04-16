import org.openqa.selenium.chrome.ChromeDriver;

public class Urrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
org.openqa.selenium.WebDriver driver =new ChromeDriver();

driver.get("https://demowebshop.tricentis.com");
String url = driver.getCurrentUrl();
System.out.println(url);
	}

}
