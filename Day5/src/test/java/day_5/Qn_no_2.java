package day_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Qn_no_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    WebDriverManager.chromedriver().setup();
	        ChromeOptions co=new ChromeOptions();
	        co.addArguments("--remote-allow-origins=*");
	        WebDriver driver=new ChromeDriver(co);
	        driver.get("https://jqueryui.com/droppable/");
	        driver.switchTo().frame(0);
	        Actions ne=new Actions(driver);  
	        WebElement src=driver.findElement(By.id("draggable"));
	        WebElement des=driver.findElement(By.id("droppable"));
		    ne.clickAndHold(src).release(des).build().perform();
	
	}

}
