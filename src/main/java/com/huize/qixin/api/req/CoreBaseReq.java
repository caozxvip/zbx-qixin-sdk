package com.huize.qixin.api.req;

public abstract class CoreBaseReq
{
    private String transNo;
    private int partnerId;
    private String ip;
    private int subPartnerId;
    
    public int getSubPartnerId() {
        return this.subPartnerId;
    }
    
    public void setSubPartnerId(final int subPartnerId) {
        this.subPartnerId = subPartnerId;
    }
    
    public String getIp() {
        return this.ip;
    }
    
    public void setIp(final String ip) {
        this.ip = ip;
    }
    
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
