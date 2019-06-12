package com.huize.qixin.api.model.notify;

public class PolicyInfo
{
    private int productId;
    private String productName;
    private int planId;
    private String planName;
    private String applicant;
    private String insurant;
    private String startDate;
    private String endDate;
    private String policyNum;
    
    public int getProductId() {
        return this.productId;
    }
    
    public void setProductId(final int productId) {
        this.productId = productId;
    }
    
    public String getProductName() {
        return this.productName;
    }
    
    public void setProductName(final String productName) {
        this.productName = productName;
    }
    
    public int getPlanId() {
        return this.planId;
    }
    
    public void setPlanId(final int planId) {
        this.planId = planId;
    }
    
    public String getPlanName() {
        return this.planName;
    }
    
    public void setPlanName(final String planName) {
        this.planName = planName;
    }
    
    public String getApplicant() {
        return this.applicant;
    }
    
    public void setApplicant(final String applicant) {
        this.applicant = applicant;
    }
    
    public String getInsurant() {
        return this.insurant;
    }
    
    public void setInsurant(final String insurant) {
        this.insurant = insurant;
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
    
    public String getPolicyNum() {
        return this.policyNum;
    }
    
    public void setPolicyNum(final String policyNum) {
        this.policyNum = policyNum;
    }
}
