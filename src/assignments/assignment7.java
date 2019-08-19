package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment7 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Selenium 3.4\\chromedriver_win32.chromedriver.exe");
		
		
		
		WebDriver driver = new ChromeDriver();
		

		//A student needs to shop for a Selenium book using Flipkart 
		
		//website and the book has to be delivered to the student’sarea. 
		
		//Since he does not own a valid credentials, he is unable to place the order. 
		
		//Automate the same using selenium java. Upon failure the screen 
		
		//shot has to be captured and retry again. Implement all the listeners 
		
		//in TestNG to understand better.
		
		//Steps:1.Open browser with Flipkart website
		
		//2.Search for a Selenium book
		
		//3.Check if it is delivered to the pin code
		
		//specified and print the duration needed
		
		//4.Add to the cart
		
		//5.While checking out, give a random email id and password 
		
		//6.Capture the error message and capture the screenshot

		

		driver.close();
	}
	
	
	
	
	
	

}
