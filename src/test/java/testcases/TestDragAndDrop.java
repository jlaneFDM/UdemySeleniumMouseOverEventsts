package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDragAndDrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.seleniumeasy.com/drag-and-drop-demo.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().fullscreen();
					
		WebElement draggable = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[1]/span[1]"));
		WebElement droppable = driver.findElement(By.xpath("//*[@id=\"mydropzone\"]"));
				
		Actions action = new Actions(driver);
		
		action.dragAndDrop(draggable, droppable).perform();
		

	}

}
