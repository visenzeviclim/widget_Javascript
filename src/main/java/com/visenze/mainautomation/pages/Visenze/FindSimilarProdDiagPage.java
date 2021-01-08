package com.visenze.mainautomation.pages.Visenze;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FindSimilarProdDiagPage extends PageObject {
    public static final Target HEADER_TITLE = Target.the("Title").locatedBy(".//div[@class='vs-dialog-title']");
    public static final Target HEADER_LOGO = Target.the("Visenze Logo").locatedBy(".//div['vs-logo']");

    public static final Target FILTER_DROPDOWN = Target.the("Filter dropdown").locatedBy(".//div[@class='vs-filter-dropdown']/div[{0}]");
    public static final Target FILTER_DROPDOWN_SELECT = Target.the("Filter dropdown select").locatedBy(".//label/div[@data-tip='{0}']");
    public static final Target FILTER_MOREFILTER_BTN = Target.the("More filter button").locatedBy(".//div[@class='vs-filter-dropdown']/button");
}
