package com.huize.qixin.api.resp.policy;

import com.huize.qixin.api.resp.*;

public class PolicyUrlResp extends BaseResp
{
    private String insureNum;
    public String fileUrl;
    
    public String getFileUrl() {
        return this.fileUrl;
    }
    
    public void setFileUrl(final String fileUrl) {
        this.fileUrl = fileUrl;
    }
    
    public String getInsureNum() {
        return this.insureNum;
    }
    
    public void setInsureNum(final String insureNum) {
        this.insureNum = insureNum;
    }
}
