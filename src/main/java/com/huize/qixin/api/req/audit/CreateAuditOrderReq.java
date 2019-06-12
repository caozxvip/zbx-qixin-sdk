package com.huize.qixin.api.req.audit;

import com.huize.qixin.api.req.*;
import com.huize.qixin.api.model.info.*;

public class CreateAuditOrderReq extends BaseReq
{
    private String caseCode;
    private String description;
    private AuditFileInfo fileInfo;
    private TrailPremiumParam priceArgs;
    private Applicant applicant;
    private Insurant insurant;
    private String partnerUniqKey;
    
    public String getCaseCode() {
        return this.caseCode;
    }
    
    public void setCaseCode(final String caseCode) {
        this.caseCode = caseCode;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(final String description) {
        this.description = description;
    }
    
    public AuditFileInfo getFileInfo() {
        return this.fileInfo;
    }
    
    public void setFileInfo(final AuditFileInfo fileInfo) {
        this.fileInfo = fileInfo;
    }
    
    public TrailPremiumParam getPriceArgs() {
        return this.priceArgs;
    }
    
    public void setPriceArgs(final TrailPremiumParam priceArgs) {
        this.priceArgs = priceArgs;
    }
    
    public Applicant getApplicant() {
        return this.applicant;
    }
    
    public void setApplicant(final Applicant applicant) {
        this.applicant = applicant;
    }
    
    public Insurant getInsurant() {
        return this.insurant;
    }
    
    public void setInsurant(final Insurant insurant) {
        this.insurant = insurant;
    }
    
    public String getPartnerUniqKey() {
        return this.partnerUniqKey;
    }
    
    public void setPartnerUniqKey(final String partnerUniqKey) {
        this.partnerUniqKey = partnerUniqKey;
    }
}
