package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2eTest.automation.utils.Setup;

public class CustomersInfoPage {
	
	/* Retrieve Element */
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[@href='#']//p[contains(text(),'Customers')]")
	public static WebElement btnCustomers;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]")
	public static WebElement btnCustomers1;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[@class='btn btn-primary']")
	public static WebElement btnAdd;

	@CacheLookup
	@FindBy(how = How.ID, using = "Email")
	public static WebElement email;

	@CacheLookup
	@FindBy(how = How.ID, using = "Password")
	public static WebElement password;

	@CacheLookup
	@FindBy(how = How.ID, using = "FirstName")
	public static WebElement firstName;

	@CacheLookup
	@FindBy(how = How.ID, using = "LastName")
	public static WebElement lastName;
	
	@FindBy(how = How.XPATH, using = "//button[@name='save']")
	public static WebElement btnSave;

	@FindBy(how = How.XPATH, using = "//h1[@class='float-left']")
	public static WebElement titlePage;
	
	@CacheLookup
	@FindBy(how = How.ID, using = "Gender_Female")
	public static WebElement gender;
	
	@CacheLookup
	@FindBy(how = How.ID, using = "DateOfBirth")
	public static WebElement dateOfBirth;
	
	@CacheLookup
	@FindBy(how = How.ID, using = "Company")
	public static WebElement company;
	
	@CacheLookup
	@FindBy(how = How.ID, using = "IsTaxExempt")
	public static WebElement tax;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//div[@role='listbox'])[1]")
	public static WebElement newsletter;
	
	@CacheLookup
	@FindBy(how = How.ID, using = "VendorId")
	public static WebElement manager;


	public CustomersInfoPage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}

//	/* Create method */
//
//	public void clickOnBtnCustomers() {
//		btnCustomers.click();
//	}
//
//	public void clickOnBtnCustomers1() {
//		btnCustomers1.click();
//	}
//
//	public void clickOnBtnAdd() {
//		btnAdd.click();
//	}
//
//	public void clickOnBtnSave() throws InterruptedException {
//		btnSave.click();
//		Thread.sleep(5000);
//	}
//
//	public void fillEmail(String mail) {
//		email.sendKeys(mail);
//	}
//
//	public void fillPassword(String keysword) {
//		password.sendKeys(keysword);
//	}
//
//	public void fillFirstName(String fName) {
//		firstName.sendKeys(fName);
//	}
//
//	public void fillLastName(String lName) {
//		lastName.sendKeys(lName);
//	}
//
//	public void clickOngender() {
//		gender.click();
//		
//	}
//
//	public void fillDateOfBirthday(String Birth) {
//		dateOfBirth.sendKeys(Birth);
//		
//	}
//
//	public void fillCompanyName(String company2) {
//		company.sendKeys(company2);
//		
//	}

}