package Day_9;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class Qn_no_1 {
	int a,b,c;
  @Test(dataProvider = "dp")
  public void add(Integer m, Integer n) {
	  c=m+n;
      System.out.println(c);
      Assert.assertEquals(c, 6);
  }
  @Test(dataProvider = "dp")
  public void subtract(Integer m, Integer n) {
	  c=m-n;
      System.out.println(c);
      Assert.assertEquals(c, 2);
  }
  @Test(dataProvider = "dp")
  public void pro(Integer m, Integer n) {
	  c=m*n;
      System.out.println(c);
      Assert.assertEquals(c, 8);
  }
  @Test(dataProvider = "dp")
  public void div(Integer m, Integer n) {
	  c=m/n;
      System.out.println(c);
      Assert.assertEquals(c, 2);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 4, 2 },
//      new Object[] { 6, 3 },
    };
  }
}
