package com.huize.qixin.api.model.info;

import java.io.*;

public class AreaInfo implements Serializable
{
    private static final long serialVersionUID = -8652304487254340472L;
    private String areaName;
    private String areaCode;
    
    public String getAreaName() {
        return this.areaName;
    }
    
    public void setAreaName(final String areaName) {
        this.areaName = areaName;
    }
    
    public String getAreaCode() {
        return this.areaCode;
    }
    
    public void setAreaCode(final String areaCode) {
        this.areaCode = areaCode;
    }
}
