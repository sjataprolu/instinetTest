package com.instinet.commonfunctions;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebElement;

import java.util.List;

public class setup {
    public static WebDriver driver=null;

    public setup() {
        {
            if (driver == null) {
                String chromepath;
                chromepath =System.getProperty("user.dir") +"\\src\\main\\resources\\drivers\\chromedriver.exe";
                System.setProperty("webdriver.chrome.driver",chromepath);
                ChromeOptions options = new ChromeOptions();
                options.addArguments("start-maximized");
                driver = new ChromeDriver(options);
            }
        }
    }

    public static WebDriver getdriver()
    {
        if (driver == null){

            return driver;
        }else{
            return driver;
        }
    }

    public void clickOnLink(String GenreName, List<WebElement> genre) {
        for (int i = 0; i < genre.size(); i++) {
            if (genre.get(i).getText().contains(GenreName)) {
                ((RemoteWebElement) genre.get(i)).findElementByLinkText(GenreName).click();
                break;
            }
        }
    }

}

