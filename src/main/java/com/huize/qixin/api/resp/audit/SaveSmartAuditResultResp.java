package com.huize.qixin.api.resp.audit;

import com.huize.qixin.api.resp.*;
import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class SaveSmartAuditResultResp extends BaseResp
{
    private Long smartAuditId;
    private int saveResult;
    
    public Long getSmartAuditId() {
        return this.smartAuditId;
    }
    
    public void setSmartAuditId(final Long smartAuditId) {
        this.smartAuditId = smartAuditId;
    }
    
    public int getSaveResult() {
        return this.saveResult;
    }
    
    public void setSaveResult(final int saveResult) {
        this.saveResult = saveResult;
    }
}
