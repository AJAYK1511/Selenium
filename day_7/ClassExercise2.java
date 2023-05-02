package day_7;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class ClassExercise2 {
  
  int a,b,c;
  @BeforeSuite
  public void get() {
	  a=4;
	  b=2;
  }
  @Test(priority=1)
  public void add() {
	  c=a+b;
	  Assert.assertEquals(c, 6);
  }
  @Test(priority=2)
  public void subtract() {
	  c=a-b;
	  Assert.assertEquals(c, 2);
  }
  @Test(priority=3)
  public void multiply() {
	  c=a*b;
	  Assert.assertEquals(c, 8);
  }
  @Test(priority=4)
  public void divide() {
	  c=a/b;
	  Assert.assertEquals(c, 2);
  }
}
