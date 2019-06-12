package com.huize.qixin.api.resp.audit;

import com.huize.qixin.api.resp.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;
import com.huize.qixin.api.model.info.*;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AuditOrderInfoResp extends BaseResp
{
    private String insureNum;
    private String caseCode;
    private String description;
    private String partnerUniqKey;
    private int auditState;
    private Applicant applicant;
    private Insurant insurant;
    private TrailPremiumParam priceArgs;
    private List<MaterialItem> materialItems;
    private List<FileInfo> resultMaterialFiles;
    private List<AuditRemark> remarks;
    
    public String getInsureNum() {
        return this.insureNum;
    }
    
    public void setInsureNum(final String insureNum) {
        this.insureNum = insureNum;
    }
    
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
    
    public String getPartnerUniqKey() {
        return this.partnerUniqKey;
    }
    
    public void setPartnerUniqKey(final String partnerUniqKey) {
        this.partnerUniqKey = partnerUniqKey;
    }
    
    public int getAuditState() {
        return this.auditState;
    }
    
    public void setAuditState(final int auditState) {
        this.auditState = auditState;
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
    
    public TrailPremiumParam getPriceArgs() {
        return this.priceArgs;
    }
    
    public void setPriceArgs(final TrailPremiumParam priceArgs) {
        this.priceArgs = priceArgs;
    }
    
    public List<MaterialItem> getMaterialItems() {
        return this.materialItems;
    }
    
    public void setMaterialItems(final List<MaterialItem> materialItems) {
        this.materialItems = materialItems;
    }
    
    public List<FileInfo> getResultMaterialFiles() {
        return this.resultMaterialFiles;
    }
    
    public void setResultMaterialFiles(final List<FileInfo> resultMaterialFiles) {
        this.resultMaterialFiles = resultMaterialFiles;
    }
    
    public List<AuditRemark> getRemarks() {
        return this.remarks;
    }
    
    public void setRemarks(final List<AuditRemark> remarks) {
        this.remarks = remarks;
    }
}
