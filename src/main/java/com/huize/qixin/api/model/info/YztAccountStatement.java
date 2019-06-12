package com.huize.qixin.api.model.info;

public class YztAccountStatement
{
    private int subPartnerId;
    private String insureNum;
    private String userId;
    private long price;
    private String companyName;
    private int payStatus;
    private int issueStatus;
    private int surrenderStatus;
    private String insureTime;
    private String payTime;
    private String policyNum;
    private int orderSource;
    
    public int getSubPartnerId() {
        return this.subPartnerId;
    }
    
    public void setSubPartnerId(final int subPartnerId) {
        this.subPartnerId = subPartnerId;
    }
    
    public String getInsureNum() {
        return this.insureNum;
    }
    
    public void setInsureNum(final String insureNum) {
        this.insureNum = insureNum;
    }
    
    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(final String userId) {
        this.userId = userId;
    }
    
    public long getPrice() {
        return this.price;
    }
    
    public void setPrice(final long price) {
        this.price = price;
    }
    
    public String getCompanyName() {
        return this.companyName;
    }
    
    public void setCompanyName(final String companyName) {
        this.companyName = companyName;
    }
    
    public int getPayStatus() {
        return this.payStatus;
    }
    
    public void setPayStatus(final int payStatus) {
        this.payStatus = payStatus;
    }
    
    public int getIssueStatus() {
        return this.issueStatus;
    }
    
    public void setIssueStatus(final int issueStatus) {
        this.issueStatus = issueStatus;
    }
    
    public int getSurrenderStatus() {
        return this.surrenderStatus;
    }
    
    public void setSurrenderStatus(final int surrenderStatus) {
        this.surrenderStatus = surrenderStatus;
    }
    
    public String getInsureTime() {
        return this.insureTime;
    }
    
    public void setInsureTime(final String insureTime) {
        this.insureTime = insureTime;
    }
    
    public String getPayTime() {
        return this.payTime;
    }
    
    public void setPayTime(final String payTime) {
        this.payTime = payTime;
    }
    
    public String getPolicyNum() {
        return this.policyNum;
    }
    
    public void setPolicyNum(final String policyNum) {
        this.policyNum = policyNum;
    }
    
    public int getOrderSource() {
        return this.orderSource;
    }
    
    public void setOrderSource(final int orderSource) {
        this.orderSource = orderSource;
    }
}
