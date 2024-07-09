Feature: Main Modules

  Scenario Outline: Sales manager sees 8 main modules
    Given the user logged in as "<userType>"
    Then user sees "<module name>" module MB

    Examples:
      | userType      | module name        |
      | store manager | dashboard          |
      | store manager | fleet              |
      | store manager | customers          |
      | store manager | sales              |
      | store manager | activities         |
      | store manager | marketing          |
      | store manager | reports & segments |
      | store manager | system             |

    Examples:
      | userType      | module name        |
      | sales manager | dashboard          |
      | sales manager | fleet              |
      | sales manager | customers          |
      | sales manager | sales              |
      | sales manager | activities         |
      | sales manager | marketing          |
      | sales manager | reports & segments |
      | sales manager | system             |
