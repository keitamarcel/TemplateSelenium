package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Driver {
	
	//ThreadLocal  rulare in paralel a browserelor
	public static ThreadLocal<WebDriver> driver= new ThreadLocal<WebDriver>();
	
	public WebDriver initBrowser(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			Log.info("Browser parameter is :CHROME");
			driver.set(new ChromeDriver());
			long chromeId = Thread.currentThread().getId();
			Log.info("Chrome=--> Thread.id ="+ chromeId);
			return driver.get();
			
			
		}else if(browser.equalsIgnoreCase("edge")) {
			Log.info("Browser parameter is :EDGE");
			driver.set(new EdgeDriver() );
			long edgeId = Thread.currentThread().getId();
			Log.info("Firefox=--> Thread.id ="+ edgeId);
			return driver.get();
		}
		return driver.get();
		
		
	}

}
