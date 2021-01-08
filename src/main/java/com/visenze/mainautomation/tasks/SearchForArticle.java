package com.visenze.mainautomation.tasks;

import com.visenze.mainautomation.pages.Google.Google_Result_Page;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class SearchForArticle {
    public static Performable of(String searchArticle){
        return Task.where(
                "{0} search for the article " + searchArticle,
                Scroll.to(Google_Result_Page.RESULT_PAGE_PREV_RESULT.of(searchArticle)),
                Click.on(Google_Result_Page.RESULT_PAGE.of(searchArticle))
        );
    }
}
