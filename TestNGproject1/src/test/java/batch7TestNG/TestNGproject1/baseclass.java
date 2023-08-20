package batch7TestNG.TestNGproject1;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class baseclass {
public WebDriver driver;

@BeforeTest
@Parameters({"brow"})
public void beforeTest(String brow) throws InterruptedException, IOException {
	  String browser= brow;
	  
	 System.out.println("value of browser" + browser );
		 
		 if(browser.contains("Chrome")) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\sharo\\eclipse-workspace\\TestNGproject1\\drivers\\chromedriver.exe");
driver= new ChromeDriver();
		 }
		 else if(browser.contains("Firefox")) {
System.setProperty("webdriver.gecko.driver","C:\\Users\\sharo\\eclipse-workspace\\TestNGproject1\\drivers\\geckodriver.exe");
driver= new FirefoxDriver();
		 }
		 else {
System.setProperty("webdriver.edge.driver","C:\\Users\\sharo\\eclipse-workspace\\TestNGproject1\\drivers\\msedgedriver.exe");
driver = new EdgeDriver();
		 }
driver.get("https://facebook.com");
driver.manage().window().maximize();
Thread.sleep(6000);
}
@AfterTest
public void afterTest() {
	  driver.quit();
}


//taking screenshots
public void shots() throws IOException {
	File cap= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	 FileHandler.copy(cap, new File("C:\\Users\\sharo\\eclipse-workspace\\TestNGproject1\\Screenshots\\1.png"));
	
}
public void shots_withargs(String name) throws IOException {
	  File cap=  ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(cap, new File("C:\\Users\\sharo\\eclipse-workspace\\TestNGproject1\\Screenshots\\"+name+".png"));
	   }
	   
	   public void shots_withargsdate() throws IOException {
	 	  Date dt = new Date();
	 	String name_dt=  dt.toString().replace(" ", "_").replace(":", "_");
	  File cap=  ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(cap, new File("C:\\Users\\sharo\\eclipse-workspace\\TestNGproject1\\Screenshots\\"+name_dt+".png"));
	   }
}