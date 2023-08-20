package batch7TestNG.TestNGproject1;

import org.testng.annotations.Test;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class Aug19dataprovider extends baseclass{
  @Test(dataProvider = "dp")
  public void f(String email,String pass) throws InterruptedException, IOException {
	  HomePOMAug06 ob = new HomePOMAug06(driver);
	  ob.email_field(email);
	  Thread.sleep(3000);
	  ob.pass_field(pass);
	  Thread.sleep(3000);
	  ob.email_field_clear();
	  ob.pass_field_clear();
	  Thread.sleep(3000);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "abc@yahoo.com", "aaaa" },
      new Object[] { "abc@gmail.com", "bbbbb" },
      new Object[] { "abc@live.com", "cccc" },
    };
  }
}
