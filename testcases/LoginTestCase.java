package com.ip.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.ip.pages.Login;
import com.ip.testbase.TestBase;

public class LoginTestCase extends TestBase{

	@Test
	public void test1() {
		Login log = PageFactory.initElements(driver, Login.class);
		log.clickLogin();
		log.setEmail(prop.getProperty("username"));
		log.setPassword(prop.getProperty("password"));
		log.login();
	}
}
