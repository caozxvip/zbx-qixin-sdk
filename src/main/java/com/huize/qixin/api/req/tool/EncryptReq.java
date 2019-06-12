package com.huize.qixin.api.req.tool;

import com.huize.qixin.api.req.*;

public class EncryptReq extends BaseReq
{
    private Integer type;
    private String param;
    
    public Integer getType() {
        return this.type;
    }
    
    public void setType(final Integer type) {
        this.type = type;
    }
    
    public String getParam() {
        return this.param;
    }
    
    public void setParam(final String param) {
        this.param = param;
    }
}
