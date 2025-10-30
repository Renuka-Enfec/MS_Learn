package pR_Script;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.asserts.SoftAssert;

public class PR_Script {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	WebDriver	driver=new EdgeDriver();
	//driver.get("https://github.com/");
	driver.get("https://github.com/MicrosoftDocs/learn-pr/pull/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	System.out.println("Opened page URL");
	driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("v-rkaparatti@microsoft.com");
	System.out.println("enetered username");
	driver.findElement(By.xpath("//input[@autocomplete='current-password']")).sendKeys("Pa55w!rd01");
	System.out.println("Enetered password");
	driver.findElement(By.xpath("//input[@value='Sign in']")).click();
	System.out.println("Clicked on Sign in ");
	/*driver.findElement(By.xpath("//span[.='Use passkey']")).click();
	System.out.println("clicked passkey");*/
	driver.findElement(By.xpath("//div[@class='two-factor-alternatives']/button/span/span/span")).click(); 
	//moreoptions
	System.out.println("Clicked on moreoption");
	driver.findElement(By.xpath("//span[.='Authenticator app']")).click();
	System.out.println("Clicked quthenticator app option");
	/*driver.findElement(By.xpath("//input[@name='app_otp']")).sendKeys("Enter authetictor app code here");
	System.out.println("Sent app code");*/
	Thread.sleep(5000);
	System.out.println("Waitng to enter OTP");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	System.out.println("Submitted code");
	Thread.sleep(10000);
	driver.findElement(By.xpath("//span[.='Continue']")).click();
	Thread.sleep(3000);
    String	title=driver.getTitle();
    System.out.println("Finall result of page: "+title);
	System.out.println("Clicked on continue button");
	String error_text = driver.findElement(By.xpath("id('heading')")).getText();
	System.out.println("Error message is: "+error_text);
	System.out.println("fecthed final output");
	Thread.sleep(3000);
	driver.quit();
	}

}
