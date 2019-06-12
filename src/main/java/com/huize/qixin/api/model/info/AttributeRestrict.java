package com.huize.qixin.api.model.info;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AttributeRestrict
{
    private String name;
    private Byte conditions;
    private String remind;
    private Integer attributeType;
    private String value;
    private Byte unit;
    private String apiName;
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public Byte getConditions() {
        return this.conditions;
    }
    
    public void setConditions(final Byte conditions) {
        this.conditions = conditions;
    }
    
    public String getValue() {
        return this.value;
    }
    
    public void setValue(final String value) {
        this.value = value;
    }
    
    public String getApiName() {
        return this.apiName;
    }
    
    public void setApiName(final String apiName) {
        this.apiName = apiName;
    }
    
    public Byte getUnit() {
        return this.unit;
    }
    
    public void setUnit(final Byte unit) {
        this.unit = unit;
    }
    
    public String getRemind() {
        return this.remind;
    }
    
    public void setRemind(final String remind) {
        this.remind = remind;
    }
    
    public Integer getAttributeType() {
        return this.attributeType;
    }
    
    public void setAttributeType(final Integer attributeType) {
        this.attributeType = attributeType;
    }
}
