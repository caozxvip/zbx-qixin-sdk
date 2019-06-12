package com.huize.qixin.api.model.notify;

public class Notify
{
    private int notifyType;
    private String sign;
    private BaseNotify data;
    
    public int getNotifyType() {
        return this.notifyType;
    }
    
    public void setNotifyType(final int notifyType) {
        this.notifyType = notifyType;
    }
    
    public String getSign() {
        return this.sign;
    }
    
    public void setSign(final String sign) {
        this.sign = sign;
    }
    
    public BaseNotify getData() {
        return this.data;
    }
    
    public void setData(final BaseNotify data) {
        this.data = data;
    }
}
