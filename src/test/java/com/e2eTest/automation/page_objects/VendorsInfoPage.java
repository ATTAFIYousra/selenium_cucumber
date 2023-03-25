package com.e2eTest.automation.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;

import com.e2eTest.automation.utils.Setup;

public class VendorsInfoPage {

	private WebDriver driver = Setup.getDriver();
	private By customersIcon = By.xpath("//a[@href='#']//p[contains(text(),'Customers')]");
	private By vendorsBtn = By.xpath("//p[normalize-space()='Vendors']");
	private By addNewBtn = By.xpath("//a[normalize-space()='Add new']");
	private By name = By.id("Name");
	private By frame = By.xpath("//iframe[@id='Description_ifr']");
	private By description = By.xpath("//*[@id=\"tinymce\"]/p");
	private By email = By.id("Email");
	private By saveBtn = By.xpath("//button[@name='save']");
	private By message = By.xpath("//div[@class='alert alert-danger alert-dismissable']");

	/*
	 * this code will locate a web element on the web page using the emailLocator
	 * mechanism and return it as a WebElement object.
	 */
	public WebElement getCustomerIcon() {
		return driver.findElement(customersIcon);
	}

	public WebElement getVendorsBtn() {
		return driver.findElement(vendorsBtn);
	}

	public WebElement getAddNewBtn() {
		return driver.findElement(addNewBtn);
	}

	public WebElement getEmail() {
		return driver.findElement(email);
	}

	public WebElement getName() {
		return driver.findElement(name);
	}

	public WebElement getDescription() {
		return driver.findElement(description);
	}

	public WebElement getSaveBtn() {
		return driver.findElement(saveBtn);
	}

	public WebElement getMessage() {
		return driver.findElement(message);
	}

	public WebElement getFrame() {
		return driver.findElement(frame);
	}

	public WebElement getVendorWrappedElement(WebElement webelement) {
		WrapsElement wrappedVendorwebelement = new WrapsElement() {
			public WebElement getWrappedElement() {
				return webelement;
			}
		};
		return wrappedVendorwebelement.getWrappedElement();

	}
}
