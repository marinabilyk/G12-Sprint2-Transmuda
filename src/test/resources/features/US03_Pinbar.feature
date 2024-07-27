Feature: Learn how to use pinbar


  Background:
    Given the user is on the login page

  @B34G12-156 @wip
  Scenario: Users see instructional content when clicking the "Learn how to use this space" link
    Given the user logged in as "driver"
    When the user clicks the "Learn how to use this space" link
    Then the user should see "How To Use Pinbar"
    And the user should see "Use the pin icon on the right top corner of the page to create fast access link in the pinbar."
    And the user should see an image with source "/bundles/oronavigation/images/pinbar-location.jpg"

