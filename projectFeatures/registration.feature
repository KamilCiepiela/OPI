Feature: The Login Page
#  As a ___ (role)
#  I want to ___ (feature)
#  So that ___ (business value)

#  As a new customer
#  I want to go to registration page
#  So that I can create an account

  Scenario: the user should be able to login with valid credentials
    Given the user does not have a valid account
    When the user goes to registration page
    Then the user should be able to create an account