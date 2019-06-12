package com.huize.qixin.api.req.product;

import com.huize.qixin.api.req.*;

public class BankAddressReq extends BaseReq
{
    private String caseCode;
    private String areaCode;
    
    public String getCaseCode() {
        return this.caseCode;
    }
    
    public void setCaseCode(final String caseCode) {
        this.caseCode = caseCode;
    }
    
    public String getAreaCode() {
        return this.areaCode;
    }
    
    public void setAreaCode(final String areaCode) {
        this.areaCode = areaCode;
    }
}
