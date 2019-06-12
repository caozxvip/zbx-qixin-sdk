package com.huize.qixin.api.resp.pay;

public class PreviewPayResp
{
    private String transNo;
    private int partnerId;
    private String insureNum;
    
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
    
    public String getInsureNum() {
        return this.insureNum;
    }
    
    public void setInsureNum(final String insureNum) {
        this.insureNum = insureNum;
    }
}
