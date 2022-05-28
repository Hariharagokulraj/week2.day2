package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	    driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("harihara");
		driver.findElement(By.id("lastNameField")).sendKeys("Gokulraj");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("hari");
		driver.findElement(By.name("lastNameLocal")).sendKeys("B");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("testing");
		driver.findElement(By.xpath("//*[@name='description']")).sendKeys("data has been added");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("bmhari1991@gmail.com");
		WebElement ele1 = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select city=new Select(ele1);
		city.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("New test notes are added");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		System.out.println(driver.getTitle());
		
	}
}
