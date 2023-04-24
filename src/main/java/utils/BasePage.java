package utils;

import org.openqa.selenium.WebDriver;

import Pages.MenuPage;

public class BasePage extends SeleniumWrappers {

	public BasePage(WebDriver driver) {
		super(driver);
	}
	public MenuPage menu= new MenuPage(driver);
}
