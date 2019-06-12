package com.huize.qixin.api.model.info;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class InsureFee
{
    private Integer feeType;
    private String discountFee;
    private String rebateFee;
    private Integer economyType;
    private IrregularFee irregularFee;
    
    public Integer getFeeType() {
        return this.feeType;
    }
    
    public void setFeeType(final Integer feeType) {
        this.feeType = feeType;
    }
    
    public String getDiscountFee() {
        return this.discountFee;
    }
    
    public void setDiscountFee(final String discountFee) {
        this.discountFee = discountFee;
    }
    
    public String getRebateFee() {
        return this.rebateFee;
    }
    
    public void setRebateFee(final String rebateFee) {
        this.rebateFee = rebateFee;
    }
    
    public Integer getEconomyType() {
        return this.economyType;
    }
    
    public void setEconomyType(final Integer economyType) {
        this.economyType = economyType;
    }
    
    public IrregularFee getIrregularFee() {
        return this.irregularFee;
    }
    
    public void setIrregularFee(final IrregularFee irregularFee) {
        this.irregularFee = irregularFee;
    }
}
