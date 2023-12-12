Feature: Exploring the ArrayPage

  Scenario: 
    Given The user is in the Array page after logged in
    When The user clicks "Arrays in Python" button
    Then The user should be redirected to "Arrays in Python" page

  Scenario: 
    Given The user is in the Basic Operations in List page after logged in
    When The user clicks "Try Here" button in Arrays using List page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  Scenario: 
    Given The user is in the Array page after logged in
    When The user clicks "Arrays Using List" button
    Then The user should be redirected to "Arrays using List" page

  Scenario: 
    Given The user is in the Applications of Array page after logged in
    When The user clicks "Try Here" button in Arrays Using Lists page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  Scenario: 
    Given The user is in the Array page after logged in
    When The user clicks "Basic Operations in Lists" button
    Then The user should be redirected to "Basic Operations in List" page

  Scenario: 
    Given The user is in the Basic Operations in Lists page after logged in
    When The user clicks "Try Here" button in Basic Operations in Lists page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  Scenario: 
    Given The user is in the Applications of Array page after logged in
    When The user clicks "Applications of Array" button
    Then The user should be redirected to "Applications of Array" page

  Scenario: 
    Given The user is in the Applications of Array page after logged in
    When The user clicks "Try Here" button in Applications of Array page
    Then The user should be redirected to a page having an tryEditor with a Run button to test
