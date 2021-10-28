package oopsAssignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailSort {
@SuppressWarnings("deprecation")
public static void main(String[] args) throws InterruptedException {
	
		 WebDriverManager.chromedriver().setup();
	 ChromeDriver driver=new ChromeDriver();
	 driver.get("https://erail.in/");
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.id("chkSelectDateOnly")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("txtStationFrom")).clear();
	driver.findElement(By.id("txtStationFrom")).sendKeys("Chennai",Keys.ENTER);
	driver.findElement(By.id("txtStationTo")).clear();
	driver.findElement(By.id("txtStationTo")).sendKeys("Surat",Keys.ENTER);
	Thread.sleep(2000);
	List<WebElement> findElements = driver.findElements(By.xpath("//*[@id='divTrainsList']/table[1]/tbody/tr/td[2]"));
	
	List<String> train = new ArrayList<String>();
	for (WebElement webElement : findElements) {
		String text = webElement.getText();
		 train.add(text);
	}
	 Collections.sort(train);
	 for(String obj : train)
	 {
		 
		 System.out.println(obj);
	 }
	}
}

