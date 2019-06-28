package com.huize.qixin.api.resp.customerservice;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.huize.qixin.api.resp.BaseResp;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class CustomerServiceResp extends BaseResp
{
    private String accesstocsUrl;
    
    public String getAccesstocsUrl() {
        return this.accesstocsUrl;
    }
    
    public void setAccesstocsUrl(final String accesstocsUrl) {
        this.accesstocsUrl = accesstocsUrl;
    }
}
