package com.huize.qixin.api.model.info;

public class Product
{
    private String prodName;
    private String caseCode;
    private String companyName;
    private String planName;
    private int offShelf;
    private int fristCategory;
    private int secondCategory;
    
    public String getCaseCode() {
        return this.caseCode;
    }
    
    public void setCaseCode(final String caseCode) {
        this.caseCode = caseCode;
    }
    
    public String getCompanyName() {
        return this.companyName;
    }
    
    public void setCompanyName(final String companyName) {
        this.companyName = companyName;
    }
    
    public String getPlanName() {
        return this.planName;
    }
    
    public void setPlanName(final String planName) {
        this.planName = planName;
    }
    
    public String getProdName() {
        return this.prodName;
    }
    
    public void setProdName(final String prodName) {
        this.prodName = prodName;
    }
    
    public int getOffShelf() {
        return this.offShelf;
    }
    
    public void setOffShelf(final int offShelf) {
        this.offShelf = offShelf;
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
}
