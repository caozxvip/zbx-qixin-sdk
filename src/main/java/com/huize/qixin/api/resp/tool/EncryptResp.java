package com.huize.qixin.api.resp.tool;

import com.huize.qixin.api.resp.*;

public class EncryptResp extends BaseResp
{
    private String encryptParam;
    
    public String getEncryptParam() {
        return this.encryptParam;
    }
    
    public void setEncryptParam(final String encryptParam) {
        this.encryptParam = encryptParam;
    }
}
