Feature: Top Rated Movies

  Scenario: Refining Movies List by Genre
    Given I load the Top Rated Movies Page
    And I refine by Genre "Comedy"
    Then list of movies should only contain relevant results


  Scenario: Sorting Movies by year
    Given I load the Top Rated Movies Page
    And I sort the list by "Release Date"
    Then the list of movies should be displayed in order of release date