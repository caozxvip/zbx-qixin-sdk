package com.huize.qixin.api.model.info;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class HealthyAttributeValue
{
    private String attributeValue;
    private Integer controlValue;
    private Integer valueSort;
    private Integer isDefault;
    
    public Integer getControlValue() {
        return this.controlValue;
    }
    
    public void setControlValue(final Integer controlValue) {
        this.controlValue = controlValue;
    }
    
    public Integer getIsDefault() {
        return this.isDefault;
    }
    
    public void setIsDefault(final Integer isDefault) {
        this.isDefault = isDefault;
    }
    
    public String getAttributeValue() {
        return this.attributeValue;
    }
    
    public void setAttributeValue(final String attributeValue) {
        this.attributeValue = attributeValue;
    }
    
    public Integer getValueSort() {
        return this.valueSort;
    }
    
    public void setValueSort(final Integer valueSort) {
        this.valueSort = valueSort;
    }
}
