package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();           	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://acme-test.uipath.com/login");
	driver.findElement(By.id("email")).sendKeys("hariharagokulraj@gmail.com");
	driver.findElement(By.id("password")).sendKeys("leaf@123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	System.out.println(driver.getTitle());
	driver.findElement(By.linkText("Log Out")).click();
	driver.close();
}
}