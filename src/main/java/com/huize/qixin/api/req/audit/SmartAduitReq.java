package com.huize.qixin.api.req.audit;

import com.huize.qixin.api.req.*;

public class SmartAduitReq extends BaseReq
{
    private String healthNo;
    private Long smartAuditId;
    
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
}
