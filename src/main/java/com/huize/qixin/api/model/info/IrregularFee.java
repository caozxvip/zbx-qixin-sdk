package com.huize.qixin.api.model.info;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class IrregularFee
{
    private Integer feeId;
    private String feeText;
    private String feeRate;
    
    public Integer getFeeId() {
        return this.feeId;
    }
    
    public void setFeeId(final Integer feeId) {
        this.feeId = feeId;
    }
    
    public String getFeeText() {
        return this.feeText;
    }
    
    public void setFeeText(final String feeText) {
        this.feeText = feeText;
    }
    
    public String getFeeRate() {
        return this.feeRate;
    }
    
    public void setFeeRate(final String feeRate) {
        this.feeRate = feeRate;
    }
}
