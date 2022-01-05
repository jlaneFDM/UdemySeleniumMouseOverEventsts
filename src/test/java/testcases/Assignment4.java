package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4 {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		int length = 400;
		int height = 400;
		
		Dimension startDimension = new Dimension(length, height);
		driver.manage().window().setSize(startDimension);
						
		while (length != 1000 && height != 1000) {
			length++;
			height++;
			Dimension resizedDems = new Dimension(length, height);
			driver.manage().window().setSize(resizedDems);
		}
		
	}

}
