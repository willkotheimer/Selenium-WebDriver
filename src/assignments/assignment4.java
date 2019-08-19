package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Selenium 3.4\\chromedriver_win32.chromedriver.exe");
		
		
		
		WebDriver driver = new ChromeDriver();
		

		//A person wants to check for the one-wayflights from 
		//Bengaluru to Lucknow for 5 passengers(3 Adults and 2 children) 
		//on Indigo portal for the current date. Automate the same using 
		//(https://www.goindigo.in/?linkNav=home_header) portal. 
		//The steps are as below.Steps:
		
		//1.Launch the browser with “https://www.goindigo.in/?linkNav=home_header”
		
		//2.Select “One way” in the option
		
		//3.Fill all the details specified above
		
		//4.Click on search button5.Wait for the page to load and list 
		
		//all the flights available


		driver.close();
	}
	
	
	
	
	
	

}
