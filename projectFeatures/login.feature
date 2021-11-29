Feature: The Login Page
#  As a ___ (role)
#  I want to ___ (feature)
#  So that ___ (business value)

#  As a returning customer
#  I want to login to the application
#  So that I can view my account

  Scenario: the user should be able to login with valid credentials
    Given the user is on the login page
    When the user enters valid credentials
    Then the user should be able to view account