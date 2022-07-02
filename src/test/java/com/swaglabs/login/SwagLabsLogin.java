package com.swaglabs.login;

import QAlessons.BaseDriver;
import com.swaglabs.HomePage;
import com.swaglabs.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SwagLabsLogin extends BaseDriver {
    @Test
    public void testLogin() {
        LoginPage login = new LoginPage(driver);
        //Enter username & password
        login.enterUsername("standard_user");
        login.enterPassword("secret_sauce");
        HomePage homePage = login.clickLogin();
        Assert.assertEquals(homePage.getTitleText(), "PRODUCTS", "Title is incorrect");
    }

}
