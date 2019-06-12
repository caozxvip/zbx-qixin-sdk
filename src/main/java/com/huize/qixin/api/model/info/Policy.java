package com.huize.qixin.api.model.info;

public class Policy
{
    private String insureTime;
    private String policyNum;
    private String startDate;
    private String endDate;
    private String insurant;
    
    public String getInsureTime() {
        return this.insureTime;
    }
    
    public void setInsureTime(final String insureTime) {
        this.insureTime = insureTime;
    }
    
    public String getPolicyNum() {
        return this.policyNum;
    }
    
    public void setPolicyNum(final String policyNum) {
        this.policyNum = policyNum;
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
    
    public String getInsurant() {
        return this.insurant;
    }
    
    public void setInsurant(final String insurant) {
        this.insurant = insurant;
    }
}
