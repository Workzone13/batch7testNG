package batch7TestNG.TestNGproject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{   public static WebDriver driver;
    public static void main( String[] args )
    {
       System.setProperty("webdriver.chrome.driver","C:\\Users\\sharo\\eclipse-workspace\\TestNGproject1\\drivers\\chromedriver.exe");
       driver= new ChromeDriver();
       driver.get("https://dominos.com");
    	
    	
    }
}
