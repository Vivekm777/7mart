package testscript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageProductPage;

public class ManageProductTest extends Base {
@Test
public void verifyUserIsAbleToDeleteProduct()
{
String userName="admin";
String password="admin";
LoginPage loginPage=new LoginPage(driver);
loginPage.enterUserNameOnUserField(userName);
loginPage.enterPasswordonPasswordField(password);
loginPage.clickOnSigInButton();
ManageProductPage manageproduct=new ManageProductPage(driver);
manageproduct.clickOnManageProductMoreInfo();
manageproduct.clickOnProductDeletionButton();
manageproduct.AcceptAlert();
boolean isProductDeletionAlertDisplayed=manageproduct.isProductDeletionAlertDisplayed();
assertTrue(isProductDeletionAlertDisplayed,"User is unable to delete product after clicking on the product delete button");
	
	






}
















}
