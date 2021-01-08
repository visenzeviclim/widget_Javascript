package com.visenze.mainautomation.tasks;

import com.visenze.mainautomation.pages.Google.Google_Main_Page;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class TypeIntoGoogleSearchBar {
    public static Performable with(String searchItem){
        return Task.where(
                "{0} keyed in " + searchItem,
                Enter.theValue(searchItem).into(Google_Main_Page.SEARCH_BAR).thenHit(Keys.ENTER)
        );
    }
}
