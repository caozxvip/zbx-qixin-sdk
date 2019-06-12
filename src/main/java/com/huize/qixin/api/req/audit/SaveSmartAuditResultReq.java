package com.huize.qixin.api.req.audit;

import com.huize.qixin.api.req.*;
import java.util.*;
import com.huize.qixin.api.model.info.*;

public class SaveSmartAuditResultReq extends BaseReq
{
    private Long smartAuditId;
    private int doneSmartAuditFlag;
    private int auditStatus;
    private List<SmartHealthInfo> healthInfos;
    private SmartAuditResult smartAuditResult;
    
    public Long getSmartAuditId() {
        return this.smartAuditId;
    }
    
    public void setSmartAuditId(final Long smartAuditId) {
        this.smartAuditId = smartAuditId;
    }
    
    public int getAuditStatus() {
        return this.auditStatus;
    }
    
    public void setAuditStatus(final int auditStatus) {
        this.auditStatus = auditStatus;
    }
    
    public List<SmartHealthInfo> getHealthInfos() {
        return this.healthInfos;
    }
    
    public void setHealthInfos(final List<SmartHealthInfo> healthInfos) {
        this.healthInfos = healthInfos;
    }
    
    public SmartAuditResult getSmartAuditResult() {
        return this.smartAuditResult;
    }
    
    public void setSmartAuditResult(final SmartAuditResult smartAuditResult) {
        this.smartAuditResult = smartAuditResult;
    }
    
    public int getDoneSmartAuditFlag() {
        return this.doneSmartAuditFlag;
    }
    
    public void setDoneSmartAuditFlag(final int doneSmartAuditFlag) {
        this.doneSmartAuditFlag = doneSmartAuditFlag;
    }
}
