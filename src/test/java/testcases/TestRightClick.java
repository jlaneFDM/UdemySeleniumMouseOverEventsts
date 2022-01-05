package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestRightClick {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://deluxe-menu.com/popup-mode-sample.html");
		WebElement menu = 
				driver.findElement(By
						.xpath("/html/body/div/table/tbody/tr/td[2]/div[2]/table[1]/tbody/tr/td[3]/p[2]/img"));
		
		Actions actions = new Actions(driver);
	
	    actions.contextClick(menu).perform();
			    
	    actions.moveToElement(driver.findElement(By.id("dm2m1i1tdT"))).perform();
	    actions.moveToElement(driver.findElement(By.id("dm2m2i1tdT"))).perform();
	    actions.moveToElement(driver.findElement(By.id("dm2m3i1tdT"))).click().perform();
	    		
	}

}
