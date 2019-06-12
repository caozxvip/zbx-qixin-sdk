package com.huize.qixin.api.req.pay;

import com.huize.qixin.api.req.*;
import com.huize.qixin.api.model.info.*;

public class BasePayReq extends BaseReq
{
    private ExpressInfo expressInfo;
    private String insureNums;
    
    public String getInsureNums() {
        return this.insureNums;
    }
    
    public void setInsureNums(final String insureNums) {
        this.insureNums = insureNums;
    }
    
    public ExpressInfo getExpressInfo() {
        return this.expressInfo;
    }
    
    public void setExpressInfo(final ExpressInfo expressInfo) {
        this.expressInfo = expressInfo;
    }
}
