package com.huize.qixin.api.model.info;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class SubRestrictDictionary
{
    private Integer min;
    private Integer max;
    private Byte condition;
    private String unit;
    
    public Integer getMin() {
        return this.min;
    }
    
    public void setMin(final Integer min) {
        this.min = min;
    }
    
    public Integer getMax() {
        return this.max;
    }
    
    public void setMax(final Integer max) {
        this.max = max;
    }
    
    public Byte getCondition() {
        return this.condition;
    }
    
    public void setCondition(final Byte condition) {
        this.condition = condition;
    }
    
    public String getUnit() {
        return this.unit;
    }
    
    public void setUnit(final String unit) {
        this.unit = unit;
    }
}
