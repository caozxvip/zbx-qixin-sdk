package com.huize.qixin.api.req.pay;

public class AppPayReq extends BasePayReq
{
    private long money;
    private int gateway;
    private int clientType;
    
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
    
    public int getGateway() {
        return this.gateway;
    }
    
    public void setGateway(final int gateway) {
        this.gateway = gateway;
    }
}
