package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.HomePage;
import com.pages.LoginPage;

public class LoginPageTest {

	@Test(testName = "loginTest", description = "verifies login")
	public void loginTest() throws InterruptedException {
		LoginPage loginPage = new LoginPage();
		HomePage homePage = loginPage.login("TestUK123@aptushealth.com", "test123");
		Assert.assertEquals(homePage.getUserName(), "Aptus Health");
	}

}
