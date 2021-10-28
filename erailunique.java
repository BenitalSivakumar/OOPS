package oopsAssignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class erailunique {
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
		System.out.println(train.size());
		
		Set<String> tra1=new HashSet<String>();
		for (WebElement webElement : findElements) {
			String text = webElement.getText();
			 tra1.add(text);
				
	}
		System.out.println(tra1.size());
		driver.close();
}
}