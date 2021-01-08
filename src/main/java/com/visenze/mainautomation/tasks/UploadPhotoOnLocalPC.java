package com.visenze.mainautomation.tasks;

import com.visenze.mainautomation.action.FromPCFindAndUploadImage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public class UploadPhotoOnLocalPC {
    public static Performable withThisFile(String sTab, String sFileName){
        return Task.where(
                "{0} uploads file from local drive",
                FromPCFindAndUploadImage.using(sFileName)
        );
    }
}
