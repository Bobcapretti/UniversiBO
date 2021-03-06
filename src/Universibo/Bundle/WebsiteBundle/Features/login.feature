Feature: Login
  In order to use my custom settings
  As registered user
  I need to login
  
  Scenario: Logging in as an Administrator
    Given I'm not logged in
    And user "admin" has accepted privacy policy
    When I click on "Login" link
    And I type "admin" on "username" field
    And I type "padrino" on "password" field
    And I click on "Login" button
    Then text "Benvenuto admin" should be present
    And text "Il tuo livello di utenza è Admin" should be present

  Scenario: Logging in as a Moderator
    Given I'm not logged in
    And user "moderator" has accepted privacy policy
    When I click on "Login" link
    And I type "moderator" on "username" field
    And I type "padrino" on "password" field
    And I click on "Login" button
    Then text "Benvenuto moderator" should be present
    And text "Il tuo livello di utenza è Collaboratore" should be present

  Scenario: Logging in as a Student
    Given I'm not logged in
    And user "student" has accepted privacy policy
    When I click on "Login" link
    And I type "student" on "username" field
    And I type "padrino" on "password" field
    And I click on "Login" button
    Then text "Benvenuto student" should be present
    And text "Il tuo livello di utenza è Studente" should be present

  Scenario: Logging in as a Professor
    Given I'm not logged in
    And user "professor" has accepted privacy policy
    When I click on "Login" link
    And I type "professor" on "username" field
    And I type "padrino" on "password" field
    And I click on "Login" button
    Then text "Benvenuto professor" should be present
    And text "Il tuo livello di utenza è Docente" should be present

  Scenario: Logging in as a Tutor
    Given I'm not logged in
    And user "tutor" has accepted privacy policy
    When I click on "Login" link
    And I type "tutor" on "username" field
    And I type "padrino" on "password" field
    And I click on "Login" button
    Then text "Benvenuto tutor" should be present
    And text "Il tuo livello di utenza è Tutor" should be present

  Scenario: Logging in as a non-teaching staff member
    Given I'm not logged in
    And user "staff" has accepted privacy policy
    When I click on "Login" link
    And I type "staff" on "username" field
    And I type "padrino" on "password" field
    And I click on "Login" button
    Then text "Benvenuto staff" should be present
    And text "Il tuo livello di utenza è Personale non docente" should be present