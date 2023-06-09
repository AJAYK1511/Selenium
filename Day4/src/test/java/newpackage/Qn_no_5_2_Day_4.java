package newpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Qn_no_5_2_Day_4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		EdgeOptions co=new EdgeOptions();
	    co.addArguments("--remote-allow-origins=*");
	    co.addArguments("start-maximized");
	    WebDriver driver=new EdgeDriver(co);
	    driver.get("https://j2store.net/free/");
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,1000)","");
	    driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]")).click();
	    List<WebElement> l1=driver.findElements(By.xpath("//h2[@class='product-title']"));
	    for(WebElement link:l1) {
	    System.out.println(link.getText());
	    }
	}
}
