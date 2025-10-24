package seleniumProject;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class Element_not_interactable {
	

	    public static void main(String[] args) throws InterruptedException {
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://practicetestautomation.com/practice-test-login/"); 

	        driver.findElement(By.xpath("//a[.='Practice']")).click();
	        System.out.println("Clicked on PRACTICE");
	        driver.findElement(By.linkText("Test Exceptions")).click();
	        System.out.println("Clicked on TEST EXCEPTION");

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        driver.findElement(By.id("add_btn")).click();
	        System.out.println("Clicked Add button");
	        // element is hidden behind another elementso used explicit wait until the element visibility
	        WebElement row2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='row2']/input")));
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", row2);
	        row2.sendKeys("Roti");
	        Thread.sleep(3000);
	        System.out.println("Entered value into row2");
	        
	        //driver.findElement(By.id("save_btn")).click(); //element not intractable issue
	        
	        //element is disable for few milliseconds after entering input value so we can solve by using JS exicuter
	        WebElement saveBtn = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("save_btn")));
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", saveBtn);
	        System.out.println("Clicked Save button using JS");

	        System.out.println("Clicked Save button");

	        driver.quit();
	    }
	}

