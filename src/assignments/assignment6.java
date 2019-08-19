package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment6 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Selenium 3.4\\chromedriver_win32.chromedriver.exe");
		
		
		
		WebDriver driver = new ChromeDriver();
		

		//Test the edureka portal to throw an exception while registering 
		
		//a user who already holds an account with the same email id. 
		
		//Log in to the edureka portal with the registered email id,and search for 
		
		//all the courses available and Logout of the edureka portal. 
		
		//Write testcases using TestNGfor above scenario.
		
		//Steps:1.Launch the Chrome browser
		
		//2.Log in to the account and browser for all the courses
		
		//3.Logout of the account
		
		//4.Use all the concepts learnt in TestNG(dependency, priority, etc)
		
		//5.Create another test case to register the user with same email and 
		
		//an exception has to be shown on portal6.Check for the HTML
		
		//report generated
		
		
		

		driver.close();
	}
	
	
	
	
	
	

}
