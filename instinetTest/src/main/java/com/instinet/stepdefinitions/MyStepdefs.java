package com.instinet.stepdefinitions;

import com.instinet.commonfunctions.pages.TopRatedMoviesPage;
import com.instinet.commonfunctions.pages.imdbHomePage;
import com.instinet.commonfunctions.setup;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.Calendar;
import java.util.List;


public class MyStepdefs extends setup {

    WebDriver driver=getdriver();

    @Given("I load the Top Rated Movies page")
    public void iLoadTheTopRatedMoviesPage() throws Throwable {
        driver.get("https://www.imdb.com/");
        new imdbHomePage().movietvshowTime("Top Rated Movies");
    }

    @And("I refine by Genre {string}")
    public void iRefineByGenre(String arg0) throws Throwable {
        new TopRatedMoviesPage().clickMoviesByGenre(arg0);
    }

    @Then("the list of movies should only contain relevant results")
    public void theListOfMoviesShouldOnlyContainRelevantResults() {
        WebElement actualText=driver.findElement(By.cssSelector(".genre"));
        String text=actualText.getText();
        Assert.assertTrue(text.contains("Comedy"));
    }

    @And("I sort the list by {string}")
    public void iSortTheListBy(String arg0) throws Throwable {
        new TopRatedMoviesPage().sortby(arg0);
    }

    @Then("the list of movies should be displayed in order of release date")
    public void theListOfMoviesShouldBeDisplayedInOrderOfReleaseDate() {
        String currentyear=Integer.toString(Calendar.getInstance().get(Calendar.YEAR));
        List<WebElement> firstmovieintheList=driver.findElements(By.cssSelector(".lister-list ,titleColumn .secondaryInfo"));
        String text=firstmovieintheList.get(0).getText();
        Assert.assertTrue(text.contains(currentyear));
    }
}
