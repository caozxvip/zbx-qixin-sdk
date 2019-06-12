package com.huize.qixin.api.req.pay;

public class OnlinePayReq extends BasePayReq
{
    private long money;
    private String callBackUrl;
    private int gateway;
    private int clientType;
    private String productUrl;
    private int bankId;
    private String payIp;
    
    public String getProductUrl() {
        return this.productUrl;
    }
    
    public void setProductUrl(final String productUrl) {
        this.productUrl = productUrl;
    }
    
    public int getClientType() {
        return this.clientType;
    }
    
    public void setClientType(final int clientType) {
        this.clientType = clientType;
    }
    
    public long getMoney() {
        return this.money;
    }
    
    public void setMoney(final long money) {
        this.money = money;
    }
    
    public String getCallBackUrl() {
        return this.callBackUrl;
    }
    
    public void setCallBackUrl(final String callBackUrl) {
        this.callBackUrl = callBackUrl;
    }
    
    public int getGateway() {
        return this.gateway;
    }
    
    public void setGateway(final int gateway) {
        this.gateway = gateway;
    }
    
    public int getBankId() {
        return this.bankId;
    }
    
    public void setBankId(final int bankId) {
        this.bankId = bankId;
    }
    
    public String getPayIp() {
        return this.payIp;
    }
    
    public void setPayIp(final String payIp) {
        this.payIp = payIp;
    }
}
