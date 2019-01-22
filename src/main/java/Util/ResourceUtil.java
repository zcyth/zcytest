package Util;

import java.io.File;

public class ResourceUtil {

    public static String getRootPath(){
        File file = new File("");
        String path = file.getAbsolutePath();
        return path;
    }

    public static String getClassPath(){
        String path = Class.class.getResource("/").getPath();
        return path;
    }
}
