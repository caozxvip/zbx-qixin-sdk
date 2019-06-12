package com.huize.qixin.api.req.product;

import com.huize.qixin.api.req.*;

public class ProductDetailReq extends BaseReq
{
    private String caseCode;
    private int platformType;
    
    public String getCaseCode() {
        return this.caseCode;
    }
    
    public void setCaseCode(final String caseCode) {
        this.caseCode = caseCode;
    }
    
    public int getPlatformType() {
        return this.platformType;
    }
    
    public void setPlatformType(final int platformType) {
        this.platformType = platformType;
    }
}
