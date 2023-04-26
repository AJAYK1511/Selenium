package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Qn_no_4_day_4 {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
	        ChromeOptions co=new ChromeOptions();
	        co.addArguments("--remote-allow-origins=*");
	        WebDriver driver=new ChromeDriver(co);
	        driver.navigate().to("https://j2store.net/free/");
	        driver.manage().window().maximize();
	        WebElement cl=driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/h4/a"));
	        cl.click();
	        driver.manage().window().maximize();
	        driver.navigate().forward();
	        driver.navigate().back();
	        driver.navigate().refresh();
	        driver.close();
	        }

}
