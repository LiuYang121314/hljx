package com.kingdee.hljx.util;

public enum FinalVariable {

    WHITE1("/getaccs"),
    WHITE2("/load"),
    MAIN("MAIN"),
    USER("USER");

    //    private String[] whiteList = {"/getaccs","/load"};
    private String value;

    private FinalVariable(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
