package com.huize.qixin.api.model;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Beneficiary extends Customer
{
    private String insurantCname;
    private int relationId;
    private String relation;
    private int serial;
    private int proportion;
    
    public int getSerial() {
        return this.serial;
    }
    
    public void setSerial(final int serial) {
        this.serial = serial;
    }
    
    public int getProportion() {
        return this.proportion;
    }
    
    public void setProportion(final int proportion) {
        this.proportion = proportion;
    }
    
    public String getInsurantCname() {
        return this.insurantCname;
    }
    
    public void setInsurantCname(final String insurantCname) {
        this.insurantCname = insurantCname;
    }
    
    public int getRelationId() {
        return this.relationId;
    }
    
    public void setRelationId(final int relationId) {
        this.relationId = relationId;
    }
    
    public String getRelation() {
        return this.relation;
    }
    
    public void setRelation(final String relation) {
        this.relation = relation;
    }
}
