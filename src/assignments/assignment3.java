package assignments;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.org.apache.bcel.internal.generic.Select;

public class assignment3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Selenium 3.4\\chromedriver_win32\\chromedriver.exe");
	
		
		
		//Automate Edureka web application with the help of Selenium WebDriver,
		//to search for a course, handle all the page loading time,
		//using selenium wait approach and handling dynamically changing elements.
		
		//Steps:Write a selenium automation code to perform these steps: 
		
		//1.Launch Chrome browser using Selenium WebDriver
		WebDriver driver = new ChromeDriver();
		
		//2.Set the Selenium page loadtimeout after launching the browser. 
		//This timeout will be applicable to any page load
		 

		  // Use the timeout when navigating to a webpage
		//3.Navigate to “https://www.edureka.co/”
		
		 driver.get("https://www.edureka.co/");
		//4.Maximizethe Browser Window5.Set implicit wait for all the activities 
		 driver.manage().window().maximize();
		//on the browser6.Set selenium script timeout and execute any asynchronous 
		
		//script (Ex: window.setTimeout(arguments[arguments. Length-1], 500);)to validate the  
		
		//script timeout
		
		//7.Search for “Selenium” course in the search box and press “Enter”
		 WebElement element = driver.findElement(By.xpath("//input[@id='search-inp']"));
		 element.sendKeys("Selenium");
		 
		
		 element.sendKeys(Keys.RETURN);
		 
		//8.Add explicit wait for page to navigate to selenium course and click on the course
		
		 driver.manage().window().maximize();
		 
		 WebDriverWait wait = new WebDriverWait(driver, 20);
		 
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Selenium Certification Training")));
		 
		 driver.findElement(By.linkText("Selenium Certification Training")).click();

		wait.until(ExpectedConditions.titleContains("Selenium Certification Training & Course With Project - Edureka"));
		

		
		//9.Wait for the whole selenium course page to be loaded and get the title of the page
		
		String title = driver.getTitle();
		
		//10.Validate the page title to be “Selenium 3.0 WebDriver Online Training”
		
		boolean titlegood = title.equals("Selenium 3.0 WebDriver Online Training");
		
		System.out.println(titlegood);
		
		//11.Navigate back to the previous 
		
		//driver.navigate().back();
		//page12. Wait for whole page to be loaded and 
		
		
		
		//now select “All courses” from the menu option
		 
		driver.findElement(By.xpath("//*[@id=\"brdcrm_holder\"]/ul/li[2]/a")).click();
		
		 //13.Add a fluent wait script
		
		//to wait for whole page to be loaded under “All course”Note:Make sure that you 
		

@SuppressWarnings("unused")
FluentWait<WebDriver> wait3 = new FluentWait<WebDriver>(driver)
.withTimeout(45, TimeUnit.SECONDS)
.pollingEvery(5, TimeUnit.SECONDS)
.ignoring(NoSuchElementException.class);


		//are logged out of Edureka’s website while performing this practical


		driver.close();
	}
	
	
	
	
	
	

}
