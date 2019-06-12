package com.huize.qixin.api.model.info;

import com.fasterxml.jackson.annotation.*;
import java.util.*;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class HealthyAttribute
{
    private String attributeName;
    private String keyCode;
    private Integer attributeType;
    private String regex;
    private String defaultRemind;
    private String errorRemind;
    private Integer attributeSort;
    private List<HealthyAttributeValue> attributeValues;
    
    public String getKeyCode() {
        return this.keyCode;
    }
    
    public void setKeyCode(final String keyCode) {
        this.keyCode = keyCode;
    }
    
    public String getRegex() {
        return this.regex;
    }
    
    public void setRegex(final String regex) {
        this.regex = regex;
    }
    
    public String getDefaultRemind() {
        return this.defaultRemind;
    }
    
    public void setDefaultRemind(final String defaultRemind) {
        this.defaultRemind = defaultRemind;
    }
    
    public String getErrorRemind() {
        return this.errorRemind;
    }
    
    public void setErrorRemind(final String errorRemind) {
        this.errorRemind = errorRemind;
    }
    
    public List<HealthyAttributeValue> getAttributeValues() {
        return this.attributeValues;
    }
    
    public void setAttributeValues(final List<HealthyAttributeValue> attributeValues) {
        this.attributeValues = attributeValues;
    }
    
    public String getAttributeName() {
        return this.attributeName;
    }
    
    public void setAttributeName(final String attributeName) {
        this.attributeName = attributeName;
    }
    
    public Integer getAttributeType() {
        return this.attributeType;
    }
    
    public void setAttributeType(final Integer attributeType) {
        this.attributeType = attributeType;
    }
    
    public Integer getAttributeSort() {
        return this.attributeSort;
    }
    
    public void setAttributeSort(final Integer attributeSort) {
        this.attributeSort = attributeSort;
    }
}
