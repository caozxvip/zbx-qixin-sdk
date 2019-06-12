package com.huize.qixin.api.req.yizt;

import com.huize.qixin.api.req.*;

public class YiztOrderRiskControlReq extends BaseReq
{
    private String insureNum;
    
    public String getInsureNum() {
        return this.insureNum;
    }
    
    public void setInsureNum(final String insureNum) {
        this.insureNum = insureNum;
    }
}
