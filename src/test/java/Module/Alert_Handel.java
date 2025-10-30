package Module;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Alert_Handel {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://learn.microsoft.com/en-us/training/modules/design-data-storage-solution-for-relational-data/");
		System.out.println("Opened page");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[.='Start']")).click();
		
		for(int i=1;i<9;i++)
			//for(int i=1;i<10;i++)  stale element reference: stale element not found in the current frame
			{
				Thread.sleep(3000);
				WebElement Alert_present = driver.findElement(By.xpath("//p[@class='alert-title']"));
				System.out.println("Alert type is: "+Alert_present.getText());
				Thread.sleep(5000);
				System.out.println();
			 driver.findElement(By.xpath("//span[.='Next']")).click();
			
				System.out.println("Unit "+i+" title"+" "+driver.getTitle());
				
			}
		
		driver.navigate().to("https://learn.microsoft.com/en-us/training/modules/design-data-storage-solution-for-relational-data/7-design-security-for-data-at-rest-data-transmission-data-use");
		WebElement Alert_present = driver.findElement(By.xpath("//p[@class='alert-title']"));
		System.out.println("Alert type is: "+Alert_present.getText());
		Thread.sleep(5000);
		driver.quit();

	}

}
