package com.instinet.commonfunctions.pages;

import com.instinet.commonfunctions.setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TopRatedMoviesPage extends setup {
    WebDriver driver = getdriver();

    private List<WebElement> genre = driver.findElements(By.cssSelector(".quicklinks li"));
    private Select sortByDropDown= new Select(driver.findElement(By.id("lister-sort-by-options")));


    public void clickMoviesByGenre(String GenreName) throws Throwable {
        clickOnLink(GenreName, genre);
    }

    public void sortby(String sortbyName) throws  Throwable{
        sortByDropDown.selectByVisibleText(sortbyName);
    }
}
