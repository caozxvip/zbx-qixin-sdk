package com.huize.qixin.api.model.info;

import java.util.*;

public class SelectionProduct
{
    private String caseCode;
    private String productName;
    private String planName;
    private String companyName;
    private long price;
    private int fristCategory;
    private int secondCategory;
    private String bigLogoImg;
    private String smallLogoImg;
    private String mobileLogoImg;
    private List<ProtectItem> protectItems;
    
    public String getCaseCode() {
        return this.caseCode;
    }
    
    public void setCaseCode(final String caseCode) {
        this.caseCode = caseCode;
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
    
    public String getCompanyName() {
        return this.companyName;
    }
    
    public void setCompanyName(final String companyName) {
        this.companyName = companyName;
    }
    
    public int getFristCategory() {
        return this.fristCategory;
    }
    
    public void setFristCategory(final int fristCategory) {
        this.fristCategory = fristCategory;
    }
    
    public int getSecondCategory() {
        return this.secondCategory;
    }
    
    public void setSecondCategory(final int secondCategory) {
        this.secondCategory = secondCategory;
    }
    
    public List<ProtectItem> getProtectItems() {
        return this.protectItems;
    }
    
    public void setProtectItems(final List<ProtectItem> protectItems) {
        this.protectItems = protectItems;
    }
    
    public long getPrice() {
        return this.price;
    }
    
    public void setPrice(final long price) {
        this.price = price;
    }
    
    public String getBigLogoImg() {
        return this.bigLogoImg;
    }
    
    public void setBigLogoImg(final String bigLogoImg) {
        this.bigLogoImg = bigLogoImg;
    }
    
    public String getSmallLogoImg() {
        return this.smallLogoImg;
    }
    
    public void setSmallLogoImg(final String smallLogoImg) {
        this.smallLogoImg = smallLogoImg;
    }
    
    public String getMobileLogoImg() {
        return this.mobileLogoImg;
    }
    
    public void setMobileLogoImg(final String mobileLogoImg) {
        this.mobileLogoImg = mobileLogoImg;
    }
}
