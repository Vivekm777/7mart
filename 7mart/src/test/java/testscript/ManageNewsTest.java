package testscript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageNewsPage;

public class ManageNewsTest extends Base
{
	@Test
	public void verifyUserIsAbleToAddNews()
	{
	   String userName="admin";
	   String password="admin";
	   LoginPage loginPage=new LoginPage(driver);
	   loginPage.enterUserNameOnUserField(userName);
	   loginPage.enterPasswordonPasswordField(password);
	   loginPage.clickOnSigInButton();
	   ManageNewsPage managenews=new ManageNewsPage(driver);
       managenews.clickOnManageNewsMoreInfo();
       managenews.clickOnManageNewsNew();
       managenews.enterTextOnEnterTheNewsTextField("cricket");
       managenews.clickOnSaveNewsButton();
       boolean isAletForNewscreationDisplayed=managenews.isAlertForNewsCreationDisplayed();
       assertTrue(isAletForNewscreationDisplayed, "User is unable to add news using add news button");
       

	}







}
