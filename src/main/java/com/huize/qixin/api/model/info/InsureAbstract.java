package com.huize.qixin.api.model.info;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class InsureAbstract
{
    private int insurePartnerId;
    private String insureNum;
    private int state;
    
    public int getInsurePartnerId() {
        return this.insurePartnerId;
    }
    
    public void setInsurePartnerId(final int insurePartnerId) {
        this.insurePartnerId = insurePartnerId;
    }
    
    public String getInsureNum() {
        return this.insureNum;
    }
    
    public void setInsureNum(final String insureNum) {
        this.insureNum = insureNum;
    }
    
    public int getState() {
        return this.state;
    }
    
    public void setState(final int state) {
        this.state = state;
    }
}
