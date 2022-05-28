package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Find Leads")).click();
		 driver.findElement(By.xpath("//form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("Hari");
		 driver.findElement(By.xpath("//td[@class='x-btn-center']/em/button[@class='x-btn-text' and text()='Find Leads']")).click(); 
		 driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		 Thread.sleep(4000);
		 WebElement ele = driver.findElement(By.xpath("//*[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		 ele.click();
		 System.out.println(driver.getTitle());
		 driver.findElement(By.xpath("//*[@class='subMenuButton' and text()='Edit']")).click();
		 WebElement ele2=driver.findElement(By.id("updateLeadForm_companyName"));
		 ele2.clear();
		 String newcomp="comp";
		 ele2.sendKeys(newcomp);
		 driver.findElement(By.xpath("//*[@class='smallSubmit']")).click();
		 String text=driver.findElement(By.id("viewLead_companyName_sp")).getText();
		 System.out.println(text);
		 if(text.contains(newcomp))
		 {
			 System.out.println("Pass");
		 }
		 else
		 {
			 System.out.println("fail");
		 }
		 driver.close();

	}

}
