package com.huize.qixin.api.req.insure;

import com.huize.qixin.api.req.*;
import java.util.*;
import com.huize.qixin.api.model.info.*;

public class InsureReq extends BaseReq
{
    private String insureNum;
    private String caseCode;
    private String startDate;
    private String endDate;
    private Applicant applicant;
    private List<Insurant> insurants;
    private OtherInfo otherInfo;
    private String partnerUniqKey;
    private String priceArgs;
    private int mergePolicyFlag;
    private int auditType;
    private Long signImgId;
    
    public String getInsureNum() {
        return this.insureNum;
    }
    
    public void setInsureNum(final String insureNum) {
        this.insureNum = insureNum;
    }
    
    public String getPriceArgs() {
        return this.priceArgs;
    }
    
    public void setPriceArgs(final String priceArgs) {
        this.priceArgs = priceArgs;
    }
    
    public String getCaseCode() {
        return this.caseCode;
    }
    
    public void setCaseCode(final String caseCode) {
        this.caseCode = caseCode;
    }
    
    public String getPartnerUniqKey() {
        return this.partnerUniqKey;
    }
    
    public void setPartnerUniqKey(final String partnerUniqKey) {
        this.partnerUniqKey = partnerUniqKey;
    }
    
    public OtherInfo getOtherInfo() {
        return this.otherInfo;
    }
    
    public void setOtherInfo(final OtherInfo otherInfo) {
        this.otherInfo = otherInfo;
    }
    
    public String getStartDate() {
        return this.startDate;
    }
    
    public void setStartDate(final String startDate) {
        this.startDate = startDate;
    }
    
    public String getEndDate() {
        return this.endDate;
    }
    
    public void setEndDate(final String endDate) {
        this.endDate = endDate;
    }
    
    public Applicant getApplicant() {
        return this.applicant;
    }
    
    public void setApplicant(final Applicant applicant) {
        this.applicant = applicant;
    }
    
    public List<Insurant> getInsurants() {
        return this.insurants;
    }
    
    public void setInsurants(final List<Insurant> insurants) {
        this.insurants = insurants;
    }
    
    public int getMergePolicyFlag() {
        return this.mergePolicyFlag;
    }
    
    public void setMergePolicyFlag(final int mergePolicyFlag) {
        this.mergePolicyFlag = mergePolicyFlag;
    }
    
    public int getAuditType() {
        return this.auditType;
    }
    
    public void setAuditType(final int auditType) {
        this.auditType = auditType;
    }
    
    public Long getSignImgId() {
        return this.signImgId;
    }
    
    public void setSignImgId(final Long signImgId) {
        this.signImgId = signImgId;
    }
}
