package batch7TestNG.TestNGproject1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class beforetestandaftertestaug05 {
  public static WebDriver driver;
  
 @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\sharo\\eclipse-workspace\\mavenproject\\drivers\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.get("https://facebook.com");
	  driver.manage().window().maximize();
	  Thread.sleep(6000);
	  System.out.println("This is before test,it will open the browser");
  }
  /*@Test
  public void backtoschool() throws InterruptedException {
	  System.out.println("Test1");
	  HomePOMAug06 ob = new HomePOMAug06(driver);
	  ob.backtoSchoolClick();
	  Thread.sleep(6000);
  }*/
  
  /*@Test
  public void offtocollege() throws InterruptedException {
	  System.out.println("Test2");
	  HomePOMAug06 ob = new HomePOMAug06(driver);
	  ob.offtoCollegeClick();
	  Thread.sleep(6000);
  }*/
 
 @Test
   public void getfbtext() {
   HomePOMAug06 ob = new HomePOMAug06(driver);
   ob.getfbtext();
 }
 
  @AfterTest
  public void afterTest() {
	  System.out.println("This is after test,it will close the browser");
	  driver.close();
  }

}
