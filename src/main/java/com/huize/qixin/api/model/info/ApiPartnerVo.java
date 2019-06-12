package com.huize.qixin.api.model.info;

import java.io.*;
import java.util.*;

public class ApiPartnerVo implements Serializable
{
    private static final long serialVersionUID = 1L;
    private Integer id;
    private Integer partnerId;
    private String partnerName;
    private String partnerKey;
    private String partnerTestKey;
    private String companyName;
    private String contactPhone;
    private Byte apiType;
    private String personalizedCode;
    private Byte settleType;
    private Boolean sendSms;
    private Boolean sendEmail;
    private Boolean isOnline;
    private String commNotifyUrl;
    private String commTestNotifyUrl;
    private Boolean deleted;
    private Date createTime;
    private Date updateTime;
    private List<String> caseCodes;
    private List<String> limitInterfaces;
    
    public Integer getId() {
        return this.id;
    }
    
    public void setId(final Integer id) {
        this.id = id;
    }
    
    public Integer getPartnerId() {
        return this.partnerId;
    }
    
    public void setPartnerId(final Integer partnerId) {
        this.partnerId = partnerId;
    }
    
    public String getPartnerName() {
        return this.partnerName;
    }
    
    public void setPartnerName(final String partnerName) {
        this.partnerName = partnerName;
    }
    
    public String getPartnerKey() {
        return this.partnerKey;
    }
    
    public void setPartnerKey(final String partnerKey) {
        this.partnerKey = partnerKey;
    }
    
    public String getPartnerTestKey() {
        return this.partnerTestKey;
    }
    
    public void setPartnerTestKey(final String partnerTestKey) {
        this.partnerTestKey = partnerTestKey;
    }
    
    public String getCompanyName() {
        return this.companyName;
    }
    
    public void setCompanyName(final String companyName) {
        this.companyName = companyName;
    }
    
    public String getContactPhone() {
        return this.contactPhone;
    }
    
    public void setContactPhone(final String contactPhone) {
        this.contactPhone = contactPhone;
    }
    
    public Byte getApiType() {
        return this.apiType;
    }
    
    public void setApiType(final Byte apiType) {
        this.apiType = apiType;
    }
    
    public String getPersonalizedCode() {
        return this.personalizedCode;
    }
    
    public void setPersonalizedCode(final String personalizedCode) {
        this.personalizedCode = personalizedCode;
    }
    
    public Byte getSettleType() {
        return this.settleType;
    }
    
    public void setSettleType(final Byte settleType) {
        this.settleType = settleType;
    }
    
    public Boolean getSendSms() {
        return this.sendSms;
    }
    
    public void setSendSms(final Boolean sendSms) {
        this.sendSms = sendSms;
    }
    
    public Boolean getSendEmail() {
        return this.sendEmail;
    }
    
    public void setSendEmail(final Boolean sendEmail) {
        this.sendEmail = sendEmail;
    }
    
    public Boolean getIsOnline() {
        return this.isOnline;
    }
    
    public void setIsOnline(final Boolean isOnline) {
        this.isOnline = isOnline;
    }
    
    public String getCommNotifyUrl() {
        return this.commNotifyUrl;
    }
    
    public void setCommNotifyUrl(final String commNotifyUrl) {
        this.commNotifyUrl = commNotifyUrl;
    }
    
    public String getCommTestNotifyUrl() {
        return this.commTestNotifyUrl;
    }
    
    public void setCommTestNotifyUrl(final String commTestNotifyUrl) {
        this.commTestNotifyUrl = commTestNotifyUrl;
    }
    
    public Boolean getDeleted() {
        return this.deleted;
    }
    
    public void setDeleted(final Boolean deleted) {
        this.deleted = deleted;
    }
    
    public Date getCreateTime() {
        return this.createTime;
    }
    
    public void setCreateTime(final Date createTime) {
        this.createTime = createTime;
    }
    
    public Date getUpdateTime() {
        return this.updateTime;
    }
    
    public void setUpdateTime(final Date updateTime) {
        this.updateTime = updateTime;
    }
    
    public static long getSerialversionuid() {
        return 1L;
    }
    
    public List<String> getCaseCodes() {
        return this.caseCodes;
    }
    
    public void setCaseCodes(final List<String> caseCodes) {
        this.caseCodes = caseCodes;
    }
    
    public List<String> getLimitInterfaces() {
        return this.limitInterfaces;
    }
    
    public void setLimitInterfaces(final List<String> limitInterfaces) {
        this.limitInterfaces = limitInterfaces;
    }
}
