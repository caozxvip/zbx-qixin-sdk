package com.huize.qixin.api.req.pay;

public class BankWithholdReq extends BasePayReq
{
    private long money;
    private String verificationCode;
    
    public long getMoney() {
        return this.money;
    }
    
    public void setMoney(final long money) {
        this.money = money;
    }
    
    public String getVerificationCode() {
        return this.verificationCode;
    }
    
    public void setVerificationCode(final String verificationCode) {
        this.verificationCode = verificationCode;
    }
}
