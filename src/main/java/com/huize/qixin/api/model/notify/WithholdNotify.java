package com.huize.qixin.api.model.notify;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class WithholdNotify extends BaseNotify
{
    private Integer term;
    private Integer termUnit;
    private Integer type;
    private Integer onlinePaymentId;
    private Long premium;
    private String withholdTime;
    
    public Integer getTerm() {
        return this.term;
    }
    
    public void setTerm(final Integer term) {
        this.term = term;
    }
    
    public Integer getTermUnit() {
        return this.termUnit;
    }
    
    public void setTermUnit(final Integer termUnit) {
        this.termUnit = termUnit;
    }
    
    public Integer getType() {
        return this.type;
    }
    
    public void setType(final Integer type) {
        this.type = type;
    }
    
    public Integer getOnlinePaymentId() {
        return this.onlinePaymentId;
    }
    
    public void setOnlinePaymentId(final Integer onlinePaymentId) {
        this.onlinePaymentId = onlinePaymentId;
    }
    
    public Long getPremium() {
        return this.premium;
    }
    
    public void setPremium(final Long premium) {
        this.premium = premium;
    }
    
    public String getWithholdTime() {
        return this.withholdTime;
    }
    
    public void setWithholdTime(final String withholdTime) {
        this.withholdTime = withholdTime;
    }
}
