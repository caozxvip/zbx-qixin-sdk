package com.huize.qixin.api.req.policy;

import com.huize.qixin.api.req.BaseReq;

public class PolicyUrlReq extends BaseReq
{
    private String insureNum;
    
    public String getInsureNum() {
        return this.insureNum;
    }
    
    public void setInsureNum(final String insureNum) {
        this.insureNum = insureNum;
    }
}
