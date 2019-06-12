package com.huize.qixin.api.model.info;

import java.util.*;

public class OrdersDetailInfo
{
    private String insureNum;
    private int payState;
    private int issueState;
    private int effectiveState;
    private int totalNum;
    private double price;
    private String productName;
    private String planName;
    private String deadline;
    private String companyName;
    private String applicant;
    private String caseCode;
    private List<Policy> policys;
    
    public int getIssueState() {
        return this.issueState;
    }
    
    public void setIssueState(final int issueState) {
        this.issueState = issueState;
    }
    
    public int getEffectiveState() {
        return this.effectiveState;
    }
    
    public void setEffectiveState(final int effectiveState) {
        this.effectiveState = effectiveState;
    }
    
    public String getInsureNum() {
        return this.insureNum;
    }
    
    public void setInsureNum(final String insureNum) {
        this.insureNum = insureNum;
    }
    
    public int getPayState() {
        return this.payState;
    }
    
    public void setPayState(final int payState) {
        this.payState = payState;
    }
    
    public int getTotalNum() {
        return this.totalNum;
    }
    
    public void setTotalNum(final int totalNum) {
        this.totalNum = totalNum;
    }
    
    public String getProductName() {
        return this.productName;
    }
    
    public void setProductName(final String productName) {
        this.productName = productName;
    }
    
    public String getPlanName() {
        return this.planName;
    }
    
    public void setPlanName(final String planName) {
        this.planName = planName;
    }
    
    public String getDeadline() {
        return this.deadline;
    }
    
    public void setDeadline(final String deadline) {
        this.deadline = deadline;
    }
    
    public String getCompanyName() {
        return this.companyName;
    }
    
    public void setCompanyName(final String companyName) {
        this.companyName = companyName;
    }
    
    public String getApplicant() {
        return this.applicant;
    }
    
    public void setApplicant(final String applicant) {
        this.applicant = applicant;
    }
    
    public double getPrice() {
        return this.price;
    }
    
    public void setPrice(final double price) {
        this.price = price;
    }
    
    public String getCaseCode() {
        return this.caseCode;
    }
    
    public void setCaseCode(final String caseCode) {
        this.caseCode = caseCode;
    }
    
    public List<Policy> getPolicys() {
        return this.policys;
    }
    
    public void setPolicys(final List<Policy> policys) {
        this.policys = policys;
    }
}
