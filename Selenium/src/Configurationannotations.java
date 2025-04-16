import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Configurationannotations {
	@BeforeSuite
	public void beforeSuite() {
		Reporter  .log("@beforeforeSuite",true); 
	}
	@BeforeTest
	public void beforeTest() {
		Reporter.log("@beforetest",true);
	}
	@BeforeClass
	public void beforeClass() {
		Reporter.log("@beforeclass",true);
	}
	
		@Test
	public void demo()
	{
		Reporter.log("@Test(demo)excuted",true);
		
	}
		@AfterClass
		public void afterclass() {
			Reporter.log("@AfterClass",true);
		}
	
		@AfterTest
		public void AfterTest() {
			Reporter.log("@AfterTest",true);
		}
		@AfterSuite
	public void afterSuite() {
		Reporter.log("@AfterSuite",true);
	}

}
