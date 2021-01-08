package com.visenze.mainautomation.action;

import com.visenze.mainautomation.pages.Visenze.SearchByImagePage;
import com.visenze.mainautomation.utils.ResourceFileUtils;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class FromPCFindAndUploadImage implements Interaction {

    private final String sFileName;

    public FromPCFindAndUploadImage(String sFileName){
        this.sFileName = sFileName;
    }

    @Override
    @Step("{0} uploads #sFileName")
    public <T extends Actor> void performAs(T actor) {
        WebElement dropAreaInput = SearchByImagePage.WIDGET_DIALOG_DROPZONE_INPUT.resolveFor(actor);
        WebElement dropArea = SearchByImagePage.WIDGET_DIALOG_DROPZONE.resolveFor(actor);
        String rPath = ResourceFileUtils.getRelativeFilePath("images",this.sFileName);

        // Reveal <input type = 'file'>
        String script = String.format("arguments[0].style='%s'","");
        ((JavascriptExecutor) getDriver()).executeScript(script,dropAreaInput);

        // Will require one more round of element hunting as obtaining webelement directly from target is not allowed
        WebElement dropAreaEL = dropArea.findElement(By.xpath("./input"));
        ((RemoteWebElement) dropAreaEL).setFileDetector(new LocalFileDetector());
        dropAreaEL.sendKeys(rPath);

    }
    public static Interaction using(String sFileName){
        return Tasks.instrumented(FromPCFindAndUploadImage.class, sFileName);
    }
}