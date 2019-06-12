package com.huize.qixin.api.resp.expre;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ExpreCheckResp
{
    private String insureNum;
    private Integer policyEnter;
    private Integer invoiceEnter;
    private Integer expreStatus;
    private Integer expreInvoiceStatus;
    private Integer exprePolicyStatus;
    private String policySendType;
    private String invoiceSendType;
    
    public String getPolicySendType() {
        return this.policySendType;
    }
    
    public void setPolicySendType(final String policySendType) {
        this.policySendType = policySendType;
    }
    
    public String getInvoiceSendType() {
        return this.invoiceSendType;
    }
    
    public void setInvoiceSendType(final String invoiceSendType) {
        this.invoiceSendType = invoiceSendType;
    }
    
    public String getInsureNum() {
        return this.insureNum;
    }
    
    public void setInsureNum(final String insureNum) {
        this.insureNum = insureNum;
    }
    
    public Integer getPolicyEnter() {
        return this.policyEnter;
    }
    
    public void setPolicyEnter(final Integer policyEnter) {
        this.policyEnter = policyEnter;
    }
    
    public Integer getInvoiceEnter() {
        return this.invoiceEnter;
    }
    
    public void setInvoiceEnter(final Integer invoiceEnter) {
        this.invoiceEnter = invoiceEnter;
    }
    
    public Integer getExpreStatus() {
        return this.expreStatus;
    }
    
    public void setExpreStatus(final Integer expreStatus) {
        this.expreStatus = expreStatus;
    }
    
    public Integer getExpreInvoiceStatus() {
        return this.expreInvoiceStatus;
    }
    
    public void setExpreInvoiceStatus(final Integer expreInvoiceStatus) {
        this.expreInvoiceStatus = expreInvoiceStatus;
    }
    
    public Integer getExprePolicyStatus() {
        return this.exprePolicyStatus;
    }
    
    public void setExprePolicyStatus(final Integer exprePolicyStatus) {
        this.exprePolicyStatus = exprePolicyStatus;
    }
}
