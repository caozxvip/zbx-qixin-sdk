package com.huize.qixin.api.req.trial;

import com.huize.qixin.api.req.*;

public class DefaultTrialReq extends BaseReq
{
    private String caseCode;
    
    public String getCaseCode() {
        return this.caseCode;
    }
    
    public void setCaseCode(final String caseCode) {
        this.caseCode = caseCode;
    }
}
