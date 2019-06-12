package com.huize.qixin.api.req.pay;

public class CheckExpressReq extends BasePayReq
{
    private long money;
    private String insureNums;
    
    public long getMoney() {
        return this.money;
    }
    
    public void setMoney(final long money) {
        this.money = money;
    }
    
    @Override
    public String getInsureNums() {
        return this.insureNums;
    }
    
    @Override
    public void setInsureNums(final String insureNums) {
        this.insureNums = insureNums;
    }
}
