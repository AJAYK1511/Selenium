package day_5;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Qn_no_5 {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeOptions co=new EdgeOptions();
	    co.addArguments("--remote-allow-origins=*");
	    co.addArguments("start-maximized");
	    WebDriver driver=new EdgeDriver(co);
	    driver.get("https://www.google.com");
	    driver.findElement(By.name("q")).sendKeys("Apple");
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	    String par=driver.getWindowHandle();
	    System.out.println(par); 
	    System.out.println(driver.getTitle());
	    driver.switchTo().newWindow(WindowType.TAB);
	    driver.get("https://www.google.com");
	    driver.findElement(By.name("q")).sendKeys("Cucumber");
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	    String par1=driver.getWindowHandle();
	    System.out.println(par1);
	    System.out.println(driver.getTitle());
	    driver.switchTo().newWindow(WindowType.TAB);
	    driver.get("https://www.google.com");
	    driver.findElement(By.name("q")).sendKeys("Selenium");
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	    String par2=driver.getWindowHandle();
	    System.out.println(par2);
	    System.out.println(driver.getTitle());
	    Set<String> ss=driver.getWindowHandles();
	    System.out.println(ss.size());
	}

}
