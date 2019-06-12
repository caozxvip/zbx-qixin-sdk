package com.huize.qixin.api.resp.alasan;

import com.huize.qixin.api.resp.*;

public class QueryPremiumResp extends BaseResp
{
    private long premiums;
    
    public long getPremiums() {
        return this.premiums;
    }
    
    public void setPremiums(final long premiums) {
        this.premiums = premiums;
    }
}
