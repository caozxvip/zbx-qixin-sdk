package com.huize.qixin.api.req.order;

import com.huize.qixin.api.req.*;

public class PolicyDetailReq extends BaseReq
{
    String policyNum;
    
    public String getPolicyNum() {
        return this.policyNum;
    }
    
    public void setPolicyNum(final String policyNum) {
        this.policyNum = policyNum;
    }
}
