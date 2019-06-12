package com.huize.qixin.api.resp.pay;

import com.huize.qixin.api.resp.*;

public class CheckExpressResp extends BaseResp
{
    private String insureNums;
    private long money;
    private boolean isSendExpress;
    private long expressFee;
    
    public long getMoney() {
        return this.money;
    }
    
    public void setMoney(final long money) {
        this.money = money;
    }
    
    public boolean isSendExpress() {
        return this.isSendExpress;
    }
    
    public void setSendExpress(final boolean isSendExpress) {
        this.isSendExpress = isSendExpress;
    }
    
    public long getExpressFee() {
        return this.expressFee;
    }
    
    public void setExpressFee(final long expressFee) {
        this.expressFee = expressFee;
    }
    
    public String getInsureNums() {
        return this.insureNums;
    }
    
    public void setInsureNums(final String insureNums) {
        this.insureNums = insureNums;
    }
}
