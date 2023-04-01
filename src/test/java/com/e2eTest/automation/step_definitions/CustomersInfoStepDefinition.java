package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.CustomersInfoPage1;
import com.e2eTest.automation.page_objects.LoginPage;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.RandomValue;
import com.e2eTest.automation.utils.SeleniumUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CustomersInfoStepDefinition {

	public CustomersInfoPage1 customers;
	public SeleniumUtils seleniumUtils;
    private ConfigFileReader configFileReader ;
    public RandomValue randomValue;
    
	public CustomersInfoStepDefinition() {
		customers = new CustomersInfoPage1();
		seleniumUtils = new SeleniumUtils();
		randomValue = new RandomValue();
		this.configFileReader = new ConfigFileReader();
	}

	@When("Je clique sur le bouton Customors")
	public void jeCliqueSurLeBoutonCustomors() {
		//customers.clickOnBtnCustomers();
		seleniumUtils.click(customers.getCustomerWrappedElement(customers.getCustomerIcon()));
	}

	@When("Je clique sur le bouton Sous Menu Customors")
	public void jeCliqueSurLeBoutonCustomors1() {
		//customers.clickOnBtnCustomers1();
		seleniumUtils.click(customers.getCustomerWrappedElement(customers.getCustomerBtn()));
	}

	@When("Je saisis l email de formulaire Customers {string}")
	public void jeSaisisLEmailDeFormulaireCustomers(String email) {
		seleniumUtils.writeText(customers.getCustomerWrappedElement(customers.getEmail()),RandomValue.getSaltString()+"@gmail.com");
	}

	@When("Je saisis le Password de formulaire Customers {string}")
	public void jeSaisisLePasswordDeFormulaireCustomers(String pswd) {
		//customers.fillPassword(pswd);
		seleniumUtils.writeText(customers.getCustomerWrappedElement(customers.getPassword()), pswd);
	}

	@When("Je clique sur le bouton Add new")
	public void jeCliqueSurLeBoutonAddNew() {
		//customers.clickOnBtnAdd();
		seleniumUtils.click(customers.getCustomerWrappedElement(customers.getAddNewBtn()));
	}

	@When("Je saisis le FirstName {string}")
	public void jeSaisisLeFirstName(String fName) {
		//customers.fillFirstName(fName);
		seleniumUtils.writeText(customers.getCustomerWrappedElement(customers.getFirstName()), fName);
	}

	@When("Je saisis le LasttName {string}")
	public void jeSaisisLeLasttName(String lName) {
		//customers.fillLastName(lName);
		seleniumUtils.writeText(customers.getCustomerWrappedElement(customers.getLastName()), lName);
	}

	@When("Je clique sur le bouton Female")
	public void jeChoisisLeGenreDeCustomers() {
		//	customers.clickOngender();
		seleniumUtils.click(customers.getCustomerWrappedElement(customers.getGenderFemale()));
	}
	@When("Je saisis la date de naissance de customers {string}")
	public void jeSaisisLaDateDeNaissanceDeCustomers(String dateOfBirth) {
		//customers.fillDateOfBirthday(dateOfBirth);
		seleniumUtils.writeText(customers.getCustomerWrappedElement(customers.getDateOfBirth()), dateOfBirth);
		
	}
	@When("Je choisis le nom de l entreprise {string}")
	public void jeChoisisLeNomDeLEntreprise(String company) {
		//customers.fillCompanyName(company);
		seleniumUtils.writeText(customers.getCustomerWrappedElement(customers.getCompany()), company);
	}

	@When("Je coche la case tax")
	public void jeCocheLaCaseTax() {
		seleniumUtils.click(customers.getCustomerWrappedElement(customers.getIsTaxExempt()));
	}
	@When("Je choisis dans Newletter la proposition {string}{string}")
	public void jeChoisisDansNewletterLaProposition(String Your, String string) throws InterruptedException {
		//seleniumUtils.click(CustomersInfoPage.newsletter);
		seleniumUtils.autoSuggest(customers.getCustomerWrappedElement(customers.getNewsLetter()),configFileReader.getProperties("newsletterSugg.customers"), configFileReader.getProperties("newsletter.customers"));
	}
	@When("Je choisis dans gestionnaire du fournisseur la proposition {string}{string}")
	public void jeChoisisDansGestionnaireDuFournisseurLaProposition(String Vendor, String Vendor1) throws InterruptedException {
		seleniumUtils.autoSuggest(customers.getCustomerWrappedElement(customers.getManagerOfVender()),Vendor,Vendor1);
	}

	@When("Je clique sur le bouton Save")
	public void jeCliqueSurLeBoutonSave(){
		seleniumUtils.click(customers.getCustomerWrappedElement(customers.getSaveBtn()));
	}

	@Then("Je me redirige vers la page string}")
	public void jeMeRedirigeVersLaPageHome(String title) throws InterruptedException {
		Thread.sleep(5000);
		String title_page = LoginPage.titlePage.getText();
		System.out.println("xxxxx " +title_page);
		//Assert.assertEquals(title_page, title);
	}
}
