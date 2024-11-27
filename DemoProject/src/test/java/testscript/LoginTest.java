package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends Base{
  
  public void varifyUserLoginWithValidCredentials() 
  {
	  LoginPage login=new LoginPage(driver);
	  login.enterUserNameField("carol");
	  login.enterPasswordField("1q2w3e4r");
	  login.loginButton();
	  
	  boolean homepageisloaded=login.isHomepageisloaded();
	  Assert.assertTrue(homepageisloaded,"Invalid credentials");
  }
  @Test
  public void varifyValidUserInvalidPassword()
  {
	  LoginPage login=new LoginPage(driver);
	  login.enterUserNameField("carol");
	  login.enterPasswordField("1q2w3e");
	  login.loginButton();
	  boolean loginpageisloaded=login.isLoginpageloaded();
	  Assert.assertTrue(loginpageisloaded,"Login not loaded");
  }
}