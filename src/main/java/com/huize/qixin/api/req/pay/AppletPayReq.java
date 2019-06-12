package com.huize.qixin.api.req.pay;

public class AppletPayReq extends BasePayReq
{
    private long money;
    private String openId;
    
    public String getOpenId() {
        return this.openId;
    }
    
    public void setOpenId(final String openId) {
        this.openId = openId;
    }
    
    public long getMoney() {
        return this.money;
    }
    
    public void setMoney(final long money) {
        this.money = money;
    }
}
