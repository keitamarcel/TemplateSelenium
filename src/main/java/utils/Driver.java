package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Driver {
	
	//ThreadLocal  rulare in paralel a browserelor
	public static ThreadLocal<WebDriver> driver= new ThreadLocal<WebDriver>();
	
	public WebDriver initBrowser(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			Log.info("Browser parameter is :CHROME");
			driver.set(new ChromeDriver(getChromeOptions()));
			long chromeId = Thread.currentThread().getId();
			Log.info("Chrome=--> Thread.id ="+ chromeId);
			return driver.get();
			
			
		}else if(browser.equalsIgnoreCase("edge")) {
			Log.info("Browser parameter is :EDGE");
			driver.set(new EdgeDriver(getEdgeOptions()) );
			long edgeId = Thread.currentThread().getId();
			Log.info("Firefox=--> Thread.id ="+ edgeId);
			return driver.get();
		}
		return driver.get();
		
		
	}
// metoda in care pornim testul fara a mai deschide browserul
	public static ChromeOptions getChromeOptions() {
		ChromeOptions chromeOPtions =  new ChromeOptions();
		chromeOPtions.addArguments("--headless");
		chromeOPtions.addArguments("--window-size=1580,1280");
		return chromeOPtions;
		
	}
	public static EdgeOptions getEdgeOptions() {
		EdgeOptions edgeOPtions =  new EdgeOptions();
		//edgeOPtions.addArguments("--headless");
		//edgeOPtions.addArguments("--window-size=1580,1280");
		
		return edgeOPtions;
	}
	
}
