package com.visenze.mainautomation.pages.Google;

import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Google_Result_Page extends PageObject {
    public static final Target RESULT_PAGE = Target.the("Result").locatedBy(".//h3/span[text()='{0}']");
    public static final Target RESULT_PAGE_PREV_RESULT = Target.the("Result").locatedBy(".//h3/span[text()='{0}']/ancestor::div[@class='g']/preceding-sibling::div[1]");
    public static final Target RESULT_PAGE_WIKI = Target.the("Result Wiki").locatedBy(".//div[@class='mw-parser-output']/p[{0}]");
}
