@smoke_test
@dhrd
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

  @logout
  Scenario: Je souhaite me deconnecter de l'application Nopcommerce
    When Je clique sur le bouton logout
    Then Je me redirige vers a page login ""
    
    
    
    
