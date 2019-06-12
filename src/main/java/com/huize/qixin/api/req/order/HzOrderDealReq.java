package com.huize.qixin.api.req.order;

import com.huize.qixin.api.req.*;

public class HzOrderDealReq extends BaseReq
{
    private String key;
    
    public String getKey() {
        return this.key;
    }
    
    public void setKey(final String key) {
        this.key = key;
    }
}
