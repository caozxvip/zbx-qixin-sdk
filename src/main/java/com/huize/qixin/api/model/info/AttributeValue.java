package com.huize.qixin.api.model.info;

import com.fasterxml.jackson.annotation.*;
import java.util.*;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AttributeValue
{
    private String value;
    private String controlValue;
    private Byte conditions;
    private String regex;
    private String remind;
    private Integer attributeType;
    private Byte unit;
    private List<AttributeRestrict> attributeRestricts;
    
    public String getValue() {
        return this.value;
    }
    
    public void setValue(final String value) {
        this.value = value;
    }
    
    public String getRegex() {
        return this.regex;
    }
    
    public void setRegex(final String regex) {
        this.regex = regex;
    }
    
    public List<AttributeRestrict> getAttributeRestricts() {
        return this.attributeRestricts;
    }
    
    public void setAttributeRestricts(final List<AttributeRestrict> attributeRestricts) {
        this.attributeRestricts = attributeRestricts;
    }
    
    public String getControlValue() {
        return this.controlValue;
    }
    
    public void setControlValue(final String controlValue) {
        this.controlValue = controlValue;
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
    
    public Byte getConditions() {
        return this.conditions;
    }
    
    public void setConditions(final Byte conditions) {
        this.conditions = conditions;
    }
    
    public Byte getUnit() {
        return this.unit;
    }
    
    public void setUnit(final Byte unit) {
        this.unit = unit;
    }
}
