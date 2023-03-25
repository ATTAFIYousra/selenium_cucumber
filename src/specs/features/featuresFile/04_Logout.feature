@deconnexion
Feature: logout de l application nopcommerce
  En tant que utilisateur, je me deconnecte de l application nopcommerce

  Background: 
    Given Je me connecte sur l application nopcommerce
    When Je saisis l email "admin@yourstore.com"
    And Je saisis le Password "admin"
    And Je clique sur le bouton LOGIN

  @logout
  Scenario: Logout de l applicaion nopcommerce
    When Je clique sur le bouton Logout
    Then Je me redirige vers la page "Admin area demo"
