package com.huize.qixin.api.resp.yizt;

import com.huize.qixin.api.resp.*;

public class YiztOrderRiskControlResp extends BaseResp
{
    private String insureNum;
    private String productName;
    private String productCode;
    private String orderAmount;
    private String createdTime;
    private String payOrderNo;
    private String payOrderStatus;
    private String riskInfo;
    private String backUrl;
    private String orderExpireFlag;
    
    public String getInsureNum() {
        return this.insureNum;
    }
    
    public void setInsureNum(final String insureNum) {
        this.insureNum = insureNum;
    }
    
    public String getProductName() {
        return this.productName;
    }
    
    public void setProductName(final String productName) {
        this.productName = productName;
    }
    
    public String getProductCode() {
        return this.productCode;
    }
    
    public void setProductCode(final String productCode) {
        this.productCode = productCode;
    }
    
    public String getOrderAmount() {
        return this.orderAmount;
    }
    
    public void setOrderAmount(final String orderAmount) {
        this.orderAmount = orderAmount;
    }
    
    public String getCreatedTime() {
        return this.createdTime;
    }
    
    public void setCreatedTime(final String createdTime) {
        this.createdTime = createdTime;
    }
    
    public String getPayOrderNo() {
        return this.payOrderNo;
    }
    
    public void setPayOrderNo(final String payOrderNo) {
        this.payOrderNo = payOrderNo;
    }
    
    public String getPayOrderStatus() {
        return this.payOrderStatus;
    }
    
    public void setPayOrderStatus(final String payOrderStatus) {
        this.payOrderStatus = payOrderStatus;
    }
    
    public String getRiskInfo() {
        return this.riskInfo;
    }
    
    public void setRiskInfo(final String riskInfo) {
        this.riskInfo = riskInfo;
    }
    
    public String getBackUrl() {
        return this.backUrl;
    }
    
    public void setBackUrl(final String backUrl) {
        this.backUrl = backUrl;
    }
    
    public String getOrderExpireFlag() {
        return this.orderExpireFlag;
    }
    
    public void setOrderExpireFlag(final String orderExpireFlag) {
        this.orderExpireFlag = orderExpireFlag;
    }
}
