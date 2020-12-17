Business Need: Sign up with different currency

  Scenario: I arrive on the Budget Calculator
  When I click on the sign up button
  And I arrive on the sign up page

  Scenario Outline:  Social links has the correct href on the sign up page
    Given The social link on the sign up page for <social_icon> has the correct href as <social_href>
    Examples:
      | social_icon | social_href                                |
      | Github      | https://github.com/IstvanGercsak           |
      | LinkedIn    | https://www.linkedin.com/in/istvangercsak/ |