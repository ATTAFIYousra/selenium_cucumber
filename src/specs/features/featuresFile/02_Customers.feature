@customers
Feature: Je souhaite tester le module customers

  Background: 
    Given Je me connecte sur l application nopcommerce
    When Je saisis l email "admin@yourstore.com"
    And Je saisis le Password "admin"
    And Je clique sur le bouton LOGIN

  @customers_Info
  Scenario: Remplir les informations de clientele sur l application nopcommerce
    When Je clique sur le bouton Customors
    And Je clique sur le bouton Sous Menu Customors
    And Je clique sur le bouton Add new
    And Je saisis l email de formulaire Customers "yousra20@yourstore.com"
    And Je saisis le FirstName "ATTAFI"
    And Je saisis le LasttName "Yousra"
    And Je saisis le Password de formulaire Customers "admin"
    And Je clique sur le bouton Female
    And Je saisis la date de naissance de customers "07/12/1992"
    And Je choisis le nom de l entreprise "CGI"
    And Je coche la case tax 
    And Je choisis dans Newletter la proposition "Your""Your store name"
    And Je choisis dans gestionnaire du fournisseur la proposition "Vendor""Vendor 1"
    And Je clique sur le bouton Save
    Then Je me redirige vers la page "The new customer has been added successfully."
    And Je clique sur le bouton Logout