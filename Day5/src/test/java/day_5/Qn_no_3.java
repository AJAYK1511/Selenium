package day_5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Qn_no_3 {

	public static void main(String[] args) throws InterruptedException {
		    WebDriverManager.chromedriver().setup();
	        ChromeOptions co=new ChromeOptions();
	        co.addArguments("--remote-allow-origins=*");
	        WebDriver driver=new ChromeDriver(co);
	        driver.get("https://demo.guru99.com/test/delete_customer.php");
	        WebElement nee=driver.findElement(By.name("cusid"));
	        nee.sendKeys("401");
	        Thread.sleep(1000);
	        WebElement neew=driver.findElement(By.name("submit"));
	        neew.click();
	        Thread.sleep(1000); 
	        Alert ale=driver.switchTo().alert();
	        ale.dismiss();
	        Thread.sleep(1000);
	        nee.clear();
	        Thread.sleep(1000);
	        nee.sendKeys("402"); 
	        Thread.sleep(1000);
	        neew.click();
	        Thread.sleep(1000);
	        Alert al1=driver.switchTo().alert();
	        al1.accept();
	        Alert a3=driver.switchTo().alert();
	        String ha=a3.getText();
	        System.out.print(ha);
	}

}
