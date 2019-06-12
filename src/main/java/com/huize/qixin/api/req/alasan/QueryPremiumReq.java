package com.huize.qixin.api.req.alasan;

import com.huize.qixin.api.req.*;

public class QueryPremiumReq extends BaseReq
{
    private String insureDate;
    
    public String getInsureDate() {
        return this.insureDate;
    }
    
    public void setInsureDate(final String insureDate) {
        this.insureDate = insureDate;
    }
}
