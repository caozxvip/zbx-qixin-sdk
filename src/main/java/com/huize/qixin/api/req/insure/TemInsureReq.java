package com.huize.qixin.api.req.insure;

public class TemInsureReq extends InsureReq
{
    private String backUrl;
    private Integer clientType;
    
    public Integer getClientType() {
        return this.clientType;
    }
    
    public void setClientType(final Integer clientType) {
        this.clientType = clientType;
    }
    
    public String getBackUrl() {
        return this.backUrl;
    }
    
    public void setBackUrl(final String backUrl) {
        this.backUrl = backUrl;
    }
}
