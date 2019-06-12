package com.huize.qixin.api.model.info;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class RenewalInsure
{
    private boolean isQX;
    private String endDate;
    private String insureNum;
    private String renewalInsureNum;
    private Integer insurePartnerId;
    
    public boolean getIsQX() {
        return this.isQX;
    }
    
    public void setIsQX(final boolean QX) {
        this.isQX = QX;
    }
    
    public String getEndDate() {
        return this.endDate;
    }
    
    public void setEndDate(final String endDate) {
        this.endDate = endDate;
    }
    
    public String getInsureNum() {
        return this.insureNum;
    }
    
    public void setInsureNum(final String insureNum) {
        this.insureNum = insureNum;
    }
    
    public String getRenewalInsureNum() {
        return this.renewalInsureNum;
    }
    
    public void setRenewalInsureNum(final String renewalInsureNum) {
        this.renewalInsureNum = renewalInsureNum;
    }
    
    public Integer getInsurePartnerId() {
        return this.insurePartnerId;
    }
    
    public void setInsurePartnerId(final Integer insurePartnerId) {
        this.insurePartnerId = insurePartnerId;
    }
}
