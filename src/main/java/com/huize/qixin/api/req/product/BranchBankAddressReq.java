package com.huize.qixin.api.req.product;

import com.huize.qixin.api.req.*;

public class BranchBankAddressReq extends BaseReq
{
    private String caseCode;
    private String areaCode;
    private int bankId;
    
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
    
    public int getBankId() {
        return this.bankId;
    }
    
    public void setBankId(final int bankId) {
        this.bankId = bankId;
    }
}
