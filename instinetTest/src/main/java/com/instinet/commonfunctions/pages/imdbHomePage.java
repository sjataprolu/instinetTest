package com.instinet.commonfunctions.pages;

import com.instinet.commonfunctions.setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.util.List;

public class imdbHomePage extends setup {

    WebDriver driver=getdriver();


    private WebElement moviestvshows=driver.findElement(By.id("navTitleMenu"));
    private List<WebElement> selectionList=driver.findElements(By.cssSelector(".subNavListContainer ul"));


    public void movietvshowTime(String nameoflink) throws Throwable{
        Actions builder=new Actions(driver);
        builder.moveToElement(moviestvshows).perform();
        Thread.sleep(2000);
        clickOnLink(nameoflink, selectionList);
        Thread.sleep(5000);
    }

}
