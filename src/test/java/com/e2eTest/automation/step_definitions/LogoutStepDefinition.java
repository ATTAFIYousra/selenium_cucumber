package com.e2eTest.automation.step_definitions;

import org.junit.Assert;

import com.e2eTest.automation.page_objects.LogoutPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutStepDefinition {

	public LogoutPage logoutPage;

	public LogoutStepDefinition() {
		logoutPage = new LogoutPage();
	}

	@When("Je clique sur le bouton Logout")
	public void jeCliqueSurLeBoutonLogout() {
		logoutPage.clickOnLogoutBtn();
	}

	@Then("Je me redirige vers la page {string}")
	public void jeMeRedirigeVersLaPage(String title) {
		String title_page1 = LogoutPage.titlePage1.getText();
		Assert.assertTrue(title_page1.contains(title));
	}
}
