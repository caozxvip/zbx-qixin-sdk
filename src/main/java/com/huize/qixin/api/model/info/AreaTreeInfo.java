package com.huize.qixin.api.model.info;

import com.fasterxml.jackson.annotation.*;
import java.util.*;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AreaTreeInfo
{
    private String areaName;
    private String areaCode;
    private String parentAreaCode;
    private List<AreaTreeInfo> children;
    
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
    
    public String getParentAreaCode() {
        return this.parentAreaCode;
    }
    
    public void setParentAreaCode(final String parentAreaCode) {
        this.parentAreaCode = parentAreaCode;
    }
    
    public List<AreaTreeInfo> getChildren() {
        return this.children;
    }
    
    public void setChildren(final List<AreaTreeInfo> children) {
        this.children = children;
    }
}
