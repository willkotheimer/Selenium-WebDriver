package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class assignment2 {

	public static void main(String[] args) {
		
		
		//Steps:Write a
		//Selenium automation code to perform these steps:
		//1.Launch Chrome browser using Selenium WebDriver
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Selenium 3.4\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		WebDriver driver = new FirefoxDriver();
		
		//2.Navigate to 
		//“https://www.edureka.co/”
		
		driver.get("https://www.edureka.co/");
		
		//3.Maximise the Browser Window
		
		
		driver.manage().window().maximize();
		
		//4.Inspect the search box with text “Search for a Course” for various attributes using
		//firebug 
		
		//5.Get attributes id,name,xpath, class name,css values
		
		// by id:
		
		driver.findElement(By.id("search-inp"));
		
		//by Xpath
		driver.findElement(By.xpath("//*[@id='search-inp']"));
		
		
		
		//6.Inspect the “Log In” link to get the link text and partial link text
		
		driver.findElement(By.linkText("Log In")).click();
		
		driver.findElement(By.partialLinkText("Log"));
		
		//7.Write a Java code using Selenium WebDriver to make sure that all the element 
		
		//attributes are found on the webpage
		
		//8.Usethe below Selenium WebDriver methods to do that:
			
			//•find_element_by_id
		driver.findElement(By.id("search-inp"));
			//•find_element_by_name
		driver.findElement(By.name("user_v1[query]"));
			//•find_element_by_class_name
		driver.findElement(By.className("typeahead__query"));
			//•find_element_by_xpath
		driver.findElement(By.xpath("//input[@id='search-inp']"));
			//•find_element_by_css_selector
		driver.findElement(By.cssSelector("input#search-inp"));
			//•find_element_by_tag_name
		driver.findElement(By.tagName("input"));
			//•find_element_by_link_text,
		driver.findElement(By.linkText("Corporate Training"));
			//•find_element_by_partial_link_text
		driver.findElement(By.partialLinkText("Cour"));
			
			//9.The  same  code  should  work  with  different  browsers  
			//as  well  (Chrome  and Firefox)Note:Make sure that you are logged outof 
			//Edureka’s website while performing this practical

		driver.close();
	}
	
	
	
	
	
	

}
