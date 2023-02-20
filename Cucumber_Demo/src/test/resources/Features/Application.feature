Feature: Test the sorting order

  Scenario: Verifying whether the given numbers are in sorted order or not
    Given set of numbers as a String arguments "1""2""4""3"
    When those numbers are sorted
    Then print the sorted Array
