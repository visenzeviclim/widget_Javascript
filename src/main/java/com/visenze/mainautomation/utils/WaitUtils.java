package com.visenze.mainautomation.utils;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class WaitUtils {
    public static void waitForElementToShow(Target target, Actor actor){
        new WebDriverWait(getDriver(), 20)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(200))
                .until(ExpectedConditions.visibilityOf(target.resolveFor(actor)));
    }
}
