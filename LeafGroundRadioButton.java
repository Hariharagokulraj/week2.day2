package week2.day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundRadioButton {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://www.leafground.com/pages/radio.html");
		//Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//*[@id='yes']"));
		ele.click();
		System.out.println(ele.isSelected());
		//driver.close();
		WebElement ele2 = driver.findElement(By.xpath("//div[@class='large-6 small-12 columns']/input[@name='news'][2]"));
		System.out.println(ele2.isSelected());
		List<WebElement> ele3 = driver.findElements(By.name("age"));
		for (WebElement radioSelect : ele3) {
			Boolean check=radioSelect.isSelected();
			
			  if(check==true)
			  
			  { 
				  System.out.println("Radio button is already selected");
			  }
			
		}

	}

}
