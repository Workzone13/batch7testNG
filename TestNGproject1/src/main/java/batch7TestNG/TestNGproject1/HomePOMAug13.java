package batch7TestNG.TestNGproject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePOMAug13 {
	public static WebDriver driver;
  
	
	public HomePOMAug13(WebDriver driver) {
		HomePOMAug13.driver=driver;
		PageFactory.initElements(driver,this);
	}
  }

