package com.huize.qixin.api.model;

import com.fasterxml.jackson.annotation.*;
import java.util.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Insurant extends Customer
{
    private int buyAmount;
    private List<Beneficiary> beneficiaryList;
    private String policyNum;
    private long singlePrice;
    private int beneficiaryType;
    private int retreatStatus;
    private int relationId;
    private String relationName;
    
    public int getBuyAmount() {
        return this.buyAmount;
    }
    
    public void setBuyAmount(final int buyAmount) {
        this.buyAmount = buyAmount;
    }
    
    public List<Beneficiary> getBeneficiaryList() {
        return this.beneficiaryList;
    }
    
    public void setBeneficiaryList(final List<Beneficiary> beneficiaryList) {
        this.beneficiaryList = beneficiaryList;
    }
    
    public String getPolicyNum() {
        return this.policyNum;
    }
    
    public void setPolicyNum(final String policyNum) {
        this.policyNum = policyNum;
    }
    
    public long getSinglePrice() {
        return this.singlePrice;
    }
    
    public void setSinglePrice(final long singlePrice) {
        this.singlePrice = singlePrice;
    }
    
    public int getBeneficiaryType() {
        return this.beneficiaryType;
    }
    
    public void setBeneficiaryType(final int beneficiaryType) {
        this.beneficiaryType = beneficiaryType;
    }
    
    public int getRetreatStatus() {
        return this.retreatStatus;
    }
    
    public void setRetreatStatus(final int retreatStatus) {
        this.retreatStatus = retreatStatus;
    }
    
    public int getRelationId() {
        return this.relationId;
    }
    
    public void setRelationId(final int relationId) {
        this.relationId = relationId;
    }
    
    public String getRelationName() {
        return this.relationName;
    }
    
    public void setRelationName(final String relationName) {
        this.relationName = relationName;
    }
}
