package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment5 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Selenium 3.4\\chromedriver_win32.chromedriver.exe");
		
		
		
		WebDriver driver = new ChromeDriver();
		

		//The candidate who has registered for edureka portal wants 
		//to update all the professional and personal details available in the portal. 
		
		//Write a selenium script to do the same and explore the edureka portal.
		
		//Steps:1.Login to the edureka
		
		//2.Navigate to My Profile
		
		//3.Update professional and personal details
		
		//4.Explore the blogs and Navigate to Main page
		
		//5.Logout of the portalNote:Make sure that you are 
		
		//logged out of Edureka’s website while performing this practical


		driver.close();
	}
	
	
	
	
	
	

}
