Feature: Top Rated Movies

  @Runthistest
  Scenario: Refining Movies List by Genre
    Given I load the Top Rated Movies page
    And I refine by Genre "Comedy"
    Then the list of movies should only contain relevant results

  @Runthistest
  Scenario: Sorting Movies List (by Release Date)
  The user is able to change the ordering of the list of titles based on the year in which the movie
  was released.
    Given I load the Top Rated Movies page
    And I sort the list by "Release Date"
    Then the list of movies should be displayed in order of release date
