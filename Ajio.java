package oopsAssignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://www.ajio.com/");
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("Bags");
		 driver.findElement(By.className("ic-search")).click();
		
		 driver.findElement(By.xpath("//input[@id='Men']/following-sibling::label[1]")).click();
driver.findElement(By.xpath("//label[text()=\"Fashion Bags (145)\"]")).click();
Thread.sleep(5000);
List<WebElement> a = driver.findElements(By.xpath("//div[@class='brand']"));
for (int i = 0; i < a.size(); i++) {
	String text = a.get(i).getText();
	System.out.println(text);
	}
List<WebElement> b = driver.findElements(By.xpath("//div[@class='name']"));
for (int i = 0; i < b.size(); i++) {
	String text1 = b.get(i).getText();
	System.out.println(text1);
	}
	}
	}
	
