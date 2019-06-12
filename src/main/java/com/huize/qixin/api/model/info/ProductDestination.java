package com.huize.qixin.api.model.info;

public class ProductDestination
{
    private String cName;
    private String eName;
    private Integer continentId;
    private String continentName;
    private String initial;
    
    public String getcName() {
        return this.cName;
    }
    
    public void setcName(final String cName) {
        this.cName = cName;
    }
    
    public String geteName() {
        return this.eName;
    }
    
    public void seteName(final String eName) {
        this.eName = eName;
    }
    
    public Integer getContinentId() {
        return this.continentId;
    }
    
    public void setContinentId(final Integer continentId) {
        this.continentId = continentId;
    }
    
    public String getContinentName() {
        return this.continentName;
    }
    
    public void setContinentName(final String continentName) {
        this.continentName = continentName;
    }
    
    public String getInitial() {
        return this.initial;
    }
    
    public void setInitial(final String initial) {
        this.initial = initial;
    }
}
