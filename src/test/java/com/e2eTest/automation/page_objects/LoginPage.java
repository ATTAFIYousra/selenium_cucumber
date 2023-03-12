package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.Setup;

public class LoginPage {
	
	private ConfigFileReader configFileReader;

	/* Retrieve Element */
	@CacheLookup
	@FindBy(how = How.ID, using = "Email")
	public static WebElement email;

	@CacheLookup
	@FindBy(how = How.ID, using = "Password")
	public static WebElement password;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	public static WebElement btnLogin;
	
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Dashboard')]")
	public static WebElement titlePage;
	
	public LoginPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		this.configFileReader = new ConfigFileReader();
	}

	/* Create method */
	public void goToUrl() {
		Setup.getDriver().get(configFileReader.getProperties("home.url"));
	}

	public void fillEmail(String mail) {
		email.clear();
		email.sendKeys(mail);
	}

	public void fillPassword(String keyword) {
		password.clear();
		password.sendKeys(keyword);
	}

	public void clickOnBtnLogin() {
		btnLogin.click();
	}
}
