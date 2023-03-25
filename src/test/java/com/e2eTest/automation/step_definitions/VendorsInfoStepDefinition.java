package com.e2eTest.automation.step_definitions;

import java.time.Duration;

import org.json.simple.JSONObject;

import com.e2eTest.automation.page_objects.LoginPage;
import com.e2eTest.automation.page_objects.VendorsInfoPage;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.SeleniumUtils;
import com.e2eTest.automation.utils.Setup;
import com.e2eTest.automation.utils.Validations;
import com.e2eTest.automation.utils.Wait;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VendorsInfoStepDefinition {
	
	private ConfigFileReader configFileReader;
	private VendorsInfoPage vendors;
	private Validations validations;
	private static SeleniumUtils seleniumUtils = new SeleniumUtils();
	static JSONObject object = seleniumUtils.JsonData(0);
	private static long mediumWait = Long.valueOf((String) object.get("MediumWait"));
//	private static long shortmWait = Long.valueOf((String) object.get("ShortWait"));
//	private static long highWait = Long.valueOf((String) object.get("HighWait"));
	private Wait wait;

	public VendorsInfoStepDefinition() {
		vendors = new VendorsInfoPage();
		wait = new Wait(Setup.getDriver());
		validations = new Validations();
		this.configFileReader = new ConfigFileReader();
	}

	@When("Je clique sur le bouton Customors1")
	public void jeCliqueSurLeBoutonCustomors() {
		// customers.clickOnBtnCustomers();
		seleniumUtils.click(vendors.getVendorWrappedElement(vendors.getCustomerIcon()));
	}

	@When("Je clique sur le bouton Sous Menu Vendors")
	public void jeCliqueSurLeBoutonSousMenuVendors() {
		seleniumUtils.waitForElementToBeClickable(vendors.getVendorsBtn());
		seleniumUtils.click(vendors.getVendorWrappedElement(vendors.getVendorsBtn()));

	}

	@When("Je clique sur le bouton1 Add new")
	public void jeCliqueSurLeBouton1AddNew() {
		seleniumUtils.waitForElementToBeClickable(vendors.getAddNewBtn());
		seleniumUtils.click(vendors.getVendorWrappedElement(vendors.getAddNewBtn()));

	}

	@When("Je saisis le Nom de formulaire du Vendeur {string}")
	public void jeSaisisLeNomDeFormulaireDuVendeur(String name) {
		seleniumUtils.writeText(vendors.getVendorWrappedElement(vendors.getName()), name);
	}

	@When("Je rajoute une description du Vendeur {string}")
	public void jeRajouteUneDescriptionDuVendeur(String descript) throws InterruptedException{
		Thread.sleep(mediumWait); 
		wait.forElementToBeDisplayed(Duration.ofSeconds(6), vendors.getVendorWrappedElement(vendors.getFrame()),
				configFileReader.getProperties("Vendor.frameId"));
		seleniumUtils.switchToNewWindow(Setup.getDriver(), configFileReader.getProperties("Vendor.frameId"));
		seleniumUtils.writeText(vendors.getVendorWrappedElement(vendors.getDescription()), descript);
		seleniumUtils.switchToDefaultFrame();
	}

	@When("Je saisis l mail du Vendeur {string}")
	public void jeSaisisLMailDuVendeur(String email) {
		seleniumUtils.writeText(vendors.getVendorWrappedElement(vendors.getEmail()), email);
	}

	@Then("Je me redirige vers la page1 {string}")
	public void jeMeRedirigeVersLaPageHome(String message) throws InterruptedException {
		validations.assertTrue(vendors.getMessage(),"For security purposes, the feature you have requested is not available on the demo site." );
	}

}
