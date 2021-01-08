package com.visenze.mainautomation.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import java.util.regex.Pattern;

public class Navigate {
    public static Performable toWebPage(String webURL){
        return Task.where(
                "{0} launched " + webURL,
                Open.browserOn().thePageNamed("google.page")
        );
    }

    public static Performable toPage(String pageName){
        String pageNameWithPage = pageName.replace(" ",".")+".page";
        return Task.where(
                "{0} launched " + pageName,
                Open.browserOn().thePageNamed(pageNameWithPage)
        );
    }
}
