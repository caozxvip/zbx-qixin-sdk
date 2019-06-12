package com.huize.qixin.api.req.audit;

import com.huize.qixin.api.req.*;
import com.huize.qixin.api.model.info.*;

public class CreatSmartAduitReq extends BaseReq
{
    private String caseCode;
    private TrailPremiumParam priceArgs;
    
    public String getCaseCode() {
        return this.caseCode;
    }
    
    public void setCaseCode(final String caseCode) {
        this.caseCode = caseCode;
    }
    
    public TrailPremiumParam getPriceArgs() {
        return this.priceArgs;
    }
    
    public void setPriceArgs(final TrailPremiumParam priceArgs) {
        this.priceArgs = priceArgs;
    }
}
