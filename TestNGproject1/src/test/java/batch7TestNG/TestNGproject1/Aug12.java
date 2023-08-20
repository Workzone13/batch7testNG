package batch7TestNG.TestNGproject1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Aug12 {
	public static WebDriver driver;
	
  @Test(priority=1)
  public void Street_Address() throws InterruptedException {
	  HomePOMAug06 ob = new HomePOMAug06(driver);
	  ob.Order_OnlineClick();
	  Thread.sleep(6000);
	  ob.DeliveryClick();
	  Thread.sleep(6000);
	  ob.Addresstype_dropdownSelect();
	  ob.Street_Address();
	  ob.State();
	  Thread.sleep(3000);
  }
  /*@Test
  public void f6() throws InterruptedException {
	  HomePOMAug06 ob = new HomePOMAug06(driver);
	  ob.email_field("abc@yahoo.com");
	  Thread.sleep(6000);
	  ob.pass_field("hdhdjja");
	  Thread.sleep(6000);
  }*/
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	 String browser= "Chrome";
	 
			 if(browser.contains("Chrome")) {
  System.setProperty("webdriver.chrome.driver","C:\\Users\\sharo\\eclipse-workspace\\TestNGproject1\\drivers\\chromedriver.exe");
  driver= new ChromeDriver();
			 }
			 else if(browser.contains("Firefox")) {
  System.setProperty("webdriver.gecko.driver","C:\\\\Users\\\\sharo\\\\eclipse-workspace\\\\TestNGproject1\\\\drivers\\\\geckodriver.exe");
  driver= new FirefoxDriver();
			 }
			 else {
  System.setProperty("webdriver.edge.driver","C:\\\\\\\\Users\\\\\\\\sharo\\\\\\\\eclipse-workspace\\\\\\\\TestNGproject1\\\\\\\\drivers\\\\\\\\msedgedriver.exe");
  driver = new EdgeDriver();
			 }
  driver.get("https://dominos.com");
  driver.manage().window().maximize();
  Thread.sleep(6000);
  
  }
  
  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
