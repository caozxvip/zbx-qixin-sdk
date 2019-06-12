package com.huize.qixin.api.resp.pay;

import com.huize.qixin.api.resp.*;

public class AppletPayResp extends BaseResp
{
    private String insureNums;
    private String gatewayData;
    
    public String getInsureNums() {
        return this.insureNums;
    }
    
    public void setInsureNums(final String insureNums) {
        this.insureNums = insureNums;
    }
    
    public String getGatewayData() {
        return this.gatewayData;
    }
    
    public void setGatewayData(final String gatewayData) {
        this.gatewayData = gatewayData;
    }
}
