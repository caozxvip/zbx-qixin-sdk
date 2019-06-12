package com.huize.qixin.api.model.info;

import java.util.*;

public class TripProductJson
{
    private int id;
    private int productId;
    private int basicProductId;
    private String productName;
    private int planId;
    private int basicPlanId;
    private String planName;
    private int categoryMasterId;
    private String categoryMasterName;
    private int categoryMasterParentId;
    private String categoryMasterParentName;
    private String categoryIds;
    private String catgoryNames;
    private int companyId;
    private String compCnName;
    private String simpName;
    private int basicSellCount;
    private int realSellCount;
    private String updateTime;
    private int productStatus;
    private int deleted;
    private long price;
    private String bigLogoImg;
    private String smallLogoImg;
    private String mobileLogoImg;
    private String insurantDateLimit;
    private String insurantDate;
    private int isHFive;
    private int hFiveBuyType;
    private int isAndroidApp;
    private int isIosApp;
    private int appBuyType;
    private int isPc;
    private int pcBuyType;
    private String insureType;
    private int planStatus;
    private String filterId;
    private String filterName;
    private int economyType;
    private int planSort;
    private int sourceAtt;
    private String productNameBlurry;
    private int basicProductStatus;
    private int basicPlanStatus;
    private List<TripProductFeatureJson> featureList;
    private List<TripProtectItemJson> protectTrialItemList;
    private List<TripRestrictGeneJson> restrictGeneList;
    
    public int getId() {
        return this.id;
    }
    
    public void setId(final int id) {
        this.id = id;
    }
    
    public int getProductId() {
        return this.productId;
    }
    
    public void setProductId(final int productId) {
        this.productId = productId;
    }
    
    public int getBasicProductId() {
        return this.basicProductId;
    }
    
    public void setBasicProductId(final int basicProductId) {
        this.basicProductId = basicProductId;
    }
    
    public String getProductName() {
        return this.productName;
    }
    
    public void setProductName(final String productName) {
        this.productName = productName;
    }
    
    public int getPlanId() {
        return this.planId;
    }
    
    public void setPlanId(final int planId) {
        this.planId = planId;
    }
    
    public int getBasicPlanId() {
        return this.basicPlanId;
    }
    
    public void setBasicPlanId(final int basicPlanId) {
        this.basicPlanId = basicPlanId;
    }
    
    public String getPlanName() {
        return this.planName;
    }
    
    public void setPlanName(final String planName) {
        this.planName = planName;
    }
    
    public int getCategoryMasterId() {
        return this.categoryMasterId;
    }
    
    public void setCategoryMasterId(final int categoryMasterId) {
        this.categoryMasterId = categoryMasterId;
    }
    
    public String getCategoryMasterName() {
        return this.categoryMasterName;
    }
    
    public void setCategoryMasterName(final String categoryMasterName) {
        this.categoryMasterName = categoryMasterName;
    }
    
    public int getCategoryMasterParentId() {
        return this.categoryMasterParentId;
    }
    
    public void setCategoryMasterParentId(final int categoryMasterParentId) {
        this.categoryMasterParentId = categoryMasterParentId;
    }
    
    public String getCategoryMasterParentName() {
        return this.categoryMasterParentName;
    }
    
    public void setCategoryMasterParentName(final String categoryMasterParentName) {
        this.categoryMasterParentName = categoryMasterParentName;
    }
    
    public String getCategoryIds() {
        return this.categoryIds;
    }
    
    public void setCategoryIds(final String categoryIds) {
        this.categoryIds = categoryIds;
    }
    
    public String getCatgoryNames() {
        return this.catgoryNames;
    }
    
    public void setCatgoryNames(final String catgoryNames) {
        this.catgoryNames = catgoryNames;
    }
    
    public int getCompanyId() {
        return this.companyId;
    }
    
    public void setCompanyId(final int companyId) {
        this.companyId = companyId;
    }
    
    public String getCompCnName() {
        return this.compCnName;
    }
    
    public void setCompCnName(final String compCnName) {
        this.compCnName = compCnName;
    }
    
    public String getSimpName() {
        return this.simpName;
    }
    
    public void setSimpName(final String simpName) {
        this.simpName = simpName;
    }
    
    public int getBasicSellCount() {
        return this.basicSellCount;
    }
    
    public void setBasicSellCount(final int basicSellCount) {
        this.basicSellCount = basicSellCount;
    }
    
    public int getRealSellCount() {
        return this.realSellCount;
    }
    
    public void setRealSellCount(final int realSellCount) {
        this.realSellCount = realSellCount;
    }
    
    public String getUpdateTime() {
        return this.updateTime;
    }
    
    public void setUpdateTime(final String updateTime) {
        this.updateTime = updateTime;
    }
    
    public int getProductStatus() {
        return this.productStatus;
    }
    
    public void setProductStatus(final int productStatus) {
        this.productStatus = productStatus;
    }
    
    public int getDeleted() {
        return this.deleted;
    }
    
    public void setDeleted(final int deleted) {
        this.deleted = deleted;
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
    
    public String getInsurantDateLimit() {
        return this.insurantDateLimit;
    }
    
    public void setInsurantDateLimit(final String insurantDateLimit) {
        this.insurantDateLimit = insurantDateLimit;
    }
    
    public String getInsurantDate() {
        return this.insurantDate;
    }
    
    public void setInsurantDate(final String insurantDate) {
        this.insurantDate = insurantDate;
    }
    
    public int getIsHFive() {
        return this.isHFive;
    }
    
    public void setIsHFive(final int isHFive) {
        this.isHFive = isHFive;
    }
    
    public int gethFiveBuyType() {
        return this.hFiveBuyType;
    }
    
    public void sethFiveBuyType(final int hFiveBuyType) {
        this.hFiveBuyType = hFiveBuyType;
    }
    
    public int getIsAndroidApp() {
        return this.isAndroidApp;
    }
    
    public void setIsAndroidApp(final int isAndroidApp) {
        this.isAndroidApp = isAndroidApp;
    }
    
    public int getIsIosApp() {
        return this.isIosApp;
    }
    
    public void setIsIosApp(final int isIosApp) {
        this.isIosApp = isIosApp;
    }
    
    public int getAppBuyType() {
        return this.appBuyType;
    }
    
    public void setAppBuyType(final int appBuyType) {
        this.appBuyType = appBuyType;
    }
    
    public int getIsPc() {
        return this.isPc;
    }
    
    public void setIsPc(final int isPc) {
        this.isPc = isPc;
    }
    
    public int getPcBuyType() {
        return this.pcBuyType;
    }
    
    public void setPcBuyType(final int pcBuyType) {
        this.pcBuyType = pcBuyType;
    }
    
    public String getInsureType() {
        return this.insureType;
    }
    
    public void setInsureType(final String insureType) {
        this.insureType = insureType;
    }
    
    public int getPlanStatus() {
        return this.planStatus;
    }
    
    public void setPlanStatus(final int planStatus) {
        this.planStatus = planStatus;
    }
    
    public String getFilterId() {
        return this.filterId;
    }
    
    public void setFilterId(final String filterId) {
        this.filterId = filterId;
    }
    
    public String getFilterName() {
        return this.filterName;
    }
    
    public void setFilterName(final String filterName) {
        this.filterName = filterName;
    }
    
    public int getEconomyType() {
        return this.economyType;
    }
    
    public void setEconomyType(final int economyType) {
        this.economyType = economyType;
    }
    
    public int getPlanSort() {
        return this.planSort;
    }
    
    public void setPlanSort(final int planSort) {
        this.planSort = planSort;
    }
    
    public int getSourceAtt() {
        return this.sourceAtt;
    }
    
    public void setSourceAtt(final int sourceAtt) {
        this.sourceAtt = sourceAtt;
    }
    
    public String getProductNameBlurry() {
        return this.productNameBlurry;
    }
    
    public void setProductNameBlurry(final String productNameBlurry) {
        this.productNameBlurry = productNameBlurry;
    }
    
    public int getBasicProductStatus() {
        return this.basicProductStatus;
    }
    
    public void setBasicProductStatus(final int basicProductStatus) {
        this.basicProductStatus = basicProductStatus;
    }
    
    public int getBasicPlanStatus() {
        return this.basicPlanStatus;
    }
    
    public void setBasicPlanStatus(final int basicPlanStatus) {
        this.basicPlanStatus = basicPlanStatus;
    }
    
    public List<TripProductFeatureJson> getFeatureList() {
        return this.featureList;
    }
    
    public void setFeatureList(final List<TripProductFeatureJson> featureList) {
        this.featureList = featureList;
    }
    
    public List<TripProtectItemJson> getProtectTrialItemList() {
        return this.protectTrialItemList;
    }
    
    public void setProtectTrialItemList(final List<TripProtectItemJson> protectTrialItemList) {
        this.protectTrialItemList = protectTrialItemList;
    }
    
    public List<TripRestrictGeneJson> getRestrictGeneList() {
        return this.restrictGeneList;
    }
    
    public void setRestrictGeneList(final List<TripRestrictGeneJson> restrictGeneList) {
        this.restrictGeneList = restrictGeneList;
    }
}
