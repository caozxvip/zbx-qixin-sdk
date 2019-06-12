package com.huize.qixin.api.resp.audit;

import com.huize.qixin.api.resp.*;
import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class CreatSmartAduitResp extends BaseResp
{
    private String caseCode;
    private Long smartAuditId;
    
    public String getCaseCode() {
        return this.caseCode;
    }
    
    public void setCaseCode(final String caseCode) {
        this.caseCode = caseCode;
    }
    
    public Long getSmartAuditId() {
        return this.smartAuditId;
    }
    
    public void setSmartAuditId(final Long smartAuditId) {
        this.smartAuditId = smartAuditId;
    }
}
