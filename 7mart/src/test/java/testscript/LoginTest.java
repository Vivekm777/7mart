package testscript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends Base {

	@Test
  public void VerifyTheUserIsAbleToLoginUsingValidCredentials()
  {
   String userName="admin";
   String password="admin";
   LoginPage loginPage=new LoginPage(driver);
   loginPage.enterUserNameOnUserField(userName);
   loginPage.enterPasswordonPasswordField(password);
   loginPage.clickOnSigInButton();
   boolean isHomepageDisplayed=loginPage.isHomePageLoaded();
   assertTrue(isHomepageDisplayed, "HomePage is not loaded when user is enter valid credentials ");
	}
	
	@Test
	public void VerifyTheUserIsAbleToLoginUsingInvalidUsernameAndValidPassword()
	{
	String userName="a";
	String password="admin";
	LoginPage loginPage=new LoginPage(driver);
	loginPage.enterUserNameOnUserField(userName);
	loginPage.enterPasswordonPasswordField(password);
	loginPage.clickOnSigInButton();
	boolean isAlertdisplayed=loginPage.isAlertMessageDisplayed();
	assertTrue(isAlertdisplayed, "Homepage  is loaded when user enter Invalidusername and valid password");
	}
	
	
	@Test
	public void VerifyTheUserIsAbleToLoginUsingvalidUsernameAndInalidPassword()
	{
	String userName="admin";
	String password="a";
	LoginPage loginPage=new LoginPage(driver);
	loginPage.enterUserNameOnUserField(userName);
	loginPage.enterPasswordonPasswordField(password);
	loginPage.clickOnSigInButton();
	boolean isAlertdisplayed=loginPage.isAlertMessageDisplayed();
	assertTrue(isAlertdisplayed, "Homepage  is loaded when user enter Valid username and Invalid password");
		
	}
	
	@Test
	public void VerifyTheUserIsAbleToLoginUsingInvalidUsernameAndInalidPassword()
	{
	String userName="ad";
	String password="a";
	LoginPage loginPage=new LoginPage(driver);
	loginPage.enterUserNameOnUserField(userName);
	loginPage.enterPasswordonPasswordField(password);
	loginPage.clickOnSigInButton();
	boolean isAlertdisplayed=loginPage.isAlertMessageDisplayed();
	assertTrue(isAlertdisplayed, "Homepage  is loaded when user enter Invalid username and Invalid password");
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
