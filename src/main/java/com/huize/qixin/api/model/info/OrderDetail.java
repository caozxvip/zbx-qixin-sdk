package com.huize.qixin.api.model.info;

import com.fasterxml.jackson.annotation.*;
import java.util.*;
import com.huize.qixin.api.model.*;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class OrderDetail
{
    private Integer insurePartnerId;
    private String insureNum;
    private String caseCode;
    private String partnerUniqueKey;
    private Applicant applicant;
    private List<Insurant> insurants;
    private String productName;
    private String planName;
    private int totalNum;
    private String companyName;
    private String startDate;
    private String endDate;
    private String deadline;
    private String deadlineText;
    private Integer issueStatus;
    private Integer effectiveStatus;
    private Integer payStatus;
    private long payAmount;
    private String payedTime;
    private String issueTime;
    private String categoryName;
    private String insureTime;
    private List<EnsureProject> projects;
    private Integer gateway;
    private String priceArgs;
    private Other other;
    private InsureFee fee;
    
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
    
    public String getPartnerUniqueKey() {
        return this.partnerUniqueKey;
    }
    
    public void setPartnerUniqueKey(final String partnerUniqueKey) {
        this.partnerUniqueKey = partnerUniqueKey;
    }
    
    public List<Insurant> getInsurants() {
        return this.insurants;
    }
    
    public void setInsurants(final List<Insurant> insurants) {
        this.insurants = insurants;
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
    
    public int getTotalNum() {
        return this.totalNum;
    }
    
    public void setTotalNum(final int totalNum) {
        this.totalNum = totalNum;
    }
    
    public String getCompanyName() {
        return this.companyName;
    }
    
    public void setCompanyName(final String companyName) {
        this.companyName = companyName;
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
    
    public String getDeadline() {
        return this.deadline;
    }
    
    public void setDeadline(final String deadline) {
        this.deadline = deadline;
    }
    
    public Integer getIssueStatus() {
        return this.issueStatus;
    }
    
    public void setIssueStatus(final Integer issueStatus) {
        this.issueStatus = issueStatus;
    }
    
    public Integer getEffectiveStatus() {
        return this.effectiveStatus;
    }
    
    public void setEffectiveStatus(final Integer effectiveStatus) {
        this.effectiveStatus = effectiveStatus;
    }
    
    public Integer getPayStatus() {
        return this.payStatus;
    }
    
    public void setPayStatus(final Integer payStatus) {
        this.payStatus = payStatus;
    }
    
    public String getCategoryName() {
        return this.categoryName;
    }
    
    public void setCategoryName(final String categoryName) {
        this.categoryName = categoryName;
    }
    
    public String getInsureTime() {
        return this.insureTime;
    }
    
    public void setInsureTime(final String insureTime) {
        this.insureTime = insureTime;
    }
    
    public long getPayAmount() {
        return this.payAmount;
    }
    
    public void setPayAmount(final long payAmount) {
        this.payAmount = payAmount;
    }
    
    public String getPayedTime() {
        return this.payedTime;
    }
    
    public void setPayedTime(final String payedTime) {
        this.payedTime = payedTime;
    }
    
    public Applicant getApplicant() {
        return this.applicant;
    }
    
    public void setApplicant(final Applicant applicant) {
        this.applicant = applicant;
    }
    
    public String getDeadlineText() {
        return this.deadlineText;
    }
    
    public void setDeadlineText(final String deadlineText) {
        this.deadlineText = deadlineText;
    }
    
    public List<EnsureProject> getProjects() {
        return this.projects;
    }
    
    public void setProjects(final List<EnsureProject> projects) {
        this.projects = projects;
    }
    
    public String getPriceArgs() {
        return this.priceArgs;
    }
    
    public void setPriceArgs(final String priceArgs) {
        this.priceArgs = priceArgs;
    }
    
    public Other getOther() {
        return this.other;
    }
    
    public void setOther(final Other other) {
        this.other = other;
    }
    
    public Integer getGateway() {
        return this.gateway;
    }
    
    public void setGateway(final Integer gateway) {
        this.gateway = gateway;
    }
    
    public InsureFee getFee() {
        return this.fee;
    }
    
    public void setFee(final InsureFee fee) {
        this.fee = fee;
    }
    
    public String getIssueTime() {
        return this.issueTime;
    }
    
    public void setIssueTime(final String issueTime) {
        this.issueTime = issueTime;
    }
    
    public Integer getInsurePartnerId() {
        return this.insurePartnerId;
    }
    
    public void setInsurePartnerId(final Integer insurePartnerId) {
        this.insurePartnerId = insurePartnerId;
    }
}
