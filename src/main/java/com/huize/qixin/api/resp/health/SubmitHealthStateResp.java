package com.huize.qixin.api.resp.health;

import com.huize.qixin.api.resp.*;

public class SubmitHealthStateResp extends BaseResp
{
    private String caseCode;
    private long healthId;
    
    public long getHealthId() {
        return this.healthId;
    }
    
    public void setHealthId(final long healthId) {
        this.healthId = healthId;
    }
    
    public String getCaseCode() {
        return this.caseCode;
    }
    
    public void setCaseCode(final String caseCode) {
        this.caseCode = caseCode;
    }
}
