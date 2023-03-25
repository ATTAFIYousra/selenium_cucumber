@authentification
Feature: Authentification de login de l application nopcommerce
  En tant que utilisateur, je souhaite naviger

  Background: 
    Given Je me connecte sur l application nopcommerce
    When Je saisis l email "admin@yourstore.com"
    And Je saisis le Password "admin"
    And Je clique sur le bouton LOGIN

  @login_CasPassant
  Scenario: Authentification sur l applicaion nopcommerce - Cas Passant
    Then Je me redirige vers la page home "Dashboard"

  @logout_1
  Scenario: Logout de l applicaion nopcommerce
    When Je clique sur le bouton Logout
    Then Je me redirige vers la page "home Admin area demo"

    
    