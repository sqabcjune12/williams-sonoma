/**
 * File Name: WilliamsSonomaTest.java<br>
 * Nepton, Jean-francois<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jul 10, 2017
 */
package com.sqa.jf.ws;

import org.openqa.selenium.*;

import com.sqa.jf.auto.*;

/**
 * WilliamsSonomaTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Nepton, Jean-francois
 * @version 1.0.0
 * @since 1.0
 */
public class WilliamsSonomaTest extends AbstractLoginTest {

	public WilliamsSonomaTest() {
		super("http://williams-sonoma.com");
	}

	public void checkForPopup() {
		if (isPresent(By.cssSelector("a.stickyOverlayMinimizeButton"))) {
			WebElement popupCloseIcon = getDriver().findElement(By.cssSelector("a.stickyOverlayMinimizeButton"));
			popupCloseIcon.click();
		}
	}

	@Override
	public void login(String username, String password) {
		getLog().info("Logging in to " + this.getBaseURL() + " with username:password = " + username + ":" + password);
		// getDriver().get(getBaseURL());
		// checkForPopup();
		// Actions accountHover = new Actions(getDriver());
		// WebElement myAccountButton =
		// getDriver().findElement(By.cssSelector(".my-account a"));
		// accountHover.moveToElement(myAccountButton);
		// WebElement signInButton =
		// getDriver().findElement(By.cssSelector("li.sign-in a"));
		// accountHover.click(signInButton).build().perform();
		// WebElement usernameField =
		// getDriver().findElement(By.id("login-email"));
		// WebElement passwordField =
		// getDriver().findElement(By.id("login-password"));
		// usernameField.sendKeys(username);
		// passwordField.sendKeys(password);
		// usernameField.submit();
	}

	@Override
	public void logout() {
		getLog().info("Logging out of " + this.getBaseURL());
	}
}
