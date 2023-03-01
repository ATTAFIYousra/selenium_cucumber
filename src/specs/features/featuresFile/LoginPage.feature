@authentification
Feature: Authentification de login de l application nopcommerce
  En tant que utilisateur, je souhaite naviger

  @login_CasPassant
  Scenario: Authentification sur l applicaion nopcommerce - Cas Passant
    Given Je me connecte sur l application nopcommerce
    When Je saisis l email "admin@yourstore.com"
    And Je saisis le Password "admin"
    And Je clique sur le bouton LOGIN
    Then Je me redirige vers la page home "Dashboard"