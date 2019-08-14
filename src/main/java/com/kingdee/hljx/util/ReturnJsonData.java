package com.kingdee.hljx.util;

public class ReturnJsonData {
    public static String formatJson(boolean success, String msg) {
        return "{\"data\":{\"success\":\"" + success + "\",\"msg\":\"" + msg + "\"}}";
    }
}
