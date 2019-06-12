package com.huize.qixin.api.model.info;

import com.fasterxml.jackson.annotation.*;
import java.util.*;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class RestrictGene
{
    private Integer protectItemId;
    private String key;
    private String name;
    private int type;
    private boolean display;
    private String defaultValue;
    private Integer sort;
    private List<RestrictDictionary> values;
    private List<RestrictGene> subRestrictGenes;
    
    public Integer getProtectItemId() {
        return this.protectItemId;
    }
    
    public void setProtectItemId(final Integer protectItemId) {
        this.protectItemId = protectItemId;
    }
    
    public String getKey() {
        return this.key;
    }
    
    public void setKey(final String key) {
        this.key = key;
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
    
    public Integer getSort() {
        return this.sort;
    }
    
    public void setSort(final Integer sort) {
        this.sort = sort;
    }
    
    public List<RestrictDictionary> getValues() {
        return this.values;
    }
    
    public void setValues(final List<RestrictDictionary> values) {
        this.values = values;
    }
    
    public List<RestrictGene> getSubRestrictGenes() {
        return this.subRestrictGenes;
    }
    
    public void setSubRestrictGenes(final List<RestrictGene> subRestrictGenes) {
        this.subRestrictGenes = subRestrictGenes;
    }
    
    public int getType() {
        return this.type;
    }
    
    public void setType(final int type) {
        this.type = type;
    }
    
    public boolean isDisplay() {
        return this.display;
    }
    
    public void setDisplay(final boolean display) {
        this.display = display;
    }
}
