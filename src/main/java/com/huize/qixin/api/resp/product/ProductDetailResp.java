package com.huize.qixin.api.resp.product;

import com.huize.qixin.api.resp.*;
import com.fasterxml.jackson.annotation.*;
import java.util.*;
import com.huize.qixin.api.model.info.*;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ProductDetailResp extends BaseResp
{
    private ProductFee fee;
    private long price;
    private List<ProtectItem> protectItems;
    private List<RestrictGene> restrictGenes;
    private String caseCode;
    private int platformType;
    private List<String> tips;
    private String productRead;
    private String compensateNotice;
    private String compensateCase;
    private String insuranceCase;
    private String insureDeclare;
    private String smallLogo;
    private String bigLogo;
    private String mobileLogo;
    private Integer minPeople;
    private Integer maxPeople;
    private Integer firstDate;
    private Integer latestDate;
    private String deadline;
    private String nextDayDeadline;
    private int state;
    private Integer observationPeriod;
    private Integer periodHesitation;
    private String simpleCompanyName;
    private String companyCnName;
    private String introduce;
    private String productName;
    private String planName;
    private String fullDescription;
    private List<Faq> faqs;
    private List<DroitVo> droits;
    private List<DroitVo> otherDroits;
    private List<Promise> promises;
    private List<ProductFeature> features;
    private List<Flow> flows;
    private List<ProductProvision> masterProvisions;
    private List<ProductProvision> additionalProvisions;
    private String samplePolicy;
    private String premiumTable;
    private String emergencyCard;
    private String pictureNotify;
    private String exclusionLiability;
    private List<ProductProvision> claimTypes;
    private List<ProductProvision> claimsRatios;
    
    public String getCaseCode() {
        return this.caseCode;
    }
    
    public void setCaseCode(final String caseCode) {
        this.caseCode = caseCode;
    }
    
    public int getPlatformType() {
        return this.platformType;
    }
    
    public void setPlatformType(final int platformType) {
        this.platformType = platformType;
    }
    
    public List<String> getTips() {
        return this.tips;
    }
    
    public void setTips(final List<String> tips) {
        this.tips = tips;
    }
    
    public String getProductRead() {
        return this.productRead;
    }
    
    public void setProductRead(final String productRead) {
        this.productRead = productRead;
    }
    
    public String getCompensateNotice() {
        return this.compensateNotice;
    }
    
    public void setCompensateNotice(final String compensateNotice) {
        this.compensateNotice = compensateNotice;
    }
    
    public String getCompensateCase() {
        return this.compensateCase;
    }
    
    public void setCompensateCase(final String compensateCase) {
        this.compensateCase = compensateCase;
    }
    
    public List<Promise> getPromises() {
        return this.promises;
    }
    
    public void setPromises(final List<Promise> promises) {
        this.promises = promises;
    }
    
    public List<ProductFeature> getFeatures() {
        return this.features;
    }
    
    public void setFeatures(final List<ProductFeature> features) {
        this.features = features;
    }
    
    public String getSamplePolicy() {
        return this.samplePolicy;
    }
    
    public void setSamplePolicy(final String samplePolicy) {
        this.samplePolicy = samplePolicy;
    }
    
    public String getPremiumTable() {
        return this.premiumTable;
    }
    
    public void setPremiumTable(final String premiumTable) {
        this.premiumTable = premiumTable;
    }
    
    public String getEmergencyCard() {
        return this.emergencyCard;
    }
    
    public void setEmergencyCard(final String emergencyCard) {
        this.emergencyCard = emergencyCard;
    }
    
    public String getPictureNotify() {
        return this.pictureNotify;
    }
    
    public void setPictureNotify(final String pictureNotify) {
        this.pictureNotify = pictureNotify;
    }
    
    public String getExclusionLiability() {
        return this.exclusionLiability;
    }
    
    public void setExclusionLiability(final String exclusionLiability) {
        this.exclusionLiability = exclusionLiability;
    }
    
    public List<ProductProvision> getClaimTypes() {
        return this.claimTypes;
    }
    
    public void setClaimTypes(final List<ProductProvision> claimTypes) {
        this.claimTypes = claimTypes;
    }
    
    public List<ProductProvision> getClaimsRatios() {
        return this.claimsRatios;
    }
    
    public void setClaimsRatios(final List<ProductProvision> claimsRatios) {
        this.claimsRatios = claimsRatios;
    }
    
    public long getPrice() {
        return this.price;
    }
    
    public void setPrice(final long price) {
        this.price = price;
    }
    
    public List<ProtectItem> getProtectItems() {
        return this.protectItems;
    }
    
    public void setProtectItems(final List<ProtectItem> protectItems) {
        this.protectItems = protectItems;
    }
    
    public String getInsuranceCase() {
        return this.insuranceCase;
    }
    
    public void setInsuranceCase(final String insuranceCase) {
        this.insuranceCase = insuranceCase;
    }
    
    public List<Faq> getFaqs() {
        return this.faqs;
    }
    
    public void setFaqs(final List<Faq> faqs) {
        this.faqs = faqs;
    }
    
    public List<DroitVo> getDroits() {
        return this.droits;
    }
    
    public void setDroits(final List<DroitVo> droits) {
        this.droits = droits;
    }
    
    public List<DroitVo> getOtherDroits() {
        return this.otherDroits;
    }
    
    public void setOtherDroits(final List<DroitVo> otherDroits) {
        this.otherDroits = otherDroits;
    }
    
    public List<Flow> getFlows() {
        return this.flows;
    }
    
    public void setFlows(final List<Flow> flows) {
        this.flows = flows;
    }
    
    public List<ProductProvision> getMasterProvisions() {
        return this.masterProvisions;
    }
    
    public void setMasterProvisions(final List<ProductProvision> masterProvisions) {
        this.masterProvisions = masterProvisions;
    }
    
    public List<ProductProvision> getAdditionalProvisions() {
        return this.additionalProvisions;
    }
    
    public void setAdditionalProvisions(final List<ProductProvision> additionalProvisions) {
        this.additionalProvisions = additionalProvisions;
    }
    
    public String getInsureDeclare() {
        return this.insureDeclare;
    }
    
    public void setInsureDeclare(final String insureDeclare) {
        this.insureDeclare = insureDeclare;
    }
    
    public String getSmallLogo() {
        return this.smallLogo;
    }
    
    public void setSmallLogo(final String smallLogo) {
        this.smallLogo = smallLogo;
    }
    
    public String getBigLogo() {
        return this.bigLogo;
    }
    
    public void setBigLogo(final String bigLogo) {
        this.bigLogo = bigLogo;
    }
    
    public String getDeadline() {
        return this.deadline;
    }
    
    public void setDeadline(final String deadline) {
        this.deadline = deadline;
    }
    
    public int getState() {
        return this.state;
    }
    
    public void setState(final int state) {
        this.state = state;
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
    
    public String getMobileLogo() {
        return this.mobileLogo;
    }
    
    public void setMobileLogo(final String mobileLogo) {
        this.mobileLogo = mobileLogo;
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
    
    public String getNextDayDeadline() {
        return this.nextDayDeadline;
    }
    
    public void setNextDayDeadline(final String nextDayDeadline) {
        this.nextDayDeadline = nextDayDeadline;
    }
    
    public String getSimpleCompanyName() {
        return this.simpleCompanyName;
    }
    
    public void setSimpleCompanyName(final String simpleCompanyName) {
        this.simpleCompanyName = simpleCompanyName;
    }
    
    public String getCompanyCnName() {
        return this.companyCnName;
    }
    
    public void setCompanyCnName(final String companyCnName) {
        this.companyCnName = companyCnName;
    }
    
    public String getIntroduce() {
        return this.introduce;
    }
    
    public void setIntroduce(final String introduce) {
        this.introduce = introduce;
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
    
    public String getFullDescription() {
        return this.fullDescription;
    }
    
    public void setFullDescription(final String fullDescription) {
        this.fullDescription = fullDescription;
    }
    
    public List<RestrictGene> getRestrictGenes() {
        return this.restrictGenes;
    }
    
    public void setRestrictGenes(final List<RestrictGene> restrictGenes) {
        this.restrictGenes = restrictGenes;
    }
    
    public ProductFee getFee() {
        return this.fee;
    }
    
    public void setFee(final ProductFee fee) {
        this.fee = fee;
    }
}
