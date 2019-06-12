package com.huize.qixin.api.req.pay;

public class LocalPayReq extends BasePayReq
{
    private long money;
    private int noRisk;
    
    public long getMoney() {
        return this.money;
    }
    
    public void setMoney(final long money) {
        this.money = money;
    }
    
    public int getNoRisk() {
        return this.noRisk;
    }
    
    public void setNoRisk(final int noRisk) {
        this.noRisk = noRisk;
    }
}
