Feature: Contact us form

  @tag1
  Scenario Outline: Verify if the user clicks on contact us link the form displays and confirm the message when user click register button after entering valid data
    Given Already opened the protrainingtech.com
    When user clicks on the contact us link
    Then user able to see contact us form
    When user enters value for First Name "<FirstName>"
    And user enters value for Last Name "<LastName>"
    And user enters value for Email "<Email>"
    And user enters value for Phone "<Phone>"
    And user clicks register button
    Then user should see confirmation message

    Examples: 
      | FirstName | LastName | Email                  | Phone      |
      | Nadeem    | Shabaz   | protraingtech@gmail.co | 7031346790 |
