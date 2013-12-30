package website;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Firstprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver","E:\\SeleniumSoftwares\\IEDriverServer.exe"); 
		
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.yahoo.com");
		
		/*WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();*/
		
		
		
		
		
		
		
	}

}
