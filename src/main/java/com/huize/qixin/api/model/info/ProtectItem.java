package com.huize.qixin.api.model.info;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ProtectItem
{
    private Integer protectItemId;
    private Integer sort;
    private String name;
    private String defaultValue;
    private String description;
    private String relateCoverage;
    
    public Integer getProtectItemId() {
        return this.protectItemId;
    }
    
    public void setProtectItemId(final Integer protectItemId) {
        this.protectItemId = protectItemId;
    }
    
    public Integer getSort() {
        return this.sort;
    }
    
    public void setSort(final Integer sort) {
        this.sort = sort;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public String getDefaultValue() {
        return this.defaultValue;
    }
    
    public void setDefaultValue(final String defaultValue) {
        this.defaultValue = defaultValue;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(final String description) {
        this.description = description;
    }
    
    public String getRelateCoverage() {
        return this.relateCoverage;
    }
    
    public void setRelateCoverage(final String relateCoverage) {
        this.relateCoverage = relateCoverage;
    }
}
