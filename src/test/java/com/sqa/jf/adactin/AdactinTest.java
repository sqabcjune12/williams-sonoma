/**
 * File Name: AdactinTest.java<br>
 * Nepton, Jean-francois<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jul 1, 2017
 */
package com.sqa.jf.adactin;

import org.openqa.selenium.*;
import org.testng.annotations.*;

import com.sqa.jf.helpers.*;

/**
 * AdactinTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Nepton, Jean-francois
 * @version 1.0.0
 * @since 1.0
 */
public class AdactinTest extends AbstractLoginTest {

	public AdactinTest() {
		super("http://adactin.com/HotelApp");
	}

	@BeforeClass
	public void adactinLogin() {
		login("sqabcjune12", "sqaadmin2017");
	}

	@AfterClass
	public void adactinLogout() {
		logout();
	}

	@Override
	public void login(String username, String password) {
		this.takeScreenshot("Pre-login");
		WebElement usernameField = getDriver().findElement(By.id("username"));
		WebElement passwordField = getDriver().findElement(By.id("password"));
		WebElement loginButton = getDriver().findElement(By.id("login"));
		usernameField.clear();
		usernameField.sendKeys(username);
		passwordField.clear();
		passwordField.sendKeys(password);
		loginButton.click();
		this.takeScreenshot("Post-login");
	}

	@Override
	public void logout() {
		this.takeScreenshot("Pre-logout");
		WebElement logoutField = getDriver().findElement(By.linkText("Logout"));
		logoutField.click();
		this.takeScreenshot("Post-logout");
	}
}
