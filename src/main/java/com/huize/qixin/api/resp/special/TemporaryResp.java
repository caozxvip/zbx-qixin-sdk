package com.huize.qixin.api.resp.special;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.huize.qixin.api.resp.BaseResp;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class TemporaryResp extends BaseResp
{
    private String temporaryUrl;
    
    public String getTemporaryUrl() {
        return this.temporaryUrl;
    }
    
    public void setTemporaryUrl(final String temporaryUrl) {
        this.temporaryUrl = temporaryUrl;
    }
}
