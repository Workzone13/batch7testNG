package batch7TestNG.TestNGproject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class HomePOMAug06 {
  public static WebDriver driver;
  
  @FindBy (xpath = "//*[text()='Back to School']")  WebElement backtoSchool;
  
  @FindBy (xpath = "//*[text()='Off to College']") WebElement offtoCollege;
  
  @FindBy (xpath = "//*[contains(text(),'Connect with')]") WebElement fbtext;
  
  @FindBy (xpath = "//*[text()='Order Online']") WebElement Order_Online;
  
  @FindBy (xpath = "//*[@id='tab-Delivery']") WebElement Delivery;
  
  @FindBy (xpath = "//*[@data-quid='address-type-select']") WebElement Address_Type;
  
  @FindBy (xpath ="//*[@name='Type']") WebElement Addresstype_dropdown;
  
  @FindBy (xpath = "//*[@id='email']")  WebElement email_field;
  
  @FindBy (xpath = "//*[@id='pass']") WebElement pass_field;
  
  @FindBy (xpath = "(//*[@type='text'])[2]") WebElement Street_Address;
  
  @FindBy (xpath = "//*[@name='Region']") WebElement State;
  
  public HomePOMAug06(WebDriver driver) {
	HomePOMAug06.driver=driver;
	PageFactory.initElements(driver, this);
  }
  //with arguments
  public void pass_field(String email) {
	  pass_field.sendKeys(email);
  }
  
  public void pass_field_clear() {
	  pass_field.clear();
  }
  //with arguments
  public void email_field(String pass) {
	  email_field.sendKeys(pass);
  }
  
  public void email_field_clear() {
	  email_field.clear();
  }
  
  public void State() {
	  Select ob= new Select(State);
	  ob.selectByVisibleText("VA");
  }
  public void Street_Address() {
	  Street_Address.sendKeys("123 abc");
  }
  public void Addresstype_dropdownSelect() {
	  Select ob= new Select(Addresstype_dropdown);
	  ob.selectByVisibleText("Apartment");
  }
  public void Addresstype_dropdownClick() {
	  Addresstype_dropdown.click();
  }
  public void Address_TypeClick() {
	  Address_Type.click();
  }
  
  public void DeliveryClick() {
	  Delivery.click();
  }
  public void Order_OnlineClick() {
	  Order_Online.click();
  }
  public void backtoSchoolClick() {
	  backtoSchool.click();
  }
  
  public void offtoCollegeClick() {
	  offtoCollege.click();
  }
  
  public void getfbtext() {
   String Expected_text = "Connect with friends and the world around you on Facebook.";
   String Actual_text = fbtext.getText();
   
   //Hard Assertion
   //Assert.assertEquals(Actual_text,Expected_text);
   //System.out.println("This is a hard assert");
   
   //Soft Assertion
   SoftAssert sa = new SoftAssert();
   sa.assertEquals(Actual_text,Expected_text);
   System.out.println("This is a soft assert");  
   sa.assertAll();
   
  }
}
