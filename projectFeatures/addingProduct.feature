Feature: The Login Page
#  As a ___ (role)
#  I want to ___ (feature)
#  So that ___ (business value)

#  As a logged customer
#  I want to see the products list
#  So that I can add a product to the basket

  Scenario: the logged user should be able to add a product to the basket
    Given the logged user
    When the user sees the products list
    Then the user should be able to add a product to the basket