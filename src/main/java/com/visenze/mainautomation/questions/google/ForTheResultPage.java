package com.visenze.mainautomation.questions.google;

import com.visenze.mainautomation.pages.Google.Google_Result_Page;
import net.serenitybdd.screenplay.Question;

public class ForTheResultPage {
    public static Question<String> paragraphOf(String paragraphNum){
        return actor -> Google_Result_Page.RESULT_PAGE_WIKI.of(paragraphNum).resolveFor(actor).getText();
    }
}