Feature: login functionality test

   Scenario Outline: Enter the education form
    Given First start page
      And I enter the name a Primary_School '<primary_School>'
      And I enter the name a Secondary_School '<secondary_School>'
      And I enter the name a Intermediate '<intermediate>'
     When I enter the name a Engineering '<engineering>'
     When I enter the name a University '<university>'
     When I enter the intermediate_Percentage '<intermediate_Percentage>'
     When  I click on gender '<gender>'
     And browser quit

    Examples:
      | primary_School           | secondary_School        | intermediate| engineering                   |University|intermediate_Percentage |
      | model mission high school|model mission high school|sri chaitanya|pulla reddy engineering college|JNTU      |Intermediate Percentage |



	