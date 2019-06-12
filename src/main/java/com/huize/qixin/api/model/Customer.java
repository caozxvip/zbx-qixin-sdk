package com.huize.qixin.api.model;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Customer
{
    private String cName;
    private String eName;
    private int cardId;
    private String cardName;
    private String cardNumber;
    private Integer sex;
    private String birthday;
    private String country;
    private String provCityId;
    private String provCityText;
    private String jobLevel;
    private String job;
    private String jobText;
    private String homeAddress;
    private String homePost;
    private String officeAddress;
    private String officePost;
    private String tel;
    private String contactAddress;
    private String contactPost;
    private String mobile;
    private String email;
    private Integer marryState;
    private Integer houseTypeId;
    private String houseTypeName;
    private String propertyAddressId;
    private String propertyAddress;
    private String propertyPost;
    private Boolean haveMedical;
    private String height;
    private String weight;
    private String yearlyIncome;
    private String cardPeriod;
    private Integer fiscalResidentIdentity;
    
    public String getcName() {
        return this.cName;
    }
    
    public void setcName(final String cName) {
        this.cName = cName;
    }
    
    public String geteName() {
        return this.eName;
    }
    
    public void seteName(final String eName) {
        this.eName = eName;
    }
    
    public int getCardId() {
        return this.cardId;
    }
    
    public void setCardId(final int cardId) {
        this.cardId = cardId;
    }
    
    public String getCardName() {
        return this.cardName;
    }
    
    public void setCardName(final String cardName) {
        this.cardName = cardName;
    }
    
    public String getCardNumber() {
        return this.cardNumber;
    }
    
    public void setCardNumber(final String cardNumber) {
        this.cardNumber = cardNumber;
    }
    
    public Integer getSex() {
        return this.sex;
    }
    
    public void setSex(final Integer sex) {
        this.sex = sex;
    }
    
    public String getBirthday() {
        return this.birthday;
    }
    
    public void setBirthday(final String birthday) {
        this.birthday = birthday;
    }
    
    public String getCountry() {
        return this.country;
    }
    
    public void setCountry(final String country) {
        this.country = country;
    }
    
    public String getProvCityText() {
        return this.provCityText;
    }
    
    public void setProvCityText(final String provCityText) {
        this.provCityText = provCityText;
    }
    
    public String getJobText() {
        return this.jobText;
    }
    
    public void setJobText(final String jobText) {
        this.jobText = jobText;
    }
    
    public String getHomeAddress() {
        return this.homeAddress;
    }
    
    public void setHomeAddress(final String homeAddress) {
        this.homeAddress = homeAddress;
    }
    
    public String getHomePost() {
        return this.homePost;
    }
    
    public void setHomePost(final String homePost) {
        this.homePost = homePost;
    }
    
    public String getOfficeAddress() {
        return this.officeAddress;
    }
    
    public void setOfficeAddress(final String officeAddress) {
        this.officeAddress = officeAddress;
    }
    
    public String getOfficePost() {
        return this.officePost;
    }
    
    public void setOfficePost(final String officePost) {
        this.officePost = officePost;
    }
    
    public String getTel() {
        return this.tel;
    }
    
    public void setTel(final String tel) {
        this.tel = tel;
    }
    
    public String getContactAddress() {
        return this.contactAddress;
    }
    
    public void setContactAddress(final String contactAddress) {
        this.contactAddress = contactAddress;
    }
    
    public String getContactPost() {
        return this.contactPost;
    }
    
    public void setContactPost(final String contactPost) {
        this.contactPost = contactPost;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(final String email) {
        this.email = email;
    }
    
    public Integer getMarryState() {
        return this.marryState;
    }
    
    public void setMarryState(final Integer marryState) {
        this.marryState = marryState;
    }
    
    public String getHouseTypeName() {
        return this.houseTypeName;
    }
    
    public void setHouseTypeName(final String houseTypeName) {
        this.houseTypeName = houseTypeName;
    }
    
    public String getPropertyAddress() {
        return this.propertyAddress;
    }
    
    public void setPropertyAddress(final String propertyAddress) {
        this.propertyAddress = propertyAddress;
    }
    
    public String getPropertyPost() {
        return this.propertyPost;
    }
    
    public void setPropertyPost(final String propertyPost) {
        this.propertyPost = propertyPost;
    }
    
    public String getHeight() {
        return this.height;
    }
    
    public void setHeight(final String height) {
        this.height = height;
    }
    
    public String getWeight() {
        return this.weight;
    }
    
    public void setWeight(final String weight) {
        this.weight = weight;
    }
    
    public String getYearlyIncome() {
        return this.yearlyIncome;
    }
    
    public void setYearlyIncome(final String yearlyIncome) {
        this.yearlyIncome = yearlyIncome;
    }
    
    public Boolean getHaveMedical() {
        return this.haveMedical;
    }
    
    public void setHaveMedical(final Boolean haveMedical) {
        this.haveMedical = haveMedical;
    }
    
    public String getMobile() {
        return this.mobile;
    }
    
    public void setMobile(final String mobile) {
        this.mobile = mobile;
    }
    
    public String getCardPeriod() {
        return this.cardPeriod;
    }
    
    public void setCardPeriod(final String cardPeriod) {
        this.cardPeriod = cardPeriod;
    }
    
    public String getProvCityId() {
        return this.provCityId;
    }
    
    public void setProvCityId(final String provCityId) {
        this.provCityId = provCityId;
    }
    
    public String getJobLevel() {
        return this.jobLevel;
    }
    
    public void setJobLevel(final String jobLevel) {
        this.jobLevel = jobLevel;
    }
    
    public String getJob() {
        return this.job;
    }
    
    public void setJob(final String job) {
        this.job = job;
    }
    
    public Integer getHouseTypeId() {
        return this.houseTypeId;
    }
    
    public void setHouseTypeId(final Integer houseTypeId) {
        this.houseTypeId = houseTypeId;
    }
    
    public String getPropertyAddressId() {
        return this.propertyAddressId;
    }
    
    public void setPropertyAddressId(final String propertyAddressId) {
        this.propertyAddressId = propertyAddressId;
    }
    
    public Integer getFiscalResidentIdentity() {
        return this.fiscalResidentIdentity;
    }
    
    public void setFiscalResidentIdentity(final Integer fiscalResidentIdentity) {
        this.fiscalResidentIdentity = fiscalResidentIdentity;
    }
}
