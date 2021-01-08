package com.visenze.mainautomation.utils;

import java.net.URL;

public class ResourceFileUtils {
    public static String getRelativeFilePath(String sFolderWhereYourFileOfInterestIs, String sFileOfInterest){
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        URL url = loader.getResource(sFolderWhereYourFileOfInterestIs);
        if(url !=null) {
            return url.getPath()+"/"+sFileOfInterest;
        } else {
            return "";
        }
    }
}
