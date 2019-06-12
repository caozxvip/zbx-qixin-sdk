package com.huize.qixin.api.req.audit;

import com.huize.qixin.api.req.*;

public class QuerySmartAuditReq extends BaseReq
{
    private Long smartAuditId;
    private String insureNum;
    
    public Long getSmartAuditId() {
        return this.smartAuditId;
    }
    
    public void setSmartAuditId(final Long smartAuditId) {
        this.smartAuditId = smartAuditId;
    }
    
    public String getInsureNum() {
        return this.insureNum;
    }
    
    public void setInsureNum(final String insureNum) {
        this.insureNum = insureNum;
    }
}
