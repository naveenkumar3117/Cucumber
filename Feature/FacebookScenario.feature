
Feature: Facebook Login

  Scenario Outline: Facebook Login
    Given Launch Browser and get facebook
    When enter username and password"<name>","<password>"
    And click login
    Then validate homepage

    Examples: 
      | name  | password|
      | naveen |     5sdas |
      |divya|534f523|
      |uma|43232rfs|
      
