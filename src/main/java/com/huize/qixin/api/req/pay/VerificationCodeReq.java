package com.huize.qixin.api.req.pay;

import com.huize.qixin.api.req.*;

public class VerificationCodeReq extends BaseReq
{
    private String insureNum;
    
    public String getInsureNum() {
        return this.insureNum;
    }
    
    public void setInsureNum(final String insureNum) {
        this.insureNum = insureNum;
    }
}
