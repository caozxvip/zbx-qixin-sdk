package com.huize.qixin.api.model.info;

public class SmartAuditResult
{
    private Integer premium;
    private String appointDescribe;
    private String premiumDescribe;
    
    public Integer getPremium() {
        return this.premium;
    }
    
    public void setPremium(final Integer premium) {
        this.premium = premium;
    }
    
    public String getAppointDescribe() {
        return this.appointDescribe;
    }
    
    public void setAppointDescribe(final String appointDescribe) {
        this.appointDescribe = appointDescribe;
    }
    
    public String getPremiumDescribe() {
        return this.premiumDescribe;
    }
    
    public void setPremiumDescribe(final String premiumDescribe) {
        this.premiumDescribe = premiumDescribe;
    }
}
