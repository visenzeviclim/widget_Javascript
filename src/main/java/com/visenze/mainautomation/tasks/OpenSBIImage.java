package com.visenze.mainautomation.tasks;

import com.visenze.mainautomation.action.WaitFor;
import com.visenze.mainautomation.pages.Visenze.SearchByImagePage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class OpenSBIImage {
    public static Performable andWaitForDialogToShow(){
        return Task.where(
                "{0} opens sbi image for basic visual verification",
                Click.on(SearchByImagePage.WIDGET_ICON),
                WaitFor.imageSearchDialogToShow()
        );
    }
}
