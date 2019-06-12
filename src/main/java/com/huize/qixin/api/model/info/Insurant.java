package com.huize.qixin.api.model.info;

import java.util.*;

public class Insurant extends PeopleInfo
{
    private String insurantId;
    private int relationId;
    private int count;
    private long singlePrice;
    private Long smartAuditId;
    private Long auditAdditionalPremium;
    private List<BeneficiaryInfo> beneficiaryInfos;
    
    public List<BeneficiaryInfo> getBeneficiaryInfos() {
        return this.beneficiaryInfos;
    }
    
    public void setBeneficiaryInfos(final List<BeneficiaryInfo> beneficiaryInfos) {
        this.beneficiaryInfos = beneficiaryInfos;
    }
    
    public String getInsurantId() {
        return this.insurantId;
    }
    
    public long getSinglePrice() {
        return this.singlePrice;
    }
    
    public void setSinglePrice(final long singlePrice) {
        this.singlePrice = singlePrice;
    }
    
    public void setInsurantId(final String insurantId) {
        this.insurantId = insurantId;
    }
    
    public int getRelationId() {
        return this.relationId;
    }
    
    public void setRelationId(final int insurantRelation) {
        this.relationId = insurantRelation;
    }
    
    public int getCount() {
        return this.count;
    }
    
    public void setCount(final int count) {
        this.count = count;
    }
    
    public Long getSmartAuditId() {
        return this.smartAuditId;
    }
    
    public void setSmartAuditId(final Long smartAuditId) {
        this.smartAuditId = smartAuditId;
    }
    
    public Long getAuditAdditionalPremium() {
        return this.auditAdditionalPremium;
    }
    
    public void setAuditAdditionalPremium(final Long auditAdditionalPremium) {
        this.auditAdditionalPremium = auditAdditionalPremium;
    }
}
