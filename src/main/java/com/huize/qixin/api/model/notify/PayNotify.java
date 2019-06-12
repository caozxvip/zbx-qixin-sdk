package com.huize.qixin.api.model.notify;

public class PayNotify extends BaseNotify
{
    private String payTime;
    private long price;
    private String onlinePaymentId;
    
    public String getPayTime() {
        return this.payTime;
    }
    
    public void setPayTime(final String payTime) {
        this.payTime = payTime;
    }
    
    public String getOnlinePaymentId() {
        return this.onlinePaymentId;
    }
    
    public void setOnlinePaymentId(final String onlinePaymentId) {
        this.onlinePaymentId = onlinePaymentId;
    }
    
    public long getPrice() {
        return this.price;
    }
    
    public void setPrice(final long price) {
        this.price = price;
    }
}
