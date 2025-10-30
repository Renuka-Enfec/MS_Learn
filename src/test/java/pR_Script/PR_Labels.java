package pR_Script;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class PR_Labels {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		/*driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://github.com/MicrosoftDocs/learn-pr/pull/49712");*/
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
		
		
		driver.navigate().to("https://github.com/MicrosoftDocs/learn-pr/pull/49712");
		
		System.out.println("Naviagated to PRnUMBER");
		//driver.get("https://github.com/MicrosoftDocs/learn-pr/pull/49712");
		driver.findElement(By.xpath("//span[.='needs-human-review']")).getText();
		driver.findElement(By.xpath("//span[.='review-in-progress']")).getText();
		driver.findElement(By.xpath("//span[.='dotnet-csharp/svc']")).getText();
		
		JavascriptExecutor Js=(JavascriptExecutor) driver;
		//Scroll down page by pixel
		Js.executeScript("window.scrollBy(0,1500)", "");
		System.out.println(Js.executeScript("return window.pageYOffset;"));  //
		Thread.sleep(2000);
		System.out.println("Scrolling by pixel is done");
		
		//Scroll down page till element is visible
		WebElement ele = driver.findElement(By.xpath("//h4[.='Add a comment']"));
		Js.executeAsyncScript("arguments[0].scrollIntoView;", ele);
		System.out.println(Js.executeScript("return window.pageYOffset;")+"Till start icon");
		
		//Scroll the page till end of the page
		Js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(Js.executeScript("return window.pageYOffset;")); // 
		Thread.sleep(2000);
		System.out.println("Scrolling done till the end ");
				
		//scrolling up to initial position
		Js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		System.out.println("Scrolled back to top");

	}

}
