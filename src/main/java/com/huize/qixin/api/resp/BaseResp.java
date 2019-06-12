package com.huize.qixin.api.resp;

public abstract class BaseResp
{
    private String transNo;
    private int partnerId;
    
    public String getTransNo() {
        return this.transNo;
    }
    
    public void setTransNo(final String transNo) {
        this.transNo = transNo;
    }
    
    public int getPartnerId() {
        return this.partnerId;
    }
    
    public void setPartnerId(final int partnerId) {
        this.partnerId = partnerId;
    }
}
