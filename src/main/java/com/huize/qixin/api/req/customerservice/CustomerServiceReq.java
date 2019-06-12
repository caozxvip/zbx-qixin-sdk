package com.huize.qixin.api.req.customerservice;

import com.huize.qixin.api.req.*;

public class CustomerServiceReq extends BaseReq
{
    private String caseCode;
    private int clientType;
    
    public String getCaseCode() {
        return this.caseCode;
    }
    
    public void setCaseCode(final String caseCode) {
        this.caseCode = caseCode;
    }
    
    public int getClientType() {
        return this.clientType;
    }
    
    public void setClientType(final int clientType) {
        this.clientType = clientType;
    }
}
