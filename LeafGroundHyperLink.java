package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundHyperLink {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leafground.com/pages/Link.html");
		driver.findElement(By.linkText("Go to Home Page")).click();
		String title=driver.getTitle();
		System.out.println(title);
	    System.out.println(driver.getCurrentUrl());
	    System.out.println(driver.getPageSource());
	    driver.navigate().back();
	    System.out.println(driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href"));
	    driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).click();
	    System.out.println(driver.findElement(By.id("color")).getCssValue("background-color"));
	    driver.findElement(By.id("color")).getText();
	    System.out.println(driver.findElement(By.id("position")).getLocation());
	    WebElement size_val = driver.findElement(By.id("size"));
	    System.out.println(size_val.getSize());
	    System.out.println(size_val.getTagName());
	    driver.navigate().back();
	    WebElement link=driver.findElement(By.linkText("Verify am I broken?"));
	    link.click();
	    System.out.println(driver.findElement(By.tagName("h1")).getText());
	    driver.navigate().to("http://leafground.com/pages/Link.html");
	    driver.findElement(By.xpath("//label[text()='(Interact with same link name)']/preceding-sibling::a")).click();
	    System.out.println("success");
	    driver.close();

	}

}
