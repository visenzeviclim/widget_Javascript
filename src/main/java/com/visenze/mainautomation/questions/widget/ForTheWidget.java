package com.visenze.mainautomation.questions.widget;

import com.visenze.mainautomation.pages.Visenze.FindSimilarProdDiagPage;
import com.visenze.mainautomation.pages.Visenze.SearchByImagePage;
import com.visenze.mainautomation.utils.WaitUtils;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

public class ForTheWidget {
    public static Question<Boolean> theIconShouldShows(){
        return actor -> SearchByImagePage.WIDGET_ICON.resolveFor(actor).isPresent();
    }


    public static Question<Boolean> theImageDialogBodyShouldDisplay(){
        Target target = SearchByImagePage.WIDGET_DIALOG;
        return actor -> {
            WaitUtils.waitForElementToShow(target, actor);
            return target.resolveFor(actor).isEnabled();
        };
    }

    public static Question<String> theImageDialogTitleShouldDisplay(){
        return actor -> SearchByImagePage.WIDGET_DIALOG_TITLE.resolveFor(actor).getText();
    }

    public static Question<String> theImageDialogDescriptionShouldDisplay(){
        return actor -> SearchByImagePage.WIDGET_DIALOG_DESCRIPTION.resolveFor(actor).getText();
    }

    public static Question<String> theImageDialogTabNameShouldDisplayForTab(int tabNum){
        return actor -> SearchByImagePage.WIDGET_DIALOG_TAB.of(Integer.toString(tabNum)).resolveFor(actor).getText();
    }

    public static Question<String> theFindSimilarProductDialogShouldShow(){
        return actor -> FindSimilarProdDiagPage.HEADER_TITLE.resolveFor(actor).getText();
    }
}
