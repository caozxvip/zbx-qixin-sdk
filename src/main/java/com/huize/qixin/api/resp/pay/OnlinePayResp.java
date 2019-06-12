package com.huize.qixin.api.resp.pay;

import com.huize.qixin.api.resp.*;

public class OnlinePayResp extends BaseResp
{
    private String insureNums;
    private String gatewayUrl;
    
    public String getInsureNums() {
        return this.insureNums;
    }
    
    public void setInsureNums(final String insureNums) {
        this.insureNums = insureNums;
    }
    
    public String getGatewayUrl() {
        return this.gatewayUrl;
    }
    
    public void setGatewayUrl(final String gatewayUrl) {
        this.gatewayUrl = gatewayUrl;
    }
}
