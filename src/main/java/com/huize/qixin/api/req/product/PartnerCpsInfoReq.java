package com.huize.qixin.api.req.product;

import com.huize.qixin.api.req.*;

public class PartnerCpsInfoReq extends BaseReq
{
    private String cuid;
    private Integer planId;
    
    public String getCuid() {
        return this.cuid;
    }
    
    public void setCuid(final String cuid) {
        this.cuid = cuid;
    }
    
    public Integer getPlanId() {
        return this.planId;
    }
    
    public void setPlanId(final Integer planId) {
        this.planId = planId;
    }
}
