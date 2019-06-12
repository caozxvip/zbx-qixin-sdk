package com.huize.qixin.api.model.info;

import java.io.*;
import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class GeneParam implements Serializable
{
    private static final long serialVersionUID = 1L;
    private String key;
    private String protectItemId;
    private String value;
    private Integer sort;
    
    public GeneParam() {
    }
    
    public GeneParam(final int sort, final String value) {
        this.value = value;
        this.sort = sort;
    }
    
    public GeneParam(final int sort, final String value, final String genekey, final boolean isProtectItem) {
        if (!isProtectItem) {
            this.key = genekey;
        }
        else {
            this.protectItemId = genekey;
        }
        this.value = value;
        this.sort = sort;
    }
    
    public String getValue() {
        return this.value;
    }
    
    public void setValue(final String value) {
        this.value = value;
    }
    
    public String getKey() {
        return this.key;
    }
    
    public void setKey(final String key) {
        this.key = key;
    }
    
    public String getProtectItemId() {
        return this.protectItemId;
    }
    
    public void setProtectItemId(final String protectItemId) {
        this.protectItemId = protectItemId;
    }
    
    public Integer getSort() {
        return this.sort;
    }
    
    public void setSort(final Integer sort) {
        this.sort = sort;
    }
    
    @Override
    public String toString() {
        return "GeneParam [key=" + this.key + ", protectItemId=" + this.protectItemId + ", value=" + this.value + ", sort=" + this.sort + "]";
    }
}
