@authentification
Feature: Authentification de login de l application SwagLabs
  En tant que utilisateur, je souhaite naviger

  @login_CasPassant
  Scenario: Authentification sur l applicaion SwagLas - Cas Passant
    Given Je me connecte sur l application SwagLabs
    When Je saisis le user name "standard_user"
    And Je saisis le Password "secret_sauce"
    And Je clique sur le bouton LOGIN
    Then Je me redirige vers la page home "PRODUCTS"
