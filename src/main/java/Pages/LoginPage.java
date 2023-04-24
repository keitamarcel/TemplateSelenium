package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class LoginPage extends SeleniumWrappers {

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	public By usernameField=By.id("username");
	public By passwordField =By.id("password");
	public By loginButton =By.xpath("//button[@value='Log in']");
	public By myAccountElement=By.xpath("//div[@class='woocommerce-MyAccount-content']");
	
	public void loginInApp(String user,String pass) {
		sendKeys(usernameField, user);
		sendKeys(passwordField, pass);
		click(loginButton);
		
	}
	
}
