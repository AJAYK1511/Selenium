package day_7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassExercise1 {
  @Test
  public void f() {
	    WebDriverManager.edgedriver().setup();
		EdgeOptions co=new EdgeOptions(); 
	    co.addArguments("--remote-allow-origins=*");
	    co.addArguments("start-maximized");
	    WebDriver driver=new EdgeDriver(co);
	    driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
	    String tit=driver.getTitle();
	    System.out.print(tit);
	    Assert.assertEquals(tit, "Guest Registration Form – User Registration");
	    
  }
}
