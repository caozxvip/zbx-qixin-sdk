package com.huize.qixin.api.model.info;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class RestrictDictionary
{
    private String value;
    private String name;
    private String type;
    private Integer max;
    private Integer min;
    private Integer step;
    private String unit;
    private SubRestrictDictionary subDictionary;
    
    public String getValue() {
        return this.value;
    }
    
    public void setValue(final String value) {
        this.value = value;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public String getType() {
        return this.type;
    }
    
    public void setType(final String type) {
        this.type = type;
    }
    
    public void setStep(final int step) {
        this.step = step;
    }
    
    public String getUnit() {
        return this.unit;
    }
    
    public Integer getMax() {
        return this.max;
    }
    
    public void setMax(final Integer max) {
        this.max = max;
    }
    
    public Integer getMin() {
        return this.min;
    }
    
    public void setMin(final Integer min) {
        this.min = min;
    }
    
    public Integer getStep() {
        return this.step;
    }
    
    public void setUnit(final String unit) {
        this.unit = unit;
    }
    
    public SubRestrictDictionary getSubDictionary() {
        return this.subDictionary;
    }
    
    public void setSubDictionary(final SubRestrictDictionary subDictionary) {
        this.subDictionary = subDictionary;
    }
}
