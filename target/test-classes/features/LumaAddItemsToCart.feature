Feature: Add Items to Cart in Luma Application

  Scenario Outline: Add Mens Tops Jackets to cart
    Given I Login to Luma application with valid Login Details "<emailid>" and "<password>"
    And I navigate to jackshirt page
    When I select a Jaacket of "<size>" "<color>"
    And Click on add to cart button
    Then Cart should be updated

    Examples: 
      | emailid                     | password    | size | color |
      | ravindrareddy0123@gmail.com | welcome123! | XS    | Black  |
      | ravindrareddy0123@gmail.com | welcome123! | L    | Orange  |
