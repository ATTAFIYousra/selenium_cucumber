@vendors
Feature: Je souhaite tester le module Vendors

  Background: 
    Given Je me connecte sur l application nopcommerce
    When Je saisis l email "admin@yourstore.com"
    And Je saisis le Password "admin"
    And Je clique sur le bouton LOGIN

  @vendors_Info
  Scenario: Remplir les informations des vendeurs sur l application nopcommerce
    When Je clique sur le bouton Customors1
    And Je clique sur le bouton Sous Menu Vendors
    And Je clique sur le bouton1 Add new
    And Je saisis le Nom de formulaire du Vendeur "Yousra"
    And Je rajoute une description du Vendeur "Vendeur Gold"
    And Je saisis l mail du Vendeur "attafi123.yos4@gmail.com"
    And Je clique sur le bouton Save
    Then Je me redirige vers la page1 "For security purposes, the feature you have requested is not available on the demo site."
    And Je clique sur le bouton Logout