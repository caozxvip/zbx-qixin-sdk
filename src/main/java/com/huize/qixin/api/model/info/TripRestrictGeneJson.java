package com.huize.qixin.api.model.info;

public class TripRestrictGeneJson
{
    private String key;
    private String geneKey;
    private String name;
    private String defaultValue;
    
    public String getKey() {
        return this.key;
    }
    
    public void setKey(final String key) {
        this.key = key;
    }
    
    public String getGeneKey() {
        return this.geneKey;
    }
    
    public void setGeneKey(final String geneKey) {
        this.geneKey = geneKey;
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
}
