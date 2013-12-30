package website;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriver {

	

	@Test
	public void test() {
		
		
      // System.setProperty("C://Users//md//Documents//New folder.exe"); 
		
		InternetExplorerDriver driver = new InternetExplorerDriver();
	//	WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.yahoo.com");
		
		/*WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");*/
		
		
	
	
	}

}
