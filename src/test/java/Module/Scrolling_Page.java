package Module;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Scrolling_Page {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://learn.microsoft.com/en-us/training/modules/design-data-storage-solution-for-relational-data/");
		System.out.println("Opened page");
		JavascriptExecutor Js=(JavascriptExecutor) driver;
		//Scroll down page by pixel
		/*Js.executeScript("window.scrollBy(0,1500)", "");
		System.out.println(Js.executeScript("return window.pageYOffset;"));  //1168.800048828125
		Thread.sleep(5000);
		System.out.println("Scrolling by pixel is done");*/
		
		//Scroll the page till end of the page
		Js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(Js.executeScript("return window.pageYOffset;")); // 1332.800048828125
				Thread.sleep(5000);
		System.out.println("Scrolling done till the end ");
				
		//scrolling up to initial position
		Js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		System.out.println("Scrolled back to top");
				
		//Scroll down page till element is visible
		/*WebElement ele = driver.findElement(By.xpath("//span[.='Start']"));
		Js.executeAsyncScript("arguments[0].scrollIntoView;", ele);
		System.out.println(Js.executeScript("return window.pageYOffset;")+"Till start icon");*/
		driver.quit();

	}

}
