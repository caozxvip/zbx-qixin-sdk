package com.huize.qixin.api.req.product;

import com.huize.qixin.api.req.BaseReq;

public class ProductDestinationReq extends BaseReq
{
    private String caseCode;
    
    public String getCaseCode() {
        return this.caseCode;
    }
    
    public void setCaseCode(final String caseCode) {
        this.caseCode = caseCode;
    }
}
