package week2.day3;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Harihara");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Gokulraj");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9787493717");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Password@123");
		WebElement dropdwn1 = driver.findElement(By.xpath("//select[@id='day']"));
		Select day=new Select(dropdwn1);
		day.selectByValue("18");
		WebElement dropdwn2 = driver.findElement(By.xpath("//select[@id='month']"));
		Select month=new Select(dropdwn2);
		month.selectByValue("5");
		WebElement dropdwn3 = driver.findElement(By.xpath("//select[@id='year']"));
		Select year=new Select(dropdwn3);
		year.selectByValue("1991");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
	}

}