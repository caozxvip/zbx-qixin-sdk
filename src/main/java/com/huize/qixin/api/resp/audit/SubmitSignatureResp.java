package com.huize.qixin.api.resp.audit;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.huize.qixin.api.resp.BaseResp;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class SubmitSignatureResp extends BaseResp
{
    private Long signImgId;
    
    public Long getSignImgId() {
        return this.signImgId;
    }
    
    public void setSignImgId(final Long signImgId) {
        this.signImgId = signImgId;
    }
}
