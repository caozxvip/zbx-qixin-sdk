package com.huize.qixin.api.model.info;

import com.fasterxml.jackson.annotation.*;
import java.util.*;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ProductFee
{
    private Integer feeType;
    private String discountFee;
    private String rebateFee;
    private Integer economyType;
    private String maxFee;
    private String minFee;
    private List<IrregularFee> irregularFees;
    
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
    
    public String getMaxFee() {
        return this.maxFee;
    }
    
    public void setMaxFee(final String maxFee) {
        this.maxFee = maxFee;
    }
    
    public String getMinFee() {
        return this.minFee;
    }
    
    public void setMinFee(final String minFee) {
        this.minFee = minFee;
    }
    
    public List<IrregularFee> getIrregularFees() {
        return this.irregularFees;
    }
    
    public void setIrregularFees(final List<IrregularFee> irregularFees) {
        this.irregularFees = irregularFees;
    }
}
