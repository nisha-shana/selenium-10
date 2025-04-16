import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver {

	public static void main(String[] args) {
		org.openqa.selenium.WebDriver driver =new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		String title =driver.getTitle();
		System.out.println(title);
		if (title.equals("Demo Web Shop"))
		{
			System.out.println("welcome page is displaed");
		}
		else {
			System.out.println("welcome page is not displayed");
			
		}
			
				

	}

}
