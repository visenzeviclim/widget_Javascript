package com.visenze.mainautomation.action;

import com.visenze.mainautomation.pages.Visenze.SearchByImagePage;
import com.visenze.mainautomation.utils.WaitUtils;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class WaitFor implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        WaitUtils.waitForElementToShow(SearchByImagePage.WIDGET_DIALOG, actor);
    }

    public static Interaction imageSearchDialogToShow(){
        return Tasks.instrumented(WaitFor.class);
    }
}
