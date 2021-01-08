package com.visenze.mainautomation.pages.Visenze;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SearchByImagePage extends PageObject {
    public static final Target WIDGET_ICON = Target.the("Widget Icon").locatedBy(".//div[@id='vs-image-search-camera']");

    public static final Target WIDGET_DIALOG = Target.the("Widget Dialog Main Body").locatedBy(".//div[@class='page ']//div[@class='react-tabs']");
    public static final Target WIDGET_DIALOG_TITLE = Target.the("Widget Dialog Title").locatedBy(".//div[@class='page ']//div[@class='react-tabs']/div[@class='vs-upload-dialog-title']");
    public static final Target WIDGET_DIALOG_DESCRIPTION = Target.the("Widget Dialog Description").locatedBy(".//div[@class='page ']//div[@class='react-tabs']/div[@class='vs-upload-dialog-description']");
    public static final Target WIDGET_DIALOG_TAB = Target.the("Widget Dialog Image Search of {0}").locatedBy(".//div[@class='page ']//div[@class='react-tabs']/ul[@role='tablist']/li[{0}]");
    public static final Target WIDGET_DIALOG_DROPZONE = Target.the("Widget Dialog Dropzone").locatedBy(".//div[@class='page ']//div[@class='react-tabs']//div[@class='vs-dropzone']");
    public static final Target WIDGET_DIALOG_DROPZONE_INPUT = Target.the("Widget Dialog Dropzone").locatedBy(".//div[@class='page ']//div[@class='react-tabs']//div[@class='vs-dropzone']/input");
}
