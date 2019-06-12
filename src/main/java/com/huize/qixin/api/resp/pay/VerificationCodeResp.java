package com.huize.qixin.api.resp.pay;

import com.huize.qixin.api.resp.*;

public class VerificationCodeResp extends BaseResp
{
    private String insureNum;
    
    public String getInsureNum() {
        return this.insureNum;
    }
    
    public void setInsureNum(final String insureNum) {
        this.insureNum = insureNum;
    }
}
