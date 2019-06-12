package com.huize.qixin.api.req.surrender;

import com.huize.qixin.api.req.*;

public class SurrenderPolicyReq extends BaseReq
{
    private String insureNum;
    
    public String getInsureNum() {
        return this.insureNum;
    }
    
    public void setInsureNum(final String insureNum) {
        this.insureNum = insureNum;
    }
}
