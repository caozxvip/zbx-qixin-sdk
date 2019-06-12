package com.huize.qixin.api.resp.pay;

import com.huize.qixin.api.resp.*;

public class LocalPayResp extends BaseResp
{
    private String insureNums;
    
    public String getInsureNums() {
        return this.insureNums;
    }
    
    public void setInsureNums(final String insureNums) {
        this.insureNums = insureNums;
    }
}
