package com.huize.qixin.api.resp.audit;

import com.huize.qixin.api.resp.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;
import com.huize.qixin.api.model.info.*;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class SmartAduitResp extends BaseResp
{
    private String healthNo;
    private Long smartAuditId;
    private Integer smartCheckCode;
    private String premium;
    private String appointDescribe;
    private String premiumDescribe;
    private List<SmartHealthInfo> healthInfos;
    
    public String getHealthNo() {
        return this.healthNo;
    }
    
    public void setHealthNo(final String healthNo) {
        this.healthNo = healthNo;
    }
    
    public Long getSmartAuditId() {
        return this.smartAuditId;
    }
    
    public void setSmartAuditId(final Long smartAuditId) {
        this.smartAuditId = smartAuditId;
    }
    
    public Integer getSmartCheckCode() {
        return this.smartCheckCode;
    }
    
    public void setSmartCheckCode(final Integer smartCheckCode) {
        this.smartCheckCode = smartCheckCode;
    }
    
    public String getPremium() {
        return this.premium;
    }
    
    public void setPremium(final String premium) {
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
    
    public List<SmartHealthInfo> getHealthInfos() {
        return this.healthInfos;
    }
    
    public void setHealthInfos(final List<SmartHealthInfo> healthInfos) {
        this.healthInfos = healthInfos;
    }
}
