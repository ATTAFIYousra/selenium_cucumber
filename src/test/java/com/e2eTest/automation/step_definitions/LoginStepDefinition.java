package com.e2eTest.automation.step_definitions;

import org.junit.Assert;

import com.e2eTest.automation.page_objects.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	
	public LoginPage loginPage;
	public LoginStepDefinition() {
		loginPage = new LoginPage();
	}

	@Given("Je me connecte sur l application nopcommerce")
	public void jeMeConnecteSurLApplicationNopcommerce() {
		loginPage.goToUrl();
	}

	@When("Je saisis l email {string}")
	public void jeSaisisLEmail(String email) {
		loginPage.fillEmail(email);
	}

	@And("Je saisis le Password {string}")
	public void jeSaisisLePassword(String password) {
		loginPage.fillPassword(password);
	}

	@And("Je clique sur le bouton LOGIN")
	public void jeCliqueSurLeBoutonLOGIN() {
		loginPage.clickOnBtnLogin();
	}

	@Then("Je me redirige vers la page home {string}")
	public void jeMeRedirigeVersLaPageHome(String title) {
		String title_page = LoginPage.titlePage.getText();
		Assert.assertEquals(title_page, title);
	}

}
