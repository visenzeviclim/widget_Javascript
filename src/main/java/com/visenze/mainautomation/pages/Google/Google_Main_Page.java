package com.visenze.mainautomation.pages.Google;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class Google_Main_Page extends PageObject {
    public static final Target SEARCH_BAR = Target.the("Main Searchbar").locatedBy(".//input[@class='gLFyf gsfi']");
}
