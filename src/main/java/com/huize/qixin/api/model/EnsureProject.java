package com.huize.qixin.api.model;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EnsureProject
{
    private String projectCode;
    private String projectName;
    private double sumInsured;
    private String unitText;
    private String startDate;
    private String endDate;
    private String insuredText;
    private int valid;
    
    public String getProjectCode() {
        return this.projectCode;
    }
    
    public void setProjectCode(final String projectCode) {
        this.projectCode = projectCode;
    }
    
    public String getProjectName() {
        return this.projectName;
    }
    
    public void setProjectName(final String projectName) {
        this.projectName = projectName;
    }
    
    public double getSumInsured() {
        return this.sumInsured;
    }
    
    public void setSumInsured(final double sumInsured) {
        this.sumInsured = sumInsured;
    }
    
    public String getStartDate() {
        return this.startDate;
    }
    
    public void setStartDate(final String startDate) {
        this.startDate = startDate;
    }
    
    public String getEndDate() {
        return this.endDate;
    }
    
    public void setEndDate(final String endDate) {
        this.endDate = endDate;
    }
    
    public String getInsuredText() {
        return this.insuredText;
    }
    
    public void setInsuredText(final String insuredText) {
        this.insuredText = insuredText;
    }
    
    public String getUnitText() {
        return this.unitText;
    }
    
    public void setUnitText(final String unitText) {
        this.unitText = unitText;
    }
    
    public int getValid() {
        return this.valid;
    }
    
    public void setValid(final int valid) {
        this.valid = valid;
    }
}
