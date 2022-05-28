package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundImages {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leafground.com/pages/Image.html");
		driver.findElement(By.xpath("//label[text()='Click on this image to go home page']/following-sibling::img")).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		WebElement brokenImg = driver.findElement(By.xpath("//*[text()='Am I Broken Image?']/following-sibling::img"));
		if (brokenImg.getAttribute("naturalWidth").equals("0"))
		{
			System.out.println(brokenImg.getAttribute("outerHTML") + " is broken.");
		     
		}
		WebElement mouse_action=driver.findElement(By.xpath("//label[text()='Click me using Keyboard or Mouse']/following-sibling::img"));
		Actions data=new Actions(driver);
		data.moveToElement(mouse_action).click().build().perform();
		System.out.println(driver.getCurrentUrl());

	}

}
