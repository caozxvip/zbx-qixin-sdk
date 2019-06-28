package com.huize.qixin.api.resp.product;

import com.huize.qixin.api.model.info.InsureAttribute;
import com.huize.qixin.api.resp.BaseResp;

public class ProductInsureAttrResp extends BaseResp
{
    private String caseCode;
    private InsureAttribute insureAttribute;
    
    public String getCaseCode() {
        return this.caseCode;
    }
    
    public void setCaseCode(final String caseCode) {
        this.caseCode = caseCode;
    }
    
    public InsureAttribute getInsureAttribute() {
        return this.insureAttribute;
    }
    
    public void setInsureAttribute(final InsureAttribute insureAttribute) {
        this.insureAttribute = insureAttribute;
    }
}
