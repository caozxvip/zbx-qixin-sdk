package com.huize.qixin.api.model.info;

public class OrderSummary
{
    private String insureNum;
    private String caseCode;
    private int insureSource;
    private int partnerId;
    private int status;
    
    public String getInsureNum() {
        return this.insureNum;
    }
    
    public void setInsureNum(final String insureNum) {
        this.insureNum = insureNum;
    }
    
    public String getCaseCode() {
        return this.caseCode;
    }
    
    public void setCaseCode(final String caseCode) {
        this.caseCode = caseCode;
    }
    
    public int getInsureSource() {
        return this.insureSource;
    }
    
    public void setInsureSource(final int insureSource) {
        this.insureSource = insureSource;
    }
    
    public int getPartnerId() {
        return this.partnerId;
    }
    
    public void setPartnerId(final int partnerId) {
        this.partnerId = partnerId;
    }
    
    public int getStatus() {
        return this.status;
    }
    
    public void setStatus(final int status) {
        this.status = status;
    }
}
