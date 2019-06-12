package com.huize.qixin.api.resp.audit;

import com.huize.qixin.api.resp.*;
import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class QuerySmartAuditResp extends BaseResp
{
    private Long smartAuditId;
    private String insureNum;
    private Long premium;
    
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
    
    public Long getPremium() {
        return this.premium;
    }
    
    public void setPremium(final Long premium) {
        this.premium = premium;
    }
}
