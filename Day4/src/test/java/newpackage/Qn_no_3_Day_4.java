package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.JavascriptExecutor;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Qn_no_3_Day_4 {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeOptions co=new EdgeOptions();
	    co.addArguments("--remote-allow-origins=*");
	    WebDriver driver=new EdgeDriver(co);
	    driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
	    driver.manage().window().maximize();
	    WebElement rname=driver.findElement(By.xpath("//*[@id=\"input-to-name\"]"));
	    rname.sendKeys("aaa");
	    WebElement rmail=driver.findElement(By.xpath("//*[@id=\"input-to-email\"]"));
	    rmail.sendKeys("aaa@gmail.com");
	    WebElement name=driver.findElement(By.xpath("//*[@id=\"input-from-name\"]"));
	    name.sendKeys("bbb");
	    WebElement mail=driver.findElement(By.xpath("//*[@id=\"input-from-email\"]"));
	    mail.sendKeys("bbb@gmail.com");
	    JavascriptExecutor js1=(JavascriptExecutor)driver;
	    js1.executeScript("window.scrollBy(0,600)","");
	    WebElement bttn=driver.findElement(By.xpath("//*[@id=\"input-theme-8\"]"));
	    bttn.click();
	    WebElement amount=driver.findElement(By.xpath("//*[@id=\"input-amount\"]"));
	    amount.sendKeys("100");
	    WebElement btt2=driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/div/input"));
	    btt2.click();
	    WebElement bttn3=driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/button"));
	    bttn3.click();
	}
}
