package com.huize.qixin.api.resp.insure;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class InsureAndPayResp extends InsureResp
{
    private String policyNum;
    
    public String getPolicyNum() {
        return this.policyNum;
    }
    
    public void setPolicyNum(final String policyNum) {
        this.policyNum = policyNum;
    }
}
