package day_5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.JavascriptExecutor;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Qn_no_4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		EdgeOptions co=new EdgeOptions(); 
	    co.addArguments("--remote-allow-origins=*");
	    co.addArguments("start-maximized");
	    WebDriver driver=new EdgeDriver(co);
	    driver.get("https://www.abhibus.com/bus-ticket-booking");
	    WebElement fr=driver.findElement(By.id("source"));
	    fr.sendKeys("Coimbatore");
	    Thread.sleep(1000);
	    fr.sendKeys(Keys.ENTER);
	    WebElement ds=driver.findElement(By.id("destination"));
	    ds.sendKeys("Ariyalur");
	    Thread.sleep(1000);
         ds.sendKeys(Keys.ENTER);
	    WebElement dt=driver.findElement(By.xpath("//*[@id=\"datepicker1\"]"));
	    dt.click(); 
	    JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].setAttribute('value','29-04-2023')",dt);
        Thread.sleep(1000);
        WebElement btn=driver.findElement(By.xpath("//*[@id=\"seo_search_btn\"]")); 
         btn.click(); 
	}

}
