package com.huize.qixin.api.resp.trial;

import com.huize.qixin.api.resp.*;

public class SimpleTrialResp extends BaseResp
{
    private String caseCode;
    private String startDate;
    private String endDate;
    private long singlePrice;
    private long originalPrice;
    private int buyQuota;
    
    public String getCaseCode() {
        return this.caseCode;
    }
    
    public void setCaseCode(final String caseCode) {
        this.caseCode = caseCode;
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
    
    public int getBuyQuota() {
        return this.buyQuota;
    }
    
    public void setBuyQuota(final int buyQuota) {
        this.buyQuota = buyQuota;
    }
    
    public long getSinglePrice() {
        return this.singlePrice;
    }
    
    public void setSinglePrice(final long singlePrice) {
        this.singlePrice = singlePrice;
    }
    
    public long getOriginalPrice() {
        return this.originalPrice;
    }
    
    public void setOriginalPrice(final long originalPrice) {
        this.originalPrice = originalPrice;
    }
}
