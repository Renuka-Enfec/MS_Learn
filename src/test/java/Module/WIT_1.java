package Module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.NewSessionPayload;

public class WIT_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.get("https://login.microsoftonline.com/");
		System.out.println("Opened application...");
		driver.findElement(By.xpath("//input[@data-report-value='Email_Phone_Skype_Entry']")).sendKeys("v-rkaparatti@microsoft.com");
		//driver.findElement(By.xpath(""))
		Thread.sleep(3000);
		driver.quit();
		

	}

}
