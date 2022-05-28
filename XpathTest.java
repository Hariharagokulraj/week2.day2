package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathTest {

	 public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/login");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 driver.findElement(By.xpath("//input[@class='inputBox']")).sendKeys("Dexra Solutions");
		 driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Harihara");
		 driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Gokulraj");
		 driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("employee");
		 driver.findElement(By.xpath("//input[@id='createLeadForm_description']")).sendKeys("Want to join");
		 driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("hari@gmail.com");
		 driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		 driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		 WebElement eleSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
			Select dd = new Select(eleSource);
			dd.selectByVisibleText("Conference");
			
			driver.findElement(By.name("submitButton")).click();
			Thread.sleep(1000);
			String firstName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
			System.out.println(firstName);
		 }
}
