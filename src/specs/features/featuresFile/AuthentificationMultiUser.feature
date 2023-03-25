@connexion
Feature: Authentification avec multi utilisateur
  Je souhaite me connecter sur l application avec multi utilisateur

  @multi_utilisateur
  Scenario Outline: Je souhaite me connecter sur l application avec multi utilisateur
    Given Je me connecte sur l application nopcommerce
    When Je saisis l email "<email>"
    And Je saisis le Password "<password>"
    And Je clique sur le bouton LOGIN

    Examples: 
      | email               | password  |
      | admin@yourstore.com | admin     |
      | Atef@gmail.com      | Atef123   |
      | Hanen@gmail.com     | Hanen123  |
      | Yousra@gmail.com    | Yousra123 |
      | Amir@gmail.com      | Amir123   |
