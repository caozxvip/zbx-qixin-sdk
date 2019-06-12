package com.huize.qixin.api.model.notify;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AuditNotify extends BaseNotify
{
    private int auditStatus;
    private String remark;
    
    public int getAuditStatus() {
        return this.auditStatus;
    }
    
    public void setAuditStatus(final int auditStatus) {
        this.auditStatus = auditStatus;
    }
    
    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(final String remark) {
        this.remark = remark;
    }
}
