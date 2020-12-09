Business Need: Testing the Landing page for the Budget Calculator

  Scenario: I arrive on the Budget Calculator landing page
    Given I open the browser and get the title

  Scenario Outline: Social links are available and has a correct href
    Given The social link for <social_icon> is available

    Examples:
      | social_icon |
      | Github      |
      | LinkedIn    |

  Scenario Outline:  Social links has the correct href
    Given The social link for <social_icon> has the correct href as <social_href>
    Examples:
      | social_icon | social_href                                |
      | Github      | https://github.com/IstvanGercsak           |
      | LinkedIn    | https://www.linkedin.com/in/istvangercsak/ |

  Scenario: The back button is redirect us to the landing page
    Given I click on the sign up button
    When I click on the back button
    Then I arrive on the landing page