package Tests;

import org.testng.annotations.Test;

import utils.BaseTest;

public class LoginTest extends BaseTest {

	@Test
	public void valiodLoginTest() {
		app.click(app.menu.loginLink);
	}
	
	
}
