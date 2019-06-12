package com.huize.qixin.api.model.notify;

import com.fasterxml.jackson.annotation.*;
import java.util.*;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BaseNotify
{
    private int partnerId;
    private String partnerUniqueKey;
    private String insureNum;
    private String caseCode;
    private boolean state;
    private String failMsg;
    private Map<String, String> otherInfo;
    
    public int getPartnerId() {
        return this.partnerId;
    }
    
    public void setPartnerId(final int partnerId) {
        this.partnerId = partnerId;
    }
    
    public String getPartnerUniqueKey() {
        return this.partnerUniqueKey;
    }
    
    public void setPartnerUniqueKey(final String partnerUniqueKey) {
        this.partnerUniqueKey = partnerUniqueKey;
    }
    
    public String getInsureNum() {
        return this.insureNum;
    }
    
    public void setInsureNum(final String insureNum) {
        this.insureNum = insureNum;
    }
    
    public boolean isState() {
        return this.state;
    }
    
    public void setState(final boolean state) {
        this.state = state;
    }
    
    public String getFailMsg() {
        return this.failMsg;
    }
    
    public void setFailMsg(final String failMsg) {
        this.failMsg = failMsg;
    }
    
    public Map<String, String> getOtherInfo() {
        return this.otherInfo;
    }
    
    public void setOtherInfo(final Map<String, String> otherInfo) {
        this.otherInfo = otherInfo;
    }
    
    public String getCaseCode() {
        return this.caseCode;
    }
    
    public void setCaseCode(final String caseCode) {
        this.caseCode = caseCode;
    }
}
