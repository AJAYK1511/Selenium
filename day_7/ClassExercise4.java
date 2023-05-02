package day_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassExercise4 {
	WebDriver driver;
	   @Test
	   public void f() throws InterruptedException {
		   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		   driver.manage().window().maximize(); 
		   Thread.sleep(3000);
		   WebElement na=driver.findElement(By.name("username"));
		   na.sendKeys("Admin");
		   Thread.sleep(1000);
		   WebElement naa=driver.findElement(By.name("password"));
		   naa.sendKeys("admin123");
		   Thread.sleep(1000);
		   WebElement bta=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		   bta.click();
		   Thread.sleep(3000);
//		   String url="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
//		   Assert.assertEquals(url,driver.getCurrentUrl());
		   }
	  @BeforeSuite
	  public void setup() {
		  WebDriverManager.chromedriver().setup();
	      ChromeOptions co=new ChromeOptions();
	      co.addArguments("--remote-allow-origins=*");
 	      co.addArguments("start-maximized");
	      driver=new ChromeDriver(co); 
	  }
	  
	 @Test(dependsOnMethods = "f")
	 void Test2() throws InterruptedException  {
		 Thread.sleep(1000);
		  WebElement pro=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p"));
		  pro.click();
		  Thread.sleep(1000);
		  WebElement log=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a"));
		  log.click();
		  Thread.sleep(5000);
		  String st=driver.getCurrentUrl();
		  Assert.assertEquals(st, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  Thread.sleep(1000);
		  driver.close();
	  }
}
