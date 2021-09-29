# autor: Valentina

  @stories
  Feature: Prueba tecnica
    Enter the platform and log in
  @scenario1
  Scenario: platform registration
    Given since Valentina entered the platform
    When she you register
      | starFirtsname | strLastname | strEmail | strCity | strPostalcode | strCountry | strPassword | strConfirmPassword|
      | <Valentina> | <Garzon Arismendi> | <valentinagarzon1717@gmail.com> | <Pereira> || <606> | <Colombia> | <Valentina1234> | <Valentina1234> |

    Then  click enter