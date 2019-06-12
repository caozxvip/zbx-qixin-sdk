package com.huize.qixin.api.req.audit;

import com.huize.qixin.api.req.*;
import java.util.*;
import com.huize.qixin.api.model.info.*;

public class EditAuditOrderReq extends BaseReq
{
    private String insureNum;
    private String description;
    private String partnerUniqKey;
    private List<AuditFileInfo> fileInfos;
    private TrailPremiumParam priceArgs;
    private Applicant applicant;
    private Insurant insurant;
    
    public String getPartnerUniqKey() {
        return this.partnerUniqKey;
    }
    
    public void setPartnerUniqKey(final String partnerUniqKey) {
        this.partnerUniqKey = partnerUniqKey;
    }
    
    public String getInsureNum() {
        return this.insureNum;
    }
    
    public void setInsureNum(final String insureNum) {
        this.insureNum = insureNum;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(final String description) {
        this.description = description;
    }
    
    public List<AuditFileInfo> getFileInfos() {
        return this.fileInfos;
    }
    
    public void setFileInfos(final List<AuditFileInfo> fileInfos) {
        this.fileInfos = fileInfos;
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
}
