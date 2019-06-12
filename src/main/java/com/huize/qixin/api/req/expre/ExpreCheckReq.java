package com.huize.qixin.api.req.expre;

import com.huize.qixin.api.req.*;

public class ExpreCheckReq extends BaseReq
{
    private String insureNum;
    
    public String getInsureNum() {
        return this.insureNum;
    }
    
    public void setInsureNum(final String insureNum) {
        this.insureNum = insureNum;
    }
}
