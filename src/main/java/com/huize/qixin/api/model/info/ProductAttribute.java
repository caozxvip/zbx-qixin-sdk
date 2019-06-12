package com.huize.qixin.api.model.info;

import com.fasterxml.jackson.annotation.*;
import java.util.*;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ProductAttribute
{
    private String name;
    private String apiName;
    private Byte type;
    private String regex;
    private String defaultRemind;
    private String errorRemind;
    private Byte required;
    private List<AttributeValue> attributeValues;
    private List<AttributeRestrict> attributeRestricts;
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public Byte getType() {
        return this.type;
    }
    
    public void setType(final Byte type) {
        this.type = type;
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
    
    public String getApiName() {
        return this.apiName;
    }
    
    public void setApiName(final String apiName) {
        this.apiName = apiName;
    }
    
    public Byte getRequired() {
        return this.required;
    }
    
    public void setRequired(final Byte required) {
        this.required = required;
    }
    
    public List<AttributeValue> getAttributeValues() {
        return this.attributeValues;
    }
    
    public void setAttributeValues(final List<AttributeValue> attributeValues) {
        this.attributeValues = attributeValues;
    }
    
    public List<AttributeRestrict> getAttributeRestricts() {
        return this.attributeRestricts;
    }
    
    public void setAttributeRestricts(final List<AttributeRestrict> attributeRestricts) {
        this.attributeRestricts = attributeRestricts;
    }
}
