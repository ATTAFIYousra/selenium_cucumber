package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.e2eTest.automation.utils.Setup;

public class LogoutPage {
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Logout')]")
	public static WebElement LogoutBtn;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div[1]")
	public static WebElement titlePage1;
	
	public LogoutPage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}
	
	public void clickOnLogoutBtn() {
		LogoutBtn.click();
	}

}

