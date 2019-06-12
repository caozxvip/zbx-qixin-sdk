package com.huize.qixin.api.resp.health;

import com.huize.qixin.api.resp.*;
import java.util.*;

public class SubmitHealthAnswerResp extends BaseResp
{
    private String caseCode;
    private long healthId;
    private boolean verifyResult;
    private List<Integer> auditTypes;
    
    public String getCaseCode() {
        return this.caseCode;
    }
    
    public void setCaseCode(final String caseCode) {
        this.caseCode = caseCode;
    }
    
    public long getHealthId() {
        return this.healthId;
    }
    
    public void setHealthId(final long healthId) {
        this.healthId = healthId;
    }
    
    public boolean getVerifyResult() {
        return this.verifyResult;
    }
    
    public void setVerifyResult(final boolean verifyResult) {
        this.verifyResult = verifyResult;
    }
    
    public List<Integer> getAuditTypes() {
        return this.auditTypes;
    }
    
    public void setAuditTypes(final List<Integer> auditTypes) {
        this.auditTypes = auditTypes;
    }
}
