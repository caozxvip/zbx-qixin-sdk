package com.huize.qixin.api.model.info;

import com.fasterxml.jackson.annotation.*;
import java.util.*;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class InsureAttribute
{
    private String productName;
    private Byte state;
    private String companyName;
    private Byte calculateType;
    private Integer minPeople;
    private Integer maxPeople;
    private Byte beneficiaryType;
    private Byte firstBeneficiaryLimit;
    private Byte secondBeneficiaryLimit;
    private Integer observationPeriod;
    private Integer periodHesitation;
    private Integer singleDayLimit;
    private Byte insureTime;
    private Byte insureTimePrecision;
    private Integer firstDate;
    private Integer latestDate;
    private String deadline;
    private String nextDayDeadline;
    private Integer insuranceTime;
    private String fixedDateStr;
    private String fixedLatestDateDtr;
    private Byte insureIncludeBirthday;
    private Byte insuredAgeCalculation;
    private String insureDeclare;
    private String jobGrade;
    private Byte destinationSelectOne;
    private String smallLogoImg;
    private String bigLogoImg;
    private Integer healthWebId;
    private Integer healthAppId;
    private Integer financialId;
    private Integer otherId;
    private Byte isForcePay;
    private String forcePayContent;
    private Byte isHzOwner;
    private boolean isBankWithhold;
    private List<AttributeModule> attrModules;
    
    public String getProductName() {
        return this.productName;
    }
    
    public void setProductName(final String productName) {
        this.productName = productName;
    }
    
    public Byte getState() {
        return this.state;
    }
    
    public void setState(final Byte state) {
        this.state = state;
    }
    
    public String getCompanyName() {
        return this.companyName;
    }
    
    public void setCompanyName(final String companyName) {
        this.companyName = companyName;
    }
    
    public Integer getMinPeople() {
        return this.minPeople;
    }
    
    public void setMinPeople(final Integer minPeople) {
        this.minPeople = minPeople;
    }
    
    public Integer getMaxPeople() {
        return this.maxPeople;
    }
    
    public void setMaxPeople(final Integer maxPeople) {
        this.maxPeople = maxPeople;
    }
    
    public Byte getBeneficiaryType() {
        return this.beneficiaryType;
    }
    
    public void setBeneficiaryType(final Byte beneficiaryType) {
        this.beneficiaryType = beneficiaryType;
    }
    
    public Byte getFirstBeneficiaryLimit() {
        return this.firstBeneficiaryLimit;
    }
    
    public void setFirstBeneficiaryLimit(final Byte firstBeneficiaryLimit) {
        this.firstBeneficiaryLimit = firstBeneficiaryLimit;
    }
    
    public Byte getSecondBeneficiaryLimit() {
        return this.secondBeneficiaryLimit;
    }
    
    public void setSecondBeneficiaryLimit(final Byte secondBeneficiaryLimit) {
        this.secondBeneficiaryLimit = secondBeneficiaryLimit;
    }
    
    public Integer getObservationPeriod() {
        return this.observationPeriod;
    }
    
    public void setObservationPeriod(final Integer observationPeriod) {
        this.observationPeriod = observationPeriod;
    }
    
    public Integer getPeriodHesitation() {
        return this.periodHesitation;
    }
    
    public void setPeriodHesitation(final Integer periodHesitation) {
        this.periodHesitation = periodHesitation;
    }
    
    public Integer getSingleDayLimit() {
        return this.singleDayLimit;
    }
    
    public void setSingleDayLimit(final Integer singleDayLimit) {
        this.singleDayLimit = singleDayLimit;
    }
    
    public Byte getInsureTime() {
        return this.insureTime;
    }
    
    public void setInsureTime(final Byte insureTime) {
        this.insureTime = insureTime;
    }
    
    public Byte getInsureTimePrecision() {
        return this.insureTimePrecision;
    }
    
    public void setInsureTimePrecision(final Byte insureTimePrecision) {
        this.insureTimePrecision = insureTimePrecision;
    }
    
    public Integer getFirstDate() {
        return this.firstDate;
    }
    
    public void setFirstDate(final Integer firstDate) {
        this.firstDate = firstDate;
    }
    
    public Integer getLatestDate() {
        return this.latestDate;
    }
    
    public void setLatestDate(final Integer latestDate) {
        this.latestDate = latestDate;
    }
    
    public String getDeadline() {
        return this.deadline;
    }
    
    public void setDeadline(final String deadline) {
        this.deadline = deadline;
    }
    
    public String getNextDayDeadline() {
        return this.nextDayDeadline;
    }
    
    public void setNextDayDeadline(final String nextDayDeadline) {
        this.nextDayDeadline = nextDayDeadline;
    }
    
    public Integer getInsuranceTime() {
        return this.insuranceTime;
    }
    
    public void setInsuranceTime(final Integer insuranceTime) {
        this.insuranceTime = insuranceTime;
    }
    
    public String getFixedDateStr() {
        return this.fixedDateStr;
    }
    
    public void setFixedDateStr(final String fixedDateStr) {
        this.fixedDateStr = fixedDateStr;
    }
    
    public String getFixedLatestDateDtr() {
        return this.fixedLatestDateDtr;
    }
    
    public void setFixedLatestDateDtr(final String fixedLatestDateDtr) {
        this.fixedLatestDateDtr = fixedLatestDateDtr;
    }
    
    public Byte getInsureIncludeBirthday() {
        return this.insureIncludeBirthday;
    }
    
    public void setInsureIncludeBirthday(final Byte insureIncludeBirthday) {
        this.insureIncludeBirthday = insureIncludeBirthday;
    }
    
    public Byte getInsuredAgeCalculation() {
        return this.insuredAgeCalculation;
    }
    
    public void setInsuredAgeCalculation(final Byte insuredAgeCalculation) {
        this.insuredAgeCalculation = insuredAgeCalculation;
    }
    
    public String getInsureDeclare() {
        return this.insureDeclare;
    }
    
    public void setInsureDeclare(final String insureDeclare) {
        this.insureDeclare = insureDeclare;
    }
    
    public String getJobGrade() {
        return this.jobGrade;
    }
    
    public void setJobGrade(final String jobGrade) {
        this.jobGrade = jobGrade;
    }
    
    public Byte getDestinationSelectOne() {
        return this.destinationSelectOne;
    }
    
    public void setDestinationSelectOne(final Byte destinationSelectOne) {
        this.destinationSelectOne = destinationSelectOne;
    }
    
    public String getSmallLogoImg() {
        return this.smallLogoImg;
    }
    
    public void setSmallLogoImg(final String smallLogoImg) {
        this.smallLogoImg = smallLogoImg;
    }
    
    public String getBigLogoImg() {
        return this.bigLogoImg;
    }
    
    public void setBigLogoImg(final String bigLogoImg) {
        this.bigLogoImg = bigLogoImg;
    }
    
    public Byte getIsHzOwner() {
        return this.isHzOwner;
    }
    
    public void setIsHzOwner(final Byte isHzOwner) {
        this.isHzOwner = isHzOwner;
    }
    
    public boolean getIsBankWithhold() {
        return this.isBankWithhold;
    }
    
    public void setIsBankWithhold(final boolean bankWithhold) {
        this.isBankWithhold = bankWithhold;
    }
    
    public List<AttributeModule> getAttrModules() {
        return this.attrModules;
    }
    
    public void setAttrModules(final List<AttributeModule> attrModules) {
        this.attrModules = attrModules;
    }
    
    public Byte getCalculateType() {
        return this.calculateType;
    }
    
    public void setCalculateType(final Byte calculateType) {
        this.calculateType = calculateType;
    }
    
    public Integer getHealthWebId() {
        return this.healthWebId;
    }
    
    public void setHealthWebId(final Integer healthWebId) {
        this.healthWebId = healthWebId;
    }
    
    public Integer getHealthAppId() {
        return this.healthAppId;
    }
    
    public void setHealthAppId(final Integer healthAppId) {
        this.healthAppId = healthAppId;
    }
    
    public Integer getFinancialId() {
        return this.financialId;
    }
    
    public void setFinancialId(final Integer financialId) {
        this.financialId = financialId;
    }
    
    public Integer getOtherId() {
        return this.otherId;
    }
    
    public void setOtherId(final Integer otherId) {
        this.otherId = otherId;
    }
    
    public Byte getIsForcePay() {
        return this.isForcePay;
    }
    
    public void setIsForcePay(final Byte isForcePay) {
        this.isForcePay = isForcePay;
    }
    
    public String getForcePayContent() {
        return this.forcePayContent;
    }
    
    public void setForcePayContent(final String forcePayContent) {
        this.forcePayContent = forcePayContent;
    }
}
