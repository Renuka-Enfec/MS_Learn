package Module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Module_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=new EdgeDriver();
		driver.get("https://learn.microsoft.com/en-us/training/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[.='Browse all paths']")).click();
		System.out.println("Clicked on browse all paths");
		driver.findElement(By.xpath("//input[@id='facet-search-input']")).sendKeys("AI");
		driver.findElement(By.xpath("//span[@class='is-hidden-mobile ']")).click();
		Thread.sleep(5000);
		System.out.println("Clicked on search icon");
		driver.navigate().to("https://learn.microsoft.com/en-us/training/modules/get-started-ai-fundamentals/");
		WebElement modl_title = driver.findElement(By.xpath("//h1[.='Introduction to AI concepts']"));
		Thread.sleep(5000);
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println("The title is: "+title);
		System.out.println("Opened the module of AI");
		driver.findElement(By.xpath("//a[.='Module assessment']")).click();
		String MA_Title=driver.getTitle();
		System.out.println("THe title is: "+MA_Title);
		Thread.sleep(5000);
		//driver.findElement(By.xpath(""))
		driver.quit();
		//System.out.println("Opened application");
		

	}

}
