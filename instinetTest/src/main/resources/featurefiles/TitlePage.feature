Feature: Title Page. Title Page describe about the movie that we have searched for which include cast and crew with
  some Trailers of the movie and user reviews

  Scenario: Watch Trailer of the movie
    Given I search for "The Imitation Game"
    Then I should see Trailers in the videos section

  Scenario: Add to Watchlist the movie for Existing user
    Given I logged in to imdb website
    When I search for "The Imitation Game"
    Then I should be able to watchlist

  Scenario: Logged in User to should be able to edit the page
    Given I logged in to imdb website
    When search for "The Imitation Game"
    Then I should be able edit the page

  Scenario: user should be able to see different section of the film
    Given I search for "The Imitation Game"
    Then I should be able to see following section
      | Videos                     |
      | Photos                     |
      | More Like This             |
      | Cast                       |
      | Storyline                  |
      | Details                    |
      | Box Office                 |
      | Company Credits            |
      | Technical Specs            |
      | Did You Know?              |
      | Frequently Asked Questions |
      | User Reviews               |

